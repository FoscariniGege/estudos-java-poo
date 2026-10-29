# ☕ Exercícios de Java - Matrizes e Coleções com POO

Este repositório guarda os meus primeiros passos com a manipulação de matrizes integradas à Programação Orientada a Objetos em Java, focando especificamente na busca de valores, armazenamento de coordenadas através de classes personalizadas e verificação segura de posições adjacentes.

## 🚀 O que eu estava aprendendo

Estes exercícios foram feitos bem no início dos meus estudos, focando em fazer a lógica funcionar e entender os conceitos fundamentais.

Nesta etapa, eu apliquei:
- Inicialização direta de matrizes no código (`int[][] matriz = { ... }`) como estratégia prática para agilizar a rotina de testes
- Separação em camadas com a criação da entidade `entities.Posicao` para encapsular linha e coluna
- Uso de coleções dinâmicas (`List<Posicao>` e `ArrayList`) para armazenar todas as ocorrências encontradas
- Varredura bidimensional com laços aninhados para localizar o valor pesquisado
- Validação precisa de limites (`col > 0`, `col < colunas - 1`, `lin > 0`, `lin < linhas - 1`) para evitar o erro `ArrayIndexOutOfBoundsException`
- Recuperação das coordenadas salvas e verificação direcional dos vizinhos (esquerda, direita, acima e abaixo)

*(Nota de evolução: Integração prática de matrizes com POO e listas dinâmicas, utilizando objetos dedicados para salvar o estado das coordenadas antes de processar as regras de vizinhança).*

## 💻 Exercícios Resolvidos

1. **Busca e Vizinhança em Matriz com Classe de Posição**: Localiza todas as ocorrências de um número informado em uma matriz[cite: 3], instancia e guarda as coordenadas em uma lista de objetos `Posicao`, e posteriormente percorre a lista imprimindo os elementos vizinhos válidos (esquerda, direita, acima e abaixo)[cite: 3].

## 🛠️ Tecnologias Utilizadas

- Java
- Java Collections Framework (`List`, `ArrayList`)
- Programação Orientada a Objetos (POO)
- Ferramentas nativas: `Scanner`

