package com.gftstart.exercicio4;


public class Main {
    public static void main(String[] args) {

        int[] a = new int[]{
                20, 198, 11549, 99999
        };
        int[] b = new int[]{
                10, 99, 9284, 9
        };
        for (int i = 0; i < a.length; i++) {
            Operacoes.soma(a[i], b[i]);
            Operacoes.sub(a[i], b[i]);
            Operacoes.mult(a[i], b[i]);
            Operacoes.div(a[i], b[i]);
        }
    }
}
