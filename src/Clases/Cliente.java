package Clases;

public class Cliente {
    private String Nombre,Apellido,genero,correo,llegada,celular;
    private int numerohabitacion;

    public Cliente(String Nombre, String Apellido, String genero, String correo,String celular,String llegada, int numerohabitacion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.genero = genero;
        this.correo = correo;
        this.celular = celular;
        this.llegada = llegada;
        this.numerohabitacion = numerohabitacion;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }
    
}
