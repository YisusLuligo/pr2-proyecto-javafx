package co.edu.uniquindio.cliente.marketplaceapp.service;

import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;

public interface VendedorCrud {
    Vendedor crearVendedor(String nombre,String apellido,String cedula,String direccion,String usuario,String contrasena);

    void actualizarVendedor(String nombre,String apellido,String cedula,String direccion,String usuario,String contrasena);
    void eliminarVendedorCrud(String cedula);
    Vendedor buscarVendedorId(String cedula);
}
