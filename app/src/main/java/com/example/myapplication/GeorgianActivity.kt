package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class GeorgianActivity : AppCompatActivity() {

    private lateinit var addbutton3: Button
    private lateinit var edittextnumber7: EditText
    private lateinit var edittextnumber8: EditText
    private lateinit var edittextnumber9: EditText
    private lateinit var gobacktoordering3: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_georgian)

        addbutton3 = findViewById(R.id.addbutton3)
        edittextnumber7 = findViewById(R.id.editTextNumber7)
        edittextnumber8 = findViewById(R.id.editTextNumber8)
        edittextnumber9 = findViewById(R.id.editTextNumber9)
        gobacktoordering3 = findViewById(R.id.goBackToOrdering3)

        gobacktoordering3.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }


        addbutton3.setOnClickListener {
            val edittext1 = edittextnumber7.text.toString()
            val edittext2 = edittextnumber8.text.toString()
            val edittext3 = edittextnumber9.text.toString()

            if (edittext1.isEmpty() || edittext2.isEmpty() || edittext3.isEmpty()) {
                Toast.makeText(this, "ცარიელია!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "დამატებულია!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}