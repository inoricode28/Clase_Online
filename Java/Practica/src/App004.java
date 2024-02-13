import java.util.Scanner;

/**
 * App004
 */
public class App004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costo, precio;
        System.out.print("¿Cual es el costo del producto?: ");
        costo = sc.nextDouble();
        precio = costo *1.18;
        System.out.println("EL precio del produicto es: " + precio);
        sc.close();
    }
}