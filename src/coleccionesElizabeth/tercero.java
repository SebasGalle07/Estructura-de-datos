package colecciones;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class tercero {


    static class ListaSinDuplicados {
        public static void main(String[] args) {
            // Crear un Set (Lista sin duplicados)
            Set<String> elementos = new LinkedHashSet<>();

            // Agregar elementos a la lista
            elementos.add("Manzana");
            elementos.add("Pera");
            elementos.add("Banana");
            elementos.add("Mango");
            elementos.add("Manzana"); // No se agregará porque es duplicado

            // Imprimir la lista usando un iterador
            System.out.println("Elementos en la lista sin duplicados:");
            Iterator<String> iterador = elementos.iterator();
            while (iterador.hasNext()) {
                System.out.println(iterador.next());
            }
        }
    }

}
