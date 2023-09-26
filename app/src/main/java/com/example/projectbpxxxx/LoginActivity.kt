package com.example.projectbpxxxx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)

        //event saat button Login click
        btnLogin.setOnClickListener{
            //call homepage
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}