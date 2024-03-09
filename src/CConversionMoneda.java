import java.util.Scanner;

public class CConversionMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo;
        int res;
        String moneda1;
        String moneda2;

        System.out.println("Este es un programa para convertir de Pesos Colombianos a dolares o viceversa");

        System.out.println("Escriba el numero asignado a la conversion que quieres hacer:");
        System.out.println("1. Pesos Colombianos a Dolares");
        System.out.println("2. Dolares a Pesos colombianos");
        int conversion = scanner.nextInt();

        System.out.println("El dia de hoy 4 de marzo el dolar esta en 3,945 pesos colombianos");

        if (conversion == 1){

            System.out.print("Ingrese el saldo:");
            saldo = scanner.nextInt();

            res = saldo / 3945;

            moneda1 = "Pesos Colombianos";
            moneda2 = "Dolares";

        } else {

            System.out.print("Ingrese el saldo:");
            saldo = scanner.nextInt();

            res = saldo * 3945;

            moneda1 = "Dolares";
            moneda2 = "Pesos Colombianos";

        }

        System.out.println(saldo+" "+moneda1+" son:"+res+" "+moneda2);

    }
}
