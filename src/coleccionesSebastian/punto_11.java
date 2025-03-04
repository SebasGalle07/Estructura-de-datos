package coleccionesSebastian;

import java.util.LinkedHashSet;
import java.util.Set;

class FavoritosMusicales {
    private Set<String> cancionesFavoritas;

    public FavoritosMusicales() {
        this.cancionesFavoritas = new LinkedHashSet<>();
    }

    // Agregar una canción favorita
    public void agregarCancion(String cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("🎵 Agregada a favoritos: " + cancion);
        } else {
            System.out.println("⚠ La canción '" + cancion + "' ya está en favoritos.");
        }
    }

    // Eliminar una canción favorita
    public void eliminarCancion(String cancion) {
        if (cancionesFavoritas.remove(cancion)) {
            System.out.println("❌ Eliminada de favoritos: " + cancion);
        } else {
            System.out.println("⚠ La canción '" + cancion + "' no está en favoritos.");
        }
    }

    // Mostrar la lista de canciones favoritas
    public void mostrarFavoritos() {
        if (cancionesFavoritas.isEmpty()) {
            System.out.println("📭 No tienes canciones favoritas.");
        } else {
            System.out.println("📜 Tus canciones favoritas:");
            for (String cancion : cancionesFavoritas) {
                System.out.println("- " + cancion);
            }
        }
    }
}

public class punto_11 {
    public static void main(String[] args) {
        FavoritosMusicales favoritos = new FavoritosMusicales();

        // Agregar canciones favoritas
        favoritos.agregarCancion("Bohemian Rhapsody - Queen");
        favoritos.agregarCancion("Hotel California - Eagles");
        favoritos.agregarCancion("Imagine - John Lennon");
        favoritos.agregarCancion("Bohemian Rhapsody - Queen"); // Intento de duplicado

        // Mostrar lista de favoritos
        favoritos.mostrarFavoritos();

        // Eliminar una canción
        favoritos.eliminarCancion("Imagine - John Lennon");

        // Mostrar lista actualizada
        favoritos.mostrarFavoritos();
    }
}
