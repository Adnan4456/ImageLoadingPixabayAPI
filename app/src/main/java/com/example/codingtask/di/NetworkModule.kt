package com.example.codingtask.di

import com.example.codingtask.data.local.db.PixabayDb
import com.example.codingtask.data.local.repository.PixabayRepository
import com.example.codingtask.data.remote.PixabayApi
import com.example.codingtask.utils.Constants.Companion.BASE_URL
import com.example.codingtask.utils.RepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRepositoryInterface(
        pixabayApi: PixabayApi,
        pixabayDatabase: PixabayDb
        ) = PixabayRepository(pixabayApi ,pixabayDatabase) as RepositoryInterface

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(providesHttpLoggingInterceptor())
            .build()
    }

    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit): PixabayApi {
        return retrofit.create(PixabayApi::class.java)
    }

    @Provides
    @Singleton
    fun providesHttpLoggingInterceptor(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }
}

/*
* Hilt Dependency Injection -
* Hilt Application class - all apps in hilt should contain the application class
* Annotated with @HiltAndroidApp
*
*
*
* */