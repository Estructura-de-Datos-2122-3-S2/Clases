package listascirculares;

public class Main {


    public static void main(String[] args) {
        ListasCirculares lista = new ListasCirculares();
        lista.insertar(1);
        
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista: "+ lista.obtenerElemento(i));
        }
        lista.eliminar(1);
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista Nueva: "+ lista.obtenerElemento(i));
        }
        
        lista.insertar(55);
        
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista MAS Nueva: "+ lista.obtenerElemento(i));
        }
    }
    
}
