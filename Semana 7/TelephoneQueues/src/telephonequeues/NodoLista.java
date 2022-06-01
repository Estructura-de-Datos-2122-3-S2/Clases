package telephonequeues;

public class NodoLista {
    private Cliente elemento;
    private NodoLista siguiente;

    public NodoLista(Cliente elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Cliente getElemento() {
        return elemento;
    }

    public void setElemento(Cliente elemento) {
        this.elemento = elemento;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
