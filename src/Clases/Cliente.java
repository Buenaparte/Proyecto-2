package Clases;
import java.time.LocalDate;

public class Cliente {
    private String Nombre,Apellido,genero,correo;
    private int Cedula,celular;
    private LocalDate llegada,salida;

    public Cliente(String Nombre, String Apellido, String genero, String correo, int Cedula, int celular, LocalDate llegada, LocalDate salida) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.genero = genero;
        this.correo = correo;
        this.Cedula = Cedula;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
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

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }
    
    
}
