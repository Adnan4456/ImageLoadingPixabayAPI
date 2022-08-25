package com.example.codingtask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.codingtask.R
import com.example.codingtask.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.fragment_detail) {
    private val args: DetailFragmentArgs by navArgs()
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
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

        CoroutineScope(Dispatchers.Main).launch {
            Glide.with(binding.imageView)
                .load(imageUrl)
                .placeholder(R.drawable.ic_person)
                .error(R.drawable.ic_launcher_foreground)
                .centerCrop() //scale to fill the imageview
                .into(binding.imageView)
        }

        CoroutineScope(Dispatchers.Main).launch {
            Glide.with(binding.imageViewUser)
                .load(userImage)
                .placeholder(R.drawable.ic_person)
                .error(R.drawable.ic_launcher_foreground)
                .centerCrop() //scale to fill the imageview
                .into(binding.imageViewUser)
        }



        binding.textViewViews.text = views
        binding.textViewComments.text = comments
        binding.textViewDownloads.text = download
        binding.textViewLikes.text = likes.toString()
        binding.textView6.text = user

    }
}