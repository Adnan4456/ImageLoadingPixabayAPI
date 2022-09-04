package com.example.codingtask.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

class MainFragmentFactory
@Inject
constructor(
        //we need to pass all dependency that fragments needs
  )  :FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        return when(className){
            ImageFragment::class.java.name ->{
                ImageFragment()
            }
            BottomSheet::class.java.name ->{
                BottomSheet()
            }
            DetailFragment::class.java.name ->{
                DetailFragment()
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}