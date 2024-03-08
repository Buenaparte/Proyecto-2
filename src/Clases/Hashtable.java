/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Hashtable {
 private Cliente array[];
 private Cliente cliente;

    public Hashtable() {
        this.array = new Cliente [102];
        this.cliente = null;
    }

    public Cliente[] getArray() {
        return array;
    }

    public void setArray(Cliente[] array) {
        this.array = array;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void Insert (Cliente cliente){
       if(isEmpty()){
          getArray()[0] = cliente; 
       }else{
         if (searchSpace()== -1){
         Cliente[] array2 = copyArray();
         array2[array2.length-1] = cliente;
         setArray(array2);
         }else{
          int index = Crearindex(cliente);
          if (getArray()[index] == null){
           getArray()[index] = cliente;   
          }else{
             System.out.println("se repitio");   
          }
         }             
        } 
    }
     
     public int Crearindex(Cliente cliente){
         String nombre = cliente.getNombre();
         int cedula = cliente.getCedula();
         int index = 0;
         for (int i = 0; i < nombre.length(); i++) {
          int a = nombre.charAt(i);
          index += a;
         }
         cedula /= 1000000;
         index /= cedula;
         return index;
     } 
    
     public Cliente[] copyArray() {
        Cliente[] newArray = new Cliente[array.length + 1];
        for (int i = 0; i < getArray().length; i++) {
            newArray[i] = getArray()[i];
        }
        return newArray;
    }
    
     public int searchSpace(){
        for (int i = 0; i < getArray().length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }
     
     public boolean isEmpty() {
        return getArray()[0] == null;
    }
     
}
