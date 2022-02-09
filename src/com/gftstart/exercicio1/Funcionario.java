package com.gftstart.exercicio1;

import java.util.Date;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;
    private Date dataAdmissao;
    private String cpf;

    public Funcionario(String nome, String matricula, double salario, Date dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void receberAumento(double valor) {
        double aumento = this.getSalario() + valor;
        setSalario(aumento);
    }

    ;

    public double calculaGanhoBrutoAnual() {
        double total_bruto_anual = this.getSalario() * 12;
        return total_bruto_anual;
    };

    public double calculaImposto() {
        double salario = this.getSalario();
        if (salario < 2500) {
            double desc = salario * 0.11;

            return desc;
        }else{
            double desc = salario * 0.175;

            return salario;
        }
    };

    public double calculaGanhoLiquidoMensal() {
        double s_liquido = this.getSalario();
        if (s_liquido < 2500) {
            double desc = s_liquido * 0.11;
            s_liquido = s_liquido - desc;
            return s_liquido;
        }else{
            double desc = s_liquido * 0.175;
            s_liquido = s_liquido - desc;
            return s_liquido;
        }
    };

    public double calculaGanhoLiquidoAnual() {
        double total_liquido = this.calculaGanhoLiquidoMensal() * 12;
        return total_liquido;
    };

}
