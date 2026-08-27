package edu.carolina.desafios.desafio02_SistemaContaBancaria;

import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args){
        
        // Instanciando o objeto ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        // Definindo o titular e o número da conta
        conta.titular = "Carolina";
        conta.numeroConta = 1001;
        Locale ptBR = new Locale("pt", "BR");
        
        System.out.println("=" .repeat(32));
        System.out.println("======= CAIXA ELETRÔNICO =======");
        System.out.println("=" .repeat(32));
        System.out.println("Titular:          " + conta.titular);
        System.out.println("Número da conta:  " + conta.numeroConta);
        System.out.println("-".repeat(32));

        // Realizando um depósito de R$ 500.00
        System.out.println("----------- Depósito -----------");
        conta.depositar(500.00);

        // Tentando o saque de R$ 600.00
        System.out.println("------ Tentativa de Saque ------");
        conta.sacar(600.00);

        // Realizando um saque válido (R$ 200.00)
        System.out.println("------------- Saque ------------");
        conta.sacar(200.00);

        // Consultando o saldo
        System.out.println("-".repeat(32));
        String saldoFinalFormatado = String.format(ptBR, "R$ %,.2f", conta.consultarSaldo());
        System.out.println("\n---- Saldo Final: " + saldoFinalFormatado + " ----");
        System.out.println("=" .repeat(32));
    }
}
