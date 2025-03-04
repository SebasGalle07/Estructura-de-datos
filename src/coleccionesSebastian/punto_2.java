package coleccionesSebastian;

import java.util.Stack;

class PilaTipos {
    private Stack<Object> pila;

    public PilaTipos() {
        this.pila = new Stack<>();
    }

    // Agregar un elemento a la pila si el tipo coincide con el de la cima
    public void push(Object elemento) {
        if (pila.isEmpty() || pila.peek().getClass().equals(elemento.getClass())) {
            pila.push(elemento);
            System.out.println("✅ Elemento agregado: " + elemento + " (Tipo: " + elemento.getClass().getSimpleName() + ")");
        } else {
            System.out.println("⛔ No se puede agregar " + elemento + " (Tipo: " + elemento.getClass().getSimpleName() +
                    "). La pila contiene elementos de tipo " + pila.peek().getClass().getSimpleName());
        }
    }

    // Eliminar el último elemento de la pila
    public void pop() {
        if (!pila.isEmpty()) {
            Object elementoRemovido = pila.pop();
            System.out.println("⬅ Elemento eliminado: " + elementoRemovido);
        } else {
            System.out.println("⚠ La pila está vacía.");
        }
    }

    // Mostrar los elementos de la pila
    public void mostrarPila() {
        if (pila.isEmpty()) {
            System.out.println("📭 La pila está vacía.");
        } else {
            System.out.println("📜 Contenido de la pila:");
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println("- " + pila.get(i) + " (Tipo: " + pila.get(i).getClass().getSimpleName() + ")");
            }
        }
    }
}

public class punto_2 {
    public static void main(String[] args) {
        PilaTipos pila = new PilaTipos();

        // Insertando elementos en la pila
        pila.push(10);          // Se permite (pila vacía)
        pila.push(20);          // Se permite (mismo tipo: Integer)
        pila.push("Hola");      // No se permite (tipo diferente)
        pila.push(30);          // Se permite (mismo tipo: Integer)

        // Mostrar pila actual
        pila.mostrarPila();

        // Eliminar un elemento
        pila.pop();
        pila.mostrarPila();

        // Insertar un nuevo tipo tras vaciar la pila
        pila.pop();
        pila.pop();
        pila.push("Texto");     // Se permite (pila vacía)
        pila.push("Otro texto");// Se permite (mismo tipo: String)

        // Intentar agregar otro tipo
        pila.push(3.14);        // No se permite (tipo Double)

        // Mostrar pila final
        pila.mostrarPila();
    }
}
