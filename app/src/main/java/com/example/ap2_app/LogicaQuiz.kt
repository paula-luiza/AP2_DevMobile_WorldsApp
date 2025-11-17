package com.example.ap2_app

class LogicaQuiz {

    val mundos = listOf(
        Mundo(1, "Hyrule", R.drawable.hyrule1, "Um reino de lendas, espadas e magia antiga.",
            listOf(R.drawable.hyrule4, R.drawable.hyrule2, R.drawable.hyrule3)),
        Mundo(2, "Hogwarts", R.drawable.hogwarts1, "A escola de magia e bruxaria mais famosa.",
            listOf(R.drawable.hogwarts2, R.drawable.hogwarts3, R.drawable.hogwarts4)),
        Mundo(3, "Tatooine", R.drawable.tatooine1, "Um planeta deserto com dois sóis e muita areia.",
            listOf(R.drawable.tatooine2, R.drawable.tatooine3, R.drawable.tatooine4)),
        Mundo(4, "Pandora", R.drawable.pandora1, "Florestas bioluminescentes e montanhas flutuantes.",
            listOf(R.drawable.pandora2, R.drawable.pandora3, R.drawable.pandora4)),
        Mundo(5, "Reino do Cogumelo", R.drawable.mushroom1, "Um mundo colorido cheio de plataformas e canos.",
            listOf(R.drawable.mushroom2, R.drawable.mushroom3, R.drawable.mushroom4)),
        Mundo(6, "Zootopia", R.drawable.zootopia1, "Uma metrópole moderna habitada por animais.",
            listOf(R.drawable.zootopia2, R.drawable.zootopia3, R.drawable.zootopia1)),
        Mundo(7, "Westeros", R.drawable.westeros1, "Um continente de intrigas, gelo e dragões.",
            listOf(R.drawable.westeros2, R.drawable.westeros3, R.drawable.westeros4)),
        Mundo(8, "O Condado", R.drawable.shire1, "Colinas verdes, tocas aconchegantes e muita comida.",
            listOf(R.drawable.shire1, R.drawable.shire2, R.drawable.shire1))
    )

