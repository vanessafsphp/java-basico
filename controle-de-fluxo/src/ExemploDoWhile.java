import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("\n Discando...");

        do {
            System.out.println("\n Telefone tocando");
        } while (tocando());

        System.out.println("\n Alô!!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("\n Atendeu? " + atendeu);

        // Negando o ato de continuar tocando caso tenha já atendido
        return ! atendeu;
    }
}
