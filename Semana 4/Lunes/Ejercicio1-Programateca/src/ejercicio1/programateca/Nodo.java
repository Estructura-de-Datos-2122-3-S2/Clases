package ejercicio1.programateca;

public class Nodo {
    private int elemento;
    private Nodo siguiente;

    public Nodo(int elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
