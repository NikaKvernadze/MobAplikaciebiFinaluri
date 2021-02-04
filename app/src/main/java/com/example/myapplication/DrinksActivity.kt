package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class DrinksActivity : AppCompatActivity() {


    private lateinit var addbutton4: Button
    private lateinit var edittextnumber10: EditText
    private lateinit var edittextnumber11: EditText
    private lateinit var edittextnumber12: EditText
    private lateinit var gobacktoordering4: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinks)

        addbutton4 = findViewById(R.id.addbutton4)
        edittextnumber10 = findViewById(R.id.editTextNumber10)
        edittextnumber11 = findViewById(R.id.editTextNumber11)
        edittextnumber12 = findViewById(R.id.editTextNumber12)
        gobacktoordering4 = findViewById(R.id.goBackToOrdering4)

        gobacktoordering4.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }


        addbutton4.setOnClickListener {
        val edittext10 = edittextnumber10.text.toString()
        val edittext11 = edittextnumber11.text.toString()
        val edittext12 = edittextnumber12.text.toString()

        if (edittext10.isEmpty() || edittext11.isEmpty() || edittext12.isEmpty()) {
            Toast.makeText(this, "ცარიელია!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "დამატებულია!", Toast.LENGTH_SHORT).show()
        }
        }

    }
}