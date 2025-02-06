package recursividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutacionesBacktracking {
    public static void generarPermutaciones(int[] nums, List<Integer> actual, boolean[] usado, List<List<Integer>> resultado) {
        if (actual.size() == nums.length) {
            resultado.add(new ArrayList<>(actual));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!usado[i]) {
                usado[i] = true;
                actual.add(nums[i]);
                generarPermutaciones(nums, actual, usado, resultado);
                actual.remove(actual.size() - 1);
                usado[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números en el conjunto: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Ingrese los números sin repetición:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        List<List<Integer>> resultado = new ArrayList<>();
        generarPermutaciones(nums, new ArrayList<>(), new boolean[n], resultado);

        System.out.println("Permutaciones generadas:");
        for (List<Integer> permutacion : resultado) {
            System.out.println(permutacion);
        }

        scanner.close();
    }
}
