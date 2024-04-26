/*
    Escreva um programa que use um loop para imprimir todos os números pares de 1 a 20.
*/

public class Exercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
