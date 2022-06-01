package telephonequeues;

public class ColaListImp {
    private NodoCola cabeza, fin;
    private int tamaño;

    public ColaListImp() {
        this.cabeza = null;
        this.fin = null;
        this.tamaño = 0;       
    }

    public NodoCola getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCola cabeza) {
        this.cabeza = cabeza;
    }

    public NodoCola getFin() {
        return fin;
    }

    public void setFin(NodoCola fin) {
        this.fin = fin;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void encolar(Cliente elemento) {
        NodoCola nodo = new NodoCola(elemento);
        if(estaVacio()) {
            setCabeza(nodo);
            setFin(nodo);
        } else {
            getFin().setSiguiente(nodo);
            setFin(nodo);
        }
        setTamaño(getTamaño() + 1);
    }
    
    public void desencolar() {
        if(!estaVacio()) {
            if (getTamaño() == 1){
                setCabeza(null);
                setFin(null);
            } else {
                NodoCola temp = getCabeza();
                setCabeza(temp.getSiguiente());
                temp.setSiguiente(null);
            }
            setTamaño(getTamaño() - 1);
        } 
    }
    
    public boolean estaVacio() {
        return getCabeza() == null;
    }

    public Cliente consultar() {
        return getCabeza().getElemento();
    }

    public Cliente despachar() {
        Cliente temp = consultar();
        desencolar();
        return temp;
    }
    
}
