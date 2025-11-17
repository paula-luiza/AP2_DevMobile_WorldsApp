package com.example.ap2_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.ap2_app.R
import com.example.ap2_app.MainQuiz

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btComecarQuiz = findViewById<Button>(R.id.btStart)
        val etNome = findViewById<EditText>(R.id.etNome)

        btComecarQuiz.setOnClickListener {
            val nome = etNome.text.toString()
            val comecarQuiz = Intent(this, MainQuiz::class.java)
            comecarQuiz.putExtra("NOME_USUARIO", nome)
            startActivity(comecarQuiz)
        }
    }



}