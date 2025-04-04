package ejerciciosGenerics;

// TODO: Restringir el tipo de dato para que solo acepte números
class CajaNumerica <T extends Number> {
    private T valor;

    public CajaNumerica(T valor) {
        this.valor = valor;
    }

    public double getDobleValor() {
        return  valor.doubleValue()* 2;
        // TODO: Implementar lógica para devolver el doble del valor
    }
}

public class Numerica {
    public static void main(String[] args) {
        CajaNumerica<Integer> cajaEntero = new CajaNumerica<>(10);
        System.out.println("Doble: " + cajaEntero.getDobleValor());

        CajaNumerica<Double> cajaDecimal = new CajaNumerica<>(5.5);
        System.out.println("Doble: " + cajaDecimal.getDobleValor());
    }
}

