
package Clases;

import EDD.Hashtable;
import EDD.Lista;
import EDD.Lista2;
import EDD.BST2;
import EDD.BST;

public class Global {
 private Lista listahabitaciones;
 private Lista2 listaprevias;
 private BST arbol;
 private BST2 arbollistas;
 private Hashtable clientesarray;


    public Global() {
        this.listahabitaciones = new Lista();
        this.arbol = new BST();
        this.arbollistas = new BST2();
        this.clientesarray = new Hashtable();
        this.listaprevias = new Lista2();
    }

    public Lista getListahabitaciones() {
        return listahabitaciones;
    }

    public void setListahabitaciones(Lista listahabitaciones) {
        this.listahabitaciones = listahabitaciones;
    }

    public BST getArbol() {
        return arbol;
    }

    public void setArbol(BST arbol) {
        this.arbol = arbol;
    }

    public Hashtable getClientesarray() {
        return clientesarray;
    }

    public void setClientesarray(Hashtable clientesarray) {
        this.clientesarray = clientesarray;
    }

    public Lista2 getListaprevias() {
        return listaprevias;
    }

    public void setListaprevias(Lista2 listaprevias) {
        this.listaprevias = listaprevias;
    }

    public BST2 getArbollistas() {
        return arbollistas;
    }

    public void setArbollistas(BST2 arbollistas) {
        this.arbollistas = arbollistas;
    }
 
   public void llenararbollistas(){
     Lista lista =  new Lista();
     getArbollistas().insertLista(lista, getArbollistas().getRoot());
     int a = 1;
     while (a< 299){
      Lista lista2 = new Lista();
      lista2.setKey(a+ 1);
      getArbollistas().insertLista(lista2, getArbollistas().getRoot()); 
      a++;
     }
   }  
    
   public void busquedacedula(int cedula){
   ClienteReservas cl = this.arbol.searchCedula(cedula, this.arbol.getRoot());
    System.out.println("nombre: "+cl.getNombre()+" Apellido: "+cl.getApellido()+" Email: "+cl.getCorreo()+" genero: "+cl.getGenero()+" Tipo de habitacion: "+cl.getTipohabitacion()+" celular: "+cl.getCelular()+" Llegada: "+cl.getLlegada()+" Salida: "+cl.getSalida());
   }
   
   public void busquedacliente(String nombre, String apellido){
       int index = getClientesarray().Crearindex(nombre, apellido);
       System.out.println(getClientesarray().getArray()[index].getNombre());
   } 
}
