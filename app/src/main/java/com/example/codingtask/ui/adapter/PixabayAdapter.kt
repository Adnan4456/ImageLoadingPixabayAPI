package com.example.codingtask.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.databinding.ImageItemBinding
import com.example.codingtask.utils.PixabayComparator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class PixabayAdapter(private val onClickListener: OnClickListener): ListAdapter<Pixabay,
        PixabayAdapter.PixabayViewHolder>(PixabayComparator()) {

    inner class PixabayViewHolder(private val binding: ImageItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(pixabay: Pixabay) {
            binding.listItem = pixabay
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixabayViewHolder {
        val imageItemBinding = ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PixabayViewHolder(imageItemBinding)
    }

    override fun onBindViewHolder(holder: PixabayViewHolder, position: Int) {
        val pixabay = getItem(position)
        holder.bind(pixabay)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(pixabay)
        }
    }
    class OnClickListener(val clickListener: (pix: Pixabay) -> Unit) {
        fun onClick(pix: Pixabay) = clickListener(pix)
    }
    override fun getItemCount() = currentList.size
}
