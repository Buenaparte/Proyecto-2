package Clases;

public class Habitacion {
  private int numero;
  private int piso;
  private String tipo;

    public Habitacion(int numero, int piso, String tipo) {
        this.numero = numero;
        this.piso = piso;
        this.tipo = tipo;
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
  
}
