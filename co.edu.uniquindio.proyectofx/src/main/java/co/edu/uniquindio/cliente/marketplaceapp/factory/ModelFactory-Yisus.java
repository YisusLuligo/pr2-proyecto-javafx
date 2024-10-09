package co.edu.uniquindio.cliente.marketplaceapp.factory;

import co.edu.uniquindio.cliente.marketplaceapp.model.MarketPlace;
import co.edu.uniquindio.cliente.marketplaceapp.model.PrestamoObjeto;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;
import co.edu.uniquindio.cliente.marketplaceapp.service.IModelFactoryService;
import co.edu.uniquindio.cliente.marketplaceapp.service.VendedorCrud;
import co.edu.uniquindio.cliente.marketplaceapp.utils.DataUtils;

import java.util.List;

public class ModelFactory implements VendedorCrud, IModelFactoryService {
    private static ModelFactory modelFactory;
    private MarketPlace marketPlace;
    PrestamoObjeto prestamoObjeto;

    private ModelFactory(){
       inicializarDatos();
    }

    private void inicializarDatos() {
        marketPlace= new MarketPlace();
        prestamoObjeto = new PrestamoObjeto();
        prestamoObjeto = DataUtils.inicializarDatos(marketPlace);
    }

    public static ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return  modelFactory;
    }


    @Override
    public List<Vendedor> obtenerVendedores() {
        return prestamoObjeto.getListaVendedor();
    }

    @Override
    public Vendedor crearVendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        Vendedor vendedor = marketPlace.crearVendedor(nombre,apellido,cedula,direccion,usuario,contrasena);
        return vendedor;
    }

    @Override
    public void actualizarVendedor(String nombre, String apellido, String cedula, String direccion, String usuario, String contrasena) {
        marketPlace.actualizarVendedor(nombre,apellido,cedula,direccion,usuario,contrasena);

    }

    @Override
    public void eliminarVendedorCrud(String cedula) {
        marketPlace.eliminarVendedorCrud(cedula);
    }

    @Override
    public Vendedor buscarVendedorId(String cedula) {

        return marketPlace.buscarVendedorId(cedula);
    }


}
