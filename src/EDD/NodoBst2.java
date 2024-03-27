package EDD;

public class NodoBst2 {
 private Lista element;
 private NodoBst2 leftSon, rightSon;

    public NodoBst2(Lista element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public Lista getElement() {
        return element;
    }

    public void setElement(Lista element) {
        this.element = element;
    }

    public NodoBst2 getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoBst2 leftSon) {
        this.leftSon = leftSon;
    }

    public NodoBst2 getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoBst2 rightSon) {
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
