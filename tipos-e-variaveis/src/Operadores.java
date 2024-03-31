public class Operadores {
    public static void main(String[] args) {
        // String concatenacao;

        // concatenacao = 1 + 1 + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);
        // System.out.println(concatenacao);

        ////////////////////////////////

        String nome1 = "Java";
        String nome2 = "Java";
        System.out.println("Teste 1: " + nome1 == nome2);

        String nome3 = new String("Java");
        System.out.println("Teste 2: " + nome1 == nome3);

        String nome4 = nome3;
        System.out.println(nome3 == nome4);

        System.out.println(nome1.equals(nome2));
        System.out.println(nome2.equals(nome3));
        System.out.println(nome3.equals(nome4));
    }
}