
package Main;


//relative paths
//"./src/CSV/Booking_hotel-Reservas.csv"
//"./src/CSV/Booking_hotel-Historico.csv"
//"./src/CSV/Booking_hotel-Habitaciones.csv"


import Clases.Global;
import Clases.ClienteReservas;
import Funciones.FuncionExcel;
import Ventanas.V1Inicio;
import org.apache.poi.hemf.record.emfplus.HemfPlusHeader;

public class Main {
    
    public static void main(String[] args) {
        V1Inicio ventana = new V1Inicio();
        ventana.setVisible(true);
        // cliente reserva =  reservacion bst
        
        // cliente = estado
        //cliente historico = historico
        
    /*Global global = new Global();
    global.llenararbollistas();
    //global.getArbollistas().inOrden(global.getArbollistas().getRoot());
    FuncionExcel func = new FuncionExcel();
    System.out.println(func.ReadExcel("reservas", 1, 7));
    //func.LlenarCliente();
    func.LeerExcelReservas("./src/CSV/Booking_hotel-Reservas.csv");
    System.out.println("lleno");
    

    System.out.println(func.ReadExcel("reservas", 1, 2));
    global.setListaprevias(func.LlenarCliente());
        for (int i = 0; i < global.getListaprevias().getSize(); i++) {
           ClienteReservas cl = global.getListaprevias().recorrer(i);
           global.getArbol().insertCedula(cl, global.getArbol().getRoot());
            //System.out.println(cl.getApellido());
           //global.getClientesarray().Insert(cl);
        }
      global.busquedacedula(13502927);
    //global.busquedacliente("Evered", "Ralestone");*/

    }   
}
