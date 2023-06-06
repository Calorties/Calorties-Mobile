package com.capstoneproject.calorties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val emailfield = findViewById<EditText>(R.id.email)
        val usernamefield = findViewById<EditText>(R.id.username)
        val passwordfield = findViewById<EditText>(R.id.password)
        val passConfirmfield = findViewById<EditText>(R.id.pass_confirm)
        val tinggiBadanfield = findViewById<EditText>(R.id.tinggi_badan)
        val beratBadanfield = findViewById<EditText>(R.id.berat_badan)
        val register = findViewById<Button>(R.id.registration)
        val login = findViewById<Button>(R.id.login)

        register.setOnClickListener {
            val email = emailfield.text.toString();
            val username = usernamefield.text.toString();
            val password = passwordfield.text.toString();
            val passConfirm = passConfirmfield.text.toString();
            val tb = tinggiBadanfield.text;
            val bb = beratBadanfield.text;
            if (isEmpty(email)|| isEmpty(username)|| isEmpty(password)|| isEmpty(passConfirm)|| isEmpty(tb)|| isEmpty(bb)){
                Toast.makeText(this@Register,"Please fill all fields", Toast.LENGTH_LONG).show()
            } else {

            }
        }
    }
}