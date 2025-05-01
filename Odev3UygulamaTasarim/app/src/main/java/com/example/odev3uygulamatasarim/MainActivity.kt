package com.example.numberguessinggame

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var randomNumber = 0
    private var guessCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtResult = findViewById<TextView>(R.id.txtResult)
        val edtGuess = findViewById<EditText>(R.id.edtGuess)
        val btnCheck = findViewById<Button>(R.id.btnCheck)

        // Generate a number between 1 and 100
        randomNumber = (1..100).random()

        btnCheck.setOnClickListener {
            val guessText = edtGuess.text.toString()
            val guess = guessText.toIntOrNull()

            if (guess == null) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            guessCount++

            when {
                guess < randomNumber -> txtResult.text = "Try a higher number"
                guess > randomNumber -> txtResult.text = "Try a lower number"
                else -> {
                    txtResult.text = "🎉 Congrats! You guessed it in $guessCount tries!"
                    guessCount = 0
                    randomNumber = (1..100).random()
                    Toast.makeText(this, "New number is generated!", Toast.LENGTH_SHORT).show()
                }
            }
            when {
                guess < randomNumber -> {
                    txtResult.text = "Try a higher number"
                    txtResult.setTextColor(Color.RED)
                }
                guess > randomNumber -> {
                    txtResult.text = "Try a lower number"
                    txtResult.setTextColor(Color.RED)
                }
                else -> {
                    txtResult.text = "🎉 Correct! You guessed in $guessCount tries!"
                    txtResult.setTextColor(Color.GREEN)
                    ...
                }
            }


            edtGuess.text.clear()

            val txtGuessCount = findViewById<TextView>(R.id.txtGuessCount)

            guessCount++
            txtGuessCount.text = "Attempts: $guessCount"

        }
    }
}
