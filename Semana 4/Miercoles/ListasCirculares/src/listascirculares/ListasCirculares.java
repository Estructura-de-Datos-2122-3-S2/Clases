package listascirculares;

public class ListasCirculares {
    private NodosCirculares ultimo;
    private int lenght;

    public ListasCirculares() {
        this.lenght = 0;
        this.ultimo = null;
    }

    public int getLenght() {
        return lenght;
    }
    
    public void insertar(int elemento) {
        NodosCirculares nodo = new NodosCirculares(elemento);
        if (estaVacia()) {
            setUltimo(nodo);
        } else {
            nodo.setSiguiente(getUltimo().getSiguiente());
            getUltimo().setSiguiente(nodo);
            setUltimo(nodo);
        }
        lenght++;
    }
    
    public Integer obtenerElemento(int pos){
        if (estaVacia()) {
            return null;
        } else {
            NodosCirculares pointer = getUltimo().getSiguiente();
            int cont = 0;
            while (cont < pos && pointer.getSiguiente() != getUltimo().getSiguiente()) {
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
    
    public void eliminar(int elemento) {
        boolean encontrado = false;
        boolean firstTime = true;
        if (!estaVacia()){
            NodosCirculares pointer = getUltimo();
            
            while(!encontrado && (pointer != getUltimo() || firstTime)) {
                firstTime = false;
                encontrado = (elemento == pointer.getSiguiente().getElemento());
                if(!encontrado){
                    pointer = pointer.getSiguiente();
                }
            }
            if (encontrado){
                NodosCirculares temp = pointer.getSiguiente();
                pointer.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(null);
                if(getLenght() == 1){
                    setUltimo(null);
                } else {
                    if(elemento == getUltimo().getElemento()) {
                        setUltimo(pointer);
                    } 
                }
                lenght--;
            }
            
        }
    }
    
    public boolean estaVacia(){
            return getUltimo()== null;
    }

    public NodosCirculares getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodosCirculares ultimo) {
        this.ultimo = ultimo;
    }
    
    
}
