import java.util.Scanner;

public class JCalculoDigRepNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Debes ingresar un número entero positivo.");
            return;
        }

        System.out.print("Ingrese el dígito (0-9): ");
        int digito = scanner.nextInt();

        if (digito < 0 || digito > 9) {
            System.out.println("Debes ingresar un dígito válido (0-9).");
            return;
        }

        int contador = contarDigitos(numero, digito);

        System.out.println("El dígito " + digito + " aparece " + contador + " veces en el número " + numero + ".");

        scanner.close();
    }

    public static int contarDigitos(int numero, int digito) {
        int contador = 0;
        while (numero > 0) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito == digito) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }
}

// Este ejercicio si me dio duro, toco ver videos
