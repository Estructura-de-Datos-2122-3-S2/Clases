package listasdobles;


public class Main {

    public static void main(String[] args) {
       
        ListasDobles lista = new ListasDobles();
        lista.insertarFinal(1);
        lista.insertarFinal(5);
        lista.insertarFinal(8);
        lista.insertarPrincipio(3);
        
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista: "+ lista.obtenerElemento(i));
        }
        
        lista.insertarEnIndice(2, 100);
        System.out.println("NUEVO");
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista: "+ lista.obtenerElemento(i));
        }
        
    }
    
}
