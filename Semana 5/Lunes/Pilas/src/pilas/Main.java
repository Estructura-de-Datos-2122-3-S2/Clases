package pilas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){            
            System.out.println("Please enter a Option:");
            System.out.println("1- Stack with List");
            System.out.println("2- Stack with Array");
            System.out.println("3- Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    listMethod();
                    break;
                case 2:
                    arrayMethod();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
    
    public static void listMethod() {
        PilasListImpl pila = new PilasListImpl();
        for (int i = 0; i < 9 ; i++) {
            pila.push(i);
        }
        while (!pila.isEmpty()) {
            System.out.println("Pila: "+ pila.getPeek().getElement());
            pila.pop();
            System.out.println("Legth" + pila.getLength());
        }
    }
    
    public static void arrayMethod() {
        PilasArrayImpl pila = new PilasArrayImpl(10);
        for (int i = 0; i < pila.getLength() ; i++) {
            pila.push(i);
        }
        
        for (int i = 0; i < pila.getLength() ; i++) {
            System.out.println("Pila: "+ pila.getArray()[pila.getPeek()]);
            pila.pop();
        }
        
        for (int i = 0; i < pila.getLength() ; i++) {
            System.out.println("Pila: "+ pila.getArray()[i]);
        }
    }
}
