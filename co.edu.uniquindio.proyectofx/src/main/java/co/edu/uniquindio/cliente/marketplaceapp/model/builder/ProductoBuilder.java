package co.edu.uniquindio.cliente.marketplaceapp.model.builder;

import co.edu.uniquindio.cliente.marketplaceapp.model.EstadoProducto;
import co.edu.uniquindio.cliente.marketplaceapp.model.Producto;

public class ProductoBuilder {
    protected String nombre;
    protected String imagen;
    protected String categoria;
    protected float precio;
    protected EstadoProducto estado;

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder imagen(String imagen) {
        this.imagen = imagen;
        return this;
    }

    public ProductoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProductoBuilder precio(float precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder estado(EstadoProducto estado) {
        this.estado = estado;
        return this;
    }

    public Producto buil(){
        return new Producto(nombre,estado,precio,categoria,imagen);
    }
}
