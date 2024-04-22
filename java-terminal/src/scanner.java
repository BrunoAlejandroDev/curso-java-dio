import java.util.Locale;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // criando o objeto Scanner (instânciando)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // criando as perguntas para o usuário
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // imprimindo os dados do usuário
        System.out.println("---------");
        System.out.println("Resumo dos seus dados:");
        System.out.println("Seu nome: " + nome);
        System.out.println("Seu sobrenome: " + sobrenome);
        System.out.println("Sua idade: " + idade + " anos");
        System.out.println("Sua altura: " + altura + "cm");
        System.out.println("---------");
    }
}