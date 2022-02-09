package com.gftstart.exercicio2;

public class Conta {

    private String nome;
    private int numero;
    private String titular;
    private double saldo;


    public Conta(String nome, int numero, String titular, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void rendimentoMensal() {
    }

}







