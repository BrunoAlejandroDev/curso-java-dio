import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Case4 {
     public static void main(String[] args) {
        List<String> candidatosSelecionados = selecaoCandidatos();
        mostrarCandidatosSelecionados(candidatosSelecionados);

        for (String candidato : candidatosSelecionados) {
            ligarParaCandidato(candidato);
        } 
    }

    //? case 2
    public static List<String> selecaoCandidatos () {
        String [] candidatos = {"FELIPE", "BRUNO", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "MIRELA", "DANIELA", "JORGE"};
        double salarioBase = 2000.0;
        int candidatoAtual = 0;
        int numCandidatosSelecionados = 0;

        //* Criando uma lista para armazenar os nomes dos candidatos selecionados
        List<String> candidatosSelecionados = new ArrayList<>();
        
        //* Loop para percorrer a lista de candidatos e verificar quais vão ser selecionados
        while (numCandidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            //System.out.printf("O candidato %s solicitou o seguinte valor: %.2f\n", candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                numCandidatosSelecionados++;
                candidatosSelecionados.add(candidato);
            }
            candidatoAtual++;
        }
        System.out.println();

        //* Retorno da lista de candidatos selecionados
        return candidatosSelecionados;
    }
    
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //? case 3
    public static void mostrarCandidatosSelecionados(List<String> candidatos) {
        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado: " + candidato);
            System.out.println("------");
        }
    }

    // //? case 4
    public static void ligarParaCandidato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atendeu();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else {
                System.out.println("Contato realizado com sucesso!");
            }
        }
        while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
            System.out.println("------");
        }
        else {
            System.out.println("Não conseguimos contato com o " + candidato + " após um total de " + tentativasRealizadas + " tentativas realizadas");
            System.out.println("------");
        }
    }

    public static boolean atendeu () {
        return new Random().nextInt(3) == 1;
    }
}