package com.gftstart.exercicio2;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(String nome, int numero, String titular, double saldo) {
        super(nome, numero, titular, saldo);
    }

    @Override
    public void rendimentoMensal() {
        double x = getSaldo() * 0.07;
        double rendimento = getSaldo() + x;
        System.out.println(rendimento);
    };

}