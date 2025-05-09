package com.example.odev4hesapmakinesii

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var resultText : TextView
    private var currentInput = ""
    private var total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.resultText)
    }
    fun onDigitClick(view: View) {
        val digit = (view as Button).text.toString()
        currentInput += digit
        resultText.text = currentInput
    }
    fun onOperatorClick(view: View) {
        if (currentInput.isNotEmpty()) {
            total += currentInput.toInt()
            currentInput = ""
            resultText.text = total.toString()
        }
    }
    fun onEqualsClick(view: View) {
        if (currentInput.isNotEmpty()) {
            total += currentInput.toInt()
            resultText.text = total.toString()
            currentInput = ""
        }
    }
    fun onClearClick(view: View) {
        total = 0
        currentInput = ""
        resultText.text = "0"
    }
}