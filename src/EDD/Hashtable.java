
package EDD;

import Clases.Cliente;

public class Hashtable {
 private Cliente array[];
 private Cliente cliente;

    public Hashtable() {
        this.array = new Cliente[10000];
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
          int index = Crearindex(cliente.getNombre(), cliente.getApellido());
          if (getArray()[index] == null){
           getArray()[index] = cliente;   
          }else{
              
              index = Crearindex2(cliente.getNombre(), cliente.getApellido());
              getArray()[index] = cliente; 
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
         return index;
     }
      public int Crearindex2(String nombre, String apellido){
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
         index *=3;
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
