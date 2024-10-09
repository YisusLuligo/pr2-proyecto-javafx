package co.edu.uniquindio.cliente.marketplaceapp.controller;

import co.edu.uniquindio.cliente.marketplaceapp.factory.ModelFactory;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;

import java.util.List;

public class VendedorCrudController{
    ModelFactory modelFactory;
    public VendedorCrudController(){
        modelFactory = ModelFactory.getInstance();
    }

    public List<Vendedor> obtenerVendedores() {
        return modelFactory.obtenerVendedores();
    }


    public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        return modelFactory.crearVendedor(nombre, apellido, cedula, direccion, usuario, contrasena);
    }

    public void actualizarVendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        modelFactory.actualizarVendedor(nombre,apellido,cedula,direccion,usuario,contrasena);
    }

    public void eliminarVendedorCrud(String cedula) {
        modelFactory.eliminarVendedorCrud(cedula);

    }

    public Vendedor buscarVendedorId(String cedula) {

        return modelFactory.buscarVendedorId(cedula);
    }
}