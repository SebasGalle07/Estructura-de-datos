package clases;

import java.util.Scanner;

public class matrushka {

    public static int contarMunecas(int n) {
        //int cont = 0;
        if (n == 0) {
            return n;

        }
        System.out.println("esta es la muñeca abierta : " + n);
        contarMunecas(n - 1);
        System.out.println("esta es la muñeca cerrada: " + n);
        return n;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Por favor, ingrese un número natural mayor o igual a 1.");
        } else {
            int resultado = contarMunecas(n);
            System.out.println(" " + n + " números naturales es: " + resultado);
        }

        scanner.close();
    }
}

