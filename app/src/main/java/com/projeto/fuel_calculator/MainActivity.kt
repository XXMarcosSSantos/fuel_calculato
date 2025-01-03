package com.projeto.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btninicia = findViewById<Button>(R.id.btn_iniciar)

        btninicia.setOnClickListener {
            val intent1 = Intent(this,preco_main::class.java)
            startActivity(intent1)
            println("proxima tela")
        }
    }
}