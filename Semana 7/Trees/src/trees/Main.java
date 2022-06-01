package trees;

public class Main {

    public static void main(String[] args) {
        Tree arbol = new Tree(null);
        arbol.insert(0, null);
        arbol.insert(1, 0);
        arbol.printPreOrden(arbol.getRoot(), 0);
    }
    
}
