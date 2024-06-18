public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Mariazinha", "Joaozinho", "Ritinha", "Pedrinho" };

        // Utilizando apenas FOR
        for (int x= 0; x < alunos.length; x++) {
            System.out.println("\n O aluno no índice x= " + x + " é " + alunos[x]);
        }

        // Utilizando FOR / EACH
        for (String aluno: alunos) {
            System.out.println("\n Nome do aluno é: " + aluno);
        }
    }
}