    // --- PERGUNTAS ---
    private val bancoDePerguntas = listOf(

        // PERGUNTA 1: MEIO DE TRANSPORTE (Imagens de veículos/montarias)
        Pergunta(
            0,
            "Qual seria seu meio de transporte ideal?",
            opcoes = listOf(
                // Hyrule (1) & Westeros (7) -> Montaria Épica
                Opcao("Cavalo de guerra ou Dragão", listOf(1, 7)),

                // Tatooine (3) & Pandora (4) -> Voo/SciFi
                Opcao("Nave espacial ou Banshee", listOf(3, 4)),

                // Hogwarts (2) & Condado (8) -> Mágico/Rústico
                Opcao("Trem a vapor ou Carroça", listOf(2, 8)),

                // Mushroom (5) & Zootopia (6) -> Veículos Motorizados
                Opcao("Kart de corrida ou Carro", listOf(5, 6))
            )
        ),

        // PERGUNTA 2: PARQUES DA DISNEY (Imagens de atrações)
        Pergunta(
            1,
            "Qual tipo de atração você corre para ir em um parque de diversões?",
            opcoes = listOf(
                // Tatooine (3) & Pandora (4) -> Simuladores Imersivos
                Opcao("Simulador de Voo", listOf(3, 4), R.drawable.parque_soarin),

                // Hyrule (1) & Westeros (7) -> Emoção/Montanha-russa
                Opcao("Montanha-russa", listOf(1, 7), R.drawable.parque_velocicoaster),

                // Mushroom (5) & Zootopia (6) -> Competição/Diversão
                Opcao("Atração Interativa/Competitiva", listOf(5, 6), R.drawable.parque_toystory),

                // Hogwarts (2) & Condado (8) -> Dark Ride/História
                Opcao("Passeio de Barco no Escuro", listOf(2, 8), R.drawable.parque_pirates)
            )
        ),

        // PERGUNTA 3: FILMES (Imagens de cartazes ou gêneros)
        Pergunta(
            2,
            "Que gênero de filme você escolheria para hoje à noite?",
            opcoes = listOf(
                // Hogwarts (2) & Condado (8) -> Fantasia Pura
                Opcao("Fantasia e Magia", listOf(2, 8), R.drawable.filme_lotr),

                // Mushroom (5) & Zootopia (6) -> Animação
                Opcao("Animação e Comédia", listOf(5, 6), R.drawable.filme_toystory),

                // Hyrule (1) & Westeros (7) -> Ação Medieval
                Opcao("Ação Épica e Batalhas", listOf(1, 7), R.drawable.filme_gladiador),

                // Tatooine (3) & Pandora (4) -> Sci-Fi
                Opcao("Ficção Científica", listOf(3, 4), R.drawable.filme_dune)
            )
        ),

        // PERGUNTA 4: PERSONALIDADE (SEM IMAGENS - TEXTO APENAS)
        // Nota: Usamos '0' no ID da imagem para ativar seu layout de 1 coluna!
        Pergunta(
            3,
            "Como seus amigos descreveriam sua personalidade?",
            opcoes = listOf(
                // Hyrule (1) & Westeros (7) -> Líderes/Corajosos
                Opcao("Corajoso(a), determinado(a) e um pouco intenso(a).", listOf(1, 7), 0),

                // Tatooine (3) & Pandora (4) -> Exploradores
                Opcao("Curioso(a), inovador(a) e com a cabeça nas nuvens.", listOf(3, 4), 0),

                // Hogwarts (2) & Condado (8) -> Leais/Caseiros
                Opcao("Leal, sábio(a) e que valoriza o conforto e amigos.", listOf(2, 8), 0),

                // Mushroom (5) & Zootopia (6) -> Energéticos
                Opcao("Energético(a), otimista e sempre pronto(a) pra agitação.", listOf(5, 6), 0)
            )
        ),

                Pergunta(
                4,
        "Qual tipo de Pokémon seria seu fiel escudeiro na viagem?",
        opcoes = listOf(
            // Hogwarts (2) & Condado (8) -> Místicos e Naturais
            Opcao("Tipo Fada ou Planta (Ex: Celebi, Sylveon)", listOf(2, 8), R.drawable.pokemon_fairy),

            // Hyrule (1) & Westeros (7) -> Poderosos e Resistentes
            Opcao("Tipo Dragão ou Aço (Ex: Charizard, Lucario)", listOf(1, 7), R.drawable.pokemon_dragonite),

            // Tatooine (3) & Pandora (4) -> Energéticos e Voadores
            Opcao("Tipo Elétrico ou Voador (Ex: Pikachu, Zapdos)", listOf(3, 4), R.drawable.pokemon_eletrico),

            // Mushroom (5) & Zootopia (6) -> Amigáveis e Lutadores
            Opcao("Tipo Normal ou Lutador (Ex: Eevee, Machamp)", listOf(5, 6), R.drawable.pokemon_lutador)
        )
    )
    )

    fun criarPlacarInicial(): IntArray {
        return IntArray(mundos.size)
    }

    fun registrarResposta(pontuacaoHerois: IntArray, heroiIds: List<Int>) {
        for (id in heroiIds) {
            val index = id - 1 // Converte ID (1-8) para índice (0-7)
            if (index >= 0 && index < pontuacaoHerois.size) {
                pontuacaoHerois[index]++
            }
        }
    }

    fun getPergunta(id: Int): Pergunta {
        return bancoDePerguntas[id]
    }

    fun getPontuacaoCompleta(pontuacaoHerois: IntArray): IntArray {
        return pontuacaoHerois
    }

    fun getResultadoFinal(pontuacaoHerois: IntArray): Mundo {
        val indiceVencedor = pontuacaoHerois.indices.maxByOrNull { pontuacaoHerois[it] } ?: 0
        return mundos[indiceVencedor]
    }
}