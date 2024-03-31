/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Clases.Cliente;
import Clases.ClienteHistorico;
import Clases.Habitacion;
import EDD.Lista;
import EDD.NodoLista;
import java.io.BufferedReader;
import java.io.File;
import Clases.ClienteReservas;
import EDD.Lista2;
import EDD.NodoLista2;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.ZoneId;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author Contingencia
 */
public class FuncionExcel {
    public String ReadExcel(String sheetName, int rowNumber, int cNumber){
        String data = "";
        try{
            FileInputStream fis = new FileInputStream("./src/Images/Booking_hotel.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet(sheetName);
            Row r = s.getRow(rowNumber);
            Cell c = r.getCell(cNumber);
            switch (c.getCellType()) {
                case STRING:
                    data = c.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(c)) {
                        data = c.getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString();
                    } else {
                        data = String.valueOf((int) c.getNumericCellValue());
                    }
                    break;   
        } 
        }catch (Exception e){
            System.out.println("Archivo invalido");
            e.printStackTrace();
        } 
        return data;
    }
    
    

    public Lista2 LlenarCliente(){
        Lista2 listaReservas = new Lista2();
        for (int i = 1; i < 10; i++) {
            int ci = Integer.parseInt(ReadExcel("reservas", i, 0));
            String nombre = ReadExcel("reservas", i, 1);
            String apellido = ReadExcel("reservas", i, 2);
            String correo = ReadExcel("reservas", i, 3);
            String genero = ReadExcel("reservas", i, 4);
            String tipohab = ReadExcel("reservas", i, 5);
            String tlf = (ReadExcel("reservas", i, 6));
            String dateLlegada = ReadExcel("reservas", i, 7);
            String dateSalida = ReadExcel("reservas", i, 8);
            ClienteReservas cliente = new ClienteReservas(ci,nombre,apellido,correo,genero,tipohab,tlf,dateLlegada,dateSalida);

            //listaReservas.InsertFinal(cliente);
            System.out.println(i);
        }
        listaReservas.print();
       return listaReservas;
    }
    
    
    public void LeerExcelReservas(String path){
        Lista2 listaReservas = new Lista2();
        try {
            File archivo = new File(path);
            FileReader lector = new FileReader(archivo);
            try (java.io.BufferedReader buffer = new BufferedReader(lector)) {
                
                String linea;                  
                buffer.readLine();
                while ((linea = buffer.readLine()) != null ) {
                    String[] datosCliente = linea.split(";");
                    if(datosCliente.length == 9){
                        String ci = datosCliente[0];
                        ci = ci.replace(".", "");
                        String name = datosCliente[1];
                        String lname = datosCliente[2];
                        String correo = datosCliente[3];
                        String genero = datosCliente[4];
                        String tipohab = datosCliente[5];
                        String tlf = datosCliente[6];
                        String datellegada = datosCliente[7];
                        String datesalida = datosCliente[8];
                        if( !ci.equals(" ") &&!name.equals(" ")&& !lname.equals(" ")&& !correo.equals(" ")&& !genero.equals(" ")&& !tipohab.equals(" ")&& !tlf.equals(" ")&& !datellegada.equals(" ")&& !datesalida.equals(" ")){
                            int intCI = Integer.parseInt(ci);
                            ClienteReservas nuevoCliente = new ClienteReservas(intCI,name,lname,correo,genero,tipohab,tlf,datellegada,datesalida);
                            //listaReservas.InsertFinal(nuevoCliente);
                        }
                    }                     
            }                 listaReservas.print();

            }
        }
        catch(IOException ioe) {
            System.out.println("Archivo invalido");
          ioe.printStackTrace();
        }

    }
    
