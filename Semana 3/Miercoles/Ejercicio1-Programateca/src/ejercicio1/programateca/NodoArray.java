package ejercicio1.programateca;


public class NodoArray {
    private int[] elemento;
    private NodoArray siguiente;

    public NodoArray(int[] elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public int[] getElemento() {
        return elemento;
    }

    public void setElemento(int[] elemento) {
        this.elemento = elemento;
    }

    public NodoArray getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoArray siguiente) {
        this.siguiente = siguiente;
    }
}
