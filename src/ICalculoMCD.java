import java.util.Scanner;

public class ICalculoMCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero positivo: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero positivo: ");
        int numero2 = scanner.nextInt();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Ambos números deben ser positivos.");
            return;
        }

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);

    }
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Toco ver videos tambien
