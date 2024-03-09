import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NEliminarDuplicados {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(7);
        lista.add(36);
        lista.add(6);
        lista.add(7);
        lista.add(1);

        System.out.println("Lista original: "+lista);

        Set<Integer> conjunto = new HashSet<>(lista);
        lista.clear();
        lista.addAll(conjunto);

        System.out.println("Lista sin duplicados: "+lista);

    }
}

// Este tambien me toco ver videos