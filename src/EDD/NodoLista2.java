
package EDD;

import Clases.ClienteReservas;

public class NodoLista2 {
    private ClienteReservas element;
    private NodoLista2 siguiente;

    public NodoLista2(ClienteReservas element) {
        this.element = element;
        this.siguiente = null;
    }

    public ClienteReservas getElement() {
        return element;
    }

    public NodoLista2 getSiguiente() {
        return siguiente;
    }

    public void setElement(ClienteReservas element) {
        this.element = element;
    }

    public void setSiguiente(NodoLista2 siguiente) {
        this.siguiente = siguiente;
    }
                                                            
    }
