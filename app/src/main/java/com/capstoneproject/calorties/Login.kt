package com.capstoneproject.calorties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.login)
//        var register = findViewById(R.id.registration) as Button

        login.setOnClickListener {
            val username = username.text
            val password = password.text
            Toast.makeText(this@Login, username, Toast.LENGTH_LONG).show()
        }
    }
}