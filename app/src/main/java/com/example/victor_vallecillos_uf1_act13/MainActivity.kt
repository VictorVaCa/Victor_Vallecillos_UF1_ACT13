package com.example.victor_vallecillos_uf1_act13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val buttonToSecond = findViewById<Button>(R.id.button_to_second)
        val buttonToThird = findViewById<Button>(R.id.button_to_third)

        buttonToSecond.setOnClickListener {
            val intent = Intent(this, GridLayout::class.java)
            startActivity(intent)
        }

        buttonToThird.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
    }
}