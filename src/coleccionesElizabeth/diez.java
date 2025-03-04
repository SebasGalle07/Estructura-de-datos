package coleccionesElizabeth;

import java.util.HashSet;
import java.util.Set;

class ControlAcceso {
    private Set<String> empleadosAutorizados;

    public ControlAcceso() {
        this.empleadosAutorizados = new HashSet<>();
    }

    // Registrar un empleado en el sistema (sin duplicados)
    public void registrarEmpleado(String idEmpleado) {
        if (empleadosAutorizados.add(idEmpleado)) {
            System.out.println("✅ Acceso autorizado para ID: " + idEmpleado);
        } else {
            System.out.println("⚠ El empleado con ID " + idEmpleado + " ya está registrado.");
        }
    }

    // Verificar si un empleado tiene acceso
    public boolean verificarAcceso(String idEmpleado) {
        if (empleadosAutorizados.contains(idEmpleado)) {
            System.out.println("🔓 Acceso permitido para ID: " + idEmpleado);
            return true;
        } else {
            System.out.println("⛔ Acceso denegado para ID: " + idEmpleado);
            return false;
        }
    }

    // Listar los empleados con acceso
    public void listarEmpleadosAutorizados() {
        if (empleadosAutorizados.isEmpty()) {
            System.out.println("📭 No hay empleados registrados.");
        } else {
            System.out.println("📜 Lista de empleados con acceso:");
            for (String id : empleadosAutorizados) {
                System.out.println("- " + id);
            }
        }
    }
}

public class diez {
    public static void main(String[] args) {
        ControlAcceso accesoEdificio = new ControlAcceso();

        // Registrar empleados
        accesoEdificio.registrarEmpleado("EMP001");
        accesoEdificio.registrarEmpleado("EMP002");
        accesoEdificio.registrarEmpleado("EMP003");
        accesoEdificio.registrarEmpleado("EMP001"); // Intento de registro duplicado

        // Verificar acceso
        accesoEdificio.verificarAcceso("EMP001");
        accesoEdificio.verificarAcceso("EMP004"); // No registrado

        // Listar empleados con acceso
        accesoEdificio.listarEmpleadosAutorizados();
    }
}

