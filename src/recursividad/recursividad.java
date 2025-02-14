package recursividad;

public class recursividad {

    public static int sumaRecursiva(int[] arr, int inicio, int fin) {

        if (inicio == fin) {
            return arr[inicio];
        }

        // Dividir el arreglo en dos mitades
        int medio = (inicio + fin) / 2;

        // Resolver recursivamente cada mitad
        int sumaIzquierda = sumaRecursiva(arr, inicio, medio);
        int sumaDerecha = sumaRecursiva(arr, medio + 1, fin);

        // Combinar los resultados
        return sumaIzquierda + sumaDerecha;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};

        // Llamar al metodo recursivo pasando el rango completo del arreglo
        int resultado = sumaRecursiva(numeros, 0, numeros.length - 1);


        System.out.println("La suma del arreglo es: " + resultado);
    }
}