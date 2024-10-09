package co.edu.uniquindio.cliente.marketplaceapp.model.builder;

import co.edu.uniquindio.cliente.marketplaceapp.model.Producto;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;

import java.util.ArrayList;
import java.util.Collection;

public class VendedorBuilder extends UsuarioBuilder<VendedorBuilder>{
    protected Collection<Producto> productos = new ArrayList<>();
    protected Collection<Vendedor>vendedorAliados = new ArrayList<>();

    public VendedorBuilder productos(Collection<Producto> productos) {
        this.productos = productos;
        return this;
    }

    public VendedorBuilder vendedorAliados(Collection<Vendedor> vendedorAliados) {
        this.vendedorAliados = vendedorAliados;
        return this;
    }

    public VendedorBuilder self(){
        return this;
    }


    public Vendedor build(){
        return new Vendedor(nombre,apellido,cedula,direccion,usuario,contrasena);
    }
}
