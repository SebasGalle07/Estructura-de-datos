package puntos;

public class ocho {
        public static int sumarElementos(int[] arr, int n) {
            // Caso base: si el vector está vacío
            if (n == 0) {
                return 0;
            }
            // Llamada recursiva sumando el último elemento
            return arr[n - 1] + sumarElementos(arr, n - 1);
        }

        public static void main(String[] args) {
            int[] numeros = {3, 1, 9};
            int suma = sumarElementos(numeros, numeros.length);
            System.out.println("La suma de los elementos es: " + suma);
        }
    }


