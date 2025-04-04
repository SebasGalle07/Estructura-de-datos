package ejerciciosGenerics;

import java.util.List;

class CalculadoraSigno {
    public static double sumarLista(List<? extends Number> lista) {
        double suma = 0;
        for (Number num : lista) {
            suma += num.doubleValue();

        }
            return suma;
        }
    // TODO: Implementar método genérico con ? extends Number
}

public class Calculadora {
    public static void main(String[] args) {
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5);
        List<Double> listaDecimales = List.of(2.5, 3.5, 1.0);

        System.out.println("Suma enteros: " + CalculadoraSigno.sumarLista(listaEnteros));
        System.out.println("Suma decimales: " + CalculadoraSigno.sumarLista(listaDecimales));
    }
}

