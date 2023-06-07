package com.example.morningxmlclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Imageintent : AppCompatActivity() {
    lateinit var stoks:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageintent)
        stoks = findViewById(R.id.BtnStk)


        stoks.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let{startActivity(it)}
        }
    }
}