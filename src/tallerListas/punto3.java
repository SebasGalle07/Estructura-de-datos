package tallerListas;

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

        // Eliminar duplicados sin estructuras auxiliares
        public void eliminarDuplicados() {
            Nodo actual = cabeza;

            while (actual != null) {
                Nodo runner = actual;
                while (runner.siguiente != null) {
                    if (runner.siguiente.dato == actual.dato) {
                        // Saltar el nodo duplicado
                        runner.siguiente = runner.siguiente.siguiente;
                    } else {
                        runner = runner.siguiente;
                    }
                }
                actual = actual.siguiente;
            }
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

        // Probar
        public static void main(String[] args) {
            ListaEnlazada lista = new ListaEnlazada();

            lista.agregar(10);
            lista.agregar(20);
            lista.agregar(10);
            lista.agregar(30);
            lista.agregar(20);
            lista.agregar(40);

            System.out.println("Lista original:");
            lista.mostrar();

            lista.eliminarDuplicados();

            System.out.println("Lista sin duplicados:");
            lista.mostrar();
        }
    }
    
