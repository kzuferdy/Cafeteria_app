package com.kzuferdy.cafeteria_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iv_pesanan.setOnClickListener {
            var intent = Intent(this@MainActivity, FormPesanan::class.java)
            startActivity(intent)
        }
        iv_menu.setOnClickListener {
            var intent = Intent(this@MainActivity, MenuCafe::class.java)
            startActivity(intent)
        }
        }
    }