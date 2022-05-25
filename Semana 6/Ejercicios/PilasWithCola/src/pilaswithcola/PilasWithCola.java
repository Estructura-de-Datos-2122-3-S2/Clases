package pilaswithcola;


public class PilasWithCola {

    public static void main(String[] args) {
        listMethod();
    }
    
    public static void listMethod() {
        Pila pila = new Pila();
        for (int i = 0; i < 9 ; i++) {
            pila.push(i);
        }
        while (!pila.isEmpty()) {
            System.out.println("Pila: "+ pila.getPeek());
            pila.pop();
            System.out.println("Legth" + pila.getLength());
        }
    }
    
}
