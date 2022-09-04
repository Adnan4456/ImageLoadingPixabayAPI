package com.example.codingtask.ui.adapter

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("android:visibility")
fun View.VisibilityBindingAdapter(visible: Boolean?) {
    visibility = if (visible != null && visible) View.VISIBLE else View.GONE
}