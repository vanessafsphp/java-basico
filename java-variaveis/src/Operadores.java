public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        numero = - numero; // torna negativo
        System.out.println(numero);

        numero = numero * -1; // torna positivo
        System.out.println(numero);

    }
}
