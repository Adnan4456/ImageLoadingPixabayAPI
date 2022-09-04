package com.example.codingtask.data.local.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.codingtask.data.local.entity.Pixabay.class, com.example.codingtask.data.local.entity.RemoteKeys.class}, exportSchema = false, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/codingtask/data/local/db/PixabayDb;", "Landroidx/room/RoomDatabase;", "()V", "pixabayDao", "Lcom/example/codingtask/data/local/dao/PixabayDao;", "remoteKeyDao", "Lcom/example/codingtask/data/local/dao/RemoteKeysDao;", "app_debug"})
public abstract class PixabayDb extends androidx.room.RoomDatabase {
    
    public PixabayDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.codingtask.data.local.dao.PixabayDao pixabayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.codingtask.data.local.dao.RemoteKeysDao remoteKeyDao();
}