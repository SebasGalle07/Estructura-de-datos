package coleccionesElizabeth;

import java.util.*;

public class punto5 {
    public static void main(String[] args) {
        // HashMap - No mantiene orden
        Map<Integer, String> hashMapProductos = new HashMap<>();
        hashMapProductos.put(3, "Monitor");
        hashMapProductos.put(1, "Teclado");
        hashMapProductos.put(2, "Ratón");
        hashMapProductos.put(5, "Impresora");

        // LinkedHashMap - Mantiene el orden de inserción
        Map<Integer, String> linkedHashMapProductos = new LinkedHashMap<>();
        linkedHashMapProductos.put(3, "Monitor");
        linkedHashMapProductos.put(1, "Teclado");
        linkedHashMapProductos.put(2, "Ratón");
        linkedHashMapProductos.put(5, "Impresora");

        // TreeMap - Ordenado por clave
        Map<Integer, String> treeMapProductos = new TreeMap<>();
        treeMapProductos.put(3, "Monitor");
        treeMapProductos.put(1, "Teclado");
        treeMapProductos.put(2, "Ratón");
        treeMapProductos.put(5, "Impresora");

        // Imprimir los mapas
        System.out.println("🔹 HashMap (Sin orden): " + hashMapProductos);
        System.out.println("🔹 LinkedHashMap (Orden de inserción): " + linkedHashMapProductos);
        System.out.println("🔹 TreeMap (Ordenado por clave): " + treeMapProductos);
    }
}
