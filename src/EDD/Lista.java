
package EDD;

import Clases.Cliente;
import EDD.NodoLista;

public class Lista {
    private int size;
    private NodoLista head;
    private int key;

    public Lista() {
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

    public NodoLista getHead() {
        return head;
    }

    public void setHead(NodoLista head) {
        this.head = head;
    }
    
    public void InsertFinal(Cliente element){
      NodoLista nodo = new NodoLista(element);
        if (Vacio()){
          setHead(nodo);
        }else{ 
         NodoLista aux = getHead();
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
           NodoLista aux = getHead();
           while(aux.getSiguiente().getSiguiente() != null){
            aux = aux.getSiguiente();
           } 
           NodoLista aux2 = aux.getSiguiente();
           aux.setSiguiente(null);
           aux2.setSiguiente(null);
           size --;
           return aux2.getElement();
         }
         return null;
    }
    
     
    public void comparacion(){
         
    }
     
    public void print(){
        NodoLista pointer = getHead();
        if (!Vacio()){
            while (pointer != null) {
            System.out.println("[ "+pointer.getElement() + " ]");
            pointer = pointer.getSiguiente();
            }
        }
        else{
            System.out.println("Lista vacia");
        }
    }
    
    public boolean Vacio(){
     return getHead() == null;
    }
}


