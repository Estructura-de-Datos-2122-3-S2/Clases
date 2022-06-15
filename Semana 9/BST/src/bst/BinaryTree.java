package bst;

public class BinaryTree {
    private Nodo root;

    public BinaryTree() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public void preOrden(Nodo root) {
        if(root != null) {
            System.out.println("R{ "+root.getElement()+" }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }
    
    public void inOrden(Nodo root) {
        if(root != null) {
            inOrden(root.getLeftSon());
            System.out.println("{ "+root.getElement()+" }");
            inOrden(root.getRightSon());
        }
    }
    
    public void postOrden(Nodo root) {
        if(root != null) {
            postOrden(root.getLeftSon());
            postOrden(root.getRightSon());
            System.out.println("{ "+root.getElement()+" }");
        }
    }
    
    public Nodo searchNodo(Nodo root,int element){
        if (root == null) {
            return null;
        } else {
            if (root.getElement() == element) {
                return root;
            } else {
                if (root.getElement() < element) {
                    return searchNodo(root.getRightSon(), element);
                } else{
                    return searchNodo(root.getLeftSon(), element);
                }
            }
        }
    }
    
    public void insertNodoRecursive(Nodo root,int element,Nodo father){
        Nodo newNodo = new Nodo(element);
        if (root == null) {
            root = newNodo;
            newNodo.setFather(father);
            
        } else {
            if (root.getElement() > element) {
                insertNodoRecursive(root.getLeftSon(), element, root);
            } else {
                insertNodoRecursive(root.getRightSon(), element, root);
            }
        }
    }
    
    public void insertNodo(Nodo root,int element){
        Nodo newNodo = new Nodo(element);
        Nodo aux = root;
        if (isEmpty()) {
            setRoot(newNodo);
        } else {
            while (true) {
                if (aux.getElement() > element) {
                    if (aux.getLeftSon() == null) {
                        aux.setLeftSon(newNodo);
                        newNodo.setFather(aux);
                        break;
                    } else {
                        aux = aux.getLeftSon();
                    }
                } else {
                    if (aux.getRightSon() == null) {
                        aux.setRightSon(newNodo);
                        newNodo.setFather(aux);
                        break;
                    } else {
                        aux = aux.getRightSon();
                    }
                }
            }
        }
    }
    
    public void deleteNodo(Nodo root, int element){
        if (root == null) {
            System.out.println("The Node was not found");
        } else {
            if (root.getElement() == element) {
                if (root.getLeftSon() == null && root.getRightSon() == null) {
                    // Es una Hoja
                    if (root.getFather().getLeftSon().getElement() == element) {
                        root.getFather().setLeftSon(null);
                    } else {
                        root.getFather().setRightSon(null);
                    }
                    root.setFather(null);
                } else if(root.getLeftSon() == null) {
                    // Solo Tiene hijo derecho
                } else if(root.getRightSon()== null) {
                    // Solo Tiene hijo izquierdo
                } else {
                    // Tiene dos hijos
                }
            } else if (root.getElement() < element) {
                deleteNodo(root.getRightSon(), element);
            } else {
                deleteNodo(root.getLeftSon(), element);
            }
        }
        
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
}
