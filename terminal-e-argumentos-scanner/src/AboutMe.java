import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            // criando objeto scanner
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

            scanner.close();
        }
        catch (InputMismatchException exception) {
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }        
    }
}
