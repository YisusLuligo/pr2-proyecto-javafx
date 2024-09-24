package co.edu.uniquindio.cliente.marketplaceapp.controller;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.marketplaceapp.factory.ModelFactory;
import co.edu.uniquindio.cliente.marketplaceapp.model.Fruit;
import co.edu.uniquindio.cliente.marketplaceapp.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

public class VendedorCrudController{

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button bntAgregarVendedor;

        @FXML
        private Button bntEliminarVendedor;

        @FXML
        private Button btnActualizarVendedor;

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
        private TextArea txtResultado;

        @FXML
        void onActualizarVendedor(ActionEvent event) {

        }

        @FXML
        void onAgregarVendedor(ActionEvent event) {
           // ModelFactory modelFactory = ModelFactory.getInstance();
            Vendedor vendedor = Vendedor.builder()
                    .nombre(txtNombre.getText())
                    .apellido(txtApellido.getText())
                    .direccion(txtDireccion.getText())
                    .cedula(txtCedula.getText())
                    .usuario(txtUsuario.getText())
                    .contrasena(txtContrasena.getText())
                    .buil();

                txtResultado.setText(vendedor.toString());
            boolean resultado = ModelFactory.getInstance().agregarVendedor(vendedor);
            if (resultado ==true){
                System.out.println("Se agrego");
            }else {
                System.out.println("No se agrego");
            }

        }

        @FXML
        void onEliminarVendedor(ActionEvent event) {

        }


    }

