package com.example.codingtask.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.codingtask.data.local.dao.PixabayDao
import com.example.codingtask.data.local.dao.RemoteKeysDao
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.data.local.entity.RemoteKeys

@Database(
    entities = [Pixabay::class , RemoteKeys::class],
    exportSchema = false,
    version = 1
)
abstract class PixabayDb: RoomDatabase() {
    abstract fun pixabayDao(): PixabayDao
    abstract fun remoteKeyDao(): RemoteKeysDao

}