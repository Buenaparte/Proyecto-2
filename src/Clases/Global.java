
package Clases;

import EDD.Hashtable;
import EDD.Lista;
import EDD.Lista2;
import EDD.BST2;
import EDD.BST;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Global {
 private static Lista listahabitaciones;
 private static Lista2 listaprevias;
 private static BST arbol;
 private static BST2 arbollistas;
 private static Hashtable clientesarray; 
 private static File reservations; 
 private static File rooms; 
 private static File historic; 
 private static File status; 
 
    /*public Global() {
           this.listahabitaciones = new Lista();
           this.arbol = new BST();
           this.arbollistas = new BST2();
           this.clientesarray = new Hashtable();
           this.listaprevias = new Lista2();
       }*/

    public static File getReservations() {
        return reservations;
    }

    public static void setReservations(File reservations) {
        Global.reservations = reservations;
    }

    public static File getRooms() {
        return rooms;
    }

    public static void setRooms(File rooms) {
        Global.rooms = rooms;
    }

    public static File getHistoric() {
        return historic;
    }

    public static void setHistoric(File historic) {
        Global.historic = historic;
    }

    public static File getStatus() {
        return status;
    }

    public static void setStatus(File status) {
        Global.status = status;
    }
    
    public static  Lista getListahabitaciones() {
        return listahabitaciones;
    }

    public static void setListahabitaciones(Lista listahabitaciones) {
        Global.listahabitaciones = listahabitaciones;
    }

    public static BST getArbol() {
        return arbol;
    }

    public static void setArbol(BST arbol) {
        Global.arbol = arbol;
    }

    public static Hashtable getClientesarray() {
        return clientesarray;
    }

    public static void setClientesarray(Hashtable clientesarray) {
        Global.clientesarray = clientesarray;
    }

    public static Lista2 getListaprevias() {
        return listaprevias;
    }

    public static void setListaprevias(Lista2 listaprevias) {
        Global.listaprevias = listaprevias;
    }

    public static BST2 getArbollistas() {
        return arbollistas;
    }

    public static void setArbollistas(BST2 arbollistas) {
        Global.arbollistas = arbollistas;
    }
 
   public static BST2 llenararbollistas(){
     Lista2 lista =  new Lista2();
     BST2 bst2 = new BST2();
     bst2.insertLista(lista, bst2.getRoot());
     int a = 1;
     while (a< 300){
      Lista2 lista2 = new Lista2();
      lista2.setKey(a+1);
      bst2.insertLista(lista2, bst2.getRoot()); 
      a++;
     }
     bst2.preOrden2(bst2.getRoot());
     return bst2;
   }  
    
   public void busquedacedula(int cedula){
   ClienteReservas cl = this.arbol.searchCedula(cedula, this.arbol.getRoot());
    System.out.println("nombre: "+cl.getNombre()+" Apellido: "+cl.getApellido()+" Email: "+cl.getCorreo()+" genero: "+cl.getGenero()+" Tipo de habitacion: "+cl.getTipohabitacion()+" celular: "+cl.getCelular()+" Llegada: "+cl.getLlegada()+" Salida: "+cl.getSalida());
   }
   
   public void  busquedacliente(String nombre, String apellido){
       int index = getClientesarray().Crearindex(nombre, apellido);
       System.out.println(getClientesarray().getArray()[index].getNombre());
   } 
   
    public static BST reservations(){
     BST bst = new BST();
     String line = "";
    int count = 0;
    try{
        String path = "./src/CSV/Booking_hotel-Reservas.csv";
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(";");
                ClienteReservas reserva = new ClienteReservas(convertirCedula(values[0]),values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8]);
                //reserva.mostrar();
                bst.insertCedula(reserva, bst.getRoot());
                
            }
            count +=1;
        }
        rd.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de reservaciones" + e);
    }
    return bst;
}
    
    public static void estado(){
     Hashtable ha= new Hashtable();
     String line = "";
    int count = 0;
    try{
        String path = "./src/CSV/Booking_hotel-estado.csv";
        BufferedReader rd = new BufferedReader(new FileReader(path));
        String habprev = "";
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(",");
                if (values[0] == ""){
                    values[0] = habprev;
                }
                habprev = values[0];
                Cliente cliente = new Cliente(Integer.parseInt(values[0]),values[1],values[2],values[3],values[4],values[5],values[6]);
                cliente.mostrar();
                ha.Insert(cliente);   
            }
            count +=1;
        }
        rd.close();
        Global.setClientesarray(ha);
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de Estado" + e);
    }
    Global.setClientesarray(ha);
}
    public static int convertirCedula(String cedulaString) {
        // Reemplazar todos los puntos de la cédula por una cadena vacía
            String cedulaSinPuntos = cedulaString.replace(".", "");

            // Convertir la cadena sin puntos a un número entero
            int cedulaInt = Integer.parseInt(cedulaSinPuntos);

            // Devolver el número entero
            return cedulaInt;
}
    

    public static void historico(){
     BST2 bst2 = Global.llenararbollistas();
     //bst2.preOrden(bst2.getRoot());
     //System.out.println(bst2.getRoot());
    String line = "";
    int count = 0;
    try{
        String path = "./src/CSV/Booking_hotel-Historico.csv";
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(";");
                ClienteHistorico cliente = new ClienteHistorico(convertirCedula(values[0]),values[1],values[2],values[3],values[4],values[5],Integer.parseInt(values[6]));
                //System.out.println(bst2.getRoot());
                bst2.Insertarclientes(cliente, bst2.getRoot());
            }
            count +=1;
        }
        rd.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de Estado" + e);
    }
}
    
    public static void habitaciones(){
     Lista lista = new Lista();
     String line = "";
    int count = 0;
    try{
        String path = "./src/CSV/Booking_hotel-Habitaciones.csv";
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(";");
                Habitacion habitacion = new Habitacion(Integer.parseInt(values[0]), values[1], values[2]);
                lista.InsertFinal(habitacion);
                //lista.print();
                
                //System.out.println(habitacion.getNumero());
            }
            count +=1;
        }
        rd.close();
    Global.setListahabitaciones(lista);
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de habitaciones" + e);
    }
   Global.setListahabitaciones(lista); 
}
    
    

    
}
