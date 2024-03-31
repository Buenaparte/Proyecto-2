package Clases;

public class Cliente {
    private String Nombre,Apellido,genero,correo,llegada,celular;
    private int numerohabitacion;

    public Cliente(int numerohabitacion, String Nombre, String Apellido,String correo, String genero, String celular,String llegada) {
        this.numerohabitacion = numerohabitacion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;   
        this.correo = correo;
        this.genero = genero;
        this.celular = celular;
        this.llegada = llegada;
        
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
    public void mostrar(){
        System.out.println("Nombre = " + Nombre+"Apellido = " + Apellido+ "Genero = " + genero+"Correo = " + correo+"llegada = " + llegada+"Celular = " + celular+"numero de hab = " + numerohabitacion );
    }
    
}
