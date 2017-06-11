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
import uvframework.models.entities.LibrosModel;
import uvframework.tools.WindowsManager;

/**
 *
 * @author Lab7-35
 */
public class InsertarLibrosViewController implements Initializable{
    
    @FXML private TextField idTxt;
    @FXML private TextField descripcionTxt;
    @FXML private TextField editorialTxt;
    @FXML private TextField autorTxt;
    
    
    @FXML
    private void aceptarbtnclick() {                                           
      //LibrosModel.AgregarLibros( idTxt.getText(), descripcionTxt.getText(),autorTxt.getText(),editorialTxt.getText());
        

// TODO add your handling code here:
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
