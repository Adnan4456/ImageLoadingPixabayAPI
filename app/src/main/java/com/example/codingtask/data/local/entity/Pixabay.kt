package com.example.codingtask.data.local.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "pixabay_table")
data class Pixabay(
    @PrimaryKey(autoGenerate = false)
    val id: Int, //1

    val collections: Int, //2
    val comments: Int, //3
    val downloads: Int, //4
    val imageHeight: Int, //5
    val imageSize: Int, //6
    val imageWidth: Int, //7
    val largeImageURL: String, //8
    val likes: Int,// 9
    val pageURL: String, //10
    val previewHeight: Int, //11
    val previewURL: String, //12
    val previewWidth: Int, //13
    val tags: String,//14
    val type: String,//15
    val user: String,//16
    val userId: Int,//17
    val userImageURL: String, //18
    val views: Int,//19
    val webformatHeight: Int,//20
    val webformatURL: String,//21
    val webformatWidth: Int//22
): Parcelable



//A parcel is highly optimized for local IPC (Inter-Process Communication —
// You can get familiar with IPC here) also is not attempt to save data in any kind
// of persistent storage.