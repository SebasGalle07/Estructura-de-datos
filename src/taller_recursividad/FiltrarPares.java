package taller_recursividad;

import java.util.ArrayList;
import java.util.List;

public class FiltrarPares {

    public static List<Integer> filtrarPares(List<Integer> lista) {
        return filtrarParesRecursivo(lista, 0, new ArrayList<>());
    }

    private static List<Integer> filtrarParesRecursivo(List<Integer> lista, int index, List<Integer> resultado) {
        if (index == lista.size()) {
            return resultado; // Caso base: cuando se recorrió toda la lista
        }

        if (lista.get(index) % 2 == 0) { // Si el número es par, se agrega a la nueva lista
            resultado.add(lista.get(index));
        }

        return filtrarParesRecursivo(lista, index + 1, resultado); // Llamado recursivo con el siguiente índice
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> pares = filtrarPares(numeros);

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista de pares: " + pares);
    }
}
