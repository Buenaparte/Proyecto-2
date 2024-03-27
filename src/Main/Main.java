
package Main;

import Clases.Global;
import Clases.ClienteReservas;
import Funciones.FuncionExcel;

public class Main {
    
    public static void main(String[] args) {
    Global global = new Global();
    global.llenararbollistas();
    //global.getArbollistas().inOrden(global.getArbollistas().getRoot());
    FuncionExcel func = new FuncionExcel();
    System.out.println(func.ReadExcel("reservas", 1, 2));
    global.setListaprevias(func.LlenarCliente());
        for (int i = 0; i < global.getListaprevias().getSize(); i++) {
           ClienteReservas cl = global.getListaprevias().recorrer(i);
           global.getArbol().insertCedula(cl, global.getArbol().getRoot());
            //System.out.println(cl.getApellido());
           //global.getClientesarray().Insert(cl);
        }
      global.busquedacedula(13502927);
    //global.busquedacliente("Evered", "Ralestone");
    }   
}
