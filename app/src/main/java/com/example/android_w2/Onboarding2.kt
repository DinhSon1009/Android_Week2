package com.example.android_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)
        val btn2 = findViewById<ImageButton>(R.id.imgButton2)
        btn2.setOnClickListener {
            val intent = Intent(this,Onboarding3::class.java)
            startActivity(intent)
        }
    }
}