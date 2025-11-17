package com.example.ap2_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalhesResultados : AppCompatActivity() {

    private val logica = LogicaQuiz()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_resultados)

        val placarFinal = intent.getIntArrayExtra("PLACAR_FINAL") ?: logica.criarPlacarInicial()
        val btShare = findViewById<FloatingActionButton>(R.id.btShare)
        val btHome = findViewById<Button>(R.id.btHome)
        val heroiVencedor = logica.getResultadoFinal(placarFinal)
        val tvDescricao = findViewById<TextView>(R.id.tvDescricao)
        val tvNome = findViewById<TextView>(R.id.tvNomeDetalhe)
        val ivGaleria1 = findViewById<ImageView>(R.id.ivGaleria1)
        val ivGaleria2 = findViewById<ImageView>(R.id.ivGaleria2)
        val ivGaleria3 = findViewById<ImageView>(R.id.ivGaleria3)
        val ratingBar = findViewById<RatingBar>(R.id.ratingPerigo)

        ratingBar.rating = heroiVencedor.perigo

        if (heroiVencedor.galeria.size >= 3) {
            ivGaleria1.setImageResource(heroiVencedor.galeria[0])
            ivGaleria2.setImageResource(heroiVencedor.galeria[1])
            ivGaleria3.setImageResource(heroiVencedor.galeria[2])
        }

        tvDescricao.text = heroiVencedor.descricao
        tvNome.text = heroiVencedor.nome

        btShare.setOnClickListener {
            val compartilhar = Intent(Intent.ACTION_VIEW)
            compartilhar.data = Uri.parse("https://www.google.com/search?q=" + heroiVencedor.nome)
            startActivity(compartilhar)
        }

        btHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}