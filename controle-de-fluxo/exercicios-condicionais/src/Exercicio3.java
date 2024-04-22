import java.util.Scanner;

/*
    Verificação de triângulo:
    Escreva um programa que pergunte três números e determine se eles podem formar um triângulo.
    Dica: Para formar um triângulo, a soma de dois lados deve ser maior que o terceiro
*/

public class Exercicio3 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o primeiro lado do triângulo");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o primeiro lado do triângulo");
        int lado3 = scanner.nextInt();

        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os valores podem formar um triângulo");
        }
        else {
            System.out.println("Os valores não3 podem formar um triângulo");
        } 

        scanner.close();
    }
}
