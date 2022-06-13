package trees;

public class Tree {
    private Nodo root;

    public Tree(Nodo root) {
        this.root = root;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public Nodo getSon(Nodo nodo) {
        return nodo.getSons()[0];
    }
    
    public Nodo getBrother(Nodo nodo) {
        return nodo.getRightBrother();
    }
    
    public boolean thereIsBrother(Nodo nodo) {
        return nodo.getRightBrother() != null;
    }
    
    public Object read(Nodo nodo) {
        return nodo.getElement();
    }
    
    public Object getFather(Nodo nodo) {
        return nodo.getFather();
    }
    
    public boolean isLeaf(Nodo nodo) {
        boolean isLeaf = true;
        if(nodo.getSons() == null || nodo.getSons().length == 0 )
            return isLeaf;
        else {
            for (int i = 0; i < nodo.getSons().length; i++) {
                isLeaf = !(nodo.getSons()[i] != null);
                if(!isLeaf){
                    return isLeaf;
                }
            }
        }
        return isLeaf;
    }
    
    public void insertRecursive(Nodo root,String element,String fatherForAdd) {
        Nodo newNodo = new Nodo(element, fatherForAdd);
        
        // Si el padre del nodo que yo quiero agregar es la Raiz
        if (root.getElement().equals(fatherForAdd)) {
            increaseSons(root, newNodo);
        } else {
            // Si el padre del nodo que yo quiero agregar es alguno de los hijos de root
            for (int i = 0; i < root.getSons().length; i++) {
                if (root.getSons()[i].getElement().equals(fatherForAdd)) {
                    // Se coloca el hijo en el padre seleccionado
                    increaseSons(root.getSons()[i], newNodo);
                } else {
                    // Significa que no lo conseguimos en el nivel superior y bajamos al siguiente nivel del arbol
                    insertRecursive(root.getSons()[i], element, fatherForAdd);
                }
            }
        }
    }
    
    public Nodo[] copySons(Nodo[] sons){
        if (sons != null) {
            Nodo[] newSons = new Nodo[sons.length + 1];
            for (int i = 0; i < sons.length; i++) {
                newSons[i] = sons[i];
            }
            return newSons;
        } 
        return new Nodo[1];
    }
    
    public void increaseSons(Nodo root, Nodo nodo){
        Nodo[] newSons = copySons(root.getSons());
        newSons[newSons.length - 1] = nodo;
        root.setSons(newSons);
    }
    
    public void printPreOrden(Nodo root) {
        // Se imprime la Raiz
        System.out.println( " { "+ root.getElement() + " } " );
        for (int i = 0; i < root.getSons().length; i++) {
            // Se imprimen los hijos
            printPreOrden(root.getSons()[i]); 
        }
    }
}
