import java.util.Random;
import java.util.Scanner;

public class BJuegoPPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");

        System.out.print("Elige tu opción (piedra, papel o tijera): ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        int indiceComputadora = random.nextInt(3);
        String eleccionComputadora = opciones[indiceComputadora];

        System.out.println("La computadora elige: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡La computadora gana!");
        }

        System.out.println("Gracias por jugar");

    }

}