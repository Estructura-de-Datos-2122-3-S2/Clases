package trees;

public class Nodo {
    private Object element;
    private Nodo rightBrother;
    private Nodo father;
    private Nodo[] sons;

    public Nodo(Object element, Nodo father, Nodo[] sons) {
        this.element = element;
        this.rightBrother = null;
        this.father = father;
        this.sons = sons;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo getRightBrother() {
        return rightBrother;
    }

    public void setRightBrother(Nodo rightBrother) {
        this.rightBrother = rightBrother;
    }

    public Nodo getFather() {
        return father;
    }

    public void setFather(Nodo father) {
        this.father = father;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    
    
}
