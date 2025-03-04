package coleccionesSebastian;

import java.util.PriorityQueue;
import java.util.Comparator;

// Clase que representa a un paciente con su nivel de prioridad
class Paciente {
    private String nombre;
    private int prioridad; // Mayor número = mayor urgencia

    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "Nombre='" + nombre + '\'' + ", Prioridad=" + prioridad + '}';
    }
}

// Comparador para ordenar la PriorityQueue por nivel de prioridad (de mayor a menor)
class ComparadorPrioridad implements Comparator<Paciente> {
    @Override
    public int compare(Paciente p1, Paciente p2) {
        return Integer.compare(p2.getPrioridad(), p1.getPrioridad()); // Orden inverso para que el mayor valor tenga prioridad
    }
}

class Hospital {
    private PriorityQueue<Paciente> colaPacientes;

    public Hospital() {
        // PriorityQueue con comparador personalizado para que la prioridad más alta sea la primera
        this.colaPacientes = new PriorityQueue<>(new ComparadorPrioridad());
    }

    // Agregar un paciente a la cola de atención
    public void ingresarPaciente(String nombre, int prioridad) {
        Paciente paciente = new Paciente(nombre, prioridad);
        colaPacientes.offer(paciente);
        System.out.println("🚑 Paciente ingresado: " + paciente);
    }

    // Atender al paciente con mayor prioridad
    public void atenderPaciente() {
        if (!colaPacientes.isEmpty()) {
            Paciente atendido = colaPacientes.poll();
            System.out.println("✅ Atendiendo a: " + atendido);
        } else {
            System.out.println("⚠ No hay pacientes en la sala de espera.");
        }
    }

    // Mostrar la lista de pacientes en espera
    public void mostrarPacientes() {
        if (colaPacientes.isEmpty()) {
            System.out.println("📭 No hay pacientes en espera.");
        } else {
            System.out.println("📜 Pacientes en espera (por prioridad):");
            for (Paciente p : colaPacientes) {
                System.out.println("- " + p);
            }
        }
    }
}

public class punto_13 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Ingresar pacientes con diferentes niveles de prioridad
        hospital.ingresarPaciente("Carlos", 3);
        hospital.ingresarPaciente("Ana", 5);  // Más urgente
        hospital.ingresarPaciente("Luis", 2);
        hospital.ingresarPaciente("Beatriz", 4);

        // Mostrar la lista de pacientes en orden de atención
        hospital.mostrarPacientes();

        // Atender pacientes en orden de prioridad
        hospital.atenderPaciente();
        hospital.atenderPaciente();

        // Mostrar lista actualizada
        hospital.mostrarPacientes();
    }
}
