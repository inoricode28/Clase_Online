import java.util.Scanner;

/**
 * App003
 */
public class App003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String nombre;
        System.out.print("¿Como te llamas?: ");
        nombre = sc.next();
        System.out.print("¿Cual es tu edad?: ");
        numero = sc.nextInt();
        System.out.println(nombre + " tienes " + numero + " años ");
        sc.close();
    }
}