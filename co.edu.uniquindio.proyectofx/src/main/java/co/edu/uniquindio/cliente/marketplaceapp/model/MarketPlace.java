package co.edu.uniquindio.cliente.marketplaceapp.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MarketPlace {
    private String nombre;
    private List<Vendedor>vendedores = new ArrayList<>();
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

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public List<Vendedor> getListaVendedor() {
        return vendedores;
    }

    public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        Vendedor vendedorExistene = verificarExistencia(cedula);
        if(vendedorExistene ==null){
            Vendedor vendedor = Vendedor.builder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .cedula(cedula)
                    .direccion(direccion)
                    .usuario(usuario)
                    .contrasena(contrasena)
                    .build();
            vendedores.add(vendedor);

            return vendedor;
        }
        return null;

    }

    private Vendedor verificarExistencia(String cedula) {
        Vendedor vendedorExistente = null;
        for(Vendedor vendedor: getVendedores()){
            if (vendedor.getCedula().equals(cedula)){
                vendedorExistente = vendedor;

                return vendedorExistente;
            }
        }
        return null;
    }

    public void actualizarVendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        // Verificar si el vendedor ya existe
        Vendedor vendedorExistente = verificarExistencia(cedula);

        if (vendedorExistente != null) {
            // Crear una nueva instancia del vendedor utilizando el Builder con los nuevos datos
            Vendedor vendedorActualizado = Vendedor.builder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .cedula(cedula)
                    .direccion(direccion)
                    .usuario(usuario)
                    .contrasena(contrasena)
                    .build();

            // Reemplazar el vendedor existente en la lista
            for (int i = 0; i < vendedores.size(); i++) {
                Vendedor vendedor = vendedores.get(i);
                if (vendedor.getCedula().equals(cedula)) {
                    vendedores.set(i, vendedorActualizado);
                    break;  // Terminar el bucle después de encontrar y actualizar al vendedor
                }
            }
        }
    }

    public void eliminarVendedorCrud(String cedula) {
        Vendedor vendedorExistente = verificarExistencia(cedula);

        if(vendedorExistente != null){
            for(int i=0; i<vendedores.size(); i++){
                Vendedor vendedor= vendedores.get(i);
                if(vendedor.getCedula().equals(cedula)){
                    vendedores.remove(i);
                    break;
                }
            }
        }

    }

    public Vendedor buscarVendedorId(String cedula) {
        Vendedor vendedorExistente = verificarExistencia(cedula);
        if (vendedorExistente != null){
            for (Vendedor vendedor :vendedores){
                if(vendedor.getCedula().equals(cedula)){
                    return vendedor;
                }

            }
        }
        return null;
    }

        /*vendedores.remove(vendedor);
        vendedor.nombre=nombre;
        vendedor.apellido=apellido;
        vendedor.cedula=cedula;
        vendedor.direccion=direccion;
        vendedor.usuario=usuario;
        vendedor.contrasena=contrasena;
        vendedores.add(vendedor);*/
    }





