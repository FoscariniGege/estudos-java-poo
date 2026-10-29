☕ Exercícios de Java - Gestão de Funcionários (POO)
Este repositório registra mais um avanço nos meus estudos de Programação Orientada a Objetos (POO) em Java. O grande foco deste exercício foi entender a mutabilidade, ou seja, como alterar o estado interno de um objeto após ele ter sido criado, utilizando seus próprios métodos.

🚀 O que eu estava aprendendo
Neste desafio, aprofundei a ideia de que um objeto não serve apenas para guardar dados e fazer contas simples, mas também para gerenciar as regras de negócio de forma segura.

Nesta etapa, eu apliquei:

Mutabilidade de Estado: Entender na prática como um método (como o acrescentandoSalario) altera o valor de um atributo interno (salarioBruto), atualizando o objeto em tempo real.

Regras de Negócio Encapsuladas: Garantir que o aumento salarial seja aplicado apenas sobre o salário bruto (sem alterar o valor do imposto) deixando essa regra matemática presa dentro da classe Funcionario.

Flexibilidade com toString(): Como usar o toString() para formatar os dados essenciais do objeto (nome e salário líquido), e no programa principal (main) apenas concatenar textos descritivos ("Employee: " + objeto), gerando saídas dinâmicas no console.

(Nota de evolução: Foi muito interessante perceber como a lógica matemática de porcentagem ficou escondida na classe, deixando o arquivo principal super limpo e focado apenas em interagir com o usuário!)

💻 Exercício Resolvido
Atualização Salarial de Funcionário: Um programa que lê os dados iniciais de um colaborador (nome, salário bruto e imposto). O sistema calcula e exibe o salário líquido (descontando o imposto) e, em seguida, solicita uma porcentagem de aumento. O programa aplica esse aumento estritamente sobre o salário bruto e exibe os dados atualizados.

🛠️ Tecnologias Utilizadas
Java

Ferramentas nativas: Scanner (para leitura contínua de dados) e formatação avançada de strings (String.format).

Fundamentos de POO: Classes, manipulação de estado, encapsulamento de regras de negócio e o método toString().