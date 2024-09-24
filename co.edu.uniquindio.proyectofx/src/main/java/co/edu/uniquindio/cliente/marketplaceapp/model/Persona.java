package co.edu.uniquindio.cliente.marketplaceapp.model;

public class Persona {
    private String nombre;
    private String imagen;
    public Persona(String nombre,String imagen){
        this.nombre = nombre;
        this.imagen = imagen;
    }
    public  Persona(){}

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
