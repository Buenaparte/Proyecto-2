package Clases;
import java.time.LocalDate;

public class Cliente {
    private String Nombre,Apellido,genero,correo,tipohabitacion;
    private int Cedula,celular,numerohabitacion;
    private LocalDate llegada,salida;

    public Cliente(String Nombre, String Apellido, String genero, String correo,String tipohabitacion,  int Cedula, int celular, int numerohabitacion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.genero = genero;
        this.correo = correo;
        this.tipohabitacion = tipohabitacion;
        this.Cedula = Cedula;
        this.celular = celular;
        this.numerohabitacion = numerohabitacion;
        this.llegada = null;
        this.salida = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public LocalDate getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDate llegada) {
        this.llegada = llegada;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }
        
    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }
  
    public void creacionfechasiniciales(int año, int mes, int dia){
     LocalDate date = LocalDate.of(año, mes, dia);
     setLlegada(date);
    }
    
     public void creacionfechasfinales(int año, int mes, int dia){
     LocalDate date = LocalDate.of(año, mes, dia);
     setSalida(date);
    } 
}
