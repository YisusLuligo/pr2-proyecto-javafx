package co.edu.uniquindio.cliente.marketplaceapp.model;

import co.edu.uniquindio.cliente.marketplaceapp.model.builder.ProductoBuilder;

public class Producto {
    private String nombre;
    private String imagen;
    private String categoria;
    private float precio;
    private EstadoProducto estado;

    public Producto(String nombre, EstadoProducto estado, float precio, String categoria, String imagen) {
        this.nombre = nombre;
        this.estado = estado;
        this.precio = precio;
        this.categoria = categoria;
        this.imagen = imagen;
    }
    public Producto(){}

    public static ProductoBuilder builder(){
        return new ProductoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public EstadoProducto getEstado() {
        return estado;
    }
}
