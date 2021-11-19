package com.example.mdpl

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next()
    }
    fun next(){

        val btn = findViewById<Button>(R.id.btn_login)

        btn.setOnClickListener(){

            intent = Intent(this,presensi::class.java)
            startActivity(intent)

        }


    }
}