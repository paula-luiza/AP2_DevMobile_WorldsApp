package com.example.ap2_app

class LogicaQuiz {

    // --- MUNDOS (RESULTADOS) ---
    // A ordem é importante! (Índice 0 = ID 1, Índice 7 = ID 8)
    val mundos = listOf(
        Mundo(1, "Hyrule", R.drawable.hyrule1, "Um reino de lendas, espadas e magia antiga.",
            listOf(R.drawable.hyrule4, R.drawable.hyrule2, R.drawable.hyrule3), 4.0f),
        Mundo(2, "Hogwarts", R.drawable.hogwarts1, "A escola de magia e bruxaria mais famosa.",
            listOf(R.drawable.hogwarts2, R.drawable.hogwarts3, R.drawable.hogwarts4), 2.5f),
        Mundo(3, "Tatooine", R.drawable.tatooine1, "Um planeta deserto com dois sóis e muita areia.",
            listOf(R.drawable.tatooine2, R.drawable.tatooine3, R.drawable.tatooine4), 3.5f),
        Mundo(4, "Pandora", R.drawable.pandora1, "Florestas bioluminescentes e montanhas flutuantes.",
            listOf(R.drawable.pandora2, R.drawable.pandora3, R.drawable.pandora4), 4.5f),
        Mundo(5, "Reino do Cogumelo", R.drawable.mushroom1, "Um mundo colorido cheio de plataformas e canos.",
            listOf(R.drawable.mushroom2, R.drawable.mushroom3, R.drawable.mushroom4), 2.0f),
        Mundo(6, "Zootopia", R.drawable.zootopia1, "Uma metrópole moderna habitada por animais.",
            listOf(R.drawable.zootopia2, R.drawable.zootopia3, R.drawable.zootopia1), 1.0f),
        Mundo(7, "Westeros", R.drawable.westeros1, "Um continente de intrigas, gelo e dragões.",
            listOf(R.drawable.westeros2, R.drawable.westeros3, R.drawable.westeros4), 5.0f),
        Mundo(8, "O Condado", R.drawable.shire1, "Colinas verdes, tocas aconchegantes e muita comida.",
            listOf(R.drawable.shire1, R.drawable.shire2, R.drawable.shire1), 0.0f)
    )

