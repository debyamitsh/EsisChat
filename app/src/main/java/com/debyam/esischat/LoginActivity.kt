package com.debyam.esischat

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        dont_have_compte.setOnClickListener {
            Log.d("MainActivity","do you have a compte")

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}