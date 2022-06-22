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
    
    public Nodo insertNodoRecursive(Nodo root,int element,Nodo father){
        Nodo newNodo = new Nodo(element);
        if (isEmpty()) {
            setRoot(newNodo);
        } else {
            if (root == null) {
                newNodo.setFather(father);
                return newNodo;
            } else {
                if (root.getElement() > element) {
                    root.setLeftSon(insertNodoRecursive(root.getLeftSon(), element, root));

                } else {
                    root.setRightSon(insertNodoRecursive(root.getRightSon(), element, root));
                }
            }
        }
        return root;
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
                    if (root.getFather().getLeftSon().getElement() == element) {
                        root.getFather().setLeftSon(root.getRightSon());
                    } else {
                        root.getFather().setRightSon(root.getRightSon());
                    }
                    root.setRightSon(null);
                    root.setFather(null);
                } else if(root.getRightSon()== null) {
                    // Solo Tiene hijo izquierdo
                    if (root.getFather().getLeftSon().getElement() == element) {
                        root.getFather().setLeftSon(root.getLeftSon());
                    } else {
                        root.getFather().setRightSon(root.getLeftSon());
                    }
                    root.setLeftSon(null);
                    root.setFather(null);
                } else {
                    // Tiene dos hijos
                    Nodo nodo = searchMin(root.getRightSon());
                    if (root.getFather().getLeftSon().getElement() == element) {
                        nodo.setLeftSon(root.getLeftSon());
                        if(root.getRightSon().getElement() != nodo.getElement()){
                            nodo.setRightSon(root.getRightSon());
                        }
                        nodo.getFather().setLeftSon(null);
                        nodo.setFather(root.getFather());
                        root.getFather().setLeftSon(nodo);
                    } else {
                        nodo.setLeftSon(root.getLeftSon());
                        if(root.getRightSon().getElement() != nodo.getElement()){
                            nodo.setRightSon(root.getRightSon());
                        }
                        nodo.getFather().setLeftSon(null);
                        nodo.setFather(root.getFather());
                        root.getFather().setRightSon(nodo);
                    }
                    root.setFather(null);
                    root.setLeftSon(null);
                    root.setRightSon(null);
                }
            } else if (root.getElement() < element) {
                deleteNodo(root.getRightSon(), element);
            } else {
                deleteNodo(root.getLeftSon(), element);
            }
        }
        
    }
    
    public Nodo searchMin(Nodo root) {
        while (root.getLeftSon() != null){
            root = root.getLeftSon();
        }
        return root;
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
}
