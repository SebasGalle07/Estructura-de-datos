package coleccionesSebastian;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class punto_3 {
    public static void main(String[] args) {
        // Crear un HashSet (lista sin duplicados)
        Set<String> elementos = new HashSet<>();

        // Agregar elementos a la lista
        elementos.add("Manzana");
        elementos.add("Pera");
        elementos.add("Uva");
        elementos.add("Naranja");
        elementos.add("Manzana"); // Intento de duplicado (no se agregará)

        // Imprimir contenido usando un iterador
        System.out.println("📜 Contenido de la lista sin duplicados:");
        Iterator<String> iterador = elementos.iterator();
        while (iterador.hasNext()) {
            System.out.println("- " + iterador.next());
        }
    }
}

