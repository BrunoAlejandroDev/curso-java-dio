/*
    Escreva um programa que pergunte ao usuário um número inteiro e exiba a tabuada desse número de 1 a 10.
*/
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo");
        int num = scanner.nextInt();

        System.out.println("----- Tabuada do " + num + ": " + "-----");

        for (int i = 1; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println(num + " * " + i + " = " + tabuada);
        }

        scanner.close();
    }
}
