import java.util.Scanner;

public class DCalculoIntCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad inicial invertida: ");
        double inicial = scanner.nextDouble();

        System.out.print("Ingrese el numero de la tasa de interés anual: ");
        double interes = scanner.nextDouble() / 100;

        System.out.print("Ingrese el número de años: ");
        int year = scanner.nextInt();

        double montoFinal = inicial * Math.pow(1 + interes, year);

        System.out.println("El monto final después de "+year+" años es: "+montoFinal);

    }
}
