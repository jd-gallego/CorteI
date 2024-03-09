public class LProductoElementosPares {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6};

        int producto = 1;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                producto *= vector[i];
            }
        }

        System.out.println("El producto de todos los números pares en el vector es: "+producto);
    }
}
