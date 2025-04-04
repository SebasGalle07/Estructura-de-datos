package coleccionesElizabeth;

import java.util.LinkedList;

class Banco {
    private LinkedList<String> colaClientes;

    public Banco() {
        this.colaClientes = new LinkedList<>();
    }

    // Agregar un cliente al final de la cola
    public void agregarCliente(String nombre) {
        colaClientes.addLast(nombre);
        System.out.println("📥 Cliente agregado: " + nombre);
    }

    // Atender al primer cliente en la cola
    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            String clienteAtendido = colaClientes.removeFirst();
            System.out.println("✅ Cliente atendido: " + clienteAtendido);
        } else {
            System.out.println("⏳ No hay clientes en la cola.");
        }
    }

    // Insertar cliente con urgencia al inicio de la cola
    public void agregarClienteUrgente(String nombre) {
        colaClientes.addFirst(nombre);
        System.out.println("🚨 Cliente urgente agregado: " + nombre);
    }

    // Mostrar la lista de espera
    public void mostrarCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("📭 No hay clientes en la cola.");
        } else {
            System.out.println("📌 Clientes en la cola: " + colaClientes);
        }
    }
}

public class punto_7 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Agregar clientes
        banco.agregarCliente("Juan");
        banco.agregarCliente("María");
        banco.agregarCliente("Carlos");

        // Mostrar la cola de espera
        banco.mostrarCola();

        // Atender al primer cliente
        banco.atenderCliente();
        banco.mostrarCola();

        // Agregar un cliente urgente
        banco.agregarClienteUrgente("Ana");
        banco.mostrarCola();

        // Atender a los clientes restantes
        banco.atenderCliente();
        banco.atenderCliente();
        banco.atenderCliente();
        banco.mostrarCola();
    }
}
