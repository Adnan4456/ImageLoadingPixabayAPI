package com.example.codingtask.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.codingtask.R
import com.example.codingtask.databinding.FragmentImageBinding
import com.example.codingtask.ui.adapter.PixabayAdapter
import com.example.codingtask.ui.viewmodels.PixabayViewModel
import com.example.codingtask.utils.InternetStatus
import com.example.codingtask.utils.Resource
import com.example.codingtask.utils.hideKeyboard
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class ImageFragment : Fragment(R.layout.fragment_image) {
    private lateinit var binding: FragmentImageBinding
    private val viewModel: PixabayViewModel by viewModels()
    private lateinit var pixabayAdapter: PixabayAdapter
    private var internetStatus:InternetStatus = InternetStatus()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        pixabayAdapter  = PixabayAdapter(PixabayAdapter.OnClickListener { photo ->

            val action = ImageFragmentDirections.actionImageFragmentToBottomSheet(photo)
            findNavController().navigate(action)
        })

        viewModel.searchQuery.value?.let { subscribeOnline(it) }
        binding.searchLayout.setEndIconOnClickListener {

            if (internetStatus.isOnline(requireContext())){
                Log.d("connect", "Internet is  connected")
                subscribeOnline(binding.searchLayout.editText?.text.toString())
                binding.progressBar.isVisible = true
                hideKeyboard()
            }
            else
            {
                Log.d("connect", "Internet is not connected")
            }
        }

        return binding.root
    }

    private fun subscribeOnline(query: String) {
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.getImages(query).collect { result ->
                when (result) {
                    is Resource.Success -> {
                        binding.progressBar.isVisible = false
                        binding.imageRecycler.isVisible = true
                        if (result.data?.isEmpty()!!) {
                            Toast.makeText(requireContext(), "No Images found ", Toast.LENGTH_LONG).show()
                        } else {
                            val pix = result.data
                            pixabayAdapter.submitList(pix)
                            binding.imageRecycler.adapter = pixabayAdapter
                            Timber.d("${result.data}")
                        }
                    }
                    is Resource.Error -> {
                        binding.progressBar.isVisible = true

                    }
                    is Resource.Loading -> {
                        binding.progressBar.isVisible = true

                    }
                }
            }
        }
    }
}

