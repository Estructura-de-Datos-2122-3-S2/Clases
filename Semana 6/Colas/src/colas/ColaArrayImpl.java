package colas;

public class ColaArrayImpl implements ICola{
    private NodoArray cabeza,fin;
    private NodoArray[] array;
    private int tamaño = 0;

    public ColaArrayImpl(int size) {
        this.cabeza = null;
        this.fin = null;
        this.array = new NodoArray[size];
    }

    public void setCabeza(NodoArray index) {
        this.cabeza = index;
    }
    
    public void setFin(NodoArray index) {
        this.fin = index;
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public void encolar(Object object) {
        int index = findEmptyPosition();
        NodoArray nodo = new NodoArray(object);
        nodo.setIndex(index);
        if (index != -1) {
            getArray()[index] = nodo;
            if (estaVacio()) {
                setCabeza(nodo);
                setFin(nodo);
            } else {
                getFin().setSiguiente(nodo);
                setFin(nodo);
            }
            setTamaño(getTamaño() + 1);
        } else {
            System.out.println("La lista esta llena");
        }
    }
    
    public int findEmptyPosition() {
        for (int i = 0; i < getArray().length; i++){
            if (getArray()[i] == null){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void desencolar() {
        if (!estaVacio()) {
            if(getTamaño() == 1){
                getArray()[getCabeza().getIndex()] = null;
                setCabeza(null);
                setFin(null);
            } else {
                NodoArray temp = getCabeza();
                setCabeza(temp.getSiguiente());
                getArray()[temp.getIndex()] = null;
            }
        }
    }
    

    public int getLength() {
        return getArray().length;
    }

    @Override
    public boolean estaVacio() {
        return getCabeza()== null;
      
    }

    public NodoArray getFin() {
        return fin;
    }
    
    public NodoArray getCabeza() {
        return cabeza;
    }

    @Override
    public Object consultar() {
        if(!estaVacio()){
          return getCabeza().getElemento();
        }
        return null;
    }

    @Override
    public Object despachar() {
        Object temp = getCabeza().getElemento();
        desencolar();
        return temp;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
