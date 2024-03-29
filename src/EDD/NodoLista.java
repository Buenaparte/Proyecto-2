
package EDD;

import Clases.Habitacion;

public class NodoLista {
    private Habitacion element;
    private NodoLista siguiente;

    public NodoLista(Habitacion element) {
        this.element = element;
        this.siguiente = null;
    }


    public Habitacion getElement() {
        return element;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setElement(Habitacion element) {
        this.element = element;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }
                                                            
    }
