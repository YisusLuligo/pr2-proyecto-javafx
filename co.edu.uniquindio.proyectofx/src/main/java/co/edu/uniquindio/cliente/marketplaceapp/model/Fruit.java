package co.edu.uniquindio.cliente.marketplaceapp.model;

public class Fruit {
    private String nombre;
    private String imagen;
    private double precio;
    private String color;

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
