package telephonequeues;

public class Listas {
    private NodoLista cabeza;
    private int lenght;

    public Listas(NodoLista cabeza) {
        if(cabeza == null){
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.cabeza = cabeza;
    }

    public NodoLista getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }

    public void setCabeza(NodoLista cabeza) {
        this.cabeza = cabeza;
    }
    
    public void insertarPrincipio(Cliente libro) {
        NodoLista nodo = new NodoLista(libro);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarFinal(Cliente libro) {
        NodoLista nodo = new NodoLista(libro);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoLista pointer = getCabeza();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, Cliente libro){
        NodoLista nodo = new NodoLista(libro);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoLista pointer = getCabeza();
            int cont = 0;
            while (cont < pos && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            nodo.setSiguiente(pointer.getSiguiente());
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public Cliente obtenerCliente(int pos){
        if (estaVacia()) {
            return null;
        } else {
            NodoLista pointer = getCabeza();
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
            NodoLista pointer = getCabeza();
            setCabeza(pointer.getSiguiente());
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarUltimo(){
        if(!estaVacia()){
            NodoLista pointer = getCabeza();
            while (pointer.getSiguiente().getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarEnIndice(int pos){
        if(!estaVacia()){
            NodoLista pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            NodoLista temp = pointer.getSiguiente();
            pointer.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
            lenght--;
        }
    }
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
}
