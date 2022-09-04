package com.example.codingtask.data.local.repository

import android.util.Log
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import com.example.codingtask.data.local.db.PixabayDb
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.local.entity.RemoteKeys
import com.example.codingtask.data.remote.PixabayApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.internal.wait
import retrofit2.HttpException
import java.io.IOException

@OptIn(ExperimentalPagingApi::class)
class PixabayMediator constructor(
    private val db: PixabayDb ,
    private val apiService: PixabayApi,
    private val tag:String
)
    :  RemoteMediator<Int , Pixabay>(){

    private val index = 1


    override suspend fun initialize(): InitializeAction {
        return InitializeAction.LAUNCH_INITIAL_REFRESH
    }

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, Pixabay>
    ): MediatorResult {

        val page = when (val pageData = getKeyPageData(loadType , state)){
            is MediatorResult.Success -> {
                return pageData
            }
            else ->{
                pageData as Int
            }
        }

        try {

            val response = apiService.fetchImages(tag,page, state.config.pageSize)
            val list = response.hits
//            Log.d("TAG"," size = ${list.size}")
//            Log.d("TAG"," tags =   $tag")
            val isEndOfList = list.isEmpty()

            //it is a suspend function
            db.withTransaction {
                if (loadType == LoadType.REFRESH){
                    db.pixabayDao().deleteAll()
                    db.remoteKeyDao().clearAll()
                }

                val prevKey = if (page == index ) null else page-1
                val nextKey = if (isEndOfList) null else page+1

                val key = list.map {
                    RemoteKeys(it.id,prevKey , nextKey)
                }
                db.remoteKeyDao().insetAll(key)
                db.pixabayDao().saveImage(list)
            }
            return MediatorResult.Success(endOfPaginationReached = isEndOfList)
        }
        catch (e:IOException){
            return MediatorResult.Error(e)
        }
        catch (h:HttpException){
            return MediatorResult.Error(h)
        }
    }

    private suspend fun getKeyPageData(loadType: LoadType , state: PagingState<Int, Pixabay>):Any{

        return when(loadType){

            LoadType.REFRESH ->{
                val remoteKey = getRefreshRemoteKey(state)
                remoteKey?.nextKey?.minus(1)?: index
            }
            LoadType.PREPEND->{
                val remoteKey = getFirstRemoteKeys(state)
                val prevKey = remoteKey?.prevKey ?: MediatorResult.Success(
                    endOfPaginationReached = false
                )
                prevKey
            }

            LoadType.APPEND ->{

                val remoteKey = getLastRemoteKey(state)
                val nextKey = remoteKey?.nextKey ?: MediatorResult.Success(
                endOfPaginationReached = true
                )
                nextKey
            }
        }
    }

    private suspend fun getFirstRemoteKeys(state: PagingState<Int, Pixabay>)
        :RemoteKeys? {
        //first add data
        return withContext(Dispatchers.IO) //for preform task in background
        {
            state.pages
                .firstOrNull{
                    it.data.isNotEmpty()
                }?.data?.firstOrNull()
                ?.let { pixabay ->
                    db.remoteKeyDao().getAllRemoteKeys(pixabay.id)
                }
        }
    }

    private suspend fun getLastRemoteKey(state: PagingState<Int, Pixabay>)
            :RemoteKeys? {

        return withContext(Dispatchers.IO){
            state.pages
                .lastOrNull{
                    it.data.isNotEmpty()
                }?.data?.lastOrNull()
                ?.let { pixabay ->
                    db.remoteKeyDao().getAllRemoteKeys(pixabay.id)
                }
        }
    }

    private suspend fun getRefreshRemoteKey(state: PagingState<Int, Pixabay>)
    :RemoteKeys?{

        return withContext(Dispatchers.IO){
            state.anchorPosition?.let { position ->
                state.closestItemToPosition(position)?.id?.let { id ->
                    db.remoteKeyDao().getAllRemoteKeys(id)
                }
            }
        }
    }
}