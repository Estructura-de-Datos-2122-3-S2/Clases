package listasdobles;

public class NodosDobles {
    private int elemento;
    private NodosDobles siguiente, anterior;

    public NodosDobles(int elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior= null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NodosDobles getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosDobles siguiente) {
        this.siguiente = siguiente;
    }

    public NodosDobles getAnterior() {
        return anterior;
    }

    public void setAnterior(NodosDobles anterior) {
        this.anterior = anterior;
    }
    
    
}
