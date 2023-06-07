package com.example.morningxmlclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Formactivity : AppCompatActivity() {
    //var
    lateinit var feedback:Button
    lateinit var pay:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formactivity)

        feedback = findViewById(R.id.button2)

        //onclick
        feedback.setOnClickListener {
            var feed=Intent(this,Buttonactivity::class.java)
            startActivity(feed)
        }
        //find pay
        pay = findViewById(R.id.btnpay)

        //intent
        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let{startActivity(it)}
        }


    }
}