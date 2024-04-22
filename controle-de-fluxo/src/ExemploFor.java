public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = {"Bruno", "Carlos", "Julia", "Mariana"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno na posição " + i + " é: " + alunos[i]);
        }

        // usando for each para iterar o array alunos
        for (String aluno : alunos) {
            System.out.println("Meu nome é: " + aluno);
        }
    }
}
