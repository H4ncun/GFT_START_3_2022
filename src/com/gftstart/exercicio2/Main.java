package com.gftstart.exercicio2;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente("Conta1",234,"Luiz",2500);

        Conta poupanca = new ContaPoupanca("Conta2",234,"Luiz",5000);

        cc.rendimentoMensal();
        poupanca.rendimentoMensal();
    }
}
