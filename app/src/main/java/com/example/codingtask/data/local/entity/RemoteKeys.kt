package com.example.codingtask.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "remoteKeys")
data class RemoteKeys(

    @PrimaryKey
    val id: Int, //1
    val prevKey :Int?, //2
    val nextKey: Int?
    ) //3
{
}