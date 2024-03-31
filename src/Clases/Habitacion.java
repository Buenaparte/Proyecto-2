package Clases;

public class Habitacion {
  private int numero;
  private String piso;
  private String tipo;

    public Habitacion(int numero, String piso, String tipo) {
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

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
