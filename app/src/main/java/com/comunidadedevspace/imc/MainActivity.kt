package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperando os componentes
        //criar uma variavel e associal o componente de UI
        //recuperar o botão da tela
        val edtPeso = findViewById<EditText>(R.id.edt_peso)
        val edtAltura = findViewById<EditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura: Float = edtAltura.text.toString().toFloat()

            val alturaQ1: Float = altura * altura
            val result: Float = peso / alturaQ1
            println("Anderson Botão" + result)

        }
    }
}