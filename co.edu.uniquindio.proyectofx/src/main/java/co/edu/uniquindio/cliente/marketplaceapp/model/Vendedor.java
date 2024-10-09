package co.edu.uniquindio.cliente.marketplaceapp.model;

import co.edu.uniquindio.cliente.marketplaceapp.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class Vendedor extends Usuario{

    private Collection<Producto>productos = new ArrayList<>();
    private Collection<Vendedor>vendedorAliados = new ArrayList<>();

    public Vendedor(){}

    public Vendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contraseña) {
        super(nombre, apellido, cedula, direccion, usuario, contraseña);
    }

    public static VendedorBuilder builder(){
        return new VendedorBuilder();
    }
    public Collection<Producto> getProductos() {
        return productos;
    }
    public Collection<Vendedor> getVendedorAliados() {
        return vendedorAliados;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contrasena + '\'' +
                '}';
    }
}
