package coleccionesSebastian;

import java.util.LinkedHashMap;
import java.util.Map;

class Supermercado {
    private LinkedHashMap<String, Double> carritoCompras;

    public Supermercado() {
        this.carritoCompras = new LinkedHashMap<>();
    }

    // Agregar un producto al carrito
    public void agregarProducto(String producto, double precio) {
        carritoCompras.put(producto, precio);
        System.out.println("🛒 Producto agregado: " + producto + " -> $" + precio);
    }

    // Calcular el total de la compra
    public double calcularTotal() {
        double total = 0.0;
        for (double precio : carritoCompras.values()) {
            total += precio;
        }
        return total;
    }

    // Mostrar la lista de productos comprados en orden de escaneo
    public void mostrarFactura() {
        if (carritoCompras.isEmpty()) {
            System.out.println("📭 El carrito está vacío.");
        } else {
            System.out.println("🧾 Factura de compra:");
            for (Map.Entry<String, Double> entrada : carritoCompras.entrySet()) {
                System.out.println("- " + entrada.getKey() + " -> $" + entrada.getValue());
            }
            System.out.println("💰 Total: $" + calcularTotal());
        }
    }
}

public class punto_16 {
    public static void main(String[] args) {
        Supermercado compra = new Supermercado();

        // Agregar productos al carrito en orden de escaneo
        compra.agregarProducto("Leche", 1.50);
        compra.agregarProducto("Pan", 2.00);
        compra.agregarProducto("Huevos", 3.75);
        compra.agregarProducto("Manzanas", 4.20);

        // Mostrar la factura con los productos en orden y el total de la compra
        compra.mostrarFactura();
    }
}

