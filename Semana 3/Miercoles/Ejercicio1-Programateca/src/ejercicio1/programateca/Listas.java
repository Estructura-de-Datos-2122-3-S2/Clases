package ejercicio1.programateca;

public class Listas {
    private Nodo cabeza;
    private int lenght;

    public Listas(Nodo cabeza) {
        if(cabeza == null){
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public void insertarPrincipio(int numero) {
        Nodo nodo = new Nodo(numero);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            nodo.setSiguiente(getCabeza());
            setCabeza(nodo);
        }
        lenght++;
    }
    
    public void insertarFinal(int numero) {
        Nodo nodo = new Nodo(numero);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            Nodo pointer = getCabeza();
            while (pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(nodo);
        }
        lenght++;
    }
    
    public void insertarEnIndice(int pos, int numero){
        Nodo nodo = new Nodo(numero);
        if (estaVacia()) {
            setCabeza(nodo);
        } else {
            Nodo pointer = getCabeza();
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
    
    public Integer obtenerNumero(int pos){
        if (estaVacia()) {
            return null;
        } else {
            Nodo pointer = getCabeza();
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
            Nodo pointer = getCabeza();
            setCabeza(pointer.getSiguiente());
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarUltimo(){
        if(!estaVacia()){
            Nodo pointer = getCabeza();
            while (pointer.getSiguiente().getSiguiente() != null) {
                pointer = pointer.getSiguiente();
            }
            pointer.setSiguiente(null);
            lenght--;
        }
    }
    
    public void eliminarEnIndice(int pos){
        if(!estaVacia()){
            Nodo pointer = getCabeza();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getSiguiente() != null) {
                pointer = pointer.getSiguiente();
                cont++;
            }
            Nodo temp = pointer.getSiguiente();
            pointer.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(null);
            lenght--;
        }
    }
    
    public boolean estaVacia(){
            return getCabeza() == null;
        }
    
}
