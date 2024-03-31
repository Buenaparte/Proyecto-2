package EDD;

import Clases.ClienteReservas;

public class BST {
    private Nodo root;
    private Nodo buscado;

    public Nodo getBuscado() {
        return buscado;
    }

    public void setBuscado(Nodo buscado) {
        this.buscado = buscado;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public void deleteNodo(ClienteReservas element, Nodo pointer, Nodo pointerPrevious) {
        if (isEmpty()) {
            System.out.println("El arbol esta vacio");
        } else {
            if (element.getCedula() < pointer.getElement().getCedula()) {
                deleteNodo(element, pointer.getLeftSon(), pointer);
            } else if (element.getCedula() > pointer.getElement().getCedula()) {
                deleteNodo(element, pointer.getRightSon(), pointer);
            } else {
                if (pointer.isLeaf()) {
                    // Cuando el nodo a eliminar es una hoja
                    if (pointerPrevious == null) {
                        setRoot(null);
                    } else {
                        if (element.getCedula() < pointerPrevious.getElement().getCedula()) {
                            pointerPrevious.setLeftSon(null);
                        } else {
                            pointerPrevious.setRightSon(null);
                        }
                    }
                } else if (pointer.hasOnlyLeftSon()) {
                    // Cuando el nodo a eliminar tiene solo un hijo izq
                    if (pointerPrevious == null) {
                        setRoot(pointer.getLeftSon());
                    } else {
                        if (element.getCedula() < pointerPrevious.getElement().getCedula()) {
                            pointerPrevious.setLeftSon(pointer.getLeftSon());
                        } else {
                            pointerPrevious.setRightSon(pointer.getLeftSon());
                        }
                    }
                }  else if (pointer.hasOnlyRightSon()) {
                    // Cuando el nodo a eliminar tiene solo un hijo der
                    if (pointerPrevious == null) {
                        setRoot(pointer.getRightSon());
                    } else {
                        if (element.getCedula() < pointerPrevious.getElement().getCedula()) {
                            pointerPrevious.setLeftSon(pointer.getRightSon());
                        } else {
                            pointerPrevious.setRightSon(pointer.getRightSon());
                        }
                    }
                } else {
                    // Cuando el nodo a eliminar tiene dos hijos
                    boolean hasRightSons = validateLeftSon(pointer.getLeftSon());
                    Nodo temp = (hasRightSons) ? searchNodoToReplace(pointer.getLeftSon()) : pointer.getLeftSon();
                    if (pointerPrevious == null) {
                        temp.setLeftSon(getRoot().getLeftSon());
                        temp.setRightSon(getRoot().getRightSon());
                        setRoot(temp);
                    } else {
                        temp.setLeftSon(pointer.getLeftSon());
                        temp.setRightSon(pointer.getRightSon());
                        if (element.getCedula() < pointerPrevious.getElement().getCedula()) {
                            pointerPrevious.setLeftSon(temp);
                        } else {
                            pointerPrevious.setRightSon(temp);
                        }
                    }
                }
            }
        }
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
    
    public void searchCedula(int element, Nodo raiz){
        if(this.getRoot().getElement().getCedula() == element){
           this.setBuscado(this.getRoot());
        }
        if( raiz.getLeftSon() != null && raiz.getLeftSon().getElement().getCedula() == element){
         this.setBuscado(raiz.getLeftSon());
     } else if( raiz.getRightSon() != null && raiz.getRightSon().getElement().getCedula() == element){
         this.setBuscado(raiz.getRightSon());
     }else if (raiz != null){
          
          if(raiz.getLeftSon() != null){
           searchCedula(element,raiz.getLeftSon());    
          }
         if(raiz.getRightSon() != null){
           searchCedula(element,raiz.getRightSon());  
         }
      }
    }
    
        public void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println("[ " + raiz.getElement().getCedula() + " ]");
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
