package com.example.codingtask.ui.viewmodels

import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.local.repository.FakePixabayRepository
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
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
     fun `check  correct values` () = runBlocking{

        val data = mutableListOf<Pixabay>()
//        var list = mutableListOf<Resource<List<Pixabay>>>()

        var list = viewModel.getImages("fruits").collect{
            Log.d("values", " = ${it.data}")
        }

        assertThat(list,`is`(data))

//        assertThat(list, hasItem(data))
//        assertThat(list,is(data))
     }

    @Test
    fun ListTest(){

        val actual: List<String> = Arrays.asList("a", "b", "c")
        val expected: List<String> = Arrays.asList("a", "b", "c")

        //1. Test equal.
        assertThat(actual, `is`(expected))
    }

    @After
    fun close(){

    }
}