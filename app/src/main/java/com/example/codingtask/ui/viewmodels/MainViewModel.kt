package com.example.codingtask.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.*
import com.example.codingtask.data.local.db.PixabayDb
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.local.repository.PixabayMediator
import com.example.codingtask.data.remote.PixabayApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel
    @Inject
    constructor(private val db:PixabayDb , private val apiService: PixabayApi)
    :ViewModel() {

    private val _searchQuery = MutableLiveData("fruits") // default value
    val searchQuery : LiveData<String> = _searchQuery

    @ExperimentalPagingApi
    fun getAllImages(query : String):Flow<PagingData<Pixabay>> {

        _searchQuery.value = query

        return Pager(
            config = PagingConfig(10, enablePlaceholders = false),
            remoteMediator = PixabayMediator(db, apiService, query),
            pagingSourceFactory = { db.pixabayDao().fetchImages(query) }
        ).flow.cachedIn(viewModelScope)
    }
}