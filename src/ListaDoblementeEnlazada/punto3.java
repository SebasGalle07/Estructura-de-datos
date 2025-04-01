public class ListaDobleEnlazada {
    static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo anterior;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    private Nodo cabeza;
    private Nodo cola;

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public int longitud() {
        int count = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    public void rotar(int n, boolean derecha) {
        int len = longitud();
        if (len == 0 || n % len == 0) return;

        n = n % len;
        if (!derecha) {
            n = len - n; // rotar izquierda equivale a rotar derecha len - n
        }

        Nodo nuevoCola = cabeza;
        for (int i = 0; i < len - n - 1; i++) {
            nuevoCola = nuevoCola.siguiente;
        }

        Nodo nuevaCabeza = nuevoCola.siguiente;

        // Separar en dos partes
        nuevoCola.siguiente = null;
        nuevaCabeza.anterior = null;

        // Unir antiguo final con antiguo inicio
        cola.siguiente = cabeza;
        cabeza.anterior = cola;

        // Actualizar referencias
        cabeza = nuevaCabeza;
        cola = nuevoCola;
    }

    // Prueba
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        for (int i = 1; i <= 6; i++) {
            lista.agregar(i);
        }

        System.out.println("Lista original:");
        lista.mostrar();

        lista.rotar(2, true); // rotar 2 a la derecha
        System.out.println("Después de rotar 2 posiciones a la derecha:");
        lista.mostrar();

        lista.rotar(3, false); // rotar 3 a la izquierda
        System.out.println("Después de rotar 3 posiciones a la izquierda:");
        lista.mostrar();
    }
}
