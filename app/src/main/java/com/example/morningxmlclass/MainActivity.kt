package com.example.morningxmlclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //DECLARE BUTTON
    lateinit var toast:Button
    lateinit var info:Button


    //FINDVIEWBYID
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast = findViewById(R.id.btn1)
        toast.setOnClickListener {
            Toast.makeText(applicationContext,"you did it succesfully",Toast.LENGTH_LONG).show()
        }
        toast = findViewById(R.id.btn2)
        toast.setOnClickListener {
            Toast.makeText(applicationContext,"you did it succesfully,Good boy",Toast.LENGTH_LONG).show()
        }

        //BTN3
        info=findViewById(R.id.btn3)
       info.setOnClickListener {
           Toast.makeText(applicationContext,"wow nice",Toast.LENGTH_LONG).show()
           var myinfo = Intent(this,Formactivity::class.java)
           startActivity(myinfo)
       }


        }
    }
