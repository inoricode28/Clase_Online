import java.util.Scanner;

/**
 * App008
 */
public class App008 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las horas a trabajar: ");
        double horas = sc.nextDouble();

        System.out.print("Ingrese ingrese la tarifa por hora: ");
        double tarifa = sc.nextDouble();

        //Calculos
        //Sueldo basico
        double Sbasico = horas*tarifa;

        //Sueldo Bruto
        double Sbruto = Sbasico+(Sbasico*0.20);

        //Sueldo Neto
        double Sneto = Sbruto-(Sbasico*0.10);

        //Salidas
        System.out.println("El sueldo basico es: " + Sbasico);
        System.out.println("El sueldo Bruto es: " + Sbruto);
        System.out.println("El sueldo Neto es: " + Sneto);

        sc.close();       
    }
}