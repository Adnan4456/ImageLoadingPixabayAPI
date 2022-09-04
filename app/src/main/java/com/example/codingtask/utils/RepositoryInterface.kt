package com.example.codingtask.utils

import com.example.codingtask.data.local.entity.Pixabay
import kotlinx.coroutines.flow.Flow

interface RepositoryInterface {

     suspend fun fetchImages(name: String): Flow<Resource<List<Pixabay>>>
}