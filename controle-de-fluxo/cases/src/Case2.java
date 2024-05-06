import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;

public class Case2 {
    public static void main(String[] args) {
        List<String> candidatosSelecionados = selecaoCandidatos();
        mostrarCandidatosSelecionados(candidatosSelecionados);
    }

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
            System.out.printf("O candidato %s solicitou o seguinte valor: %.2f\n", candidato, salarioPretendido);

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

    public static void mostrarCandidatosSelecionados(List<String> candidatos) {
        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado: " + candidato);
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}