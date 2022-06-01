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
    
    public Nodo getFather(Nodo nodo) {
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
    
    public void insert(int element,Integer father) {
        Nodo[] sons = new Nodo[1];
        Nodo nodo = new Nodo(element,null,sons);
        if(getRoot() == null) {
            setRoot(nodo);
        } else {
            Nodo temp = searchNodo(getRoot(), father, 0);
            if (temp != null){
                Nodo[] newSons = copySons(temp.getSons());
                temp.setSons(orderSons(newSons, nodo));
            }
        }
    }
    
    public Nodo[] orderSons(Nodo[] newSons, Nodo nodo) {
       Nodo[] copynewSons = new Nodo[newSons.length];
       boolean inserted = false;
       int pos = -1;
        for (int i = 0; i < newSons.length; i++) {
            if (newSons[i] != null) {
                if (!inserted && (int)nodo.getElement() < (int)newSons[i].getElement()) {
                copynewSons[i] = nodo;
                inserted = true;
                pos = i;
                break;
            } else {
                    copynewSons[i] = newSons[i];
                }
            } 
        }
        for (int i = pos; i < copynewSons.length; i++) {
            
            if (i+1 < copynewSons.length){
                copynewSons[i] = newSons[i];
            }
        }
        return copynewSons;
    }
    
    public Nodo[] copySons(Nodo[] sons){
        Nodo[] newSons = new Nodo[sons.length + 1];
        for (int i = 0; i < sons.length; i++) {
            newSons[i] = sons[i];
        }
        return newSons;
    }
    
    public Nodo searchNodo(Nodo root,int element,int pos) {
        Nodo nodo = null;
        if(root != null){
            if((int)root.getElement() == element){
                return root;
            }
            if(pos + 1 <= root.getSons().length) {
                nodo = searchNodo(root.getSons()[pos], element,pos+1);
            }
            if(nodo == null) {
               nodo = searchNodo(root.getRightBrother(), element, pos+1); 
            }
        }
        return nodo;
    }
    
    public void printPreOrden(Nodo root,int pos) {
        if(root != null){
            System.out.println(root.getElement());
            if(pos + 1 <= root.getSons().length) {
                printPreOrden(root.getSons()[pos],pos+1);
            }
            printPreOrden(root.getRightBrother(), pos+1);
        }
        
    }
}
