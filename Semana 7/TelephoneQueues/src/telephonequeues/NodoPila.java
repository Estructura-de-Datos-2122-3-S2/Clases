package telephonequeues;

public class NodoPila {
    private Regalo element;
    private NodoPila next;

    public NodoPila(Regalo element) {
        this.element = element;
        this.next = null;
    }

    public Regalo getElement() {
        return element;
    }

    public void setElement(Regalo element) {
        this.element = element;
    }

    public NodoPila getNext() {
        return next;
    }

    public void setNext(NodoPila next) {
        this.next = next;
    }
}
