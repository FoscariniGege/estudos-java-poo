☕ Exercícios de Java - Sistema de Avaliação de Alunos (POO)
Este repositório documenta a minha evolução na Programação Orientada a Objetos (POO) em Java. O foco deste exercício foi aprender a embutir lógicas condicionais (decisões de aprovação/reprovação) diretamente nas regras de negócio da classe, mantendo a aplicação principal limpa.

🚀 O que eu estava aprendendo
Neste desafio, o objetivo foi dar mais inteligência ao objeto. Além de armazenar dados e fazer cálculos simples, o objeto agora é capaz de analisar o seu próprio estado e devolver respostas dinâmicas baseadas em condições (if/else).

Nesta etapa, eu apliquei:

Lógica Condicional Encapsulada: A regra de aprovação (nota mínima de 60 pontos) e o cálculo de pontos faltantes foram inseridos diretamente dentro da classe Aluno, tirando essa responsabilidade do programa principal.

toString() Dinâmico: Utilização do método toString() de forma avançada, fazendo com que ele retorne textos de formatação completamente diferentes dependendo do aluno ter sido aprovado ou reprovado.

Clean Code e Delegação: O método main continua focado exclusivamente na interação com o usuário (coleta do nome e das três notas), provando que uma boa arquitetura de classes facilita a leitura e a manutenção do código.

(Nota de evolução: Foi um salto enorme perceber que o toString() não serve apenas para listar variáveis, mas pode conter inteligência para exibir mensagens condicionais complexas com base nos cálculos da própria classe!)

💻 Exercício Resolvido
Sistema de Notas de Aluno: Um programa que lê o nome de um aluno e as notas que ele obteve nos três trimestres do ano. A classe Aluno processa essas informações, calcula a nota final (somatório) e verifica se o aluno foi aprovado (PASS) ou reprovado (FAILED), indicando exatamente quantos pontos faltam para atingir o mínimo de 60% caso ele não passe.

🛠️ Tecnologias Utilizadas
Java

Ferramentas nativas: Scanner (leitura de texto e números na mesma execução) e String.format (formatação de casas decimais e quebras de linha %n).

Fundamentos de POO: Classes, encapsulamento de lógica condicional, métodos que retornam cálculos e sobrescrita do método toString().