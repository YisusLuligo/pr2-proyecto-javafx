package co.edu.uniquindio.cliente.marketplaceapp.controller;

import co.edu.uniquindio.cliente.marketplaceapp.model.Persona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonaController implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView txtImagen;

    @FXML
    private Label txtNombre;

    public void setData(Persona persona){
        Image imProfile = new Image(getClass().getResourceAsStream(persona.getImagen()));
        txtImagen.setImage(imProfile);

        txtNombre.setText(persona.getNombre());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
