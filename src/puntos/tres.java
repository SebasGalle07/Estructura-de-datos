package puntos;

public class tres {
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