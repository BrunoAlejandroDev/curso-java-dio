/*
    Escreva um programa que peça a idade do usuário e classifique-o em um dos seguintes grupos:
    Criança (idade < 13)
    Adolescente (13 <= idade < 18)
    Adulto (18 <= idade < 65)
    Idoso (idade >= 65)
*/
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio2 {
    public static void main(String[] args) {
        int idade = idadeAleatoria();
        System.out.println("Idade sorteada: " + idade);

        if (idade < 13) {
            System.out.println("Criança");
        }
        else if (idade >= 13 && idade < 18) {
            System.out.println("Adolescente");
        }
        else if (idade >= 18 && idade < 65) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }
    }

    // método para gerar numeros aleatórios
    private static int idadeAleatoria() {
        return ThreadLocalRandom.current().nextInt(13, 80);
    }
}
