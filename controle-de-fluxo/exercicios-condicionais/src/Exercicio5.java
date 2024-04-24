/*
    Escreva um programa que pergunte a nota de um aluno e converta essa nota para um conceito de A a F. Considere as seguintes faixas:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: abaixo de 60
    Se a nota estiver fora do intervalo 0-100, exiba uma mensagem de erro
*/
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua nota (0 a 100)");
        int nota = scanner.nextInt();

        if (nota < 0 || nota > 100) {
            System.out.println("ERRO: insira um valor correto");
        }
        else if (nota < 60) {
            System.out.println("Conceito F");
        }
        else if (nota <= 69) {
            System.out.println("Conceito D");
        }
        else if (nota <= 79) {
            System.out.println("Conceito C");
        }
        else if (nota <= 89) {
            System.out.println("Conceito B");
        }
        else if (nota <= 100) {
            System.out.println("Conceito A");
        }

        scanner.close();
    }
}
