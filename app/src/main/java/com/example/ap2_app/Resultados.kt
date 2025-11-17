package com.example.ap2_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultados : AppCompatActivity() {
    private val logica = LogicaQuiz()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        val placarFinal = intent.getIntArrayExtra("PLACAR_FINAL")
        val nomeUsuario = intent.getStringExtra("NOME_USUARIO") ?: ""
        val btMais = findViewById<Button>(R.id.btMore)
        val nomeResultado = findViewById<TextView>(R.id.tvResultado)
       // val titulo = findViewById<TextView>(R.id.tvResultado)
        val imagemResultado = findViewById<ImageView>(R.id.ivImagemResultado)
        val btInicio = findViewById<Button>(R.id.btInicio)

        if (placarFinal != null) {
            val heroiVencedor = logica.getResultadoFinal(placarFinal)
          //  titulo.text = nomeUsuario +", seu mundo ideal para explorar seria..."
            nomeResultado.text = heroiVencedor.nome
            imagemResultado.setImageResource(heroiVencedor.imagemHeroi)
        } else {
            nomeResultado.text = "Erro ao calcular o resultado."
        }

        btMais.setOnClickListener {
            val intent = Intent(this, DetalhesResultados::class.java)
            intent.putExtra("PLACAR_FINAL", placarFinal)
            startActivity(intent)
        }

        btInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}