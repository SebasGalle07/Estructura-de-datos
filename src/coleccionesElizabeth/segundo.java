package coleccionesElizabeth;
import java.util.Stack;

public class segundo {

    static class PilaTipos {
        private Stack<Object> pila;

        public PilaTipos() {
            this.pila = new Stack<>();
        }

        // Método para insertar un elemento si el tipo coincide con el de la cima
        public boolean push(Object elemento) {
            if (pila.isEmpty() || pila.peek().getClass().equals(elemento.getClass())) {
                pila.push(elemento);
                System.out.println("Elemento insertado: " + elemento);
                return true;
            } else {
                System.out.println("Error: No se puede insertar " + elemento + " de tipo " +
                        elemento.getClass().getSimpleName() +
                        " porque la pila contiene elementos de tipo " +
                        pila.peek().getClass().getSimpleName());
                return false;
            }
        }

        // Método para sacar un elemento de la pila
        public Object pop() {
            if (!pila.isEmpty()) {
                return pila.pop();
            }
            System.out.println("Error: La pila está vacía.");
            return null;
        }

        // Método para obtener el elemento en la cima de la pila
        public Object peek() {
            if (!pila.isEmpty()) {
                return pila.peek();
            }
            System.out.println("Error: La pila está vacía.");
            return null;
        }

        // Método para verificar si la pila está vacía
        public boolean isEmpty() {
            return pila.isEmpty();
        }

        // Método para mostrar los elementos de la pila
        public void mostrarPila() {
            System.out.println("Estado actual de la pila: " + pila);
        }


        // Clase principal para probar la funcionalidad

        public static void main(String[] args) {


            PilaTipos pila = new PilaTipos();

            // Insertar elementos de diferentes tipos
            pila.push(10); // Inserta un entero
            pila.push(20); // Inserta otro entero

            pila.mostrarPila();

            pila.push("Hola"); // Error: no coincide con el tipo actual (Integer)

            pila.pop(); // Quita el 20
            pila.pop(); // Quita el 10
            pila.mostrarPila();

            pila.push("Hola"); // Inserta una cadena
            pila.push("Mundo"); // Inserta otra cadena
            pila.mostrarPila();

            pila.push(3.14); // Error: la pila tiene Strings, no Doubles
        }
    }
}




