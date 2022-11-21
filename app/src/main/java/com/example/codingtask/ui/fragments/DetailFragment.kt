package com.example.codingtask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.codingtask.R
import com.example.codingtask.data.local.entity.Pixabay
import com.example.codingtask.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint

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

    //calling this function from XML file on click
     fun VisibilityStatus(){

        if (binding.expandableLayout.visibility == View.GONE) {

            binding.expandableLayout.visibility = View.VISIBLE
            binding.dropdown.setImageResource(R.drawable.ic_drop_up)

        } else {
            binding.expandableLayout.visibility = View.GONE
            binding.dropdown.setImageResource(R.drawable.ic_drop_down)
        }

    }
}