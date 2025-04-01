package tallerListas;

public class ListaEnlazada {
    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;

    // Agregar al final
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

    // Mostrar lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Dividir la lista en pares e impares
    public ListaEnlazada[] dividirLista() {
        ListaEnlazada pares = new ListaEnlazada();
        ListaEnlazada impares = new ListaEnlazada();

        Nodo actual = cabeza;
        int posicion = 0;

        while (actual != null) {
            if (posicion % 2 == 0) {
                pares.agregar(actual.dato);
            } else {
                impares.agregar(actual.dato);
            }
            actual = actual.siguiente;
            posicion++;
        }

        return new ListaEnlazada[]{pares, impares};
    }

    // Método principal para probar
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(6);

        System.out.println("Lista original:");
        lista.mostrar();

        ListaEnlazada[] resultado = lista.dividirLista();

        System.out.println("Lista posiciones pares:");
        resultado[0].mostrar();

        System.out.println("Lista posiciones impares:");
        resultado[1].mostrar();
    }
}
