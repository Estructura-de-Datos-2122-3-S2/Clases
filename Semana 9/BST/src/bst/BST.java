package bst;

public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();
       tree.insertNodoRecursive(tree.getRoot(), 10, tree.getRoot());
       tree.insertNodoRecursive(tree.getRoot(), 55, tree.getRoot());
       tree.insertNodoRecursive(tree.getRoot(), 1, tree.getRoot());
       tree.insertNodoRecursive(tree.getRoot(), 19, tree.getRoot());
       tree.insertNodoRecursive(tree.getRoot(), 79, tree.getRoot());
//       tree.insertNodoRecursive(tree.getRoot(), 65, tree.getRoot());
//       tree.insertNodoRecursive(tree.getRoot(), 82, tree.getRoot());
//       tree.insertNodo(tree.getRoot(), 3);

       Nodo nodo = tree.searchNodo(tree.getRoot(), 19);
//       System.out.println("Nodo: "+nodo.getElement());
       
       tree.inOrden(tree.getRoot());
        System.out.println("***DELETE***");
       tree.deleteNodo(tree.getRoot(), 55);
       tree.inOrden(tree.getRoot());
    }
    
}
