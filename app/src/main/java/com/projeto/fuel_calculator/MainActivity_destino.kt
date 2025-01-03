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

const val KEY_CONSUMO = "MainActivity_consumo.KEY_CONSUMO"
class MainActivity_destino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_destino)
        val preco = intent.getFloatExtra(KEY_PRECO,0f)
        val consumo = intent.getFloatExtra(KEY_CONSUMO,0f)
        val edit_destino = findViewById<TextInputEditText>(R.id.text_input_destino)
        val btn_destino = findViewById<Button>(R.id.btn_destino)

        btn_destino.setOnClickListener {
            val destino = edit_destino.text.toString()

            if (destino == ""){
                Snackbar.make(
                    edit_destino,
                    "Preencha o campo vazio",
                    Snackbar.LENGTH_LONG
                ).show()
            }else{
                val destino: Float = destino.toFloat()
                val intent4 = Intent(this,Activity_resultado_final::class.java)
                intent4.putExtra(KEY_PRECO,preco)
                intent4.putExtra(KEY_CONSUMO,consumo)
                intent4.putExtra(KEY_DESTINO,destino)
                startActivity(intent4)
                println("acao botao preco: "+preco)
                println("acao botao consumo: "+consumo)
                println("acao botao destino: "+destino)
            }
        }

    }
}