package coleccionesSebastian;

import java.util.ArrayDeque;
import java.util.Deque;

class HistorialMensajes {
    private static final int LIMITE_HISTORIAL = 10;
    private Deque<String> mensajes;

    public HistorialMensajes() {
        this.mensajes = new ArrayDeque<>();
    }

    // Agregar un mensaje al historial (manteniendo máximo 10 mensajes)
    public void enviarMensaje(String mensaje) {
        if (mensajes.size() >= LIMITE_HISTORIAL) {
            mensajes.pollFirst(); // Elimina el mensaje más antiguo para mantener el tamaño
        }
        mensajes.addLast(mensaje);
        System.out.println("📩 Mensaje enviado: " + mensaje);
    }

    // Mostrar los últimos mensajes enviados
    public void mostrarHistorial() {
        if (mensajes.isEmpty()) {
            System.out.println("📭 No hay mensajes en el historial.");
        } else {
            System.out.println("📜 Últimos mensajes enviados:");
            for (String mensaje : mensajes) {
                System.out.println("- " + mensaje);
            }
        }
    }
}

public class punto_14 {
    public static void main(String[] args) {
        HistorialMensajes chat = new HistorialMensajes();

        // Enviar 12 mensajes (los primeros 2 serán eliminados porque el límite es 10)
        for (int i = 1; i <= 12; i++) {
            chat.enviarMensaje("Mensaje " + i);
        }

        // Mostrar los últimos 10 mensajes
        chat.mostrarHistorial();
    }
}
