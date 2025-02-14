package puntos;
import java.util.Scanner;

public class seis {
    // Metodo recursivo para calcular combinaciones C(n, k)
    public static int combinations(int n, int k) {
        // Casos base
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }

        // Caso recursivo: C(n, k) = C(n-1, k) + C(n-1, k-1)
        return combinations(n - 1, k) + combinations(n - 1, k - 1);
    }

    // Metodo para solicitar la entrada del usuario de manera segura
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            try {
                System.out.print(message);
                value = Integer.parseInt(scanner.nextLine());
                if (value < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido no negativo.");
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println("Cálculo de combinaciones C(n, k)");
        int n = getInput("Ingrese el valor de n: ");
        int k = getInput("Ingrese el valor de k: ");

        int result = combinations(n, k);
        System.out.println("El número de combinaciones C(" + n + ", " + k + ") es: " + result);
}
}