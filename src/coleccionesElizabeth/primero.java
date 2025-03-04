package coleccionesElizabeth;
import java.util.TreeSet;

import java.util.Comparator;
public class primero {

    // Clase Producto sin Comparable, pero con Comparator externo
    static class Producto {
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
            return "Producto{Código=" + codigo + ", Nombre='" + nombre + "', Precio=" + precio + "}";
        }
    }

    // Comparator para ordenar productos por código
    static class ComparadorPorCodigo implements Comparator<Producto> {
        @Override
        public int compare(Producto p1, Producto p2) {
            return Integer.compare(p1.getCodigo(), p2.getCodigo());
        }
    }

    // Clase Empresa que maneja un TreeSet de productos
    static class Empresa {
        private TreeSet<Producto> productos;

        public Empresa() {
            // Usamos TreeSet con Comparator para ordenar por código
            this.productos = new TreeSet<>(new ComparadorPorCodigo());
        }

        // Método para agregar un producto
        public void agregarProducto(Producto producto) {
            productos.add(producto);
        }

        // Método para buscar un producto por código
        public Producto buscarProducto(int codigo) {
            for (Producto p : productos) {
                if (p.getCodigo() == codigo) {
                    return p;
                }
            }
            return null; // Retorna null si no encuentra el producto
        }

        // Método para mostrar todos los productos ordenados
        public void mostrarProductos() {
            productos.forEach(System.out::println);
        }
    }

    // Clase principal para probar la funcionalidad
    public static void main(String[] args) {


            Empresa empresa = new Empresa();

            // Agregar productos
            empresa.agregarProducto(new Producto(101, "Laptop", 1200.50));
            empresa.agregarProducto(new Producto(102, "Mouse", 25.99));
            empresa.agregarProducto(new Producto(103, "Teclado", 45.00));

            // Mostrar productos
            System.out.println("Lista de productos:");
            empresa.mostrarProductos();

            // Buscar un producto por código
            int codigoBuscado = 102;
            Producto encontrado = empresa.buscarProducto(codigoBuscado);
            if (encontrado != null) {
                System.out.println("\nProducto encontrado: " + encontrado);
            } else {
                System.out.println("\nProducto con código " + codigoBuscado + " no encontrado.");
            }
        }
    }



