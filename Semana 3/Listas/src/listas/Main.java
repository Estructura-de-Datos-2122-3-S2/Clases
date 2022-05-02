package listas;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter","J.K. Rowling", "123");
        Libro libro2 = new Libro("Señor de los anillos","Pepe Grillo", "456");
        Libro libro3 = new Libro("100 años de soledad", "Gabriel Garcia Marquez","789");
        
        Listas lista = new Listas(null);
        lista.insertarFinal(libro1);
        lista.insertarFinal(libro2);
        lista.insertarFinal(libro3);
        lista.insertarPrincipio(libro3);
        
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista: "+ lista.obtenerLibro(i).getName());
        }
        
        lista.insertarEnIndice(2, libro3);
        System.out.println("NUEVO");
        for(int i = 0; i < lista.getLenght();i++){
            System.out.println("Lista: "+ lista.obtenerLibro(i).getName());
        }
    }
    
}
