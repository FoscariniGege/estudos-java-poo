# ☕ Estudos de Java, POO e Estrutura de Dados

Repositório centralizador da minha jornada prática em **Java**, reunindo **31 exercícios e projetos modulares** que cobrem desde lógica de programação e estruturas de repetição até Programação Orientada a Objetos (POO), manipulação dinâmica de coleções e implementação de Estruturas de Dados.

---

## 🗂️ Módulos e Exercícios Práticos

| Módulo | Qtd. | Classes de Domínio / Utilitárias (`entities` & `util`) | Conceitos Praticados |
|---|:---:|---|---|
| **1. Estruturas de Repetição (`while`)** | 4 | `Exercicio01` a `Exercicio03`, `ExerciciosSobreWhile` | Controle de fluxo condicional, leitura contínua de dados e validação de entrada com laço `while`. |
| **2. Estruturas de Repetição (`for`)** | 8 | `Exercicio01` a `Exercicio07`, `ExerciciosFor` | Laços contados, acumuladores, intervalos numéricos, cálculos matemáticos e iterações controladas. |
| **3. Introdução à POO (Classes e Membros Estáticos)** | 6 | `Triangulo`, `Product`, `Retangulo`, `Funcionario`, `Aluno`, `ConversorDeDinheiro` | Modelagem de entidades, atributos, métodos de negócio, sobrescrita do `toString()` e métodos utilitários estáticos (`util`). |
| **4. Construtores, Sobrecarga e Encapsulamento** | 3 | `ContaBancaria`, `Carro`, `Streaming` | Proteção de estado (`private`), métodos `getters`/`setters`, sobrecarga de construtores e regras de negócio encapsuladas (saque/depósito, controle de velocidade e planos de assinatura). |
| **5. Vetores (Arrays Unidimensionais)** | 11 | `Pessoa`, `Aluno` + 8 algoritmos em `Program` | Alocação contígua em memória, vetores de tipos primitivos (tipo valor) vs. vetores de objetos (tipo referência), filtragem, médias e estatísticas sobre conjuntos de dados. |
| **6. Listas Dinâmicas (`List` / `ArrayList`)** | 1 | `Funcionario`, `Util` | Manipulação da interface `List<T>`, busca por ID, inserção/remoção dinâmica e reajuste salarial percentual com funções auxiliares. |
| **7. Matrizes (Arrays Bidimensionais)** | 2 | `Posicao` + `Program` | Percorrimento de linhas e colunas, diagonal principal, contagem de elementos e mapeamento de coordenadas adjacentes (acima, abaixo, esquerda e direita). |
| **8. Estrutura de Dados** | 1 | `FilaEstatica` | Implementação manual de **Fila Estática (FIFO - First In, First Out)** orientada a objetos, gerenciamento de ponteiros de início/fim, capacidade e operações de enfileirar/desenfileirar. |

---

## 🏛️ Arquitetura dos Exercícios

A partir do módulo de Orientação a Objetos, os exercícios seguem a divisão de responsabilidades em pacotes:

```text
ExercicioXX/
├── README.md                  # Enunciado e regras de negócio do problema
└── src/
    ├── application/
    │   └── Program.java       # Ponto de entrada (main) e interação via console (Scanner)
    ├── entities/
    │   └── Entidade.java      # Regras de negócio, atributos encapsulados e construtores
    └── util/
        └── Utilitario.java    # Classes auxiliares e métodos estáticos de validação/conversão
