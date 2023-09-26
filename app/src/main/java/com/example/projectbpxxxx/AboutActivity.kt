package com.example.projectbpxxxx

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //instance
        val call:ImageView = findViewById(R.id.imageViewCall)
        val web:ImageView = findViewById(R.id.imageViewWeb)
        val location:ImageView = findViewById(R.id.imageViewLocation)

        //dial number
        call.setOnClickListener {
            val callIntent: Intent= Uri.parse("tel:085743439096").let {
                    number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        //website
        web.setOnClickListener {
            val webIntent:Intent = Uri.parse("https://home.amikom.ac.id/").let{
                webpage->Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

        //lokasi
        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }
    }
}