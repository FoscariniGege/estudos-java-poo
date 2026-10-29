# ☕ Exercícios de Java - Telemetria de Frota de Veículos

Este repositório guarda os meus primeiros passos com Orientação a Objetos em Java, focando especificamente em encapsulamento rígido, sobrecarga de construtores, métodos auxiliares privados e controle de regras e limites físicos.

## 🚀 O que eu estava aprendendo

Estes exercícios foram feitos bem no início dos meus estudos, focando em fazer a lógica funcionar e entender os conceitos fundamentais.

Nesta etapa, eu apliquei:
- Sobrecarga de construtores (`Overloading`) para viabilizar duas formas de cadastro: veículo novo (quilometragem zerada e reserva de fábrica de 5.0 L) ou veículo seminovo (com hodômetro e combustível informados).
- Encapsulamento rígido contra adulteração de dados: atributos imutáveis (`final String modelo`), ausência deliberada de *setters* no hodômetro e no tanque para impedir modificações externas diretas.
- Métodos auxiliares com visibilidade privada (`private void andar`) para realizar atualizações internas de estado de forma segura e controlada.
- Validação de regras e limites físicos: trava do tanque na capacidade máxima permitida (55.0 L) durante o abastecimento e cálculo dinâmico de autonomia (consumo de 10.0 km/L) para barrar viagens caso o combustível seja insuficiente.
- Sobrescrita do método `toString()` com `@Override` e formatação de texto independente de plataforma (`String.format` e `%n`).

*(Nota de evolução: O código reflete o aprendizado de proteger a integridade dos dados de uma entidade, garantindo que variáveis que representam grandezas físicas só sofram alterações por ações lógicas autorizadas e consistentes).*

## 💻 Exercícios Resolvidos

1. **Telemetria de Frota de Veículos (`Carro`)**: Sistema de monitoramento veicular que cadastra carros novos ou seminovos, gerencia abastecimentos respeitando o teto de 55 L do tanque e simula viagens rodoviárias, calculando o consumo de combustível e a atualização do odômetro apenas quando há combustível suficiente.

## 🛠️ Tecnologias Utilizadas

- Java
- Ferramentas nativas: `Scanner`, `Locale`, `String.format`
- Conceitos de POO: Encapsulamento, Atributos Imutáveis (`final`), Sobrecarga de Construtores, Métodos Auxiliares Privados e Sobrescrita de `toString()`.

---
