# 🏦 Sistema de Conta Bancária Simples

Projeto desenvolvido em Java para praticar e consolidar conceitos fundamentais de Orientação a Objetos (POO), incluindo criação de classes, atributos, métodos com e sem retorno, manipulação de parâmetros e formatação de saídas no console.

---

## 📌 Sobre o Desafio

O objetivo principal é simular o funcionamento básico de um caixa eletrônico interagindo com uma conta bancária. A aplicação executa operações de depósito, tentativas de saque (com validação de saldo) e consulta de saldo final.

### Requisitos Implementados

* **Classe `ContaBancaria`:**
  * Atributos: `numeroConta` (int), `titular` (String) e `saldo` (double).
  * Estado Inicial: Saldo zerado (`0.0`).
  * `depositar(double valor)`: Adiciona o valor ao saldo e exibe a confirmação.
  * `sacar(double valor)`: Valida se há saldo suficiente. Se sim, realiza o débito e retorna `true`. Se não, exibe alerta e retorna `false`.
  * `consultarSaldo()`: Retorna o saldo atual.
* **Classe `CaixaEletronico` (`main`):**
  * Instanciação do objeto `ContaBancaria`.
  * Atribuição de titular e número da conta.
  * Simulação de depósito de R$ 500,00.
  * Simulação de tentativa de saque de R$ 600,00 (saldo insuficiente).
  * Simulação de saque válido de R$ 200,00.
  * Exibição do saldo final.

---

## 🚀 Diferenciais da Implementação

Além de atender aos requisitos do enunciado, foram aplicadas boas práticas de apresentação e escrita de código:

* **Formatação Monetária Brasileira:** Uso da classe `Locale("pt", "BR")` e `String.format()` para exibir os valores no padrão `R$ 0,00` (com vírgula decimal e separador de milhar).
* **Estética no Terminal:** Utilização do método `.repeat()` para criar divisores visuais alinhados, tornando o extrato legível e organizado.
* **Mensagens Claras:** Indicação de operações aprovadas, recusadas e atualização do saldo em tempo real.

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 11+)
* **Paradigma:** Orientação a Objetos (POO)
* **Conceitos aplicados:** Classes, Atributos, Métodos com/sem retorno e Encapsulamento
* **IDE:** VS Code

---

## 💻 Exemplo de Saída no Terminal

```text
================================
======= CAIXA ELETRÔNICO =======
================================
Titular:          Carolina
Número da conta:  1001
--------------------------------
----------- Depósito -----------
Depósito de R$ 500,00+
Novo saldo: R$ 500,00

------ Tentativa de Saque ------
Saldo insuficiente.
Saque de R$ 600,00 recusado.
(Saldo Atual: R$ 500,00)

------------- Saque ------------
Saque de R$ 200,00-
Novo saldo: R$ 300,00
--------------------------------

---- Saldo Final: R$ 300,00 ----
================================
```
