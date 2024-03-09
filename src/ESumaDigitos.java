import java.util.Scanner;

public class ESumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if(numero < 0) {
            System.out.println("Debes ingresar un número entero positivo.");
            return;
        }

        int sumaDigitos = 0;
        int numeroActual = numero;

        while(numeroActual > 0) {

            int digito = numeroActual % 10;

            sumaDigitos += digito;

            numeroActual /= 10;
        }

        System.out.println("La suma de los dígitos del número "+numero+" es: "+sumaDigitos);

    }
}