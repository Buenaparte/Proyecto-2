package Clases;

public class Habitacion {
  private int numero;
  private int piso;
  private String tipo;
  private Cliente cliente;

    public Habitacion(int numero, int piso, String tipo, Cliente cliente) {
        this.numero = numero;
        this.piso = piso;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
