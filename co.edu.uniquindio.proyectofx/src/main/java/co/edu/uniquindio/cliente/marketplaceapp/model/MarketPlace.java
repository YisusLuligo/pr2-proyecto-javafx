package co.edu.uniquindio.cliente.marketplaceapp.model;

import java.util.ArrayList;
import java.util.Collection;

public class MarketPlace {
    private String nombre;
    private Collection<Vendedor>vendedores = new ArrayList<>();
    private Administrador administrador;

    public MarketPlace(String nombre) {
        this.nombre = nombre;
    }
    public MarketPlace(){}

    public String getNombre() {
        return nombre;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public Collection<Vendedor> getVendedores() {
        return vendedores;
    }


    public boolean agregarVendedor(Vendedor vendedor) {
        if (vendedor instanceof Vendedor){
            vendedores.add(vendedor);
            return true;
        }else{
            return false;
        }



    }
}
