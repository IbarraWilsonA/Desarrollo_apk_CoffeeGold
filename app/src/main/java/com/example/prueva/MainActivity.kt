package com.example.prueva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttoninicio = findViewById<Button>(R.id.buttonInicio)

        buttoninicio.setOnClickListener(){
            val intentoa = Intent(this, HomeActivity::class.java)
            startActivity(intentoa)
        }

    }
}



