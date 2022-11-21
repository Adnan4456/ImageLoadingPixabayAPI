package com.example.codingtask.data.remote

import com.example.codingtask.data.local.entity.Pixabay
import com.google.gson.annotations.SerializedName

data class PixabayResponse(@SerializedName("hits") val hits: List<Pixabay>)