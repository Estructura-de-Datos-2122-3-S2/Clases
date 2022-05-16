package pilas;


public class PilasArrayImpl implements IPilas {
    private int peek;
    private Object[] array;

    public PilasArrayImpl(int size) {
        this.peek = -1;
        this.array = new Object[size];
    }

    public void setPeek(int peek) {
        this.peek = peek;
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public void push(Object object) {
        setPeek(getPeek() + 1);
        getArray()[getPeek()] = object;
    }

    @Override
    public void pop() {
        getArray()[getPeek()] = null;
        setPeek(getPeek() - 1);
    }

    @Override
    public int getLength() {
        return getArray().length;
    }

    @Override
    public boolean isEmpty() {
        return getPeek() == -1;
      
    }

    public int getPeek() {
        return peek;
    }
    
}
