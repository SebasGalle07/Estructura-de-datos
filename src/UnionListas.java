import java.util.*;

class ListaInvertida {
    public static <T> List<T> invertirLista(List<T> lista) {
        return new LinkedList<>(new ArrayDeque<>(lista));
    }

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("uno", "dos", "tres");
        System.out.println(invertirLista(palabras));
    }
}
