package com.example.codingtask.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.codingtask.data.local.entity.Pixabay

class PixabayComparator: DiffUtil.ItemCallback<Pixabay>() {
    override fun areItemsTheSame(oldItem: Pixabay, newItem: Pixabay): Boolean {
        return oldItem == newItem
    }
    override fun areContentsTheSame(oldItem: Pixabay, newItem: Pixabay): Boolean {
        return oldItem.id == newItem.id
    }
}