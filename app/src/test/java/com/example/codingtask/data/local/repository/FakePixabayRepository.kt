package com.example.codingtask.data.local.repository

import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.utils.RepositoryInterface
import com.example.codingtask.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class FakePixabayRepository:RepositoryInterface {

    private val data = mutableListOf<Pixabay>()
    override suspend fun fetchImages(name: String): Flow<Resource<List<Pixabay>>> {

        return flow {
            data
        }
    }

}