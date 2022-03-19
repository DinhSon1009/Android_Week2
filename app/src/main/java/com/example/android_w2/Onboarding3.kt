package com.example.android_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)
        val btn3 = findViewById<ImageButton>(R.id.imgButton3)
        btn3.setOnClickListener {
            val intent = Intent(this,Welcome::class.java)
            startActivity(intent)
        }
    }
}