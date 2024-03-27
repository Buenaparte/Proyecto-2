package EDD;

public class BST2 {
    private NodoBst2 root;

    public BST2() {
        this.root = null;
    }

    public NodoBst2 getRoot() {
        return root;
    }

    public void setRoot(NodoBst2 root) {
        this.root = root;
    }
   //revisar codigo algo esta raro     
    public void insertLista(Lista element, NodoBst2 pointer) {
        NodoBst2 nodo = new NodoBst2(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            if(element == pointer.getElement()) {
                System.out.println("El elemento no es valido");
                return;
            } else if (element.getKey() < pointer.getElement().getKey()) {
                if (pointer.hasLeftSon()) {
                    insertLista(element, pointer.getLeftSon());
                } else {
                    pointer.setLeftSon(nodo);
                }
            } else {
                if (pointer.hasRightSon()) {
                    insertLista(element, pointer.getRightSon());
                } else {
                    pointer.setRightSon(nodo);
                }
            }
        }
    }
    
    public void insertSimple(Lista element) {
        NodoBst2 nodo = new NodoBst2(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            NodoBst2 pointer = getRoot();
            while (true) {
                if(element == pointer.getElement()) {
                    System.out.println("El elemento no es valido");
                    return;
                } else if (element.getKey() < pointer.getElement().getKey()) {
                    if (pointer.hasLeftSon()) {
                        pointer = pointer.getLeftSon();
                    } else {
                        pointer.setLeftSon(nodo);
                        break;
                    }
                } else {
                    if (pointer.hasRightSon()) {
                        pointer = pointer.getRightSon();
                    } else {
                        pointer.setRightSon(nodo);
                    }
                }
            }
        }
        
    }
    
    public NodoBst2 searchNodoToReplace(NodoBst2 nodo){
        NodoBst2 previous = nodo;
        while (nodo.getRightSon() != null){
            previous = nodo;
            nodo = nodo.getRightSon();
        }
        previous.setRightSon(null);
        if(nodo.getLeftSon() != null) {
            previous.setRightSon(nodo.getLeftSon());
            nodo.setLeftSon(null);
        }
        
        return nodo;
    }
      
       public Lista searchPrevias(int element, NodoBst2 raiz){
     if( raiz != null && element != raiz.getElement().getKey()){
      searchPrevias(element,raiz.getLeftSon());
      searchPrevias(element,raiz.getRightSon());
     }   
     return raiz.getElement();
    }
       
        public void preOrden(NodoBst2 raiz) {
        if (raiz != null) {
            System.out.println("[ " + raiz.getElement() + " ]");
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
        }
    }
    
    public void postOrden(NodoBst2 raiz) {
        if (raiz != null) {
            postOrden(raiz.getLeftSon());
            postOrden(raiz.getRightSon());
            System.out.println("[ " + raiz.getElement() + " ]");
        }
    }
    
    public void inOrden(NodoBst2 raiz) {
        if (raiz != null) {
            inOrden(raiz.getLeftSon());
            System.out.println("[ " + raiz.getElement() + " ]");
            inOrden(raiz.getRightSon());
        }
    }
    
    public boolean validateLeftSon(NodoBst2 nodo) {
        return nodo.getRightSon() != null;
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }    
}
