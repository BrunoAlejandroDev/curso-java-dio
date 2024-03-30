public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // uma variável pode ser declarada com um valor e ter esse mesmo valor alterado, tendo apenas que respeitar o tipo
        int numero = 10;
        numero = 5;
        System.out.println(numero);

        // para declarar variáveis constantes, segue-se a seguinte prática: final <tipo> nome (caixa alta)
        final double valor_Pi = 3.14;
        System.out.println(valor_Pi);
    }
}