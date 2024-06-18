import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;

        try {
            valor = NumberFormat.getInstance().parse("a1.65");
            System.out.println(valor);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }        
    }
}
