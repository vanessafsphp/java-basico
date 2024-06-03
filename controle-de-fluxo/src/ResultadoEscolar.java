public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        if (nota >= 7)
            System.out.println("\n Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("\n Prova de Recuperação");

        else
            System.out.println("\n Reprovado");

        // Utilizando condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
