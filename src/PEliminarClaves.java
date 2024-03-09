import java.util.*;

public class PEliminarClaves {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);
        hashMap.put(4, 40);
        hashMap.put(5, 50);

        System.out.println("HashMap antes de eliminar claves:");
        System.out.println(hashMap);

        int numeroMinimo = 25;

        System.out.println("\nNumero minimo: "+numeroMinimo);

        // Eliminar las claves con valores menores que el número mínimo
        eliminarClavesMenoresQue(hashMap, numeroMinimo);

        // Mostrar el HashMap después de eliminar las claves
        System.out.println("\nHashMap después de eliminar claves:");
        System.out.println(hashMap);
    }

    public static void eliminarClavesMenoresQue(HashMap<Integer, Integer> hashMap, int numero) {
        // Obtener un conjunto de claves
        Set<Integer> keys = hashMap.keySet();
        // Crear un iterador sobre el conjunto de claves
        Iterator<Integer> iterator = keys.iterator();
        // Iterar sobre las claves y eliminar las que tienen un valor menor que el número dado
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (hashMap.get(key) < numero) {
                iterator.remove();
            }
        }
    }
}

// Este ejercicio lo copie igual que el video explicativo de youtube, coloque en comentario para que sirve cada cosa que medio entendi