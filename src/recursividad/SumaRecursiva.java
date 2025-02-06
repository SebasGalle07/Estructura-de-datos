package recursividad;
import java.util.Scanner;

public class SumaRecursiva {
    // Función recursiva para calcular la suma de los primeros n números naturales
    public static int sumaNaturales(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaNaturales(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Por favor, ingrese un número natural mayor o igual a 1.");
        } else {
            int resultado = sumaNaturales(n);
            System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
        }

        scanner.close();
    }
}
