package recursividad;

import java.util.Scanner;

public class Enteros {
    public static int SumaDigitos (int n){
        if (n<10){
            return n;
        }
         return (n%10)+ SumaDigitos(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Por favor, ingrese un número natural mayor o igual a 0.");
        } else {
            int resultado = SumaDigitos(n);
            System.out.println("la suma de los dígitos "+ n + " es: "+ SumaDigitos(n));
        }

        scanner.close();
    }
}

