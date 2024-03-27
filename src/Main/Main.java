
package Main;

import Clases.Global;
import Funciones.FuncionExcel;
import Clases.Cliente;

public class Main {
    
    public static void main(String[] args) {
    //Cliente cliente = new Cliente("Pedro","P","m","a","t",13764548,1);
    //Hashtable a = new Hashtable();
    //System.out.println(a.Crearindex(cliente));
    Global global = new Global();
    global.llenararbollistas();
    //global.getArbollistas().inOrden(global.getArbollistas().getRoot());
    FuncionExcel func = new FuncionExcel();
    System.out.println(func.ReadExcel("reservas", 1, 2));
    global.setListaprevias(func.LlenarCliente());
        for (int i = 0; i < global.getListaprevias().getSize(); i++) {
           Cliente cl = global.getListaprevias().recorrer(i);
            System.out.println(cl.getApellido());
           global.getClientesarray().Insert(cl);
        }
    global.busquedacliente("Evered", "Ralestone");
    }   
}
