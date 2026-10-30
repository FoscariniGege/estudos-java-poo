# 🎮 Jogo da Velha em Java (Tic-Tac-Toe)

Projeto de console desenvolvido em **Java** simulando o clássico **Jogo da Velha**. O jogador humano enfrenta o computador em um tabuleiro 3x3 no próprio terminal.

---

## 📌 Funcionalidades

- **Jogador vs Computador:** Você joga como **X** e o computador joga automaticamente como **O**.
- **Tabuleiro Interativo:** Visualização em formato de grade atualizada a cada rodada.
- **Validação de Entradas:**
  - Tratamento de exceções com `try-catch` (`InputMismatchException`) para garantir que o usuário digite apenas números inteiros sem quebrar a aplicação.
  - Verificação de limites: validação para aceitar apenas índices de 0 a 2.
  - Impedimento de sobreposição: não permite jogar em posições já ocupadas.
- **Inteligência Básica do Computador:** O computador sorteia posições vazias disponíveis de forma dinâmica.
- **Verificação Completa de Fim de Jogo:**
  - Checagem de vitória nas horizontais (linhas), verticais (colunas) e nas duas diagonais (principal e secundária).
  - Detecção automática de **empate ("Deu Velha")** quando todas as 9 casas são preenchidas.

---

## 🕹️ Como Jogar

O tabuleiro é representado por uma matriz 3x3 com índices de **0 a 2** para linhas e colunas:

```
        Coluna 0   Coluna 1   Coluna 2
Linha 0: [0, 0]  |  [0, 1]  |  [0, 2]
Linha 1: [1, 0]  |  [1, 1]  |  [1, 2]
Linha 2: [2, 0]  |  [2, 1]  |  [2, 2]
```

A cada rodada:
1. Digite o número da **Linha** desejada (`0`, `1` ou `2`) e pressione `Enter`.
2. Digite o número da **Coluna** desejada (`0`, `1` ou `2`) e pressione `Enter`.
3. O computador fará a jogada dele logo em seguida.
4. O jogo termina assim que alguém fizer uma trinca ou quando não sobrarem mais espaços vazios (empate).

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Linguagem:** Java (JDK 17+)
- **Estruturas de Dados:** Matrizes bidimensionais (`String[][]`)
- **Controle de Fluxo:** Loops `while` e `do-while`, condicionais `if-else` e `break`
- **Entrada e Saída:** `java.util.Scanner` com limpeza de buffer
- **Geração Aleatória:** `java.util.Random`
- **Tratamento de Exceções:** `try-catch` com `java.util.InputMismatchException`
- **Manipulação de Strings:** Comparação com `.equals()`

---

## 🚀 Como Executar

### Pré-requisitos
- Ter o **Java JDK** instalado (versão 17 ou superior recomendada).

### Pelo Terminal

1. Navegue até a pasta raiz do exercício:
   ```bash
   cd ExercicioJogoDaVelha
   ```

2. Compile os arquivos para a pasta `bin`:
   ```bash
   javac -d bin src/application/Program.java
   ```

3. Execute o jogo:
   ```bash
   java -cp bin application.Program
   ```

### Pelo VS Code
1. Abra a pasta `ExercicioJogoDaVelha` no VS Code.
2. Abra o arquivo `src/application/Program.java`.
3. Clique em **Run** ou pressione `F5` / `Ctrl + F5`.
