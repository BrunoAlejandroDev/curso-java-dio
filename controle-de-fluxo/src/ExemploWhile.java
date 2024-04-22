import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantDoces = 0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce de valor: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce;
            quantDoces++;
        }
        System.out.println("Valor atual da mesada: " + mesada);
        System.out.println("Quantidade de doces comprados: " + quantDoces);
    }

    // código para gerar valores aleatórios para os doces
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
