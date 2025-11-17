# AP2 - WorldsApp: Agência de Viagens Multiverso

**Aluna**: Paula Oliveira
**Matrícula**: 202309747511
**Curso**: Engenharia de Software

### Descrição do Projeto

O WorldsApp é um aplicativo de quiz interativo desenvolvido para a Avaliação Parcial 2 (AP2). O app funciona como uma "agência de viagens" para mundos fictícios, mapeando a personalidade e os interesses do usuário para recomendar um destino de viagem ideal.

Baseado em um quiz de 5 perguntas, o app coleta as preferências do usuário em temas como transporte, parques de diversão, gêneros de filme, Pokémon e personalidade. Cada resposta contribui para um placar que define qual dos 8 mundos (como Hyrule, Hogwarts, Westeros, etc.) mais combina com o perfil do viajante.

Ao final, o app apresenta o mundo vencedor e uma tela de detalhes com mais informações, uma galeria de imagens e a opção de compartilhar o destino.

### Funcionalidades Principais:

Quiz de Personalidade: 5 perguntas com opções visuais (com imagens) e textuais (sem imagens).

Arquitetura Híbrida: Utiliza uma MainActivity para coletar o nome do usuário e uma MainQuizActivity que gerencia e troca Fragments (QuizImagensFragment) para cada pergunta.

Resultado Personalizado: Tela de Resultados que exibe o mundo vencedor e sua imagem principal.

Tela de Detalhes: Uma tela (DetalhesResultados) com mais informações, incluindo descrição, galeria de fotos em HorizontalScrollView e um RatingBar para o "nível de perigo" do mundo.

Navegação Completa: Inclui Intents Explícitas (para navegar entre as telas) e Implícitas (para compartilhar o resultado).

### Fluxo de Uso (Instruções de Execução)

Tela Inicial: O usuário é recebido com o título do app e uma prévia dos mundos em um scroll horizontal. Ele deve inserir seu nome e clicar em "Iniciar a Viagem".

Tela do Quiz: O usuário é levado à tela principal do quiz. Os botões de navegação ("Recomeçar", "Home", "Avançar") são fixos na Activity.

Perguntas: O app exibe 5 perguntas, uma de cada vez, dentro de um Fragment.

Layout Dinâmico: O layout das opções se adapta automaticamente:

2 colunas: Para perguntas com imagens (Transporte, Disney, Pokémon, Filmes).

1 coluna: Para perguntas sem imagens (Personalidade).

Navegação: Ao selecionar uma opção (que fica destacada) e clicar em "Avançar", o app salva a pontuação e carrega o próximo fragmento de pergunta.

Tela de Resultado: Após a 5ª pergunta, o usuário vê o mundo que mais combinou com ele, junto com seu nome e a imagem principal do local.

Tela de Detalhes: Clicando em "Saber Mais", o usuário pode ver uma descrição, a galeria de fotos e os "status" do mundo.

Finalização: O usuário pode "Compartilhar" o resultado (abre o Google) ou "Voltar ao Início" (que limpa o placar e o histórico de telas).

### Telas do Aplicativo (Prints)

Aqui estão as principais telas do aplicativo em funcionamento:

1. Tela Inicial

<img width="366" height="724" alt="image" src="https://github.com/user-attachments/assets/9a8f7360-6f44-4138-8d79-5335251936f3" />

2. Quiz com Imagens (2 Colunas)

<img width="350" height="723" alt="image" src="https://github.com/user-attachments/assets/22a8da6e-f2ed-4a99-97b5-e8b21daa724f" />

3. Quiz sem Imagens (1 Coluna)

<img width="348" height="717" alt="image" src="https://github.com/user-attachments/assets/46ad62c8-c34f-4477-abcc-6e240d0d1ae6" />

4. Tela de Resultado

<img width="354" height="715" alt="image" src="https://github.com/user-attachments/assets/4322445f-91db-47d7-a8f8-a277f1517670" />

5. Tela de Detalhes

<img width="345" height="733" alt="image" src="https://github.com/user-attachments/assets/ef43a823-b1aa-4643-9c2e-db5174b4c737" />
