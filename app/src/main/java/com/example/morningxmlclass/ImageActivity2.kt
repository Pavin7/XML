package com.example.morningxmlclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity2 : AppCompatActivity() {
    lateinit var alaskan:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)

        alaskan = findViewById(R.id.imageView2)

        alaskan.setOnClickListener {
            val dog = Intent(this,Imageintent::class.java)

            startActivity(dog)
        }
    }
}