package Clases;

public class ClienteReservas {
    private String Nombre,Apellido,genero,correo,tipohabitacion,llegada,salida,celular;
    private int Cedula;

    public ClienteReservas(int Cedula, String Nombre, String Apellido,String correo, String genero,String tipohabitacion,    String celular,String llegada, String salida) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.correo = correo;
        this.genero = genero;
        this.tipohabitacion = tipohabitacion;
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

    public String getSalida() {
        return salida;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }
        
    public void setSalida(String salida) {
        this.salida = salida;
    }
    
   
}
