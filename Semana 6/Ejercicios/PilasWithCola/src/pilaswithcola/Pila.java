package pilaswithcola;

public class Pila {
    private ColaListImp cola1;
    private ColaListImp cola2;

    public Pila() {
        this.cola1 = new ColaListImp();
        this.cola2 = new ColaListImp();
    }
    
    public void push(Object object) {
        cola1.encolar(object);
    }
    
    public void pop(){
        this.cola2 = new ColaListImp();
        while(cola1.getTamaño() != 1) {
            cola2.encolar(cola1.despachar());
        }
        cola1.desencolar();
        while(!cola2.estaVacio()){
            cola1.encolar(cola2.despachar());
        }
    }
    
    public int getLength(){
        return cola1.getTamaño();
    }
    
    public boolean isEmpty(){
        return cola1.estaVacio();
    }
     
    public Object getPeek(){
        this.cola2 = new ColaListImp();
        while(cola1.getTamaño() != 1) {
            cola2.encolar(cola1.despachar());
        }
        Object temp = cola1.getCabeza().getElemento();
        cola1.desencolar();
        while(!cola2.estaVacio()){
            cola1.encolar(cola2.despachar());
        }
        cola1.encolar(temp);
        return temp;
    }
    
}
