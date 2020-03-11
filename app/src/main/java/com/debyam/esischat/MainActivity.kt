package com.debyam.esischat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register_button.setOnClickListener {
            val email = email_edit.text.toString()
            val password = password_edit.text.toString()

            Log.d("MainActivity","the email is $email")
            Log.d("MainActivity","the email is $password")
        }

        have_compte.setOnClickListener {
            Log.d("MainActivity","do you have a compte")

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
