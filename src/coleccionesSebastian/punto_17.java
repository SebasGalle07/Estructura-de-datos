package coleccionesSebastian;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

class AgendaEventos {
    private TreeMap<LocalDate, String> eventos;

    public AgendaEventos() {
        this.eventos = new TreeMap<>();
    }

    // Agregar un evento con su fecha
    public void agregarEvento(LocalDate fecha, String evento) {
        eventos.put(fecha, evento);
        System.out.println("📅 Evento agregado: " + fecha + " -> " + evento);
    }

    // Eliminar un evento por fecha
    public void eliminarEvento(LocalDate fecha) {
        if (eventos.remove(fecha) != null) {
            System.out.println("❌ Evento del " + fecha + " eliminado.");
        } else {
            System.out.println("⚠ No hay eventos en la fecha " + fecha);
        }
    }

    // Mostrar todos los eventos en orden cronológico
    public void mostrarAgenda() {
        if (eventos.isEmpty()) {
            System.out.println("📭 No hay eventos programados.");
        } else {
            System.out.println("📜 Agenda de eventos:");
            for (Map.Entry<LocalDate, String> entrada : eventos.entrySet()) {
                System.out.println("- " + entrada.getKey() + " -> " + entrada.getValue());
            }
        }
    }

    // Obtener el evento más próximo
    public void obtenerProximoEvento() {
        if (!eventos.isEmpty()) {
            Map.Entry<LocalDate, String> proximo = eventos.firstEntry();
            System.out.println("🔜 Próximo evento: " + proximo.getKey() + " -> " + proximo.getValue());
        } else {
            System.out.println("⚠ No hay eventos programados.");
        }
    }
}

public class punto_17 {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        // Agregar eventos en diferentes fechas
        agenda.agregarEvento(LocalDate.of(2024, 3, 20), "Reunión con clientes");
        agenda.agregarEvento(LocalDate.of(2024, 2, 15), "Entrega de proyecto");
        agenda.agregarEvento(LocalDate.of(2024, 4, 10), "Conferencia de tecnología");
        agenda.agregarEvento(LocalDate.of(2024, 2, 5), "Cena de empresa");

        // Mostrar la agenda completa (ordenada)
        agenda.mostrarAgenda();

        // Obtener el evento más próximo
        agenda.obtenerProximoEvento();

        // Eliminar un evento
        agenda.eliminarEvento(LocalDate.of(2024, 2, 15));

        // Mostrar la agenda actualizada
        agenda.mostrarAgenda();
    }
}
