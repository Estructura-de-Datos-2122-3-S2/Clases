package colas;

public class NodoArray {
    private Object elemento;
   private NodoArray siguiente;
   private int index;

    public NodoArray(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.index = -1;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodoArray getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoArray siguiente) {
        this.siguiente = siguiente;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}
