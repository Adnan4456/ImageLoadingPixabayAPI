package com.example.codingtask.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.codingtask.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_confirm_dialog.*


class BottomSheet : BottomSheetDialogFragment() {

    private val args:BottomSheetArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_confirm_dialog,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val image = args.id
        btn_yes.setOnClickListener{
            val action = BottomSheetDirections.actionBottomSheetToDetailFragment(image)
            findNavController().navigate(action)
        }

        btn_no.setOnClickListener{
            dismiss()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","Bottom sheet dialog on destory called")
    }
}