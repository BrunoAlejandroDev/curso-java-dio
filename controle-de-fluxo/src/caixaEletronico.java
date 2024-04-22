public class caixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorDeSaque = 26.0;

        if (saldo > valorDeSaque) {
            saldo -= valorDeSaque;
            System.out.println("Novo saldo: " + saldo);
        }
        else {
            System.out.println("ERRO: saldo insuficiente para saque.");
        }
    }
}