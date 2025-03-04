package coleccionesSebastian;

import java.util.HashMap;
import java.util.Map;

class DirectorioTelefonico {
    private Map<String, String> directorio;

    public DirectorioTelefonico() {
        this.directorio = new HashMap<>();
    }

    // Agregar un contacto al directorio
    public void agregarContacto(String nombre, String numero) {
        if (directorio.containsKey(nombre)) {
            System.out.println("⚠ El contacto '" + nombre + "' ya existe con el número: " + directorio.get(nombre));
        } else {
            directorio.put(nombre, numero);
            System.out.println("✅ Contacto agregado: " + nombre + " -> " + numero);
        }
    }

    // Buscar un número de teléfono por nombre
    public void buscarContacto(String nombre) {
        if (directorio.containsKey(nombre)) {
            System.out.println("📞 " + nombre + ": " + directorio.get(nombre));
        } else {
            System.out.println("❌ Contacto '" + nombre + "' no encontrado.");
        }
    }

    // Eliminar un contacto
    public void eliminarContacto(String nombre) {
        if (directorio.remove(nombre) != null) {
            System.out.println("❌ Contacto '" + nombre + "' eliminado.");
        } else {
            System.out.println("⚠ No se encontró el contacto '" + nombre + "'.");
        }
    }

    // Mostrar todos los contactos
    public void mostrarContactos() {
        if (directorio.isEmpty()) {
            System.out.println("📭 El directorio está vacío.");
        } else {
            System.out.println("📜 Lista de contactos:");
            for (Map.Entry<String, String> entrada : directorio.entrySet()) {
                System.out.println("- " + entrada.getKey() + " -> " + entrada.getValue());
            }
        }
    }
}

public class punto_15 {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        // Agregar contactos
        directorio.agregarContacto("Juan", "123-456-789");
        directorio.agregarContacto("Ana", "987-654-321");
        directorio.agregarContacto("Luis", "456-789-123");
        directorio.agregarContacto("Juan", "111-222-333"); // Intento de duplicado

        // Buscar un contacto
        directorio.buscarContacto("Ana");
        directorio.buscarContacto("Carlos"); // No existe

        // Mostrar contactos
        directorio.mostrarContactos();

        // Eliminar un contacto
        directorio.eliminarContacto("Luis");

        // Mostrar directorio actualizado
        directorio.mostrarContactos();
    }
}
