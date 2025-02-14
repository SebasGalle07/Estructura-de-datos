package puntos;

public class diez {
        public static int sumarDiagonal(int[][] matriz, int indice) {
            // Caso base: si el índice es menor a 0, terminamos la recursión
            if (indice < 0) {
                return 0;
            }
            // Sumar el elemento de la diagonal y llamar recursivamente con el siguiente índice
            return matriz[indice][indice] + sumarDiagonal(matriz, indice - 1);
        }

        public static void main(String[] args) {
            int[][] numeros = {
                    {3, 1, 9},
                    {7, 5, 6},
                    {10, 2, 8}
            };
            int suma = sumarDiagonal(numeros, numeros.length - 1);
            System.out.println("La suma de la diagonal principal es: " + suma);
        }
    }

