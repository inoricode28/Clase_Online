import java.util.Scanner;

/**
 * App002
 */
public class App002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        numero = numero * 2;
        System.out.println("El doble de un numero es: " + numero);
        sc.close();
    }
}