package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var num1 = editTextNumber.text.toString()
            var num2 = editTextNumber2.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView6.text = "+"
            textView8.text = (num1.toDouble() + num2.toDouble()).toString()


        }
        button2.setOnClickListener {
            var num1 = editTextNumber.text.toString()
            var num2 = editTextNumber2.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView6.text = "/"
            textView8.text = (num1.toDouble() / num2.toDouble()).toString()

        }
        button3.setOnClickListener {
            var num1 = editTextNumber.text.toString()
            var num2 = editTextNumber2.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView6.text = "-"
            textView8.text = (num1.toDouble() - num2.toDouble()).toString()

        }
        button4.setOnClickListener {
            var num1 = editTextNumber.text.toString()
            var num2 = editTextNumber2.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView6.text = "%"
            textView8.text = (num1.toDouble() % num2.toDouble()).toString()

        }
        button5.setOnClickListener {
            var num1 = editTextNumber.text.toString()
            var num2 = editTextNumber2.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input Num1 and Num2",
                    Toast.LENGTH_SHORT
                ).show()
            textView6.text = "*"
            textView8.text = (num1.toDouble() * num2.toDouble()).toString()

        }
        button6.setOnClickListener {
            editTextNumber.text.clear()
            editTextNumber2.text.clear()
            textView6.text=""
            textView8.text=""

        }
    }
}
