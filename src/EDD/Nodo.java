package EDD;

import Clases.Cliente;

public class Nodo {
 private Cliente element;
 private Nodo leftSon, rightSon;

    public Nodo(Cliente element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public Cliente getElement() {
        return element;
    }

    public void setElement(Cliente element) {
        this.element = element;
    }

    public Nodo getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Nodo leftSon) {
        this.leftSon = leftSon;
    }

    public Nodo getRightSon() {
        return rightSon;
    }

    public void setRightSon(Nodo rightSon) {
        this.rightSon = rightSon;
    }
    
    
    public boolean isLeaf() {
        return this.leftSon == null && 
            this.rightSon == null; 
    }
    
    public boolean hasOnlyLeftSon() {
        return this.leftSon != null && 
            this.rightSon == null; 
    }
    
    public boolean hasOnlyRightSon() {
        return this.leftSon == null && 
            this.rightSon != null; 
    }
    
    public boolean hasLeftSon() {
        return this.leftSon != null;
    }
    
    public boolean hasRightSon() {
        return this.rightSon != null;
    }   
}
