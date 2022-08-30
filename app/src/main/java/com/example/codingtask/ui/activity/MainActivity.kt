package com.example.codingtask.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bumptech.glide.Glide
import com.bumptech.glide.MemoryCategory
import com.example.codingtask.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        val splashScreen = installSplashScreen()
        setContentView(R.layout.activity_main)

        // temporarily allow Glide to use more memory in certain parts of app.
        Glide.get(this).setMemoryCategory(MemoryCategory.HIGH);
    }

    override fun onDestroy() {
        super.onDestroy()
        //delete call save bitmaps from memory
        Glide.get(this).clearMemory();

    }
}