package com.example.android_w2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout;
class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

            val login  = findViewById<MaterialButton>(R.id.btn_login)
            login.setOnClickListener {
            val edtEmail = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.edt_email_1)
            val edtPassword = findViewById<EditText>(R.id.tv_pass)
            val mail =  edtEmail.editText?.text.toString().trim()
            val password = edtPassword.text.toString().trim()
            val intent = Intent(this, Profile::class.java)
            val email ="ronaldo@gmail.com"
            val pass="123456"
            if(mail==email && password==pass) {
               startActivity(intent)
           }
       }
    }
}
