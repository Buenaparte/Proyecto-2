package EDD;

import Clases.ClienteReservas;

public class Nodo {
 private ClienteReservas element;
 private Nodo leftSon, rightSon;

    public Nodo(ClienteReservas element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public ClienteReservas getElement() {
        return element;
    }

    public void setElement(ClienteReservas element) {
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
