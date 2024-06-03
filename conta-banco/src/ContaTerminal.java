import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nomeCompleto;
        String agencia;
        int numero;
        double saldo;

        System.out.println("\n ------------ BEM-VINDO BANK ACCOUNT --------- ");
        System.out.println("\n O banco que você confia, sempre do seu jeito! ");
        System.out.println("\n ---------------------------------------------- \n");

        System.out.println("\n Por favor, digite o número da sua Agência Bancária: ");
        agencia = scanner.next();

        System.out.println("\n Por favor, digite o número da sua Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada por nextInt()

        System.out.println("\n Por favor, digite seu Nome Completo: ");
        nomeCompleto = scanner.nextLine();

        System.out.println("\n Por favor, digite o valor a depositar (use ponto para separador decimal): ");
        if (scanner.hasNextDouble()) {
            saldo = scanner.nextDouble();
        } else {
            System.out.println("Erro: Entrada inválida. Certifique-se de usar ponto como separador decimal.");
            scanner.next(); // Descartar a entrada inválida
            saldo = 0.0;
        }

        scanner.close();

        System.out.println("\n --------------- BANK ACCOUNT -------------- ");
        System.out.println("\n Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        System.out.println("\n --------------- Obrigado por usar o nosso sistema! -------------- \n");
    }
}
