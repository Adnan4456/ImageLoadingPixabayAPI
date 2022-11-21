package com.example.codingtask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.ExperimentalPagingApi
import com.example.codingtask.R
import com.example.codingtask.databinding.FragmentImageBinding
import com.example.codingtask.ui.adapter.LoadingStateAdapter
import com.example.codingtask.ui.adapter.MyPagingAdapter
import com.example.codingtask.ui.viewmodels.MainViewModel
import com.example.codingtask.utils.InternetStatus
import com.example.codingtask.utils.hideKeyboard
import com.example.codingtask.utils.showSnackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@AndroidEntryPoint
class ImageFragment : Fragment(R.layout.fragment_image) , LifecycleObserver {

    private lateinit var binding: FragmentImageBinding
    private val viewModel:MainViewModel by viewModels()

    @Inject
    lateinit var internetStatus:InternetStatus

    lateinit var myAdapter:MyPagingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImageBinding.inflate(inflater, container, false)
        myAdapter  = MyPagingAdapter(MyPagingAdapter.OnClickListener { photo ->
            val action = ImageFragmentDirections.actionImageFragmentToBottomSheet(photo)
            findNavController().navigate(action)
        })

        viewModel.searchQuery.value?.let { searchImage("fruits") }

        binding.searchLayout.setEndIconOnClickListener {

            if (internetStatus.isOnline(requireContext())){

                searchImage(binding.searchLayout.editText?.text.toString())
                binding.progressBar.isVisible = true

//                extension function to hide keyboard
                hideKeyboard()
                //Make search bar invisibile
                setVisibility()
            }
            else
            {
                showSnackbar("Internet is not connected")
            }
        }

        binding.imageRecycler.adapter = myAdapter.withLoadStateHeaderAndFooter(
            header = LoadingStateAdapter{myAdapter.retry()},
            footer = LoadingStateAdapter{myAdapter.retry()}
        )

        binding.imageFramgnet = this
        return binding.root
    }

    fun setVisibility(){
       if (binding.searchLayout.isVisible){
           val slidUp = AnimationUtils.loadAnimation(requireContext(),R.anim.slide_up)
           binding.searchLayout.startAnimation(slidUp)
           binding.searchLayout.visibility = View.GONE

       }
       else
       {
           val falldown = AnimationUtils.loadAnimation(requireContext(),R.anim.fall_down)
           binding.search.setText("")
           binding.searchLayout.visibility = View.VISIBLE
           binding.searchLayout.startAnimation(falldown)
       }
   }

    @OptIn(ExperimentalPagingApi::class)
    private fun searchImage(query: String){

        lifecycleScope.launchWhenStarted {

            viewModel.getAllImages(query).collectLatest { response ->

                binding.imageRecycler.visibility = View.VISIBLE
                binding.progressBar.visibility = View.GONE

                myAdapter.submitData(response)
            }
        }
    }
}

