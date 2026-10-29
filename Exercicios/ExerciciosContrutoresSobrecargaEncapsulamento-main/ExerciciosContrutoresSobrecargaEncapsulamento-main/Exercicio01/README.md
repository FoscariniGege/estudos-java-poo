# ☕ Exercícios de Java - Sistema de Conta Bancária

Este repositório guarda os meus primeiros passos com Orientação a Objetos em Java, focando especificamente em construtores, sobrecarga e encapsulamento de regras bancárias.

## 🚀 O que eu estava aprendendo

Estes exercícios foram feitos bem no início dos meus estudos, focando em fazer a lógica funcionar e entender os conceitos fundamentais.

Nesta etapa, eu apliquei:
- Sobrecarga de construtores (`Overloading`) para viabilizar duas formas de abertura de conta: com depósito inicial ou com saldo zerado.
- Encapsulamento estrito e proteção de atributos sensíveis: número da conta imutável (`final` e sem *setter*), titular com alteração controlada e saldo protegido contra modificações externas diretas.
- Centralização de regras de negócio em métodos específicos (`depositar` e `sacar`), aplicando automaticamente a cobrança de tarifa fixa de R$ 5,00 por saque e permitindo saldo negativo.
- Sobrescrita do método `toString()` com `@Override` e formatação de texto independente de plataforma (`String.format` e `%n`).

*(Nota de evolução: O código representa a consolidação da integridade dos dados, garantindo que o estado interno do objeto só mude por operações autorizadas e nunca por atribuições diretas de fora da classe).*

## 💻 Exercícios Resolvidos

1. **Sistema de Conta Bancária (`ContaBancaria`)**: Programa que simula o cadastro de uma conta corrente bancária com opção de depósito inicial. Executa operações sequenciais de depósito e saque com taxa fixa administrativa, exibindo os dados cadastrais e o saldo atualizado a cada movimentação financeira.

## 🛠️ Tecnologias Utilizadas

- Java
- Ferramentas nativas: `Scanner`, `Locale`, `String.format`
- Conceitos de POO: Encapsulamento, Atributos Imutáveis (`final`), Sobrecarga de Construtores e Sobrescrita de `toString()`.

---
*Registro da minha jornada no Java: focado em solidificar a lógica de programação antes de avançar para códigos mais complexos.*
