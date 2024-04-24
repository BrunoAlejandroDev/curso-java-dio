/* 
    Escreva um programa que pergunte dois números ao usuário e exiba qual deles é maior. Se os números forem iguais, exiba uma mensagem indicando isso.
*/

public class Exercicio4 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 6;

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior do que o número " + num2);
        }
        else if (num2 > num1) {
            System.out.println("O número " + num2 + " é maior do que o número " + num1);
        }
        else {
            System.out.println("Os números são iguais");
        }
    }
}
