package com.example.codingtask.ui.adapter

import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.codingtask.R
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.databinding.ImageItemBinding
import com.example.codingtask.utils.PixabayComparator

class MyPagingAdapter constructor(private val onClickListener: OnClickListener)
    :PagingDataAdapter<Pixabay , MyPagingAdapter.MyViewHolder>(
    PixabayComparator()) {

    class MyViewHolder(val binding: ImageItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(image: Pixabay){
            binding.listItem = image
        }
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val image = getItem(position)
        if (image != null){
            holder.bind(image)
        }
        holder.itemView.setOnClickListener {
            onClickListener.onClick(image!!)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val imageItemBinding = (ImageItemBinding.inflate(LayoutInflater.from(parent.context),parent ,
            false))

        imageItemBinding.dropdown.setOnClickListener {

            if (imageItemBinding.expandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(imageItemBinding.cardView, AutoTransition())
                imageItemBinding.dropdown.setImageResource(R.drawable.ic_drop_up)
                imageItemBinding.expandableLayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(imageItemBinding.cardView, AutoTransition())
                imageItemBinding.expandableLayout.visibility = View.GONE
                imageItemBinding.dropdown.setImageResource(R.drawable.ic_drop_down)
            }
        }
        return MyViewHolder(imageItemBinding)
    }
    class OnClickListener(val clickListener: (pix: Pixabay) -> Unit) {
        fun onClick(pix: Pixabay) = clickListener(pix)
    }
}