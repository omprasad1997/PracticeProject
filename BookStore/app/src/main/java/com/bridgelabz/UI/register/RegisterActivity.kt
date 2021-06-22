package com.bridgelabz.UI.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.bridgelabz.bookstore.R

class RegisterActivity : AppCompatActivity() {
    private lateinit var enteredUserName: EditText
    private lateinit var enteredEmail: EditText
    private lateinit var enteredPassword: EditText
    private lateinit var enteredConfirmPassword: EditText
    private lateinit var register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = "Register"
        initializationOfViews()
    }

    private fun initializationOfViews() {
        enteredUserName = findViewById(R.id.userName)
        enteredEmail = findViewById(R.id.email)
        enteredPassword = findViewById(R.id.password)
        enteredConfirmPassword = findViewById(R.id.confirmPassword)
        register = findViewById(R.id.register)
    }


    fun alreadyRegistered(view: View) {
        finish()
    }
}