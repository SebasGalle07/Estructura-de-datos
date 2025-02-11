package recursividad;

import java.util.Scanner;

public class Fibonacci {
    public static int serieFibonacci(int n){
        if(n<=0) {
            return 0;

        }
        if (n==1){
            return 1;
        }
        return serieFibonacci(n-1) + serieFibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un término: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Por favor, ingrese un número natural mayor o igual a 0.");
        } else {
            int resultado = serieFibonacci(n);
            System.out.println("el término: "+ n + " de Fibonacci es: "+ serieFibonacci(n));
        }

        scanner.close();
    }

}
