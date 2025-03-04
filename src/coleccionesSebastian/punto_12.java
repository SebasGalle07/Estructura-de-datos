package coleccionesSebastian;

import java.util.TreeSet;

class Universidad {
    private TreeSet<String> estudiantes;

    public Universidad() {
        this.estudiantes = new TreeSet<>();
    }

    // Agregar un estudiante a la lista (sin duplicados y en orden alfabético)
    public void agregarEstudiante(String nombre) {
        if (estudiantes.add(nombre)) {
            System.out.println("✅ Estudiante agregado: " + nombre);
        } else {
            System.out.println("⚠ El estudiante '" + nombre + "' ya está registrado.");
        }
    }

    // Eliminar un estudiante
    public void eliminarEstudiante(String nombre) {
        if (estudiantes.remove(nombre)) {
            System.out.println("❌ Estudiante eliminado: " + nombre);
        } else {
            System.out.println("⚠ El estudiante '" + nombre + "' no está en la lista.");
        }
    }

    // Mostrar la lista de estudiantes en orden alfabético
    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("📭 No hay estudiantes registrados.");
        } else {
            System.out.println("📜 Lista de estudiantes (orden alfabético):");
            for (String nombre : estudiantes) {
                System.out.println("- " + nombre);
            }
        }
    }

    // Obtener el primer estudiante en orden alfabético
    public void primerEstudiante() {
        if (!estudiantes.isEmpty()) {
            System.out.println("🏅 Primer estudiante: " + estudiantes.first());
        } else {
            System.out.println("⚠ No hay estudiantes registrados.");
        }
    }

    // Obtener el último estudiante en orden alfabético
    public void ultimoEstudiante() {
        if (!estudiantes.isEmpty()) {
            System.out.println("🎖 Último estudiante: " + estudiantes.last());
        } else {
            System.out.println("⚠ No hay estudiantes registrados.");
        }
    }
}

public class punto_12 {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();

        // Agregar estudiantes
        universidad.agregarEstudiante("Carlos");
        universidad.agregarEstudiante("Ana");
        universidad.agregarEstudiante("Luis");
        universidad.agregarEstudiante("Beatriz");
        universidad.agregarEstudiante("Carlos"); // Intento de duplicado

        // Mostrar estudiantes ordenados
        universidad.mostrarEstudiantes();

        // Mostrar primer y último estudiante
        universidad.primerEstudiante();
        universidad.ultimoEstudiante();

        // Eliminar un estudiante
        universidad.eliminarEstudiante("Luis");

        // Mostrar lista actualizada
        universidad.mostrarEstudiantes();
    }
}
