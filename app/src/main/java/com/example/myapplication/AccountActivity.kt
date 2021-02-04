package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class AccountActivity : AppCompatActivity() {

    private lateinit var userInfoTextView: TextView
    private lateinit var passwordChangeButton: Button
    private lateinit var logoutButton: Button
    private lateinit var backToOrderingButton: ImageButton

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        mAuth = FirebaseAuth.getInstance()

        userInfoTextView = findViewById(R.id.userInfoTextview)
        passwordChangeButton = findViewById(R.id.goToPasswordChangeButton)
        logoutButton = findViewById(R.id.logoutButton)
        backToOrderingButton = findViewById(R.id.backToOrderingButton)

        userInfoTextView.text = mAuth.currentUser?.uid

        passwordChangeButton.setOnClickListener {
            startActivity(Intent(this, PasswordChangeActivity::class.java))
            finish()
        }

        logoutButton.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        backToOrderingButton.setOnClickListener {
            startActivity(Intent(this, Page1Activity::class.java))
            finish()
        }

    }
}