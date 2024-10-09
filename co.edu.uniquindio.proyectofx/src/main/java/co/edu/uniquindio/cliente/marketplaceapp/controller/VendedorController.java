package co.edu.uniquindio.cliente.marketplaceapp.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.marketplaceapp.HelloApplication;
import co.edu.uniquindio.cliente.marketplaceapp.model.Fruit;
import co.edu.uniquindio.cliente.marketplaceapp.model.Persona;
import co.edu.uniquindio.cliente.marketplaceapp.service.IMyListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;


public class VendedorController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox listaVendedores;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cargaVendedores();
        cargaFruits();
    }



    private void cargaVendedores() {
        List<Persona> vendedores = new ArrayList<>(vendedores());
        for(int i = 0; i<vendedores.size(); i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/co/edu/uniquindio/cliente/marketplaceapp/Persona.fxml"));

            try{
                HBox hBox = fxmlLoader.load();
                PersonaController  cic = fxmlLoader.getController();
               // System.out.println(vendedores.get(i));
                cic.setData(vendedores.get(i));
                listaVendedores.getChildren().add(hBox);

            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    private Collection<Persona>vendedores(){
        Collection <Persona>vendedores = new ArrayList<>();
        Persona vendedor = new Persona();
        vendedor.setNombre("Jesus");
        vendedor.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/101010.png");
        vendedores.add(vendedor);

        vendedor = new Persona();
        vendedor.setNombre("Luis");
        vendedor.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/101010.png");
        vendedores.add(vendedor);

        vendedor = new Persona();
        vendedor.setNombre("Alexis");
        vendedor.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/101010.png");
        vendedores.add(vendedor);

        vendedor = new Persona();
        vendedor.setNombre("Ronal");
        vendedor.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/101010.png");
        vendedores.add(vendedor);

        vendedor = new Persona();
        vendedor.setNombre("Luisa");
        vendedor.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/101010.png");
        vendedores.add(vendedor);


        return vendedores;

    }

    //Producto

    @FXML
    private GridPane txtGridProductos;

    @FXML
    private ImageView txtImagenProducto;

    @FXML
    private Label txtNombreProductoLabel;

    @FXML
    private Label txtPrecioProductoLabel;

    @FXML
    private VBox txtProductoElegito;

    @FXML
    private ScrollPane txtScrollProductos;

    //Productos listas

    private List<Fruit> fruits = new ArrayList<>();
    private Image imagen;
    private IMyListener myListener;

    private List<Fruit> getData() {
        List<Fruit> fruits = new ArrayList<>();
        Fruit fruit;

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/grapes.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/cherry.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/grapes.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/cherry.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/mango.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/mango.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/grapes.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);

        fruit = new Fruit();
        fruit.setNombre("Kiwi");
        fruit.setPrecio(2.99);
        fruit.setImagen("/co/edu/uniquindio/cliente/marketplaceapp/values/Imagenes/coconut.png");
        fruit.setColor("6A7324");
        fruits.add(fruit);


        return fruits;
    }

    private void setChosenFruit(Fruit fruit) {
        txtNombreProductoLabel.setText(fruit.getNombre());
        txtPrecioProductoLabel.setText(HelloApplication.CURRENCY + fruit.getPrecio());
        imagen = new Image(getClass().getResourceAsStream(fruit.getImagen()));
        txtImagenProducto.setImage(imagen);
        txtProductoElegito.setStyle("-fx-background-color: #" + fruit.getColor() + ";\n" + "    -fx-background-radius: 30;");
    }
    private void cargaFruits() {
        fruits.addAll(getData());
        if(fruits.size()>0){
            setChosenFruit(fruits.get(0));
            myListener = new IMyListener() {
                @Override
                public void onClickListener(Fruit fruit) {
                    setChosenFruit(fruit);
                }
            };

        }

        int columnas = 0;
        int filas = 1;
        try {
            for(int i = 0; i<fruits.size();i++){
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/co/edu/uniquindio/cliente/marketplaceapp/itemproducto.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemProductoController itemProductoController = fxmlLoader.getController();
                itemProductoController.setData(fruits.get(i),myListener);
                if(columnas == 3){
                    columnas = 0;
                    filas ++;
                }

                txtGridProductos.add(anchorPane,columnas++,filas); //Child, column row
                //set grid width
                txtGridProductos.setMaxWidth(Region.USE_COMPUTED_SIZE);
                txtGridProductos.setPrefWidth(Region.USE_COMPUTED_SIZE);
                txtGridProductos.setMaxWidth(Region.USE_PREF_SIZE);
                //set grid height
                txtGridProductos.setMaxHeight(Region.USE_COMPUTED_SIZE);
                txtGridProductos.setPrefHeight(Region.USE_COMPUTED_SIZE);
                txtGridProductos.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane,new Insets(10));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

