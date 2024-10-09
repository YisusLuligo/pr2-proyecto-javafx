package co.edu.uniquindio.cliente.marketplaceapp.model;

import co.edu.uniquindio.cliente.marketplaceapp.model.builder.UsuarioBuilder;

public class Usuario {
    public String nombre;
    public String apellido;
    public String cedula;
    public String direccion;
    public String usuario;
    public String contrasena;

    public Usuario(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }




}