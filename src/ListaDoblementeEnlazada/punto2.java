package ListaDoblementeEnlazada;

public class ListaDobleOrdenada {
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

    // Método para insertar en orden ascendente
    public void insertarOrdenado(int dato) {
        Nodo nuevo = new Nodo(dato);

        // Caso 1: lista vacía
        if (cabeza == null) {
            cabeza = cola = nuevo;
        }
        // Caso 2: insertar al inicio
        else if (dato < cabeza.dato) {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
        // Caso 3: insertar al final
        else if (dato >= cola.dato) {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        // Caso 4: insertar en el medio
        else {
            Nodo actual = cabeza;
            while (actual != null && actual.dato < dato) {
                actual = actual.siguiente;
            }

            Nodo anterior = actual.anterior;
            anterior.siguiente = nuevo;
            nuevo.anterior = anterior;
            nuevo.siguiente = actual;
            actual.anterior = nuevo;
        }
    }

    // Mostrar lista desde la cabeza
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método principal para probar
    public static void main(String[] args) {
        ListaDobleOrdenada lista = new ListaDobleOrdenada();

        int[] elementos = {30, 10, 50, 20, 40};
        for (int e : elementos) {
            lista.insertarOrdenado(e);
        }

        System.out.println("Lista ordenada:");
        lista.mostrar();
    }
}
