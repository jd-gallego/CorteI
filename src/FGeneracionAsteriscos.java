import java.util.Scanner;

public class FGeneracionAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println(); // salto de linea

        }

    }
}
