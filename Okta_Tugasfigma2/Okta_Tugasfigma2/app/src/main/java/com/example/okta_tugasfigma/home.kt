package com.example.okta_tugasfigma

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.content.Intent

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
    fun favorite (view: View) {
        Intent(this, Favorite::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun toflashsale (view: View) {
        Intent(this, flashsale::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun barang (view: View) {
        Intent(this, detailbarang::class.java).also {
            startActivity(it)
            finish()
        }
    }
}