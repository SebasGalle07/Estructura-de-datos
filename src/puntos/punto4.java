package puntos;

import java.util.*;

public class punto4 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Lista original: " + lista);

        invertirLista(lista, 0, lista.size() - 1);

        System.out.println("Lista invertida: " + lista);
    }

    public static void invertirLista(List<Integer> lista, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        // Intercambiar los elementos en las posiciones inicio y fin
        int temp = lista.get(inicio);
        lista.set(inicio, lista.get(fin));
        lista.set(fin, temp);

        // Llamada recursiva con los siguientes índices
        invertirLista(lista, inicio + 1, fin - 1);
    }
}
