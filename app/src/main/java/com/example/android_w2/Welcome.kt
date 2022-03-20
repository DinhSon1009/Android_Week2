package com.example.android_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton
class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val btnSkip = findViewById<MaterialButton>(R.id.btn_skip)
        btnSkip.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
        val btnSignIn = findViewById<TextView>(R.id.tv_signIn)
        btnSignIn.setOnClickListener {
            val intent = Intent(this,Signin::class.java)
            startActivity(intent)
        }

        val btnSignUp = findViewById<MaterialButton>(R.id.btn_start)
        btnSignUp.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}