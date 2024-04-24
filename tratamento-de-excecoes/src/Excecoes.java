import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner (System.in);
    
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
    
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
    
            // mostrar informações
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
    
            scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println();
            System.out.println("ERRO: os campos de idade e altura precisam ser númericos e não aceitam vírgulas");
        }
    }
}
