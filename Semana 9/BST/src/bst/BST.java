package bst;

public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();
       tree.insertNodo(tree.getRoot(), 10);
       tree.insertNodo(tree.getRoot(), 55);
       tree.insertNodo(tree.getRoot(), 1);
       tree.insertNodo(tree.getRoot(), 19);
//       tree.insertNodo(tree.getRoot(), 16);
//       tree.insertNodo(tree.getRoot(), 23);
       tree.insertNodo(tree.getRoot(), 79);
//       tree.insertNodo(tree.getRoot(), 3);

       Nodo nodo = tree.searchNodo(tree.getRoot(), 19);
       System.out.println("Nodo: "+nodo.getElement());
       
       tree.inOrden(tree.getRoot());
        System.out.println("***DELETE***");
       tree.deleteNodo(tree.getRoot(), 1);
       tree.inOrden(tree.getRoot());
    }
    
}
