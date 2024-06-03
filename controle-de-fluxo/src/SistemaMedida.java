public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("\n PEQUENO");
                break;

            case "M":
                System.out.println("\n MÉDIO");
                break;

            case "G":
                System.out.println("\n GRANDE");
                break;
        
            default:
                System.out.println("\n INDEFINIDO");
                break;
        }
    }
}
