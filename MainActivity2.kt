package com.example.practicumexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.practicumexam.R.id

class MainActivity2 : AppCompatActivity() {
    private val screenTime = IntArray(3)

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)

        val submitButton = findViewById<Button>(id.submit)
        val clearButton = findViewById<Button>(id.clear)
        val weeklyButton = findViewById<Button>(id.btnweekly)
        val avgtempButton = findViewById<Button>(id.btntemp)
        val weeklyweather = findViewById<EditText>(id.weeklyweather)
        val avgtemperature = findViewById<EditText>(id.avgtemperature)

        findViewById<Button>(R.id.clear).setOnClickListener {
            screenTime.fill(0)
            submitButton.text.javaClass
            clearButton.text.javaClass
            weeklyButton.text.javaClass
            avgtempButton.text.javaClass
            weeklyweather.text.javaClass
            avgtemperature.text.javaClass
            Toast.makeText(this, "Data cleared. You can re-enter.", Toast.LENGTH_SHORT).show()
        }

            submitButton.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java).apply {
                    putExtra("screenTime", screenTime)
                }
                startActivity(intent)
            }
        }
    }

    private fun screenTime(value: () -> Comparable<in Any>) {
        TODO("Not yet implemented")
    }







