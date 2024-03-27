
package EDD;

import Clases.Cliente;

public class NodoLista {
    private Cliente element;
    private NodoLista siguiente;

    public NodoLista(Cliente element) {
        this.element = element;
        this.siguiente = null;
    }

    public Object getElement() {
        return element;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setElement(Cliente element) {
        this.element = element;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
                                                            
    }
