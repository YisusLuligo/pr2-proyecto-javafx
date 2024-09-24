package co.edu.uniquindio.cliente.marketplaceapp.controller;

import co.edu.uniquindio.cliente.marketplaceapp.HelloApplication;
import co.edu.uniquindio.cliente.marketplaceapp.model.Fruit;
import co.edu.uniquindio.cliente.marketplaceapp.service.IMyListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ItemProductoController {

    private Fruit fruit;
    private IMyListener myListener;

    @FXML
    private ImageView txtImagenLabel;

    @FXML
    private Label txtPrecioLabel;

    @FXML
    private Label txtnameLabel;

    @FXML
    private  void click(MouseEvent mouseEvent){
        myListener.onClickListener(fruit);
    }



    public  void  setData(Fruit fruit,IMyListener myListener){
        this.myListener = myListener;
        this.fruit = fruit;
        txtnameLabel.setText(fruit.getNombre());
        txtPrecioLabel.setText(HelloApplication.CURRENCY + fruit.getPrecio());
        Image image = new Image(getClass().getResourceAsStream(fruit.getImagen()));
        txtImagenLabel.setImage(image);

    }

}
