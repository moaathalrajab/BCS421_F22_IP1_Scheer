package com.example.bcs421_f22_ip1_scheer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
lateinit var etUserName: EditText
lateinit var etPassword: EditText
lateinit var btLogin: Button
lateinit var tfRegister: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUserName = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)
        btLogin = findViewById(R.id.loginbtn)
        tfRegister = findViewById(R.id.register)

        btLogin.setOnClickListener{loginAttempt()}
        tfRegister.setOnClickListener{registerScreen()}
    }
    fun loginAttempt() { //Compares typed Username and Password to register Username and Password
        if (etUserName.getText().toString().equals(etUserNameR.getText().toString())
            && etPassword.getText().toString().equals(etPasswordR.getText().toString())
        ) {
            Toast.makeText(this@MainActivity, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this@MainActivity, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
        }
    }
    fun registerScreen(){ //Switches to register activity if clicked on
        val intent = Intent(this@MainActivity, RegisterScreen::class.java)
        startActivity(intent)
    }
}