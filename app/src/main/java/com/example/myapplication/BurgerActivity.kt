package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class BurgerActivity : AppCompatActivity() {

    private lateinit var addbutton1: Button
    private lateinit var edittextnumber: EditText
    private lateinit var edittextnumber2: EditText
    private lateinit var edittextnumber3: EditText
    private lateinit var gobacktoordering1: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)

        addbutton1 = findViewById(R.id.addbutton1)
        edittextnumber = findViewById(R.id.editTextNumber)
        edittextnumber2 = findViewById(R.id.editTextNumber2)
        edittextnumber3 = findViewById(R.id.editTextNumber3)
        gobacktoordering1 = findViewById(R.id.goBackToOrdering1)

        gobacktoordering1.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }


        addbutton1.setOnClickListener {
            val edittext1 = edittextnumber.text.toString()
            val edittext2 = edittextnumber2.text.toString()
            val edittext3 = edittextnumber3.text.toString()

            if (edittext1.isEmpty() || edittext2.isEmpty() || edittext3.isEmpty()) {
                Toast.makeText(this, "ცარიელია!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "დამატებულია!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}