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
import uvframework.models.EstudiantesModel;
import uvframework.models.entities.EstudianteEntity;
import uvframework.models.entities.LibroEntity;
import uvframework.models.LibrosModel;
import uvframework.tools.WindowsManager;

/**
 *
 * @author Lab7-35
 */
public class InsertarLibrosViewController implements Initializable{
    
   // @FXML private TextField idLibro;
    @FXML private TextField libroNombre;
    @FXML private TextField libroFecha;
   
    
    
    @FXML
    private void AgregarLibroBtnClick() {                                           
        
            LibroEntity libro = new LibroEntity();
        
        libro.LibroNombre = libroNombre.getText();
        libro.LibroFecha = libroFecha.getText(); 

      LibroEntity dbuser = LibrosModel.insertarlibro(libro);
      JOptionPane.showMessageDialog(null, "Su registro se ha guardado exitosamente en la Base de Datos");
      libroNombre.setText("");
      libroFecha.setText("");
      WindowsManager.getStage("/agregarLibros").show();
      
    }
    
    
    
       @FXML   
    private void regresarbtnclick() {
        
        WindowsManager.getStage("/agregarLibros").hide();
        WindowsManager.getStage("/menu").show();
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
}
