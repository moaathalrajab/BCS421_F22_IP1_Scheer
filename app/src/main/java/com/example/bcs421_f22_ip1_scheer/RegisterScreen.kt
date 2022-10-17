package com.example.bcs421_f22_ip1_scheer

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.jetbrains.annotations.NotNull

lateinit var etFirstNameR: EditText
lateinit var etLastNameR: EditText
lateinit var etDOB: EditText
lateinit var etEmail: EditText
lateinit var etUserNameR: EditText
lateinit var etPasswordR: EditText
lateinit var tvRegister: TextView
lateinit var btRegister: Button

class RegisterScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        etFirstNameR = findViewById(R.id.rFirstName)
        etLastNameR = findViewById(R.id.rLastName)
        etDOB = findViewById(R.id.rDOB)
        etEmail = findViewById(R.id.rEmail)


        etUserNameR = findViewById(R.id.rUserName)
        etPasswordR = findViewById(R.id.rPassword)
        btRegister = findViewById(R.id.registerbtn)
        tvRegister = findViewById(R.id.rRegister)
        btRegister.setOnClickListener { registerCreate() }
    }

    fun registerCreate() {
        //etUserName.getText().toString()

        if(etFirstNameR.getText().toString().isNotEmpty() //Makes sure all requirements are fullfilled
            && etLastNameR.getText().toString().isNotEmpty()
            && etDOB.getText().toString().isNotEmpty()
            && etEmail.getText().toString().isNotEmpty()
            && etPasswordR.getText().toString().isNotEmpty()){
                val intent = Intent(this@RegisterScreen, MainActivity::class.java)
                startActivity(intent)
                Toast.makeText( this, "REGISTRATION SUCCESSFUL", Toast.LENGTH_SHORT).show();
        } //if any requirements aren't met turns field red and changes text to what must be done
        else {
            if(etFirstNameR.getText().toString().length < 3
                || etFirstNameR.getText().toString().length > 30)
            {
                if(etFirstNameR.getText().toString().isEmpty())
                {
                    etFirstNameR.setBackgroundResource(R.color.red)
                    etFirstNameR.setHint("Missing First Name")}
                else{
                etFirstNameR.setBackgroundResource(R.color.red)
                etFirstNameR.setHint("First Name must be Bewteen 3 and 30 characters")
                }
            }
                else
                {
                    etFirstNameR.setBackgroundResource(R.color.green)
                }

            if(etLastNameR.getText().toString().length < 3
                || etLastNameR.getText().toString().length > 30)
            {
                if(etLastNameR.getText().toString().isEmpty())
                {
                    etLastNameR.setBackgroundResource(R.color.red)
                    etLastNameR.setHint("Missing Last Name")}
                else{
                    etLastNameR.setBackgroundResource(R.color.red)
                    etLastNameR.setHint("Last Name must be Bewteen 3 and 30 characters")
                }
            }
            else
            {
                etLastNameR.setBackgroundResource(R.color.green)
            }

            if(etDOB.getText().toString().isEmpty())
            {
                etDOB.setBackgroundResource(R.color.red)
                etDOB.setHint("Missing Date of Birth")}
                else
                {
                    etDOB.setBackgroundResource(R.color.green)
                }

            if(etEmail.getText().toString().isEmpty()
                || etEmail.getText().toString().contains("@"))
            {
                if(etEmail.getText().toString().isEmpty())
                {
                    etEmail.setBackgroundResource(R.color.red)
                    etEmail.setHint("Missing Email")
                }
                else {
                    etEmail.setBackgroundResource(R.color.red)
                    etEmail.setHint("Email must contain '@'")
                }
            }
                else
                {
                    etEmail.setBackgroundResource(R.color.green)
                }

            if(etUserNameR.getText().toString().isEmpty())
            {
                etUserNameR.setBackgroundResource(R.color.red)
                etUserNameR.setHint("Missing Username")
            }
                else
                {
                    etUserNameR.setBackgroundResource(R.color.green)
                }

            if(etPasswordR.getText().toString().isEmpty())
            {
                etPasswordR.setBackgroundResource(R.color.red)
                etPasswordR.setHint("Missing Password")
            }
                else
                {
                    etPasswordR.setBackgroundResource(R.color.green)
                }
        }
    }
}