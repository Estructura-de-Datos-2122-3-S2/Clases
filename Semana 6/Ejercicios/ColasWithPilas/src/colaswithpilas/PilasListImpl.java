package colaswithpilas;


public class PilasListImpl {
    private Nodo peek;
    private int length;

    public PilasListImpl() {
        this.peek = null;
        this.length = 0;
    }

    public void push(Object elemento) {
        Nodo nodo = new Nodo(elemento);
        nodo.setNext(getPeek());
        setPeek(nodo);
        setLength(getLength()+ 1);
    }
    
    public void pop() {
        if (!isEmpty()){
            Nodo temp = getPeek();
            setPeek(getPeek().getNext());
            temp.setNext(null);
            setLength(getLength() - 1);
        }
    }
    
    public int getLength() {
        return length;
    }

    public Nodo getPeek() {
        return peek;
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }

    public void setPeek(Nodo nodo) {
        this.peek = nodo;
    }


    public void setLength(int length) {
        this.length = length;
    }

    
}
