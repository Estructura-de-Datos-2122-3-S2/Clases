package listas;

public class Nodo {
    private Libro elemento;
    private Nodo siguiente;

    public Nodo(Libro elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Libro getElemento() {
        return elemento;
    }

    public void setElemento(Libro elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
