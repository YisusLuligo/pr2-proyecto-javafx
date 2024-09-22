package co.edu.uniquindio.cliente.marketplaceapp.model.builder;

import co.edu.uniquindio.cliente.marketplaceapp.model.Administrador;

public class AdministradorBuilder extends UsuarioBuilder<AdministradorBuilder>{
    public AdministradorBuilder self(){
        return this;
    }

    public Administrador buil(){
        return new Administrador(nombre,apellido,cedula,direccion,usuario,contrasena);
    }
}
