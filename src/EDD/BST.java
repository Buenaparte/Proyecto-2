package EDD;

import Clases.ClienteReservas;

public class BST {
    private Nodo root;

    public BST() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
        
    public void insertCedula(ClienteReservas element, Nodo pointer) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            if(element == pointer.getElement()) {
                System.out.println("El elemento no es valido");
                return;
            } else if (element.getCedula() < pointer.getElement().getCedula()) {
                if (pointer.hasLeftSon()) {
                    insertCedula(element, pointer.getLeftSon());
                } else {
                    pointer.setLeftSon(nodo);
                }
            } else {
                if (pointer.hasRightSon()) {
                    insertCedula(element, pointer.getRightSon());
                } else {
                    pointer.setRightSon(nodo);
                }
            }
        }
    }
    
    public void insertSimple(ClienteReservas element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            Nodo pointer = getRoot();
            while (true) {
                if(element == pointer.getElement()) {
                    System.out.println("El elemento no es valido");
                    return;
                } else if (element.getCedula() < pointer.getElement().getCedula()) {
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
    
    public Nodo searchNodoToReplace(Nodo nodo){
        Nodo previous = nodo;
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
    
    public ClienteReservas searchCedula(int element, Nodo raiz){
     if( raiz != null && element != raiz.getElement().getCedula()){
      searchCedula(element,raiz.getLeftSon());
      searchCedula(element,raiz.getRightSon());
     }   
     return raiz.getElement();
    }
    
        public void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println("[ " + raiz.getElement() + " ]");
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
        }
    }
    
    public void postOrden(Nodo raiz) {
        if (raiz != null) {
            postOrden(raiz.getLeftSon());
            postOrden(raiz.getRightSon());
            System.out.println("[ " + raiz.getElement() + " ]");
        }
    }
    
    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.getLeftSon());
            System.out.println("[ " + raiz.getElement() + " ]");
            inOrden(raiz.getRightSon());
        }
    }
    
    public boolean validateLeftSon(Nodo nodo) {
        return nodo.getRightSon() != null;
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }    
}
