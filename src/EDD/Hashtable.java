
package EDD;

import Clases.Cliente;

public class Hashtable {
 private Cliente array[];
 private Cliente cliente;

    public Hashtable() {
        this.array = new Cliente [1002];
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
         if (searchSpace()== -1){
         Cliente[] array2 = copyArray();
         array2[array2.length-1] = cliente;
         setArray(array2);
         }else{
          int index = Crearindex(cliente.getNombre(), cliente.getApellido());
          if (getArray()[index] == null){
           getArray()[index] = cliente;   
          }else{
             System.out.println("se repitio");   
          }
         }             
        } 
     
      public int Crearindex(String nombre, String apellido){
         int nombreh = 0;
         int apellidoh = 0;
         int index = 0;
         for (int i = 0; i < nombre.length(); i++) {
          int a = nombre.charAt(i);
          nombreh += a;
         }
         for (int i = 0; i < apellido.length(); i++) {
          int b = apellido.charAt(i);
          apellidoh += b;
         }
         index = nombreh + apellidoh;
         index/= apellidoh/100;
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
