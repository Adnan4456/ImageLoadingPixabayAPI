package com.example.codingtask.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/codingtask/di/NetworkModule;", "", "()V", "provideRepositoryInterface", "Lcom/example/codingtask/utils/RepositoryInterface;", "pixabayApi", "Lcom/example/codingtask/data/remote/PixabayApi;", "pixabayDatabase", "Lcom/example/codingtask/data/local/db/PixabayDb;", "providesApi", "retrofit", "Lretrofit2/Retrofit;", "providesHttpLoggingInterceptor", "Lokhttp3/OkHttpClient;", "providesRetrofit", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.codingtask.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.codingtask.utils.RepositoryInterface provideRepositoryInterface(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.remote.PixabayApi pixabayApi, @org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.local.db.PixabayDb pixabayDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.codingtask.data.remote.PixabayApi providesApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesHttpLoggingInterceptor() {
        return null;
    }
}