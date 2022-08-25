package com.example.codingtask.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.codingtask.data.local.dao.PixabayDao
import com.example.codingtask.data.local.entity.Pixabay

@Database(
    entities = [Pixabay::class],
    exportSchema = false,
    version = 1
)
abstract class PixabayDb: RoomDatabase() {
    abstract fun pixabayDao(): PixabayDao
}