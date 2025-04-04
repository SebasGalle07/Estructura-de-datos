package coleccionesElizabeth;

import java.util.Stack;

class NavegadorWeb {
    private Stack<String> historial;

    public NavegadorWeb() {
        this.historial = new Stack<>();
    }

    // Visitar una nueva página (agregar a la pila)
    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("🌐 Visitando: " + url);
    }

    // Retroceder a la página anterior (eliminar la última)
    public void retroceder() {
        if (!historial.isEmpty()) {
            String paginaAnterior = historial.pop();
            if (!historial.isEmpty()) {
                System.out.println("⬅ Volviendo a: " + historial.peek());
            } else {
                System.out.println("🔴 No hay más páginas en el historial.");
            }
        } else {
            System.out.println("⚠ No hay páginas en el historial.");
        }
    }

    // Mostrar historial de navegación
    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("📭 Historial vacío.");
        } else {
            System.out.println("📜 Historial de navegación:");
            for (int i = historial.size() - 1; i >= 0; i--) {
                System.out.println((historial.size() - i) + ". " + historial.get(i));
            }
        }
    }
}

public class punto_9 {
    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();

        // Visitar páginas web
        navegador.visitarPagina("https://www.google.com");
        navegador.visitarPagina("https://www.github.com");
        navegador.visitarPagina("https://www.stackoverflow.com");

        // Mostrar historial
        navegador.mostrarHistorial();

        // Retroceder en la navegación
        navegador.retroceder();
        navegador.retroceder();
        navegador.retroceder();

        // Intentar retroceder más allá del historial
        navegador.retroceder();
    }
}
