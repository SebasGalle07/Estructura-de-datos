package ListaDoblementeEnlazada;

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

    // Agregar al final
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

    // Mostrar lista desde la cabeza
    public void mostrarDesdeCabeza() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Eliminar desde la cabeza
    public boolean eliminarDesdeCabeza(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) cabeza.anterior = null;
                    else cola = null;
                } else if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Eliminar desde la cola
    public boolean eliminarDesdeCola(int valor) {
        Nodo actual = cola;
        while (actual != null) {
            if (actual.dato == valor) {
                if (actual == cola) {
                    cola = actual.anterior;
                    if (cola != null) cola.siguiente = null;
                    else cabeza = null;
                } else if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    cabeza.anterior = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return true;
            }
            actual = actual.anterior;
        }
        return false;
    }

    // Método principal para probar
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);

        System.out.println("Lista original:");
        lista.mostrarDesdeCabeza();

        System.out.println("\nEliminando 30 desde la cabeza:");
        lista.eliminarDesdeCabeza(30);
        lista.mostrarDesdeCabeza();

        System.out.println("\nEliminando 40 desde la cola:");
        lista.eliminarDesdeCola(40);
        lista.mostrarDesdeCabeza();
    }
}
