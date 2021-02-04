package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class OrderActivity : AppCompatActivity() {

    private lateinit var backToPage1Button: ImageButton
    private lateinit var burgerButton: ImageButton
    private lateinit var pizzaButton: ImageButton
    private lateinit var georgianButton: ImageButton
    private lateinit var drinksButton: ImageButton
    private lateinit var orderButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        backToPage1Button = findViewById(R.id.backToPage1)
        burgerButton = findViewById(R.id.burgerImageButton)
        pizzaButton = findViewById(R.id.pizzaImageButton)
        georgianButton = findViewById(R.id.georgianImageButton)
        drinksButton = findViewById(R.id.drinksImageButton)
        orderButton = findViewById(R.id.orderFinishButton)

        orderButton.setOnClickListener {
            startActivity(Intent(this, Page1Activity::class.java))
            Toast.makeText(this, "შეკვეთილია!", Toast.LENGTH_SHORT).show()
            finish()
        }

        backToPage1Button.setOnClickListener {
            startActivity(Intent(this, Page1Activity::class.java))
            finish()
        }

        burgerButton.setOnClickListener {
            startActivity(Intent(this, BurgerActivity::class.java))
            finish()
        }

        pizzaButton.setOnClickListener {
            startActivity(Intent(this, PizzaActivity::class.java))
            finish()
        }

        georgianButton.setOnClickListener {
            startActivity(Intent(this, GeorgianActivity::class.java))
            finish()
        }

        drinksButton.setOnClickListener {
            startActivity(Intent(this, DrinksActivity::class.java))
            finish()
        }

    }
}