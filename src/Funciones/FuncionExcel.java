/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import Clases.Cliente;
import EDD.Lista;
import java.io.FileInputStream;
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
        for (int i = 0; i < 1001; i++) {
            int ci = Integer.parseInt(ReadExcel("reservas", i, 0));
            String nombre = ReadExcel("reservas", i, 1);
            String apellido = ReadExcel("reservas", i, 2);
            String correo = ReadExcel("reservas", i, 3);
            String genero = ReadExcel("reservas", i, 4);
            String tipohab = ReadExcel("reservas", i, 5);
            int tlf = Integer.parseInt(ReadExcel("reservas", i, 6));
            String dateLlegada = ReadExcel("reservas", i, 7);
            String dateSalida = ReadExcel("reservas", i, 7);
            Cliente cliente = new Cliente(nombre, apellido, genero, correo,tipohab,ci, tlf, dateLlegada, dateSalida);
            listaReservas.InsertFinal(cliente);
        }
            
        
        
    }
    
    
    
    
    
}
