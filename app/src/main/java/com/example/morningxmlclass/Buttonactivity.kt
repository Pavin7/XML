package com.example.morningxmlclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Buttonactivity : AppCompatActivity() {
    lateinit var buttonintent:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttonactivity)

        //intent
        buttonintent = findViewById(R.id.btn6)
        buttonintent.setOnClickListener {
            var gointent = Intent(this, Intentactivity::class.java)
            startActivity(gointent)
        }
    }
}