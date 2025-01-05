package com.projeto.fuel_calculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
const val KEY_DESTINO = "Activity_resultado_final.KEY_DESTINO"
class Activity_resultado_final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado_final)

        val preco = intent.getFloatExtra(KEY_PRECO,0f)
        val consumo = intent.getFloatExtra(KEY_CONSUMO,0f)
        val destino = intent.getFloatExtra(KEY_DESTINO,0f)
        val resultadoFinal = (destino/consumo) * preco

        val tvpreco = findViewById<TextView>(R.id.tv_preco_result)
        val tvconsumo = findViewById<TextView>(R.id.tv_consumo_result)
        val tvdestino = findViewById<TextView>(R.id.tv_km_result)
        val tvresultado = findViewById<TextView>(R.id.tv_resultado)


        tvpreco.text = preco.toString()
        tvresultado.text = resultadoFinal.toString()
        tvconsumo.text = consumo.toString()
        tvdestino.text = destino.toString()

    }
}