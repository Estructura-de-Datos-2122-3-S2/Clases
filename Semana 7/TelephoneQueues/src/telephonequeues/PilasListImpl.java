package telephonequeues;


public class PilasListImpl {
    private NodoPila peek;
    private int length;

    public PilasListImpl() {
        this.peek = null;
        this.length = 0;
    }

    public void push(Regalo elemento) {
        NodoPila nodo = new NodoPila(elemento);
        nodo.setNext(getPeek());
        setPeek(nodo);
        setLength(getLength()+ 1);
    }
    
    public void pop() {
        if (!isEmpty()){
            NodoPila temp = getPeek();
            setPeek(getPeek().getNext());
            temp.setNext(null);
            setLength(getLength() - 1);
        }
    }

    public int getLength() {
        return length;
    }

    public NodoPila getPeek() {
        return peek;
    }


    public boolean isEmpty() {
        return getPeek() == null;
    }

    public void setPeek(NodoPila nodo) {
        this.peek = nodo;
    }

    public void setLength(int length) {
        this.length = length;
    }

    
}
