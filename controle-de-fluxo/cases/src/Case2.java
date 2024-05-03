import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    public static void analisarCandidatos (double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static void selecaoCandidatos () {
        String [] candidatos = {"FELIPE", "BRUNO", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "MIRELA", "DANIELA", "JORGE"};
        double salarioBase = 2000.0;
        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            double salarioPretendido = valorPretendido();
            String candidato = candidatos[candidatoAtual];
            System.out.printf("O candidato %s solicitou o seguinte valor: %.2f\n", candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}