package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class PizzaActivity : AppCompatActivity() {

    private lateinit var addbutton2: Button
    private lateinit var gobacktoordering2: ImageButton
    private lateinit var edittextnumber4: EditText
    private lateinit var edittextnumber5: EditText
    private lateinit var edittextnumber6: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        addbutton2 = findViewById(R.id.addButton2)
        edittextnumber4 = findViewById(R.id.editTextNumber4)
        edittextnumber5 = findViewById(R.id.editTextNumber5)
        edittextnumber6 = findViewById(R.id.editTextNumber6)
        gobacktoordering2 = findViewById(R.id.goBackToOrdering2)

        gobacktoordering2.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
            finish()
        }


        addbutton2.setOnClickListener {
            val edittext4 = edittextnumber4.text.toString()
            val edittext5 = edittextnumber5.text.toString()
            val edittext6 = edittextnumber6.text.toString()

            if (edittext4.isEmpty() || edittext5.isEmpty() || edittext6.isEmpty()) {
                Toast.makeText(this, "ცარიელია!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "დამატებულია!", Toast.LENGTH_LONG).show()
            }
        }

    }
}