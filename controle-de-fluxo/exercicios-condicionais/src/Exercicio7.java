/*
    Escreva um programa que pergunte o salário bruto de um funcionário e a alíquota de impostos. Calcule e exiba o salário líquido após a aplicação dos impostos.
    Adicione condições para garantir que o salário bruto e a alíquota são valores positivos
*/
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário bruto");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Digite a aliquota de imposto (em %)");
        double aliquotaImposto = scanner.nextDouble();

        if (salarioBruto <= 0) {
            System.out.println("ERRO: o valor para salário deve ser maior que zero");
        }
        else if (aliquotaImposto < 0 || aliquotaImposto > 100) {
            System.out.println("ERRO: o valor para a aliquota de imposto deve ser maior que zero e menor que 100");
        }
        else {
            double descontoImposto = (salarioBruto * (aliquotaImposto / 100));
            double salarioLiquido = salarioBruto - descontoImposto;

            System.out.println("Salário Bruto: " + salarioBruto);
            System.out.println("Aliquota de imposto: " + aliquotaImposto);
            System.out.println("Desconto do imposto: " + descontoImposto);
            System.out.println("Salário líquido: " + salarioLiquido);
        }
        scanner.close();
    }
}
