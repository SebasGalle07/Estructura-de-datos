public class ListaEnlazada {
    // Clase Nodo
    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // Referencia al primer nodo
    private Nodo cabeza;

    // Agregar elemento al final de la lista
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Invertir la lista sin estructuras auxiliares
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        while (actual != null) {
            siguiente = actual.siguiente;  // Guardar el siguiente nodo
            actual.siguiente = anterior;   // Invertir el enlace
            anterior = actual;             // Mover "anterior" hacia adelante
            actual = siguiente;            // Mover "actual" hacia adelante
        }

        cabeza = anterior; // Actualizar cabeza al nuevo inicio
    }

    // Mostrar la lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método principal para probar
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        System.out.println("Lista original:");
        lista.mostrar();

        lista.invertir();

        System.out.println("Lista invertida:");
        lista.mostrar();
    }
}
