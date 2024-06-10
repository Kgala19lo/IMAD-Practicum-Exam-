package com.example.practicumexam

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.practicumexam.R.id.avgtemperature
import com.example.practicumexam.R.id.editTextDay
import com.example.practicumexam.R.id.editTextMax
import com.example.practicumexam.R.id.editTextMin

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_screen)

        val screenTime = intent.getIntArrayExtra("screenTime") ?: intArrayOf()
        val categories = intent.getStringArrayExtra("categories") ?: arrayOf()

        val totalScreenTime = screenTime.sum()
        val averageScreenTime =
            if (screenTime.isNotEmpty()) totalScreenTime / screenTime.size else 0
        val minScreenTime = screenTime.min()


        findViewById<EditText>(editTextDay).text = "totalScreenTime $totalScreenTime temperature"
        findViewById<EditText>(editTextMax).text = "averageScreenTime $averageScreenTime temperature"
        findViewById<EditText>(editTextMin).text = "minScreenTime $minScreenTime temperature"

        findViewById<Button>(R.id.submit).setOnClickListener {
            finish()
        }
    }
}



