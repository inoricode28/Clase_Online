import java.util.Scanner;

/**
 * App005
 */
public class App005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.println("EL area del cuadrado es: " + area);
        sc.close();
    }
}