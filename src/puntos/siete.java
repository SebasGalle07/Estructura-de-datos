package puntos;

public class siete {

    public static int encontrarMayor(int[] arr, int inicio, int fin) {
        // Caso base: si hay un solo elemento
        if (inicio == fin) {
            return arr[inicio];
        }

        // Dividir el array en dos mitades
        int medio = (inicio + fin) / 2;
        int maxIzquierda = encontrarMayor(arr, inicio, medio);
        int maxDerecha = encontrarMayor(arr, medio + 1, fin);

        // Retornar el mayor de ambas mitades
        return Math.max(maxIzquierda, maxDerecha);
    }

    public static void main(String[] args) {
        int[] numeros = {3, 1, 9, 7, 5, 36, 10, 2, 8};
        int mayor = encontrarMayor(numeros, 0, numeros.length - 1);
        System.out.println("El número mayor es: " + mayor);
    }
}
