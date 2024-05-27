package com.example.Okta_Tugasfigma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.okta_tugasfigma.R
import com.example.okta_tugasfigma.home

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tombol Sign In
        val signInButton: Button = findViewById(R.id.signInButton)
        signInButton.setOnClickListener {
            val intent = Intent(this, home::class.java) // Ubah 'home' menjadi 'Home'
            startActivity(intent)
            finish()
        }

        // Tombol Register
        val registerText: TextView = findViewById(R.id.registerText)
        registerText.setOnClickListener {
            val intent = Intent(this, Daftar::class.java)
            startActivity(intent)
        }
    }
}
