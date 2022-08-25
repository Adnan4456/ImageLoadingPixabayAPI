package com.example.codingtask.data.local.repository

import com.example.codingtask.data.local.db.PixabayDb
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.remote.PixabayApi
import com.example.codingtask.utils.RepositoryInterface
import com.example.codingtask.utils.Resource
import com.example.codingtask.utils.SafeApiRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class PixabayRepository @Inject constructor(
    private val pixabayApi: PixabayApi,
    private val pixabayDatabase: PixabayDb
    ): SafeApiRequest() , RepositoryInterface {
        override fun fetchImages(name: String): Flow<Resource<List<Pixabay>>> = flow {
            emit(Resource.Loading())

            // first checking data is present in database.
            val pixabayImage = pixabayDatabase.pixabayDao().fetchImages(name)
            emit(Resource.Loading(data = pixabayImage))

            //No then
            try {
                // Get our words and replace them in the database
                val data = pixabayApi.fetchImages(name)
                pixabayDatabase.pixabayDao().saveImage(data.hits)
                //pixabayDatabase.pixabayDao().deleteAll(data.hits.map { it.previewURL })

            }
            catch (e: HttpException) {
                emit(
                    Resource.Error(message = "Error .",
                        data = pixabayImage
                    )
                )
            }
            catch (e: IOException) {
                emit(
                    Resource.Error("Internet error", data = pixabayImage
                    )
                )
            }

            // Emit our data to the UI
            val newImage = pixabayDatabase.pixabayDao().fetchImages(name)
            emit(Resource.Success(newImage))
        }.flowOn(Dispatchers.IO) // getting data from server on background thread IO
}



