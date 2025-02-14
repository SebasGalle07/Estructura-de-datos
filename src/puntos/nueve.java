package puntos;

public class nueve {
        public static int sumarMatriz(int[][] matriz, int fila, int col) {
            // Caso base: si la matriz está vacía
            if (fila < 0) {
                return 0;
            }
            if (col < 0) {
                return sumarMatriz(matriz, fila - 1, matriz[0].length - 1);
            }
            // Llamada recursiva sumando el elemento actual
            return matriz[fila][col] + sumarMatriz(matriz, fila, col - 1);
        }

        public static void main(String[] args) {
            int[][] numeros = {
                    {3, 1, 9},
                    {7, 5, 6},
                    {10, 2, 8}
            };
            int suma = sumarMatriz(numeros, numeros.length - 1, numeros[0].length - 1);
            System.out.println("La suma de los elementos de la matriz es: " + suma);
        }
    }


