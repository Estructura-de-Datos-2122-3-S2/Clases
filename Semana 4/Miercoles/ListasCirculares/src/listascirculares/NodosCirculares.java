package listascirculares;

public class NodosCirculares {
    private int elemento;
    private NodosCirculares siguiente;

    public NodosCirculares(int elemento) {
        this.elemento = elemento;
        this.siguiente = this;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NodosCirculares getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodosCirculares siguiente) {
        this.siguiente = siguiente;
    }
    
}
