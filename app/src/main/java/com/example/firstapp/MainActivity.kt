package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtMsg = findViewById<TextView>(R.id.txtMsg)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            txtMsg.text = getString(R.string.txt_after_button)
        }
    }
}