package puntos;

public class tres {
<<<<<<< HEAD
    public static int contarVeces(int [] arreglo, int n, int objetivo, int primero){
        if(primero >= n){
            return 0;
        }
        int suma = 0;
        if (arreglo[primero] == objetivo){
            suma = 1;
        }
        return suma + contarVeces(arreglo,n,objetivo, primero + 1);

    }

    public static void main(String[] args) {
        int  [] arreglo = {1,4,3,8,9,3};
        int objetivo = 3;
        int n = arreglo.length;
        int resultado = contarVeces(arreglo,n,objetivo,0);
        System.out.println("el número "+objetivo+" aparece "+resultado+ " veces en el arreglo");
    }

}
=======
    public static int countOccurrences(int[] vector, int target, int index) {
        // Caso base: si hemos recorrido el vector, retornar 0
        if (index >= vector.length) {
            return 0;
        }

        // Contamos 1 si el elemento actual es igual al objetivo, sino contamos 0
        int count = (vector[index] == target) ? 1 : 0;

        // Llamada recursiva al siguiente índice
        return count + countOccurrences(vector, target, index + 1);
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 2, 2, 5, 2};
        int target = 2;
        int occurrences = countOccurrences(vector, target, 0);

        System.out.println("El número " + target + " aparece " + occurrences + " veces en el vector.");
}
}
>>>>>>> 6cc364e87b81d54a02c91e00151df879cbdc1d71
