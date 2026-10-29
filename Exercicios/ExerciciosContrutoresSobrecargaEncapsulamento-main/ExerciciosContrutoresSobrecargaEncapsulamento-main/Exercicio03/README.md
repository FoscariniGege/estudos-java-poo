# ☕ Exercícios de Java - Gestão de Assinatura Streaming

Este repositório guarda os meus primeiros passos com Orientação a Objetos em Java, focando especificamente em encapsulamento rígido, sobrecarga de construtores e gerenciamento de ciclo de vida e estados de uma entidade.

## 🚀 O que eu estava aprendendo

Estes exercícios foram feitos bem no início dos meus estudos, focando em fazer a lógica funcionar e entender os conceitos fundamentais.

Nesta etapa, eu apliquei:
- Sobrecarga de construtores (`Overloading`) para atender a duas formas distintas de adesão: período de teste gratuito (trial de 7 dias) ou contratação paga calculada em meses.
- Encapsulamento rigoroso: atributo identificador imutável (`final int codAssinatura`), ausência intencional de *setters* em atributos de estado (`plano`, `status`, `diasRestantes`) e exposição segura via *getters*.
- Métodos auxiliares privados para centralizar a regra de transição de estado (ativação/desativação automática da conta quando os dias se esgotam ou quando há renovação).
- Tratamento e controle do buffer do `Scanner` (`Integer.parseInt` e consumo correto de quebras de linha no terminal).

*(Nota de evolução: O código demonstra como representar regras de negócio reais, permitindo que o objeto altere seu próprio estado de forma segura conforme eventos acontecem — passagem do tempo, recargas e upgrades — sem abrir brechas para manipulação externa direta).*

## 💻 Exercícios Resolvidos

1. **Gestão de Assinatura Streaming (`Streaming`)**: Sistema que administra o ciclo de vida de uma conta de streaming. Permite adesão gratuita ou por meses pagos, consome dias restantes até a desativação por expiração, realiza reativação automática via renovação de meses e gerencia upgrade do plano básico para premium.

## 🛠️ Tecnologias Utilizadas

- Java
- Ferramentas nativas: `Scanner`, `Locale`, `String.format`
- Conceitos de POO: Encapsulamento, Construtores Sobrecarregados, Métodos Auxiliares Privados e Sobrescrita de `toString()`.

---
