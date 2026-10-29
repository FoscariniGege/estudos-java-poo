# ☕ Exercícios de Java - Vetores (Arrays) e Orientação a Objetos

Este repositório documenta a minha evolução prática com manipulação de arrays unidimensionais (vetores), algoritmos clássicos de busca/agregação e a transição gradual para Programação Orientada a Objetos (POO) em Java.

---

## 🚀 O que eu estava aprendendo

Estes exercícios foram desenvolvidos com foco na construção de uma base sólida de lógica de programação, boas práticas de código (*Clean Code*) e gerenciamento de memória em Java.

Nesta etapa, consolidei:
- **Vetores Primitivos vs. Objetos:** Diferença entre alocação sequencial de tipos primitivos (`int[]`, `double[]`) e vetores de referência (`Pessoa[]`, `Aluno[]`), prevenindo ativamente falhas de execução por ponteiro nulo (`NullPointerException`).
- **Algoritmos de Busca Linear:** Identificação de valores extremos (máximo e mínimo) com captura de índices, adotando sempre o primeiro elemento (`vetor[0]`) como referência para suporte a números negativos e limites.
- **Aritmética e Precisão Numérica:** Prevenção de divisão inteira truncada via *casting* explícito (`(double)`), guarda contra divisões por zero (`ArithmeticException`) e formatação rigorosa de ponto flutuante via `System.out.printf`.
- **Gerenciamento de Fluxo de I/O:** Controle e limpeza do buffer de entrada do `Scanner` (`nextLine()` após leituras numéricas como `nextInt()` e `nextDouble()`).
- **Encapsulamento e POO:** Modelagem de entidades no singular com atributos privados (`private`), métodos de acesso (*getters/setters*), construtores parametrizados e delegação de lógica de negócio para métodos internos da própria classe (ex.: `aluno.media()`).
- **Clean Code e Legibilidade:** Nomenclatura expressiva sem abreviações em *camelCase*, rigor ortográfico nas saídas de terminal e separação estrita de responsabilidades (**Entrada de Dados $\rightarrow$ Processamento $\rightarrow$ Saída**).

---

## 💻 Exercícios Resolvidos

### Parte 1: Fundamentos de Vetores e Filtragem Básica
1. **Problema Negativos**: Lê $N$ números inteiros, armazena-os num vetor e exibe apenas os valores negativos digitados.
2. **Problema Soma Vetor**: Lê $N$ números reais, imprime todos os elementos armazenados e calcula a soma total e a média aritmética de todos os valores.
3. **Problema Alturas**: Lê os dados (nome, idade e altura) de várias pessoas em vetores de entidades, calculando a altura média e a porcentagem de indivíduos com menos de 16 anos, listando seus respectivos nomes.
4. **Problema Números Pares**: Lê $N$ números inteiros em um vetor, filtra e exibe todos os números pares e calcula a quantidade total de valores que atenderam ao critério.

### Parte 2: Algoritmos de Busca, Acumulação e Múltiplos Vetores
5. **Problema Maior Posição**: Lê $N$ números reais em um vetor e determina tanto o maior valor do conjunto quanto a sua respectiva posição (índice) no array, assumindo a primeira posição como 0.
6. **Problema Soma Vetores**: Lê dois vetores distintos ($A$ e $B$) com $N$ inteiros cada, sincroniza os índices homólogos para gerar um terceiro vetor $C$ com a soma correspondente e imprime o vetor resultante.
7. **Problema Abaixo da Média**: Lê um vetor de $N$ números reais, calcula a média aritmética de todo o grupo (exibida com três casas decimais) e lista todos os valores estritamente abaixo da média com uma casa decimal.
8. **Problema Média dos Pares**: Lê um vetor de $N$ inteiros e calcula a média aritmética dos valores pares lidos formatada com uma casa decimal. Possui condição de guarda para exibir `"NENHUM NUMERO PAR"` caso nenhum valor atenda ao filtro.
9. **Problema Mais Velho**: Lê o nome e a idade de $N$ indivíduos em vetores paralelos sincronizados por índice, identificando a maior idade e exibindo o nome correspondente.

### Parte 3: Vetores de Objetos e Encapsulamento (POO)
10. **Problema Aprovados**: Lê os dados de $N$ alunos (nome e notas semestrais) armazenando-os em um vetor de instâncias da classe `Aluno`. O cálculo da média semestral é delegado a um método da própria entidade, exibindo no terminal apenas os estudantes aprovados ($\text{média} \ge 6.0$).
11. **Problema Dados Pessoas**: Lê a altura e o gênero ($M$ ou $F$) de $N$ pessoas utilizando a classe `Pessoa`. O algoritmo extrai a maior e a menor altura do grupo inteiro, padroniza as entradas de texto com `Character.toUpperCase`, calcula a média de altura exclusivamente entre as mulheres e totaliza a contagem de homens.

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java (JDK 17+)
- **Entrada e Localidade:** `java.util.Scanner`, `java.util.Locale`
- **Manipulação de Caracteres:** `java.lang.Character`
- **Estruturas de Dados:** Arrays primitivos (`int[]`, `double[]`) e arrays de tipos referência (`Aluno[]`, `Pessoa[]`)
- **Conceitos de POO:** Classes, Atributos privados, Encapsulamento (*Getters/Setters*), Construtores, Delegação de Métodos

---

*Registro da minha jornada no Java: focado em solidificar a lógica de programação, a precisão matemática e os fundamentos da Orientação a Objetos antes de avançar para coleções dinâmicas e estruturas mais complexas.*
