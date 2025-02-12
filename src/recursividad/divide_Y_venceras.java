package recursividad;

public class divide_Y_venceras {
        // Método de búsqueda binaria recursiva
        public static int busquedaBinaria(int[] arreglo, int izquierda, int derecha, int objetivo) {
            if (izquierda > derecha) {
                return -1; // No encontrado
            }

            int medio = izquierda + (derecha - izquierda) / 2; // Evita desbordamiento

            // Mostrar la pila de llamadas
            System.out.println("Llamada: busquedaBinaria(" + izquierda + ", " + derecha + ")");
            System.out.println("  Medio: " + medio + " (Valor: " + arreglo[medio] + ")");

            // Caso base: el elemento está en la posición media
            if (arreglo[medio] == objetivo) {
                System.out.println("  Elemento encontrado en la posición " + medio);
                return medio;
            }

            // Si el objetivo es menor, buscar en la mitad izquierda
            if (objetivo < arreglo[medio]) {
                return busquedaBinaria(arreglo, izquierda, medio - 1, objetivo);
            }
            // Si el objetivo es mayor, buscar en la mitad derecha
            else {
                return busquedaBinaria(arreglo, medio + 1, derecha, objetivo);
            }
        }

        public static void main(String[] args) {
            int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15}; // Arreglo ordenado
            int objetivo = 2; // Elemento a buscar

            int resultado = busquedaBinaria(arreglo, 0, arreglo.length - 1, objetivo);

            if (resultado != -1) {
                System.out.println("\nResultado: Elemento encontrado en la posición " + resultado);
            } else {
                System.out.println("\nResultado: Elemento no encontrado en el arreglo.");
            }
        }
    }


