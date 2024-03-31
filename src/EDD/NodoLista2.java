
package EDD;

import Clases.ClienteHistorico;

public class NodoLista2 {
    private ClienteHistorico element;
    private NodoLista2 siguiente;

    public NodoLista2(ClienteHistorico element) {
        this.element = element;
        this.siguiente = null;
    }

    public ClienteHistorico getElement() {
        return element;
    }

    public NodoLista2 getSiguiente() {
        return siguiente;
    }

    public void setElement(ClienteHistorico element) {
        this.element = element;
    }

    public void setSiguiente(NodoLista2 siguiente) {
        this.siguiente = siguiente;
    }
                                                            
    }
