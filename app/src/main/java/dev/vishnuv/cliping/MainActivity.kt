package dev.vishnuv.cliping

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mountainImage: ImageView = findViewById(R.id.image)

        val clipOutlineProvider = ClipOutlineProvider(24f)

        mountainImage.outlineProvider = clipOutlineProvider
        mountainImage.clipToOutline = true


    }
}

