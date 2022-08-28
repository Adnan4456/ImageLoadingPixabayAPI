package com.example.codingtask.ui.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.local.repository.PixabayRepository
import com.example.codingtask.utils.RepositoryInterface
import com.example.codingtask.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class PixabayViewModel @Inject constructor(
    private val repository: RepositoryInterface
    ): ViewModel() {

    private val _searchQuery = MutableLiveData("fruits") // default value
    val searchQuery : LiveData<String> = _searchQuery

    suspend fun getImages(query: String): Flow<Resource<List<Pixabay>>> {
        _searchQuery.value = query
//        Log.d("data" ,  _searchQuery.value.toString())
        return repository.fetchImages(query)
    }
}