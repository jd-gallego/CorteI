public class MMaximoDelVector {
    public static void main(String[] args) {
        int[] vector = {10, 20, 5, 30, 15};

        int maximo = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }

        System.out.println("El elemento máximo en el vector es: " + maximo);

    }
}
