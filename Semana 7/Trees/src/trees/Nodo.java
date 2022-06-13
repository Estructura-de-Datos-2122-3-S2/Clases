package trees;

public class Nodo {
    private Object element;
    private Nodo rightBrother;
    private Object father;
    private Nodo[] sons;

    
    public Nodo(Object element, Object father) {
        this.element = element;
        this.father = father;
        this.rightBrother = null;
        this.sons = new Nodo[0];
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

    public Object getFather() {
        return father;
    }

    public void setFather(Object father) {
        this.father = father;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
}
