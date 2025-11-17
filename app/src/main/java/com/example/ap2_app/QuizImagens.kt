package com.example.ap2_app

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.helper.widget.Flow
import androidx.fragment.app.Fragment

class QuizImagens : Fragment(R.layout.fragment_quiz_imagens) {
    private val logica = LogicaQuiz()
    private lateinit var tvPergunta: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var flowGrid: Flow

    // Views para as opções customizadas
    private lateinit var option1: View
    private lateinit var option2: View
    private lateinit var option3: View
    private lateinit var option4: View

    private lateinit var pergunta: Pergunta
    private var selecaoAtual: List<Int>? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Encontra as views
        tvPergunta = view.findViewById(R.id.tvTitle)
        progressBar = view.findViewById(R.id.progressBar)
        flowGrid = view.findViewById(R.id.flow_grid)
        option1 = view.findViewById(R.id.option1)
        option2 = view.findViewById(R.id.option2)
        option3 = view.findViewById(R.id.option3)
        option4 = view.findViewById(R.id.option4)

        val indiceDaPergunta = arguments?.getInt("INDICE_PERGUNTA") ?: 0
        pergunta = logica.getPergunta(indiceDaPergunta)

        tvPergunta.text = pergunta.textoDaPergunta
        progressBar.progress = (indiceDaPergunta + 1) * 25

        val hasImages = pergunta.opcoes.any { it.imagem != 0 }


        if (hasImages) {
            flowGrid.setMaxElementsWrap(2)
        } else {
            flowGrid.setMaxElementsWrap(1)
        }


        setupOption(option1, pergunta.opcoes[0])
        setupOption(option2, pergunta.opcoes[1])
        setupOption(option3, pergunta.opcoes[2])
        setupOption(option4, pergunta.opcoes[3])


        setupClickListeners()
    }

    private fun setupOption(optionView: View, opcao: Opcao) {
        val ivOpcao = optionView.findViewById<ImageView>(R.id.ivOptionImage)
        val tvOpcao = optionView.findViewById<TextView>(R.id.tvOptionText)

        tvOpcao.text = opcao.texto


        if (opcao.imagem != 0 && opcao.imagem != -1) {
            ivOpcao.setImageResource(opcao.imagem)
            ivOpcao.visibility = View.VISIBLE
        } else {
            ivOpcao.visibility = View.GONE
        }
    }

    private fun setupClickListeners() {
        val options = listOf(option1, option2, option3, option4)

        for ((index, optionView) in options.withIndex()) {
            optionView.setOnClickListener {
                selecaoAtual = pergunta.opcoes[index].heroiIds
                options.forEach { it.isSelected = false }
                optionView.isSelected = true
            }
        }
    }

    fun getSelecaoAtual(): List<Int>? {
        return selecaoAtual
    }

    companion object {
        fun newInstance(indiceDaPergunta: Int): QuizImagens {
            val fragment = QuizImagens()
            val args = Bundle()
            args.putInt("INDICE_PERGUNTA", indiceDaPergunta)
            fragment.arguments = args
            return fragment
        }
    }
}