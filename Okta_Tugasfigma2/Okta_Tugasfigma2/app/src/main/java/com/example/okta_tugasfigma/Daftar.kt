package com.example.Okta_Tugasfigma


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.okta_tugasfigma.R
import com.example.okta_tugasfigma.home


class Daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val registerButton: Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish()  // Menutup RegisterActivity sehingga tidak bisa kembali dengan tombol back
        }

        val signInText: TextView = findViewById(R.id.signInText)
        signInText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Menutup RegisterActivity sehingga tidak bisa kembali dengan tombol back
        }
    }
}
