package Clases;

public class ClienteHistorico {
    private String Nombre,Apellido,genero,correo,llegada;
    private int Cedula,numerohabitacion;

    public ClienteHistorico(String Nombre, String Apellido, String genero, String correo,String llegada, int numerohabitacion, int cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.genero = genero;
        this.correo = correo;
        this.llegada = llegada;
        this.Cedula = cedula;
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

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
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
