/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.ni.fcys.programacion2.tableviewfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ni.edu.ni.fcys.programacion2.tableviewfx.controllers.pojo.Producto;

/**
 * FXML Controller class
 *
 * @author Sistemas-10
 */
public class ProductoFXMLController implements Initializable {

    @FXML
    public Spinner<Integer> spCantidad;
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtDescripcion;
    @FXML
    public TextField txtPrecio;
    @FXML
    public TextField txtImagen;
    @FXML
    public Button btnBuscar;
    @FXML
    public TableView<Producto> tblVProducto;
    @FXML
    public TableColumn<Producto, String> tblCID;
    @FXML
    public TableColumn<Producto, String> tblCNombre;
    @FXML
    public TableColumn<Producto, String> tblCDescripcion;
    @FXML
    public TableColumn<Producto, String> tblCCantidad;
    @FXML
    public TableColumn<Producto, String> tblCPrecio;
    @FXML
    public Button btnAgregar;
    @FXML
    public Button btnEliminar;
    
    private ObservableList<Producto> productos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       productos = FXCollections.observableArrayList();
       productos.add(new Producto(1, "CocaCola", "VITAMINA CSM", 15, 6, ""));
       tblCID.setCellValueFactory(new PropertyValueFactory<>("id"));
       tblCNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
       tblCDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
       tblCPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
       tblCCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
       spCantidad.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 1));
       
       tblVProducto.setItems(productos);
    }    

    @FXML
    public void btnBuscarAction(ActionEvent event) {
    }

    @FXML
    public void btnAgregarAction(ActionEvent event) {
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        int cantidad = Integer.parseInt(spCantidad.getValue().toString());
        float precio = Float.parseFloat(txtPrecio.getText());
        int id = 0;
        Producto last = productos.get(productos.size()-1);
        if(last == null){
            id = 1;
        }
        Producto p = new Producto(last.getId()+1, nombre,descripcion, cantidad, precio, "");
        productos.add(p);
    }

    @FXML
    public void btnEliminarAction(ActionEvent event) {
    }
    
}
