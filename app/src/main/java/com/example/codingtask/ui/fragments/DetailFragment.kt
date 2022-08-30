package com.example.codingtask.ui.fragments

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.codingtask.R
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val args: DetailFragmentArgs by navArgs()

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentDetailBinding.inflate(inflater, container, false)

        val image : Pixabay = args.id
        binding.item = image

        binding.detailFragment = this

        return binding.root
    }

    //calling this function from XML file
     fun VisibilityStatus(){

        if (binding.expandableLayout.visibility == View.GONE) {
//                TransitionManager.beginDelayedTransition(binding.cardView, AutoTransition())
            binding.expandableLayout.visibility = View.VISIBLE
            binding.dropdown.setImageResource(R.drawable.ic_drop_up)

        } else {
//                TransitionManager.beginDelayedTransition(binding.cardView, AutoTransition())
            binding.expandableLayout.visibility = View.GONE
            binding.dropdown.setImageResource(R.drawable.ic_drop_down)
        }

    }
}