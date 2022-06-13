package trees;

public class Main {

    public static void main(String[] args) {
        Tree arbol = new Tree(null);
        Nodo root = new Nodo("0", null);
        arbol.setRoot(root);
        arbol.insertRecursive(root, "1", "0");
        arbol.insertRecursive(root, "2", "0");
        arbol.insertRecursive(root, "3", "0");
        arbol.insertRecursive(root, "4", "0");
        
        arbol.insertRecursive(root, "1.1", "1");
        arbol.insertRecursive(root, "1.2", "1");
        arbol.insertRecursive(root, "1.3", "1");
        arbol.insertRecursive(root, "1.4", "1");

        arbol.insertRecursive(root, "1.5", "5");    
        arbol.printPreOrden(arbol.getRoot());
    }
    
}
