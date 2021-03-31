package com.example.final0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BMR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_m_r)
        ok.setOnClickLisener {
            startActivity(Intent(this,BMR::class.java))
        }
    }
}