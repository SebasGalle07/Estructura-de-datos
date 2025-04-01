package coleccionesElizabeth;

import java.util.*;

class Producto {
    private int codigo;
    private String nombre;
    private double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Código=" + codigo +
                ", Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                '}';
    }
}

class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Agregar un nuevo producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Eliminar un producto por código
    public void eliminarProducto(int codigo) {
        productos.removeIf(producto -> producto.getCodigo() == codigo);
    }

    // Buscar un producto por código
    public Producto buscarProducto(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    // Listar los productos en orden alfabético por nombre
    public void listarPorNombre() {
        productos.sort(Comparator.comparing(Producto::getNombre));
        System.out.println("📌 Inventario ordenado por nombre:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    // Listar los productos por precio (de menor a mayor)
    public void listarPorPrecio() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio));
        System.out.println("📌 Inventario ordenado por precio:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

public class punto_6 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos
        inventario.agregarProducto(new Producto(101, "Laptop", 1200.99));
        inventario.agregarProducto(new Producto(102, "Ratón", 25.50));
        inventario.agregarProducto(new Producto(103, "Teclado", 45.75));
        inventario.agregarProducto(new Producto(104, "Monitor", 300.99));

        // Listar productos por nombre
        inventario.listarPorNombre();

        // Listar productos por precio
        inventario.listarPorPrecio();

        // Buscar un producto
        int codigoBuscado = 103;
        Producto encontrado = inventario.buscarProducto(codigoBuscado);
        if (encontrado != null) {
            System.out.println("✅ Producto encontrado: " + encontrado);
        } else {
            System.out.println("❌ Producto con código " + codigoBuscado + " no encontrado.");
        }

        // Eliminar un producto
        inventario.eliminarProducto(102);
        System.out.println("❌ Producto con código 102 eliminado.");

        // Mostrar inventario después de la eliminación
        inventario.listarPorNombre();
    }
}
