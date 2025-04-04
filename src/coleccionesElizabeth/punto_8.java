package coleccionesElizabeth;

import java.util.Vector;

class EditorTexto {
    private Vector<String> historialCambios;

    public EditorTexto() {
        this.historialCambios = new Vector<>();
    }

    // Agregar un cambio al historial
    public void agregarCambio(String cambio) {
        historialCambios.add(cambio);
        System.out.println("✍ Cambio agregado: " + cambio);
    }

    // Deshacer el último cambio realizado
    public void deshacer() {
        if (!historialCambios.isEmpty()) {
            String ultimoCambio = historialCambios.remove(historialCambios.size() - 1);
            System.out.println("↩ Deshacer: " + ultimoCambio);
        } else {
            System.out.println("⚠ No hay cambios para deshacer.");
        }
    }

    // Mostrar el historial de cambios
    public void mostrarHistorial() {
        if (historialCambios.isEmpty()) {
            System.out.println("📭 Historial vacío.");
        } else {
            System.out.println("📜 Historial de cambios:");
            for (int i = 0; i < historialCambios.size(); i++) {
                System.out.println((i + 1) + ". " + historialCambios.get(i));
            }
        }
    }
}

public class punto_8 {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        // Agregar cambios
        editor.agregarCambio("Escribí la primera línea.");
        editor.agregarCambio("Agregué un párrafo.");
        editor.agregarCambio("Corrigí un error ortográfico.");

        // Mostrar historial de cambios
        editor.mostrarHistorial();

        // Deshacer el último cambio
        editor.deshacer();
        editor.mostrarHistorial();

        // Deshacer otro cambio
        editor.deshacer();
        editor.mostrarHistorial();

        // Intentar deshacer cuando el historial está vacío
        editor.deshacer();
        editor.deshacer();
    }
}