    // --- PERGUNTAS (Com pesos e pares quebrados) ---
    private val bancoDePerguntas = listOf(

        // Pergunta 0: Foco em Aventura vs. Tecnologia vs. Conforto
        Pergunta(
            0,
            "Qual seria seu meio de transporte ideal?",
            opcoes = listOf(
                // Aventura Medieval Pura (Hyrule, Westeros)
                Opcao("Cavalo de guerra ou Dragão", listOf(1, 1, 7), R.drawable.parque_velocicoaster), // +2 Hyrule, +1 Westeros

                // Sci-Fi (Tatooine, Pandora)
                Opcao("Nave espacial ou Banshee", listOf(3, 3, 4), R.drawable.parque_soarin), // +2 Tatooine, +1 Pandora

                // Conforto (Hogwarts, Condado)
                Opcao("Trem a vapor ou Carroça", listOf(2, 8, 8), R.drawable.parque_pirates), // +1 Hogwarts, +2 Condado

                // Diversão (Mushroom, Zootopia)
                Opcao("Kart de corrida ou Carro", listOf(5, 5, 6), R.drawable.parque_toystory) // +2 Mushroom, +1 Zootopia
            )
        ),

        // Pergunta 1: Foco em Adrenalina vs. Imersão
        Pergunta(
            1,
            "Qual tipo de atração você corre para ir em um parque de diversões?",
            opcoes = listOf(
                // Imersão Sci-Fi
                Opcao("Simulador de Voo", listOf(3, 4, 4), R.drawable.parque_soarin), // +1 Tatooine, +2 Pandora

                // Adrenalina Pura
                Opcao("Montanha-russa", listOf(1, 5, 5), R.drawable.parque_velocicoaster), // +1 Hyrule, +2 Mushroom

                // Diversão casual
                Opcao("Atração Interativa/Competitiva", listOf(6, 6, 5), R.drawable.parque_toystory), // +2 Zootopia, +1 Mushroom

                // História e Atmosfera
                Opcao("Passeio de Barco no Escuro", listOf(2, 7, 8), R.drawable.parque_pirates) // +1 Hogwarts, +1 Westeros, +1 Condado
            )
        ),

        // Pergunta 2: Foco em Poder vs. Magia vs. Velocidade
        Pergunta(
            2,
            "Qual tipo de Pokémon seria seu fiel escudeiro na viagem?",
            opcoes = listOf(
                // Magia e Natureza
                Opcao("Tipo Fada ou Planta", listOf(2, 8, 4), R.drawable.pokemon_fairy), // +1 Hogwarts, +1 Condado, +1 Pandora

                // Poder Bruto
                Opcao("Tipo Dragão ou Aço", listOf(1, 7, 7), R.drawable.pokemon_dragonite), // +1 Hyrule, +2 Westeros

                // Velocidade e Energia
                Opcao("Tipo Elétrico ou Voador", listOf(4, 5, 5), R.drawable.pokemon_eletrico), // +1 Pandora, +2 Mushroom

                // Confiável e Moderno
                Opcao("Tipo Normal ou Lutador", listOf(1, 6, 6), R.drawable.pokemon_lutador) // +1 Hyrule, +2 Zootopia
            )
        ),

        // Pergunta 3: Foco em Gênero
        Pergunta(
            3,
            "Que gênero de filme você escolheria para hoje à noite?",
            opcoes = listOf(
                // Magia Pura
                Opcao("Fantasia e Magia", listOf(2, 2, 8), R.drawable.filme_lotr), // +2 Hogwarts, +1 Condado

                // Diversão Leve
                Opcao("Animação e Comédia", listOf(5, 6, 6), R.drawable.filme_toystory), // +1 Mushroom, +2 Zootopia

                // Ação Épica
                Opcao("Ação Épica e Batalhas", listOf(1, 1, 7), R.drawable.filme_gladiador), // +2 Hyrule, +1 Westeros

                // Sci-Fi Puro
                Opcao("Ficção Científica", listOf(3, 3, 4), R.drawable.filme_dune) // +2 Tatooine, +1 Pandora
            )
        ),

        // Pergunta 4: Foco em Personalidade (Sem Imagem)
        Pergunta(
            4,
            "Como seus amigos descreveriam sua personalidade?",
            opcoes = listOf(
                // Determinado
                Opcao("Corajoso(a), determinado(a) e um pouco intenso(a).", listOf(1, 7, 7), 0), // +1 Hyrule, +2 Westeros

                // Sonhador
                Opcao("Curioso(a), inovador(a) e com a cabeça nas nuvens.", listOf(3, 4, 4), 0), // +1 Tatooine, +2 Pandora

                // Confiável
                Opcao("Leal, sábio(a) e que valoriza o conforto e amigos.", listOf(2, 2, 8), 0), // +2 Hogwarts, +1 Condado

                // Otimista
                Opcao("Energético(a), otimista e sempre pronto(a) pra agitação.", listOf(5, 6), 0) // +1 Mushroom, +1 Zootopia
            )
        )
    )

    // --- FUNÇÕES (NENHUMA MUDANÇA NECESSÁRIA AQUI) ---

    fun criarPlacarInicial(): IntArray {
        return IntArray(mundos.size)
    }

    fun registrarResposta(pontuacaoHerois: IntArray, heroiIds: List<Int>) {
        // Esta lógica NÃO MUDA. O loop vai rodar mais vezes para IDs repetidos.
        for (id in heroiIds) {
            val index = id - 1 // Converte ID (1-8) para índice (0-7)
            if (index >= 0 && index < pontuacaoHerois.size) {
                pontuacaoHerois[index]++
            }
        }
    }

    fun getPergunta(id: Int): Pergunta {
        // Adicionando uma checagem de segurança para não crashar
        if (id >= 0 && id < bancoDePerguntas.size) {
            return bancoDePerguntas[id]
        }
        return bancoDePerguntas[0] // Retorna a primeira pergunta em caso de erro
    }

    fun getPontuacaoCompleta(pontuacaoHerois: IntArray): IntArray {
        return pontuacaoHerois
    }

    fun getResultadoFinal(pontuacaoHerois: IntArray): Mundo {
        // Esta lógica NÃO MUDA.
        val indiceVencedor = pontuacaoHerois.indices.maxByOrNull { pontuacaoHerois[it] } ?: 0
        return mundos[indiceVencedor]
    }
}