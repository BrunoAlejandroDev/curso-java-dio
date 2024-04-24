/*
    Escreva um programa que pergunte um ano ao usuário e determine se é bissexto. Um ano é bissexto se:
        É divisível por 4.
    Se for divisível por 100, deve também ser divisível por 400 para ser bissexto.
*/

public class Exercicio6 {
    public static void main(String[] args) {
        int ano = 2004;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto");
        }
        else {
            System.out.println(ano + " não é um ano bissexto");
        }
    }
}
