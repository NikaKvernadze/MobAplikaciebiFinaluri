package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Page1Activity : AppCompatActivity() {

    private lateinit var orderButton: Button
    private lateinit var accountButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        orderButton = findViewById(R.id.orderButton)
        accountButton = findViewById(R.id.accountButton)


        accountButton.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }

        orderButton.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }

    }
}