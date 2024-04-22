public class ResultadoEscolar {
    public static void main(String[] args) {
        double notaAluno = 7.2;

        if (notaAluno >= 7) {
            System.out.println("Aprovado");
        }
        else if (notaAluno >= 5 && notaAluno < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
