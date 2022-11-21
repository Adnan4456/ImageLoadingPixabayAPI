package com.example.codingtask.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "remoteKeys")
@Entity
data class RemoteKeys(

    @PrimaryKey(autoGenerate = false)
    val id: Int, //1
    val prevKey :Int?, //2
    val nextKey: Int?
    )