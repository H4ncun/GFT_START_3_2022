package com.gftstart.exercicio2;

public class ContaCorrente extends Conta {


    public ContaCorrente(String nome, int numero, String titular, double saldo) {
        super(nome, numero, titular, saldo);
    }

    @Override
    public void rendimentoMensal() {
        double x = getSaldo() * 0.05;
        double rendimento = getSaldo() + x;
        System.out.println(rendimento);
    };
}
