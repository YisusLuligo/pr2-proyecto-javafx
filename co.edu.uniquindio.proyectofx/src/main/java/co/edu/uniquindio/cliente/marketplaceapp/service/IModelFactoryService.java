package co.edu.uniquindio.cliente.marketplaceapp.service;

import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;

import java.util.List;

public interface IModelFactoryService {
    List<Vendedor>obtenerVendedores();
    Vendedor crearVendedor(String nombre,String apellido,String cedula,String direccion,String usuario,String contrasena);
    void actualizarVendedor(String nombre,String apellido,String cedula,String direccion,String usuario,String contrasena);
    void eliminarVendedorCrud(String cedula);

    Vendedor buscarVendedorId(String cedula);
}
