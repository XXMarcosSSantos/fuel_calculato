package com.projeto.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_PRECO = "Consumo_main.KEY_PRECO"

class Consumo_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo_main)
        val editconsumo = findViewById<TextInputEditText>(R.id.edit_text_consumo)
        val btnconsumo = findViewById<Button>(R.id.btn_tela_consumo)
        val preco = intent.getFloatExtra(KEY_PRECO, 0f)


        btnconsumo.setOnClickListener {
            val consumo = editconsumo.text.toString()

            if(consumo == "" ){
                Snackbar.make(
                    editconsumo,
                    "Preencha o campo vazio",
                    Snackbar.LENGTH_LONG
                ).show()
            }else{
                val consumo: Float = consumo.toFloat()
                val intent3 = Intent(this, MainActivity_destino::class.java)
                intent3.putExtra(KEY_PRECO, preco)
                intent3.putExtra(KEY_CONSUMO, consumo)
                startActivity(intent3)
                println("preço: "+preco)
                println("consumo: "+consumo)
            }
        }

    }
}