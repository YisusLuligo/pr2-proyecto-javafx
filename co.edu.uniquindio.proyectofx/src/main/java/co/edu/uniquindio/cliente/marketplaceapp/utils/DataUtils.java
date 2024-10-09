package co.edu.uniquindio.cliente.marketplaceapp.utils;

import co.edu.uniquindio.cliente.marketplaceapp.model.MarketPlace;
import co.edu.uniquindio.cliente.marketplaceapp.model.PrestamoObjeto;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;

public class DataUtils {

    public static PrestamoObjeto inicializarDatos(MarketPlace marketPlace) {
        PrestamoObjeto prestamoObjeto = new PrestamoObjeto();
        Vendedor vendedor = Vendedor.builder()
                .nombre("Jesus")
                .apellido("Luligo")
                .cedula("1010")
                .direccion("Km 5")
                .usuario("Yisus")
                .contrasena("3767")
                .build();

        Vendedor vendedor2 = Vendedor.builder()
                .nombre("Luis")
                .apellido("Ruiz")
                .cedula("4040")
                .direccion("Km 10")
                .usuario("Luixd")
                .contrasena("3030")
                .build();

        prestamoObjeto.getListaVendedor().add(vendedor);
        prestamoObjeto.getListaVendedor().add(vendedor2);
        marketPlace.getVendedores().add(vendedor);
        marketPlace.getVendedores().add(vendedor2);


        return prestamoObjeto;

    }
}
