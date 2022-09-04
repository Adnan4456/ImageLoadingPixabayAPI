package com.example.codingtask.ui.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.codingtask.R


@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url:String){
    Glide.with(this.context)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .error(R.drawable.ic_launcher_foreground)
            .transition(DrawableTransitionOptions.withCrossFade(200))
            .centerCrop()
            .into(this)
}