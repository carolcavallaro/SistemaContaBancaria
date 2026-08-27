package edu.carolina.desafios.desafio02_SistemaContaBancaria;

import java.util.Locale;

public class ContaBancaria {
    
    int numeroConta;
    String titular;
    double saldo = 0.0;

    // Objeto para formatar valores no padrão Real (R$ 0,00)
    private final Locale ptBR = new Locale("pt","BR");

    // Método para depositar um valor no saldo
    public void depositar(double valor){
        saldo += valor; // adiciona o valor ao saldo
        String saldoFormatado = String.format(ptBR, "R$ %,.2f", saldo);
        String valorFormatado = String.format(ptBR, "R$ %,.2f", valor);

        System.out.println("Depósito de " + valorFormatado + "+");
        System.out.println("Novo saldo: " + saldoFormatado + "\n");
    }

    // Método para sacar: retorna 'true' se conseguir, ou 'false' se não tiver saldo suficiente
    public boolean sacar(double valor){
        String valorFormatado = String.format(ptBR, "R$ %,.2f", valor);
        String saldoFormatado = String.format(ptBR, "R$ %,.2f", saldo);

        if (valor <= saldo) {
            saldo -= valor; // subtrai o valor do saldo
            String novoSaldoFormatado = String.format(ptBR, "R$ %,.2f", saldo);
            System.out.println("Saque de " + valorFormatado + "-");
            System.out.println("Novo saldo: R$ " + novoSaldoFormatado);
            return true; // confirma que o saque deu certo
        } else {
            System.out.println("Saldo insuficiente.\nSaque de " + valorFormatado + " recusado.\n(Saldo Atual: " + saldoFormatado + ")\n");
            return false; // avisa que não foi possível sacar
        }
    }

    // Método que retorna o saldo atual
    public double consultarSaldo(){
        return saldo;
    }
}
