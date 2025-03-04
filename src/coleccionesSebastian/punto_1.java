package coleccionesSebastian;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

// Clase Producto
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

// Clase Empresa que usa TreeSet
class Empresa {
    private Set<Producto> productos;

    public Empresa() {
        // Se usa un Comparator para ordenar por código
        this.productos = new TreeSet<>(Comparator.comparingInt(Producto::getCodigo));
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null; // Retorna null si no se encuentra el producto
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}

// Clase Main para probar el código
public class punto_1 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarProducto(new Producto(101, "Laptop", 1200.99));
        empresa.agregarProducto(new Producto(202, "Teléfono", 699.49));
        empresa.agregarProducto(new Producto(303, "Tablet", 450.75));

        // Mostrar todos los productos
        System.out.println("📌 Lista de productos:");
        empresa.mostrarProductos();

        // Buscar un producto por código
        int codigoBuscado = 202;
        Producto encontrado = empresa.buscarProductoPorCodigo(codigoBuscado);

        if (encontrado != null) {
            System.out.println("✅ Producto encontrado: " + encontrado);
        } else {
            System.out.println("❌ Producto con código " + codigoBuscado + " no encontrado.");
        }
    }
}
