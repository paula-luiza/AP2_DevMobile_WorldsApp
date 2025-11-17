package com.example.ap2_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ap2_app.LogicaQuiz
import com.example.ap2_app.MainActivity
import com.example.ap2_app.QuizImagens
import com.example.ap2_app.R
import com.example.ap2_app.Resultados

class MainQuiz : AppCompatActivity() {

    private lateinit var placar: IntArray
    private val logica = LogicaQuiz()
    private lateinit var nomeDoUsuario: String
    private var indicePerguntaAtual = 0
    private val totalPerguntas = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_quiz)

        nomeDoUsuario = intent.getStringExtra("NOME_USUARIO") ?: ""
        placar = logica.criarPlacarInicial()


        if (savedInstanceState == null) {
            mostrarProximaPergunta()
        }

        val btAvancar: Button = findViewById(R.id.btAvancar)
        val btRecomecar: Button = findViewById(R.id.btRecomecar)

        btAvancar.setOnClickListener {
            val fragmentoAtual = supportFragmentManager.findFragmentById(R.id.fragment_container) as QuizImagens
            val selecao = fragmentoAtual.getSelecaoAtual()

            if (selecao == null) {
                Toast.makeText(this, "Escolha uma opção", Toast.LENGTH_SHORT).show()
            } else {
                registrarResposta(selecao)
                mostrarProximaPergunta()
            }
        }

        val btHome: Button = findViewById(R.id.btHome)

        btHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            finish()
        }

        btRecomecar.setOnClickListener {
            val intent = Intent(this, MainQuiz::class.java)
            startActivity(intent)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            finish()
        }
    }

    private fun registrarResposta(heroiIndices: List<Int>) {
        for (id in heroiIndices) {
            val index = id - 1 // Converte ID (1-8) para índice (0-7)
            if (index >= 0 && index < placar.size) {
                placar[index]++
            }
        }
    }

    private fun mostrarProximaPergunta() {
        if (indicePerguntaAtual < totalPerguntas) {
            val quizFragment = QuizImagens.newInstance(indicePerguntaAtual)

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, quizFragment)
                .commit()

            indicePerguntaAtual++
        } else {
            mostrarResultados()
        }
    }

    private fun mostrarResultados() {
        val intent = Intent(this, Resultados::class.java)
        intent.putExtra("PLACAR_FINAL", placar)
        intent.putExtra("NOME_USUARIO", nomeDoUsuario)
        startActivity(intent)
        finish()
    }
}