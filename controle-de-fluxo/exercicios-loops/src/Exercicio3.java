/* 
    Escreva um programa que peça ao usuário um número inteiro N e calcule a soma dos primeiros N números inteiros.
*/

public class Exercicio3 {
    public static void main(String[] args) {
        int soma = 0;
        int numUsuario = 10;

        for (int i = 1; i <= numUsuario; i++) {
            soma += i;
        }
        System.out.println(soma);

        while (numUsuario > 0) {
            soma += numUsuario;
            numUsuario--;
        }
        System.out.println(soma);
    }
}
