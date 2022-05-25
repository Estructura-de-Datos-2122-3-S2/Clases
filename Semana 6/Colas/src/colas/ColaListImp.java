package colas;

public class ColaListImp implements ICola{
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

    @Override
    public void encolar(Object elemento) {
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

    @Override
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
    

    @Override
    public boolean estaVacio() {
        return getCabeza() == null;
    }

    @Override
    public Object consultar() {
        return getCabeza().getElemento();
    }

    @Override
    public Object despachar() {
        Object temp = consultar();
        desencolar();
        return temp;
    }
    
}
