# ☕ Exercícios de Java - Encapsulamento, Construtores e Sobrecarga

Esta pasta reúne a sequência de exercícios focados especificamente em **Encapsulamento**, **Sobrecarga de Construtores** e **Proteção de Integridade de Dados** em Java, consolidando a transição para uma arquitetura orientada a objetos consistente e segura.

## 🚀 O que eu estava aprendendo

Estes exercícios foram feitos para dominar o controle de acesso e o ciclo de vida dos objetos em memória, garantindo que o estado interno das entidades nunca seja corrompido por operações externas indevidas.

Nesta etapa, eu apliquei:
- **Sobrecarga de Construtores (`Overloading`)**: Criação de múltiplos construtores para permitir diferentes fluxos de inicialização de um objeto (dados padrão/cortesia vs. dados completos informados pelo usuário).
- **Encapsulamento Rígido (`private`)**: Restrição de acesso aos atributos com ausência deliberada de métodos modificadores (*setters*) em dados sensíveis, expondo apenas operações de negócio seguras.
- **Atributos Imutáveis (`final`)**: Uso do modificador `final` para identificadores que nunca podem mudar após a criação do objeto (como número de conta e placa de veículo).
- **Métodos Auxiliares Privados (`private`)**: Isolamento de operações internas e cálculos intermediários que pertencem exclusivamente à entidade e não devem ser visíveis para o programa principal.
- **Validações de Negócio e Limites Físicos**: Implementação de travas para impedir estados inconsistentes (cobrança de taxas de operação, capacidade máxima física de reservatórios e expiração/reativação automática de serviços).
- **Gestão do Buffer do `Scanner`**: Tratamento de entradas no terminal com `Integer.parseInt(sc.nextLine())` e consumo correto de quebras de linha pendentes.

*(Nota de evolução: A evolução aqui foi entender que uma classe bem encapsulada atua como uma "caixa-preta confiável", onde quem usa o objeto apenas solicita ações através de métodos públicos, enquanto a própria entidade valida suas regras e protege seus dados).*

## 💻 Exercícios Resolvidos

1. **Sistema de Conta Bancária (`ContaBancaria`)**:
   - Cadastro de conta corrente com opção de depósito inicial opcional via sobrecarga.
   - Número da conta imutável (`final`) e proteção do saldo contra edições externas arbitrárias.
   - Aplicação automática de taxa administrativa de R$ 5,00 por saque, permitindo saldo negativo.

2. **Telemetria de Frota de Veículos (`Carro`)**:
   - Cadastro flexível de veículos novos (0 km com reserva de fábrica de 5.0 L) ou seminovos.
   - Proteção de odômetro e combustível contra adulteração direta (sem *setters*).
   - Trava física na capacidade máxima do tanque (55.0 L) durante abastecimentos.
   - Cálculo dinâmico de autonomia (consumo de 10.0 km/L) e método auxiliar privado para realizar o deslocamento com segurança.

3. **Gestão de Assinatura Streaming (`Streaming`)**:
   - Gestão do ciclo de vida e transições de estado de uma assinatura digital.
   - Sobrecarga para adesão via período de teste gratuito (trial de 7 dias) ou contratação paga em meses.
   - Consumo de dias restantes com trava em zero e desativação automática (`INATIVA`) por expiração.
   - Reativação automática do serviço após renovação de meses e operação de upgrade do plano básico para premium.

## 🛠️ Tecnologias Utilizadas

- Java
- Ferramentas nativas: `Scanner`, `Locale`, `String.format`
- Conceitos de POO: Encapsulamento Rígido, Atributos Imutáveis (`final`), Sobrecarga de Construtores, Métodos Auxiliares Privados e Sobrescrita de `toString()`.

---
*Registro da minha jornada no Java: focado em solidificar a lógica de programação antes de avançar para códigos mais complexos.*
