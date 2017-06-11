/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframeworkLibreria.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import uvframeworkLibreria.models.entities.LibrosModel;

/**
 *
 * @author Lab7-35
 */
public class InsertarLibrosViewController implements Initializable{
    
    @FXML private TextField idTxt;
    @FXML private TextField nombreTxt;
    @FXML private TextField descripcionTxt;
    @FXML private TextField editorialTxt;
    @FXML private TextField autorTxt;
    
    
    @FXML
    private void aceptarbtn() {                                           
      LibrosModel.AgregarLibros( idTxt.getText(), nombreTxt.getText(), descripcionTxt.getText(),autorTxt.getText(),editorialTxt.getText());
        

// TODO add your handling code here:
    }
    
    
      @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
}
