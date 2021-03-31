package com.example.final0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BMI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_m_i)
        ok.setOnClickLisener {
            startActivity(Intent(this,BMI::class.java))

    }
}