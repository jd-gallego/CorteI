public class KSumaElementos {
    public static void main(String[] args) {
        int[] vector = {10, 20, 30, 40, 50};

        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de todos los elementos del vector es: "+suma);
    }
}