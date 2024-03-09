import java.util.Random;
import java.util.Scanner;

public class HGeneracionNumAleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;

        int suma = num1 + num2;

        System.out.println("Ingrese la suma de los siguientes números:");
        System.out.println(num1+" + "+num2);
        System.out.print("El resultado es: ");
        int respuestaUsuario = scanner.nextInt();

        if (respuestaUsuario == suma) {
            System.out.println("Respuesta correcta");
        } else {
            System.out.println("Respuesta incorrecta. La respuesta correcta es: "+suma);
        }

    }
}
