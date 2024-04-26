/*
    Escreva um programa que pergunte ao usuário um número inteiro n e calcule o fatorial de n. 
    Lembre-se que n! é a multiplicação de todos os números de 1 a n.
*/

public class Exercicio5 {
    public static void main(String[] args) {
        int num = 6;

        if (num == 0 || num == 1) {
            num = 1;
            System.out.println(num);
        }
        else {
            for (int i = num - 1; i >= 1; i--) {
                num *= i;
            }
            System.out.println(num);
        }
    }
}
