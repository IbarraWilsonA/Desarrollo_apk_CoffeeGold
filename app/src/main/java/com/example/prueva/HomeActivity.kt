package com.example.prueva

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val buttonCompras = findViewById<Button>(R.id.buttonCompras)
        val buttonInformes = findViewById<Button>(R.id.buttonInformes)
        val buttonSalir = findViewById<Button>(R.id.buttonSalir)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val buttonUbicacion = findViewById<Button>(R.id.buttonUbicacion)

        buttonUbicacion.setOnClickListener(){
            val intentou = Intent(this,MapsActivity::class.java)
            startActivity(intentou)
        }

        buttonCompras.setOnClickListener(){
            val intentox = Intent(this,ComprasActicity::class.java)
            startActivity(intentox)
        }

        buttonInformes.setOnClickListener(){
            val intentoy = Intent(this,InformesActivity::class.java)
            startActivity(intentoy)
        }

        buttonSalir.setOnClickListener(){
            finish()
        }

        buttonLogin.setOnClickListener(){
            val intento = Intent(this,InformesActivity::class.java)
            startActivity(intento)
        }

    }
}