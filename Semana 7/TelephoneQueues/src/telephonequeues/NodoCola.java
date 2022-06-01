package telephonequeues;


public class NodoCola {
   private Cliente elemento;
   private NodoCola siguiente;

    public NodoCola(Cliente elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public Cliente getElemento() {
        return elemento;
    }

    public void setElemento(Cliente elemento) {
        this.elemento = elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    
   
   
}
