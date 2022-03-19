package com.example.android_w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val intent = Intent(this, Onboarding1::class.java)
        startActivity(intent)
    }
}