package co.edu.uniquindio.cliente.marketplaceapp.viewController;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.marketplaceapp.controller.VendedorController;
import co.edu.uniquindio.cliente.marketplaceapp.controller.VendedorCrudController;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VendedorCrudViewController {
    VendedorCrudController vendedorCrudController;
    ObservableList<Vendedor>listaVendedor = FXCollections.observableArrayList();
    Vendedor vendedorSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizarVnededor;

    @FXML
    private Button btnAgregarVendedor;

    @FXML
    private Button btnEliminarVendedor;

    @FXML
    private TableView<Vendedor> tableVendedor;

    @FXML
    private TableColumn<Vendedor, String> tcApellido;

    @FXML
    private TableColumn<Vendedor, String> tcCedula;

    @FXML
    private TableColumn<Vendedor, String> tcContrasena;

    @FXML
    private TableColumn<Vendedor, String> tcDireccion;

    @FXML
    private TableColumn<Vendedor, String> tcNombre;

    @FXML
    private TableColumn<Vendedor, String> tcUsuario;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtContrasena;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btnBurcarVendedor;

    @FXML
    void onBurcarVendedor(ActionEvent event) {
        buscarVendedor();

    }

    private void buscarVendedor() {
        if(txtCedula.getText()!=""){
           Vendedor vendedor= vendedorCrudController.buscarVendedorId(txtCedula.getText());
            txtNombre.setText(vendedor.nombre);
            txtApellido.setText(vendedor.apellido);
            txtCedula.setText(vendedor.cedula);
            txtDireccion.setText(vendedor.direccion);
            txtUsuario.setText(vendedor.usuario);
            txtContrasena.setText(vendedor.contrasena);
        }

    }

    private Vendedor buscarVendedor(String cedula){
        Vendedor vendedor=null;
        for(Vendedor v:listaVendedor){
            if(v.cedula.equalsIgnoreCase(cedula)){
                vendedor=v;
                break;
            }
        }

        return vendedor;
    }




    @FXML
    void onActualizarVendedor(ActionEvent event) {
        actulizarVendedor();
    }

    private void actulizarVendedor() {
        if((txtNombre.getText()!="") && (txtApellido.getText()!="") && (txtCedula.getText()!="")
                && (txtDireccion.getText()!="")
        && (txtUsuario.getText()!="") || (txtContrasena.getText()!="")){
            vendedorCrudController.actualizarVendedor(
                    txtNombre.getText(),
                    txtApellido.getText(),
                    txtCedula.getText(),
                    txtDireccion.getText(),
                    txtUsuario.getText(),
                    txtContrasena.getText());
        }
        /*Vendedor viejo = vendedorSeleccionado
                    Vendedor nuevo=*/
        tableVendedor.getItems().clear();
        listaVendedor.addAll(vendedorCrudController.obtenerVendedores());
    }


    @FXML
    void onAgregarCliente(ActionEvent event) {
        agregarVendedor();
    }

    private void agregarVendedor() {
        Vendedor vendedor = vendedorCrudController.crearVendedor(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtDireccion.getText(), txtUsuario.getText(), txtContrasena.getText());

        listaVendedor.addAll(vendedor);
    }

    @FXML
    void onEliminarVendedor(ActionEvent event) {
        eliminarVendedor();

    }

    private void eliminarVendedor() {
        if((txtNombre.getText()!="") && (txtApellido.getText()!="") && (txtCedula.getText()!="") && (txtDireccion.getText()!="")
                && (txtUsuario.getText()!="") || (txtContrasena.getText()!="")){
            vendedorCrudController.eliminarVendedorCrud(txtCedula.getText());
        }
        tableVendedor.getItems().clear();
        listaVendedor.addAll(vendedorCrudController.obtenerVendedores());
    }

    @FXML
    void initialize() {
        vendedorCrudController = new VendedorCrudController();
        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerVendedores();
        tableVendedor.getItems().clear();
        tableVendedor.setItems(listaVendedor);
        listenerSelection();

    }

    private void obtenerVendedores() {
        listaVendedor.addAll(vendedorCrudController.obtenerVendedores());
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellido));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula));
        tcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion));
        tcUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().usuario));
        tcContrasena.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().contrasena));
    }
    private void listenerSelection() {
        //Sirve la dar la seleccion de la tabla cada que se seleccione se va guardar en una variable cliente seleccionado
        tableVendedor.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vendedorSeleccionado = newSelection;
            //Cada que se seleccione de hace una nueva seleccion y se va mostrar el seleccionado
            mostrarInformacionCliente(vendedorSeleccionado);

        });
    }

    private void mostrarInformacionCliente(Vendedor vendedorSeleccionado) {
        //Verificar que el cliente exista
        if(vendedorSeleccionado !=null){
            //Mostrar en los texFiel los datos que se selecciono
           txtNombre.setText(vendedorSeleccionado.nombre);
           txtApellido.setText(vendedorSeleccionado.apellido);
           txtCedula.setText(vendedorSeleccionado.cedula);
           txtDireccion.setText(vendedorSeleccionado.direccion);
           txtUsuario.setText(vendedorSeleccionado.usuario);
           txtContrasena.setText(vendedorSeleccionado.contrasena);
        }
    }

}

