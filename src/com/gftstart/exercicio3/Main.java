package com.gftstart.exercicio3;

public class Main {
    public static void main(String[] args) {

        String[] Alphabet = new String[]{
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N",
                "O","P","Q","R","S","T","U","V","W","X","Y","Z"
        };

        char[] letras = null;
    String palavra = "Meu código não precisa de comentários";

        String palavraUpperCase = palavra.toUpperCase();

        letras = palavraUpperCase.toCharArray();
        int numeros = 0;
        for (int i=0; i < letras.length  ; i++)

            int x = letras[i];
            ;

             numeros+= i;
        }
        System.out.println(numeros);

        }


    }
}