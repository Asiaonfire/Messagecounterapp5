package com.example.messagecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        plusButton.setOnClickListener {
            counter++
            counterText.text = counter.toString()
        }

        resetButton.setOnClickListener {
            counter = 0
            counterText.text = counter.toString()
        }
    }
}

