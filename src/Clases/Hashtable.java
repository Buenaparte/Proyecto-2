
package Clases;

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
          int index = Crearindex(cliente.getCedula());
          if (getArray()[index] == null){
           getArray()[index] = cliente;   
          }else{
             System.out.println("se repitio");   
          }
         }             
        } 
     
     public int Crearindex(int cedula){
         int index = 0;
         index = cedula/20000;
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
