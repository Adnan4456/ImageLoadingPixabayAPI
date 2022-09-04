package com.example.codingtask.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/codingtask/di/DatabaseModule;", "", "()V", "RemoteKeysDao", "Lcom/example/codingtask/data/local/dao/RemoteKeysDao;", "pixabayDb", "Lcom/example/codingtask/data/local/db/PixabayDb;", "providesDao", "Lcom/example/codingtask/data/local/dao/PixabayDao;", "providesDb", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.codingtask.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.codingtask.data.local.db.PixabayDb providesDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.codingtask.data.local.dao.PixabayDao providesDao(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.local.db.PixabayDb pixabayDb) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.codingtask.data.local.dao.RemoteKeysDao RemoteKeysDao(@org.jetbrains.annotations.NotNull()
    com.example.codingtask.data.local.db.PixabayDb pixabayDb) {
        return null;
    }
}