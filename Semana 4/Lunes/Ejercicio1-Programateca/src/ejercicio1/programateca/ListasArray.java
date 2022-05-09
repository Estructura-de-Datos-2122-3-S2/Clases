package ejercicio1.programateca;

public class ListasArray {
    
    private NodoArray cabeza;
    private int lenght;

    public ListasArray(NodoArray cabeza) {
        if(cabeza == null){
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.cabeza = cabeza;
    }

    public NodoArray getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }

    public void setCabeza(NodoArray cabeza) {
        this.cabeza = cabeza;
    }
    
    public void insertarPrincipio(int[] array) {
        NodoArray nodo = new NodoArray(array);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarFinal(int[] array) {
        NodoArray nodo = new NodoArray(array);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoArray pointer = getCabeza();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, int[] array){
        NodoArray nodo = new NodoArray(array);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            NodoArray pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            nodo.setSiguiente(pointer.getSiguiente());
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public int[] obtenerNumero(int pos){
        if (estaVacia()) {
            return null;
        } else {
            NodoArray pointer = getCabeza();
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
            NodoArray pointer = getCabeza();
            setCabeza(pointer.getSiguiente());
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarUltimo(){
        if(!estaVacia()){
            NodoArray pointer = getCabeza();
            while (pointer.getSiguiente().getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarEnIndice(int pos){
        if(!estaVacia()){
            NodoArray pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            NodoArray temp = pointer.getSiguiente();
            pointer.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
            lenght--;
        }
    }
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
}
