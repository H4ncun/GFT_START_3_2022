package com.gftstart.exercicio1;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        var x = LocalDate.parse("09/02/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Funcionario funcio1 = new Funcionario("Luiz","M001",2500d,convertToDateViaInstant(x),"465.908.654-78");
        Funcionario funcio2 = new Funcionario("Felipe","M002",4500d,convertToDateViaInstant(x),"475.008.654-78");

        System.out.println(funcio1.calculaGanhoLiquidoMensal());
        System.out.println(funcio1.calculaGanhoLiquidoMensal());
        System.out.println(funcio1.calculaGanhoLiquidoAnual());
        System.out.println(funcio1.calculaImposto());
        System.out.println(funcio1.calculaGanhoBrutoAnual());
        funcio1.receberAumento(500);
        System.out.println(funcio1.calculaGanhoLiquidoMensal());
        System.out.println(funcio1.calculaGanhoLiquidoAnual());
        System.out.println(funcio1.calculaImposto());
        System.out.println(funcio1.calculaGanhoBrutoAnual());

        System.out.println(funcio2.calculaGanhoLiquidoMensal());
        System.out.println(funcio2.calculaGanhoLiquidoMensal());
        System.out.println(funcio2.calculaGanhoLiquidoAnual());
        System.out.println(funcio2.calculaImposto());
        System.out.println(funcio2.calculaGanhoBrutoAnual());
        funcio2.receberAumento(500);
        System.out.println(funcio2.calculaGanhoLiquidoMensal());
        System.out.println(funcio2.calculaGanhoLiquidoAnual());
        System.out.println(funcio2.calculaImposto());
        System.out.println(funcio2.calculaGanhoBrutoAnual());






    }

    public static Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

}
