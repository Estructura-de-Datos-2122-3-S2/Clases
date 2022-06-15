package trees;

public class Main {

    public static void main(String[] args) {
        Tree arbol = new Tree(null);
        Nodo root = new Nodo("0", null);
        arbol.setRoot(root);
        arbol.insertRecursive(arbol.getRoot(), "1", "0");
        arbol.insertRecursive(arbol.getRoot(), "2", "0");
        arbol.insertRecursive(arbol.getRoot(), "3", "0");
        arbol.insertRecursive(arbol.getRoot(), "4", "0");
        
        arbol.insertRecursive(arbol.getRoot(), "1.1", "1");
        arbol.insertRecursive(arbol.getRoot(), "1.2", "1");
        arbol.insertRecursive(arbol.getRoot(), "1.3", "1");
        arbol.insertRecursive(arbol.getRoot(), "1.4", "1");

        arbol.insertRecursive(arbol.getRoot(), "1.5", "5");    
        arbol.printPreOrden(arbol.getRoot());
    }
    
}
