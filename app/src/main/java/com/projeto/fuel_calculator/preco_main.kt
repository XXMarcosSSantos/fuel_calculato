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

class preco_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preco_main)

        val edtpreco = findViewById<TextInputEditText>(R.id.text_input_preco)
        val btntela2 = findViewById<Button>(R.id.btn_tela_preco)

         btntela2.setOnClickListener {
             val preco = edtpreco.text.toString()

             if(preco == ""){
                Snackbar.make(
                    edtpreco,
                    "Preencha o campo vazio",
                    Snackbar.LENGTH_LONG
                ).show()
             }else{
                 val preco: Float = preco.toFloat()
                 val intent2 = Intent(this, Consumo_main::class.java)
                 intent2.putExtra(KEY_PRECO, preco)
                 startActivity(intent2)
                 println("acao botao2:" +preco)
             }


         }

    }
}