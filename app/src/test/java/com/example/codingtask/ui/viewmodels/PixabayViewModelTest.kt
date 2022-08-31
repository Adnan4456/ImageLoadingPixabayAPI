package com.example.codingtask.ui.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.local.repository.FakePixabayRepository
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.util.*

class PixabayViewModelTest{

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

//    @get:Rule
//    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var viewModel: PixabayViewModel

    @Before
    fun setUp(){
        viewModel = PixabayViewModel(FakePixabayRepository())
    }

    @Test
     fun `check correct values` () = runBlocking{

        val data = mutableListOf<List<Pixabay>>()
//        var list = mutableListOf<Resource<List<Pixabay>>>()

       viewModel.getImages("fruits").collect{
//            Log.d("values", " = ${it.data}")
           data.add(it.data!!)

        }

        assertThat(data.size>0).isTrue()

     }

    @Test
    fun ListTest(){

        val actual: List<String> = Arrays.asList("a", "b", "c")
        val expected: List<String> = Arrays.asList("a", "b", "c")

        //1. Test equal.
//        assertThat(actual, `is`(expected))
        assertThat(actual == expected).isTrue()
    }

    @After
    fun close(){

    }
}