
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
 
    public Global() {
           this.listahabitaciones = new Lista();
           this.arbol = new BST();
           this.arbollistas = new BST2();
           this.clientesarray = new Hashtable();
           this.listaprevias = new Lista2();
       }

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
    
    public  Lista getListahabitaciones() {
        return listahabitaciones;
    }

    public  void setListahabitaciones(Lista listahabitaciones) {
        this.listahabitaciones = listahabitaciones;
    }

    public  BST getArbol() {
        return arbol;
    }

    public  void setArbol(BST arbol) {
        this.arbol = arbol;
    }

    public  Hashtable getClientesarray() {
        return clientesarray;
    }

    public  void setClientesarray(Hashtable clientesarray) {
        this.clientesarray = clientesarray;
    }

    public  Lista2 getListaprevias() {
        return listaprevias;
    }

    public  void setListaprevias(Lista2 listaprevias) {
        this.listaprevias = listaprevias;
    }

    public BST2 getArbollistas() {
        return arbollistas;
    }

    public  void setArbollistas(BST2 arbollistas) {
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

    public static void reservations(){
    String line = "";
    int count = 0;
    try{
        String path = Global.getReservations().getAbsolutePath();
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(",");
                ClienteReservas reserva = new ClienteReservas(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8]);
                //arbol.
                
            }
            count +=1;
        }
        rd.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de reservaciones" + e);
    }
}
    
    public static void estado(){
    String line = "";
    int count = 0;
    try{
        String path = Global.getStatus().getAbsolutePath();
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(",");
                Cliente cliente = new Cliente(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
                System.out.println(cliente);
                //clientesarray.Insert(cliente);   
            }
            count +=1;
        }
        rd.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de Estado" + e);
    }
}
    
    public static void historico(){
    String line = "";
    int count = 0;
    try{
        String path = Global.getHistoric().getAbsolutePath();
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(",");
                ClienteHistorico cliente = new ClienteHistorico(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);
                System.out.println(cliente.getApellido());
            }
            count +=1;
        }
        rd.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de Estado" + e);
    }
}
    
    public static void habitaciones(){
    String line = "";
    int count = 0;
    try{
        String path = Global.getRooms().getAbsolutePath();
        BufferedReader rd = new BufferedReader(new FileReader(path));
        
        while ((line = rd.readLine()) != null){
            if (count > 0){
                String[] values = line.split(",");
                Habitacion habitacion = new Habitacion(values[0], values[1], values[2]);
                //listahabitaciones.InsertFinal(habitacion);
                //listahabitaciones.print();
                
                System.out.println(habitacion.getNumero());
            }
            count +=1;
        }
        rd.close();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Algo esta mal con el archivo de habitaciones" + e);
    }
}
    
    

    
}
