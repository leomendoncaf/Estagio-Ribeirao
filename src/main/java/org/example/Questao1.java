package org.example;

public class Questao1 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;

        for (int k = 1; k <= indice; k++) {
            soma += k;
        }

        System.out.println(soma);
    }
}