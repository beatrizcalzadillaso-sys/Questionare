package com.example.questionare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_Q1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_q1)

        val rg1= findViewById<RadioGroup>(R.id.rg_q1) // recojo id del radiogrupo

        var score = 0

        findViewById<Button>(R.id.btn1).setOnClickListener {
             rg1.checkedRadioButtonId // pregunto por el ID del seleccionado

            if (rg1.checkedRadioButtonId != -1){
                if (rg1.checkedRadioButtonId == R.id.rb1_a3 ){
                    score++
                }
                val intent = Intent(this, MainActivity_Q2::class.java)
                intent.putExtra("Score", score)
                setResult(RESULT_OK, intent)
                startActivity(intent)
            }
        }
    }
}