/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Clases.Cliente;
import EDD.Lista;
import java.io.BufferedReader;
import java.io.File;
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
    
    
    public void LlenarCliente(){
        Lista listaReservas = new Lista();
        for (int i = 1; i < 92; i++) {
            int ci = Integer.parseInt(ReadExcel("reservas", i, 0));
            String nombre = ReadExcel("reservas", i, 1);
            String apellido = ReadExcel("reservas", i, 2);
            String correo = ReadExcel("reservas", i, 3);
            String genero = ReadExcel("reservas", i, 4);
            String tipohab = ReadExcel("reservas", i, 5);
            String tlf = (ReadExcel("reservas", i, 6));
            String dateLlegada = ReadExcel("reservas", i, 7);
            String dateSalida = ReadExcel("reservas", i, 8);
            Cliente cliente = new Cliente(nombre, apellido, genero, correo,tipohab,ci, tlf, dateLlegada, dateSalida);
            listaReservas.InsertFinal(cliente);
            System.out.println(i);
        }
        listaReservas.print();
       
    }
    
    
    public void LeerExcelReservas(String path){
        Lista listaReservas = new Lista();
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
                            Cliente nuevoCliente = new Cliente(name, lname,genero,correo,tipohab,intCI,tlf,datellegada,datesalida);
                            listaReservas.InsertFinal(nuevoCliente);
                        }
                    }                     
            }                
                listaReservas.print();

            }
        }
        catch(IOException ioe) {
            System.out.println("Archivo invalido");
          ioe.printStackTrace();
        }

    }
    
    
    
    
    
    
    
}

    


