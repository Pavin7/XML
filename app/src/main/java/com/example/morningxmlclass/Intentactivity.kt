package com.example.morningxmlclass

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class Intentactivity : AppCompatActivity() {
    //VARS
    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var stk :Button
    lateinit var call :Button
    lateinit var images:Button
    lateinit var back:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentactivity)
        //FINDVIEW
        sms =  findViewById(R.id.BtnSms)
        email = findViewById(R.id.BtnEmail)
        share = findViewById(R.id.BtnShare)
        camera = findViewById(R.id.BtnCamera)
        stk = findViewById(R.id.BtnStk)
        call = findViewById(R.id.BtnCall)

        //INTENT
        sms.setOnClickListener {
            val uri = Uri.parse("smsto:0708693634")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body","hi pavin,..")
            startActivity(intent)
        }
        //mail
        email.setOnClickListener {
            val emailintent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","pavinwere10@gmail.com",null))
            emailintent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION")
            emailintent.putExtra(Intent.EXTRA_TEXT,"DEAR SIR")
            startActivity(Intent.createChooser(emailintent,"send email..."))
        }

        //share
        share.setOnClickListener {
            val shareintent = Intent(Intent.ACTION_SEND)
            shareintent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareintent.type = "text/plain"
            shareintent.putExtra(Intent.EXTRA_TEXT,"https://github.com/Pavin7/")
            startActivity(shareintent)
        }

        //CAMERA
        camera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent,1)
        }

        //stk
        stk.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let{startActivity(it)}
        }

        //call
        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0705744919")
            startActivity(dialIntent)
        }
        //Image
        images = findViewById(R.id.btnphoto)
        images.setOnClickListener {
            val img = Intent(this,ImageActivity2::class.java)
            startActivity(img)
        }
        back = findViewById(R.id.btnback)
        back.setOnClickListener {
            val bck = Intent(this,BackgroundImage::class.java)
            startActivity(bck)
        }

    }


}