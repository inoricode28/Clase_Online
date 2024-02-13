import java.util.Scanner;

/**
 * App006
 */
public class App006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares: ");
        double dolares = sc.nextDouble();
        System.out.println("Ingrese el tipo de cambio (1 dolar a soles): ");
        double tipoCambio = sc.nextDouble();

        double soles = dolares * tipoCambio;
        System.out.println( dolares + " dolares equivalen a " + soles + " soles." );
        sc.close();
    }
}
