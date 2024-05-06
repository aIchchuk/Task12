package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var emailInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        emailInput = findViewById(R.id.idEmail)
        passwordInput = findViewById(R.id.idPassword)
        loginBtn = findViewById(R.id.idLogin)

        loginBtn.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }



    }
}