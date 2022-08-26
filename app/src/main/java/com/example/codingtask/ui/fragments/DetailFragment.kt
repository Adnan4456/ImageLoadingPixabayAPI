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

        binding.dropdown.setOnClickListener{

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

        val image : Pixabay = args.id
        binding.item = image
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        setUpUI()
    }

    private fun setUpUI() {

        val image = args.id
        val imageUrl = image.webformatURL
        val user = image.user
        val views = image.views.toString()
        val download = image.downloads.toString()
        val comments = image.comments.toString()
        val likes = image.likes
        val userImage = image.userImageURL

//        CoroutineScope(Dispatchers.Main).launch {
//            Glide.with(binding.imageView)
//                .load(imageUrl)
//                .error(R.drawable.ic_launcher_foreground)
//                .transition(DrawableTransitionOptions.withCrossFade())
//                .centerCrop() //scale to fill the imageview
//                .into(binding.imageView)
//        }
//
//        CoroutineScope(Dispatchers.Main).launch {
//            Glide.with(binding.imageViewUser)
//                .load(userImage)
//                .error(R.drawable.ic_launcher_foreground)
//                .centerCrop() //scale to fill the imageview
//                .transition(DrawableTransitionOptions.withCrossFade())
//                .into(binding.imageViewUser)
//        }

        binding.textViewViews.text = views
        binding.textViewComments.text = comments
        binding.textViewDownloads.text = download
        binding.textViewLikes.text = likes.toString()
        binding.textView6.text = user
    }
}