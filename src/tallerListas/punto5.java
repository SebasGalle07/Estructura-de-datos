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

    // Crear ciclo manualmente (para pruebas)
    public void crearCiclo() {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        Nodo ultimo = null;
        Nodo tercero = null;
        int contador = 0;

        while (actual.siguiente != null) {
            if (contador == 2) {
                tercero = actual;
            }
            actual = actual.siguiente;
            contador++;
        }

        ultimo = actual;
        if (tercero != null) {
            ultimo.siguiente = tercero;  // ciclo hacia el tercer nodo
        }
    }

    // Método para detectar ciclo usando algoritmo de Floyd
    public boolean tieneCiclo() {
        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        while (rapido != null && rapido.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;

            if (lento == rapido) {
                return true;  // Ciclo detectado
            }
        }

        return false;  // No hay ciclo
    }

    // Método principal para probar
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        System.out.println("¿Tiene ciclo? " + lista.tieneCiclo());

        lista.crearCiclo(); // Crear un ciclo artificialmente

        System.out.println("¿Tiene ciclo después de crearlo? " + lista.tieneCiclo());
    }
}
