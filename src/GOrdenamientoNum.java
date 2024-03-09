import java.util.Scanner;

public class GOrdenamientoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números enteros:");

        System.out.print("Número 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Número 3: ");
        int num3 = scanner.nextInt();

        int mayor, intermedio, menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                intermedio = num2;
                menor = num3;
            } else {
                intermedio = num3;
                menor = num2;
            }

        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                intermedio = num1;
                menor = num3;
            } else {
                intermedio = num3;
                menor = num1;
            }

        } else {
            mayor = num3;
            if (num1 >= num2) {
                intermedio = num1;
                menor = num2;
            } else {
                intermedio = num2;
                menor = num1;
            }
        }

        System.out.println("Los números en orden ascendente son:");
        System.out.println(menor);
        System.out.println(intermedio);
        System.out.println(mayor);

    }
}

// Viendo videos lo resolvi
