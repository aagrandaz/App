package com.aagranda

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.aagranda.R.layout.activity_main

class MainActivity : AppCompatActivity() {

    private lateinit var primerParcialInput: EditText
    private lateinit var segundoParcialInput: EditText
    private lateinit var promedioTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        primerParcialInput = findViewById(R.id.editTextPrimerParcial)
        segundoParcialInput = findViewById(R.id.editTextSegundoParcial)
        promedioTextView = findViewById(R.id.textViewPromedio)
    }

    fun calcularPromedio(view: View) {
        try {
            val primerParcial = primerParcialInput.text.toString().toDouble()
            val segundoParcial = segundoParcialInput.text.toString().toDouble()

            val promedio = (primerParcial + segundoParcial) / 2

            promedioTextView.text = String.format("Promedio: %.2f", promedio)

        } catch (e: NumberFormatException) {
            promedioTextView.text = "Ingrese calificaciones válidas"
        }
    }
}