package recursividad;

import java.util.Scanner;

public class Potencia {
    public static double CalcularPotencia(int numero, int potencia){

        if (potencia == 0){
            return 1;
        }
        if (potencia < 0) { // Manejo de exponentes negativos
            return 1 / CalcularPotencia(numero, -potencia);
        }
        double mitad = CalcularPotencia(numero, potencia / 2); // Divide y vencerás

        if (potencia % 2 == 0) { // Si es par
            return mitad * mitad;
        } else { // Si es impar
            return numero * mitad * mitad;
        }
        //return numero * CalcularPotencia(numero,potencia-1 );

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base positiva o negativa: ");

        int numero = scanner.nextInt();
        System.out.print("Ingrese la potencia positiva o negativa: ");
        int potencia = scanner.nextInt();

            double resultado = CalcularPotencia(numero, potencia);
            System.out.println("la potencia de "+ numero+ " a la "+potencia+ " es: "+resultado);

        scanner.close();
    }
}
