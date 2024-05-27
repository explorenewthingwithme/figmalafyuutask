package com.example.okta_tugasfigma

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.view.View
import androidx.activity.enableEdgeToEdge


class detailbarang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailbarang)
    }
    fun backtoHome(view: View) {
        Intent(this, home::class.java).also {
            startActivity(it)
            finish()
        }
    }
}