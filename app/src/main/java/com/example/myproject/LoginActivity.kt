package com.example.myproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    lateinit var btnlogin:Button
    lateinit var etEmail:EditText
    lateinit var Email:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_relative)

        btnlogin = findViewById(R.id.btn_login)
        etEmail = findViewById(R.id.et_email)
        btnlogin.setOnClickListener {
            Toast.makeText(applicationContext,etEmail.text.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}