    public void LeerExcelHabitaciones(String path, Lista2 clientes){
        Lista listaHabitaciones = new Lista();
        //ClienteReservas cliente =  clientes.getHead().getElement();
        //NodoLista2 aux = clientes.getHead();
        try {
            File archivo = new File(path);
            FileReader lector = new FileReader(archivo);
            try (java.io.BufferedReader buffer = new BufferedReader(lector)) {
                
                String linea;                  
                buffer.readLine();
                while ((linea = buffer.readLine()) != null ) {
                    String[] datosCliente = linea.split(";");
                    if(datosCliente.length == 3){
                        String num = datosCliente[0];
                        String tipo = datosCliente[1];
                        String piso = datosCliente[2];
                        if(  !num.equals(" ")&& !tipo.equals(" ")&& !piso.equals(" ")){
                            int intNum = Integer.parseInt(num);
                            //cliente = aux.getElement();
                            
                            Habitacion nuevaHabitacion = new Habitacion(intNum,piso,tipo);
                            listaHabitaciones.InsertFinal(nuevaHabitacion);
                            //aux.getSiguiente();
                        }
                    }                     
            }                System.out.println("listo");
                listaHabitaciones.print();

            }
        }
        catch(IOException ioe) {
            System.out.println("Archivo invalido");
          ioe.printStackTrace();
        }

    }
    
    public void LeerExcelHistorico(String path){
        //Cual es la lista de cliente historico
        Lista listaHistorico = new Lista();
        try {
            File archivo = new File(path);
            FileReader lector = new FileReader(archivo);
            try (java.io.BufferedReader buffer = new BufferedReader(lector)) {
                
                String linea;                  
                buffer.readLine();
                while ((linea = buffer.readLine()) != null ) {
                    String[] datosCliente = linea.split(";");
                    if(datosCliente.length == 7){
                        String ci = datosCliente[0];
                        ci = ci.replace(".", "");
                        String name = datosCliente[1];
                        String lname = datosCliente[2];
                        String correo = datosCliente[3];
                        String genero = datosCliente[4];
                        String datellegada = datosCliente[5];
                        String numHab = datosCliente[6];
                        if( !ci.equals(" ") &&!name.equals(" ")&& !lname.equals(" ")&& !correo.equals(" ")&& !genero.equals(" ")&& !datellegada.equals(" ")&& !numHab.equals(" ")){
                            int intCI = Integer.parseInt(ci);
                            int intNumHab = Integer.parseInt(numHab);

                            ClienteHistorico nuevoClienteH = new ClienteHistorico(intCI,name,lname,correo,genero,datellegada,intNumHab);
                            //listaHistorico.InsertFinal(nuevoClienteH);
                        }
                    }                     
                }                 listaHistorico.print();

            }
        }
        catch(IOException ioe) {
            System.out.println("Archivo invalido");
          ioe.printStackTrace();
        }

    }
    
    
    public void LeerExcelEstado(String path){
        //cual es la lista de ClienteEstado
        //Lista listaEstado = new Lista();
        try {
            File archivo = new File(path);
            FileReader lector = new FileReader(archivo);
            try (java.io.BufferedReader buffer = new BufferedReader(lector)) {
                
                String linea;                  
                buffer.readLine();
                while ((linea = buffer.readLine()) != null ) {
                    String[] datosCliente = linea.split(";");
                    if(datosCliente.length == 7){
                        String numHab = datosCliente[0];
                        String name = datosCliente[1];
                        String lname = datosCliente[2];
                        String correo = datosCliente[3];
                        String genero = datosCliente[4];
                        String tlf = datosCliente[5];
                        String datellegada = datosCliente[6];
                        if( !name.equals(" ")&& !lname.equals(" ")&& !correo.equals(" ")&& !genero.equals(" ")&& !datellegada.equals(" ")){
                            //0 significa que no tenia habitacion asignada en el excel
                            if(numHab.equals(" ")){
                                numHab="0";
                            }
                            int intNumHab = Integer.parseInt(numHab);
                            //ClienteEstado nuevoClienteEstado = new ClienteEstado(numHab,name,lname,correo,genero,tlf,datellegada);
                            //listaEstado.InsertFinal(nuevoClienteEstado);
                            
                            
                        }
                    }                     
                }                 //listaEstado.print();

            }
        }
        catch(IOException ioe) {
            System.out.println("Archivo invalido");
          ioe.printStackTrace();
        }

    }
    
    
    
    
}
