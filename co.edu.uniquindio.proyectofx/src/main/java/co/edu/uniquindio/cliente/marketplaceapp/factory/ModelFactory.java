package co.edu.uniquindio.cliente.marketplaceapp.factory;

import co.edu.uniquindio.cliente.marketplaceapp.model.MarketPlace;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;
import co.edu.uniquindio.cliente.marketplaceapp.service.VendedorCrud;

public class ModelFactory implements VendedorCrud {
    private static ModelFactory modelFactory;
    private MarketPlace marketPlace;

    private ModelFactory(){
       inicializarDatos();
    }

    private void inicializarDatos() {
        marketPlace= new MarketPlace();
    }

    public static ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return  modelFactory;
    }

    @Override
    public boolean agregarVendedor(Vendedor vendedor) {
        return marketPlace.agregarVendedor(vendedor);
    }
}
