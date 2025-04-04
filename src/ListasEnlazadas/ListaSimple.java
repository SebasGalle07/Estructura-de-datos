package ListasEnlazadas;

public class ListaSimple {
    private Nodo nodoInicial;

    public ListaSimple(Nodo nodoInicial) {
        nodoInicial = null;
    }

    public Nodo getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
    }
    public Nodo buscarLista(Elemento destino)
    {
        Nodo indice;
        for (indice = nodoInicial; indice!= null; indice = indice.enlace)
            if (destino == indice.dato) // (destino.equals(indice.dato))
                return indice;
        return null;
    }
}
