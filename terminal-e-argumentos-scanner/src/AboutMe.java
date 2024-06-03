import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        // criando objeto scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n Digite seu nome");
        String nome = scanner.next();

        System.out.println("\n Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("\n Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("\n Digite sua altura");
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
