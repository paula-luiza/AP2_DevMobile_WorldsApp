package com.example.ap2_app

data class Pergunta(
    val id: Int,
    val textoDaPergunta: String,
    val opcoes: List<Opcao>
)

data class Opcao(
    val texto: String,
    val heroiIds: List<Int>,
    val imagem: Int = 0
)

data class Mundo(
    val id: Int,
    val nome: String,
    val imagemHeroi: Int,
    val descricao: String,
    val galeria: List<Int>,
    val perigo: Float = 0.0f
)
