package com.example.android_w2

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.*
import kotlinx.android.synthetic.main.edit_profile.view.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide();


        val textView26=findViewById<TextView>(R.id.textview30)
        val textView25=findViewById<TextView>(R.id.tv_EditProfile)
        val textView19=findViewById<TextView>(R.id.edt_full_name_input)
        val textView20=findViewById<TextView>(R.id.edt_email_input)
        val textView21=findViewById<TextView>(R.id.edt_phone_input)

        textView26.setOnClickListener {
            //Inflate the dialog with custom view
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.edit_profile, null)
            //AlertDialogBuilder
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("Edit Profile")
            //show dialog
            val  mAlertDialog = mBuilder.show()
            //login button click of custom layout
            mDialogView.dialogLoginBtn.setOnClickListener {
                //dismiss dialog
                mAlertDialog.dismiss()
                //get text from EditTexts of custom layout
                val name = mDialogView.dialogNameEt.text.toString()
                val email = mDialogView.dialogEmailEt.text.toString()
                val password = mDialogView.dialogPasswEt.text.toString()
                //set the input text in TextView
                //   mainInfoTv.setText("Name:"+ name +"\nEmail: "+ email +"\nPassword: "+ password)
                textView25.setText(name)
                textView19.setText(name)
                textView20.setText(email)
                textView21.setText(password)

            }
            //cancel button click of custom layout
            mDialogView.dialogCancelBtn.setOnClickListener {
                //dismiss dialog
                mAlertDialog.dismiss()
            }
        }

        val imageView9=findViewById<ImageView>(R.id.btn_back)
        imageView9.setOnClickListener{
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }
    }
}