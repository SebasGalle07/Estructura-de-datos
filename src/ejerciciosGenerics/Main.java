
package ejerciciosGenerics;

class Utilidades {
    public static  <T> void imprimirElemento(T elemento) {
        System.out.println("Elemeto: " + elemento);
    }
}

    public class Main {
            public static void main(String[] args) {
                Utilidades.imprimirElemento("Hola Mundo!");
                Utilidades.imprimirElemento(456);
                Utilidades.imprimirElemento(3.14);
            }
        }

