package com.example.final0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ok.setOnClickLisener {
            startActivity(Intent(this,activity_main::class.java))

            final EditText e1 = (EditText) findViewById(R.id.et1);
            e1.requestFocus();
    }
}