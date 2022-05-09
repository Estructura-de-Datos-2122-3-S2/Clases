package listasdobles;

public class ListasDobles {
    private NodosDobles cabeza, cola;
    private int lenght;

    public ListasDobles() {
        this.lenght = 0;
        this.cabeza = null;
        this.cola = null;
    }

    public NodosDobles getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }

    public void setCabeza(NodosDobles cabeza) {
        this.cabeza = cabeza;
    }
    
    public void insertarPrincipio(int elemento) {
        NodosDobles nodo = new NodosDobles(elemento);
        if (estaVacia()) {
            setCabeza(nodo);
            setCola(nodo);
        } else {
            getCabeza().setAnterior(nodo);
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarFinal(int elemento) {
        NodosDobles nodo = new NodosDobles(elemento);
        if (estaVacia()) {
            setCabeza(nodo);
            setCola(nodo);
        } else {
            nodo.setAnterior(getCola());
            getCola().setSiguiente(nodo);
            setCola(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, int elemento){
        NodosDobles nodo = new NodosDobles(elemento);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodosDobles pointer = getCabeza();
            int cont = 0;
            while (cont < pos-1 && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            nodo.setSiguiente(pointer.getSiguiente());
            nodo.setAnterior(pointer);
            pointer.getSiguiente().setAnterior(nodo);
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public Integer obtenerElemento(int pos){
        if (estaVacia()) {
            return null;
        } else {
            NodosDobles pointer = getCabeza();
            int cont = 0;
            while (cont < pos && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            if (cont == pos) {
                return pointer.getElemento();
            } else {
                return null;
            }
        }
    }
    
    public void eliminarPrincipio() {
        if (!estaVacia()){
            NodosDobles pointer = getCabeza();
            setCabeza(pointer.getSiguiente());
            pointer.setSiguiente(null);
            getCabeza().setAnterior(null);
            lenght--;
        }
    }
    
    public void eliminarUltimo(){
        if(!estaVacia()){
            NodosDobles pointer = getCola();
            setCola(pointer.getAnterior());
            pointer.setAnterior(null);
            getCola().setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarEnIndice(int pos){
        if(!estaVacia()){
            NodosDobles pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            NodosDobles temp = pointer.getSiguiente();
            pointer.setSiguiente(temp.getSiguiente());
            temp.getSiguiente().setAnterior(pointer);
            temp.setSiguiente(null);
            temp.setAnterior(null);
            lenght--;
        }
    }
    
    public boolean estaVacia(){
            return getCabeza() == null;
    }

    public NodosDobles getCola() {
        return cola;
    }

    public void setCola(NodosDobles cola) {
        this.cola = cola;
    }
    
    
    
}
