package colecciones;
import java.util.PriorityQueue;

public class cuarto {


    // Clase Tarea que implementa Comparable para definir prioridad
     static class Tarea implements Comparable<Tarea> {
        private String nombre;
        private int prioridad; // Número menor = Mayor prioridad

        public Tarea(String nombre, int prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        public int getPrioridad() {
            return prioridad;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public int compareTo(Tarea otra) {
            return Integer.compare(this.prioridad, otra.prioridad); // Orden ascendente (menor número = mayor prioridad)
        }

        @Override
        public String toString() {
            return "Tarea{Nombre='" + nombre + "', Prioridad=" + prioridad + "}";
        }
    }

    // Clase principal que usa una PriorityQueue
    static class ColaDePrioridad {
        public static void main(String[] args) {
            // Crear la cola de prioridad
            PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

            // Agregar tareas con diferentes prioridades
            colaTareas.add(new Tarea("Completar reporte", 2));
            colaTareas.add(new Tarea("Responder correos", 4));
            colaTareas.add(new Tarea("Atender reunión urgente", 1)); // Mayor prioridad
            colaTareas.add(new Tarea("Revisar código", 3));

            // Mostrar y procesar tareas en orden de prioridad
            System.out.println("Procesando tareas en orden de prioridad:");
            while (!colaTareas.isEmpty()) {
                System.out.println("Ejecutando: " + colaTareas.poll()); // Extrae y muestra la tarea con mayor prioridad
            }
        }
    }

}
