
package ejercicio1.programateca;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Ingresa una opcion:\n -1 - Salir \n 1- Ejercicio 1 \n 2- Ejercicio 2 \n 3- Ejercicio 3\n 4- Ejercicio 3 Guillen");
       
            int option = sc.nextInt();
            Listas lista = new Listas(null);
            for(int i =0; i<20;i++){
                lista.insertarPrincipio(i);
            }

            System.out.println("***************************");
            if (option == 1){
                Ejercicio1(lista);
            } else if (option == 2){
                Ejercicio2(lista);
            } else if (option == 3){
                Ejercicio3();
            } else if (option == 4){
                mezcla2();
            } else if (option == -1) {
                break;
            }
        }
        
    }
    
    public static ListasArray llenarListasArray(boolean esPar){
        ListasArray lista = new ListasArray(null);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        int[] vector4 = new int[5];
        int[] vector5 = new int[5];
        
        
        return lista;
    }
    
    public static int[] poblarArray(int[] vector,int inicio){
        int cont = 0;
        while(cont<5) {
            vector[cont] = inicio;
            cont++;
            inicio+=2;
        }
    }
    
    public static void Ejercicio1(Listas lista){
        Listas lista2 = new Listas(null);
        for(int i = 0; i<lista.getLenght();i++){
                lista2.insertarPrincipio(lista.obtenerNumero(i));
            }
        imprimirLista("Lista1: ",lista);
        imprimirLista("Lista2: ",lista2);
    }
    
    public static void Ejercicio2(Listas lista){
        Listas lista2 = new Listas(null);
        while(!lista.estaVacia()){
                lista2.insertarPrincipio(lista.obtenerNumero(0));
                lista.eliminarPrincipio();
            }
        imprimirLista("Lista1: ",lista);
        imprimirLista("Lista2: ",lista2);
    }
    
    public static void Ejercicio3(){
        Listas lista = new Listas(null);
        Listas lista2 = new Listas(null);
        Listas listaResultado = new Listas(null);
        for(int i =0; i<20;i++){
            if(i%2 == 0) {
                lista.insertarFinal(i);
            } else {
                lista2.insertarFinal(i);
            }  
        }
                
        while(!lista.estaVacia() || !lista2.estaVacia()) {
            if (lista.estaVacia()) {
                while(!lista2.estaVacia()){
                    listaResultado.insertarFinal(lista2.getCabeza().getElemento());
                    lista2.eliminarPrincipio();
                }
            } else if (lista2.estaVacia()) {
                while(!lista.estaVacia()){
                    listaResultado.insertarFinal(lista.getCabeza().getElemento());
                    lista.eliminarPrincipio();
                }
            } else {
                int cabeza1 = lista.getCabeza().getElemento();
                int cabeza2 = lista2.getCabeza().getElemento();
                if(cabeza1 < cabeza2) {
                    listaResultado.insertarFinal(cabeza1);
                    lista.eliminarPrincipio();
                } else {
                    listaResultado.insertarFinal(cabeza2);
                    lista2.eliminarPrincipio();
                }
            }
        }
      
        imprimirLista("Lista1: ",lista);
        imprimirLista("Lista2: ",lista2);
        imprimirLista("Lista Resultado: ",listaResultado);
    }
    
    public static void mezcla2(Listas lista,Listas lista2){
        
    }
    
    public static void imprimirLista(String mensaje, Listas lista){
        if(lista.estaVacia()){
            System.out.println("Lista Vacia");
        } else {
            for(int i = 0; i < lista.getLenght();i++){
            System.out.println(mensaje+ lista.obtenerNumero(i));
        }
        }
        
    }
    
}
