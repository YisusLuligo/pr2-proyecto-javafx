module co.edu.uniquindio.cliente.marketplaceapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.cliente.marketplaceapp to javafx.fxml;
    exports co.edu.uniquindio.cliente.marketplaceapp;

    opens co.edu.uniquindio.cliente.marketplaceapp.controller;
    exports co.edu.uniquindio.cliente.marketplaceapp.controller;

    opens co.edu.uniquindio.cliente.marketplaceapp.viewController;
    exports co.edu.uniquindio.cliente.marketplaceapp.viewController;

}