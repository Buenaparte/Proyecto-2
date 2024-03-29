
package EDD;

import Clases.ClienteHistorico;

//arbol
public class Lista2 {
    private int size;
    private NodoLista2 head;
    private int key;

    public Lista2() {
        this.size = 0;
        this.head = null;
        this.key = 1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public NodoLista2 getHead() {
        return head;
    }

    public void setHead(NodoLista2 head) {
        this.head = head;
    }
    
    public void InsertFinal(ClienteHistorico element){
      NodoLista2 nodo = new NodoLista2(element);
        if (Vacio()){
          setHead(nodo);
        }else{ 
         NodoLista2 aux = getHead();
         while(aux.getSiguiente() != null){
          aux = aux.getSiguiente();
        }
        aux.setSiguiente(nodo);
        }   
     size++;
    }

    public Object DeleteFinal(){
         if (Vacio()){
            System.out.println("No hay nada que eleminar");
        }else{
           NodoLista2 aux = getHead();
           while(aux.getSiguiente().getSiguiente() != null){
            aux = aux.getSiguiente();
           } 
           NodoLista2 aux2 = aux.getSiguiente();
           aux.setSiguiente(null);
           aux2.setSiguiente(null);
           size --;
           return aux2.getElement();
         }
         return null;
    }
    
     
    public ClienteHistorico recorrer(int contador){
      NodoLista2 pointer = getHead();
      int a = 0;
        while (pointer.getSiguiente() != null && a < contador) {
            pointer = pointer.getSiguiente();
            a++;
        }
      return pointer.getElement();
    }
     
    public void print(){
        NodoLista2 pointer = getHead();
        while (pointer != null) {
            System.out.println("[ "+pointer.getElement().getApellido() + " ]");
            pointer = pointer.getSiguiente();
        }
    }
    
    public boolean Vacio(){
     return getHead() == null;
    }
}


