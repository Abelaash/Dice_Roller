package com.abelaash.abelaashdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private var diceImage : ImageView? = null
    private var diceImage2 : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice(); rollDice2() }


        diceImage = findViewById(R.id.imageView)
        diceImage2 = findViewById(R.id.imageView2)
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        Toast.makeText(this, "Dice: $randomInt", Toast.LENGTH_SHORT).show()

        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage?.setImageResource(drawableResource)
    }

    private fun rollDice2() {
        val randomInt = Random().nextInt(6) + 1
        val t = Toast.makeText(this, "Dice: $randomInt", Toast.LENGTH_SHORT)
        t.setGravity(Gravity.TOP,0,0)
        t.show()

        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage2?.setImageResource(drawableResource)
    }
}
