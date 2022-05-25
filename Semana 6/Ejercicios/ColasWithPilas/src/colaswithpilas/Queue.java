package colaswithpilas;

public class Queue {
    private PilasListImpl pila1;
    private PilasListImpl pila2;
    
    public void enqueue(Object elemento){
        pila1.push(elemento);
    }
    
    public void dequeue(){
        while(pila1.getLength() !=1){
            pila2.push(pila1.getPeek().getElement());
            pila1.pop();
        }
        pila1.pop();
        while(!pila2.isEmpty()){
            pila1.push(pila2.getPeek().getElement());
            pila2.pop();
        }
    }
    
    public Object display(){
        while(pila1.getLength() !=1){
            pila2.push(pila1.getPeek().getElement());
            pila1.pop();
        }
        Object temp = pila1.getPeek().getElement();
        while(!pila2.isEmpty()){
            pila1.push(pila2.getPeek().getElement());
            pila2.pop();
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return pila1.isEmpty();
    }
    
    public Object dispatch(){
        Object temp= display();
        dequeue();
        return temp;
    }
}
