import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Digite o primeiro parâmetro: ");
		int primeiroNumero = scanner.nextInt();
		System.out.println("\n Digite o segundo parâmetro: ");
		int segundoNumero = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(primeiroNumero, segundoNumero);
		
		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
		} finally {
            scanner.close();
        }            
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        //validar se primeiroNumero é MAIOR que segundoNumero e lançar a exceção
        if (primeiroNumero > segundoNumero)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = segundoNumero - primeiroNumero;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
