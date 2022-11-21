package com.example.codingtask.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.codingtask.data.local.entity.Pixabay

@Dao
interface PixabayDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveImage(pixabay: List<Pixabay>)

    @Insert
    suspend fun insertRecord(pixabay: Pixabay)

    @Query("DELETE FROM pixabay_table")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM pixabay_table WHERE tags OR previewURL OR pageURL LIKE '%' || :query || '%'")
     fun fetchImages(query: String?): PagingSource<Int,Pixabay>
}