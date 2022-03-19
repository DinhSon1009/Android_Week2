package com.example.android_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast


class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        val login = findViewById<ImageButton>(R.id.btn_login)
        val edtEmail = findViewById<EditText>(R.id.tv_email)
        val edtPassword = findViewById<EditText>(R.id.tv_pass)
        if(login!=null && edtEmail!=null && edtPassword!=null){
            login.setOnClickListener {
                val email = edtEmail.text.toString()
                val password = edtPassword.text.toString()

                if(email == "ronaldo@gmail.com" && password == "123456"){
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                }else {
                    Toast.makeText(applicationContext,
                        "email or password sai", Toast.LENGTH_SHORT).show()
                }
            }
        }
        var buttonSignIn = findViewById<ImageButton>(R.id.btn_login)
        buttonSignIn.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        supportActionBar?.hide();
        /* window.decorView.apply {
             // Hide both the navigation bar and the status bar.
             // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
             // a general rule, you should design your app to hide the status bar whenever you
             // hide the navigation bar.
             systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
         }*/
    }
}
