/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import uvframework.models.AutorModel;
import uvframework.models.entities.AutorEntity;

import uvframework.tools.WindowsManager;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */

public class AgregarAutoresViewController implements Initializable {
  
    /**
     * Initializes the controller class.
     */
        @FXML
    private void btnCancelarClick() {
        WindowsManager.getStage("/agregarAutores").close();
        WindowsManager.getStage("/MenuView.fxml").show();
        
    }
    
     @FXML
    private TextField txtNombreAutor;
    @FXML
    private TextField txtCantidad;
     @FXML
    private void btnInsertarClick() {
      AutorEntity autor = new AutorEntity();

        autor.NombreAutor = txtNombreAutor.getText();
        autor.cantidadLibros = txtCantidad.getText();

        AutorEntity dbuser = AutorModel.insertarAutor(autor);
        JOptionPane.showMessageDialog(null, "Su registro se ha guardado exitosamente en la Base de Datos");
        txtNombreAutor.setText("");
        txtCantidad.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    }    
    
}
