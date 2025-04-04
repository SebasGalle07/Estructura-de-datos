package ejerciciosGenerics;

    class Caja<T> {
        private T contenido;

        public void setContenido(T contenido) {
            this.contenido = contenido;
        }

        public T getContenido() {
            return contenido;
        }
    }

    public class LaCaja {
        public static void main(String[] args) {
            Caja<String> cajaTexto = new Caja<>();
            cajaTexto.setContenido("Hola Generics!");
            System.out.println("Contenido: " + cajaTexto.getContenido());

            Caja<Integer> cajaNumero = new Caja<>();
            cajaNumero.setContenido(123);
            System.out.println("Número almacenado: " + cajaNumero.getContenido());
        }
    }


