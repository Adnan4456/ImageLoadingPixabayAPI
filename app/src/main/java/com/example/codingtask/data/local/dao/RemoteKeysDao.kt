package com.example.codingtask.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.codingtask.data.local.entity.RemoteKeys


@Dao
interface   RemoteKeysDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetAll(pixabay: List<RemoteKeys>)

    @Query("SELECT * FROM remoteKeys WHERE id = :id")
    suspend fun getAllRemoteKeys(id:Int):RemoteKeys

    @Query("DELETE FROM remoteKeys")
    suspend fun clearAll()

}