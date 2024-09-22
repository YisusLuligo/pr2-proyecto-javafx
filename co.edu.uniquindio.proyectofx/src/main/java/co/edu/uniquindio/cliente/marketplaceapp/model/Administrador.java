package co.edu.uniquindio.cliente.marketplaceapp.model;

import co.edu.uniquindio.cliente.marketplaceapp.model.builder.AdministradorBuilder;

public class Administrador extends Usuario {

    public Administrador(String nombre, String apellido, String cedula, String direccion, String usuario,
                         String contraseña) {
        super(nombre, apellido, cedula, direccion, usuario, contraseña);
    }

    public static AdministradorBuilder builder(){
        return new AdministradorBuilder();
    }


}