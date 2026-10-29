# ☕ Módulo: Introdução a Classes e Orientação a Objetos (POO) em Java

Este repositório documenta a consolidação da minha base em Programação Orientada a Objetos (POO) com Java. Esta pasta centraliza os primeiros **6 exercícios práticos** do curso, representando a transição crucial da programação estruturada/procedural (com lógica concentrada no método principal) para uma arquitetura limpa, modular e orientada a objetos, aplicando boas práticas de Código Limpo (*Clean Code*).

---

## 🚀 O que foi treinado e aplicado no módulo

- **Separação de Pacotes (`application`, `entities` e `util`)**: Isolamento claro entre o ponto de entrada da aplicação, regras de negócio das entidades e funções utilitárias.
- **Atributos e Métodos de Instância**: Compreensão de como criar moldes de classes e permitir que os objetos manipulem seus próprios dados.
- **Membros Estáticos (`static`) e Constantes (`final`)**: Criação de classes utilitárias com métodos que não dependem da criação de instâncias (`new`) e definição de valores imutáveis de classe (`public static final`).
- **Encapsulamento de Comportamentos**: Delegação de regras matemáticas e lógicas complexas para dentro de suas respectivas classes.
- **Mutabilidade de Estado**: Atualização de valores internos de um objeto em tempo de execução através de métodos específicos.
- **Lógica Condicional Encapsulada**: Tomada de decisões e regras de validação utilizando estruturas de controle (`if/else`) dentro das classes.
- **Sobrescrita do método `toString()`**: Customização da representação textual dos objetos para manter a classe principal enxuta e focada na interação com o usuário.

---

## 💻 Os 6 Exercícios Resolvidos nesta Pasta

1. **Calculadora de Área de Triângulos (`Triangle`)**:
   - *Evolução Inicial*: Comparação prática da mesma lógica primeiro de forma procedural (variáveis soltas no `main`) e, em seguida, modularizada em uma classe dedicada aplicando a Fórmula de Heron.
2. **Controle de Estoque de Produtos (`Product`)**:
   - *Foco*: Gerenciamento de estado e fluxo de mercadorias. O sistema calcula o valor total em estoque, realiza entradas (`addProducts`) e saídas (`removeProducts`), exibindo o estado atualizado com o `toString()`.
3. **Cálculo de Medidas do Retângulo (`Rectangle`)**:
   - *Foco*: Encapsulamento de fórmulas geométricas. A classe calcula de forma independente a Área, o Perímetro e a Diagonal (utilizando o Teorema de Pitágoras com `Math.sqrt`).
4. **Gestão de Funcionários (`Employee`)**:
   - *Foco*: Mutabilidade e regras de negócio financeiras. O sistema calcula o salário líquido descontando impostos e aplica aumentos percentuais com impacto direto no salário bruto do colaborador.
5. **Sistema de Avaliação de Alunos (`Student`)**:
   - *Foco*: Lógica condicional e formatação dinâmica. A classe soma as notas dos trimestres, avalia a situação do aluno (aprovação/reprovação) e calcula quantos pontos faltaram para atingir a nota de corte em caso de reprovação.
6. **Conversor de Moeda com IOF (`ConversorDeDinheiro` / `CurrencyConverter`)**:
   - *Foco*: Membros estáticos e classes utilitárias. Centralização do cálculo de câmbio em uma classe de utilidade sem necessidade de instanciação, aplicando constante estática (`IOF = 0.06`) e método estático utilitário para calcular o total em reais com taxa de imposto.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

- **Linguagem**: Java
- **Entrada e Saída**: `Scanner`, `Locale.US`, `System.out.printf` e `String.format` (formatação de casas decimais e quebras de linha com `%n`)
- **Bibliotecas Nativas**: `java.lang.Math` (para funções matemáticas como `Math.sqrt`)
- **Conceitos de POO e Boas Práticas**:
  - Classes e Objetos (Instanciação)
  - Métodos de Instância vs. Métodos Estáticos (`static`)
  - Constantes de Classe (`static final`)
  - Encapsulamento e Delegação de Responsabilidades
  - Sobrescrita de Métodos (`@Override toString`)
  - Organização Modular em Pacotes (`packages`)

---
*Registro da minha jornada no Java: focado em solidificar a lógica de programação e arquitetura orientada a objetos antes de avançar para tópicos mais complexos.*
