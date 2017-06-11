/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenLibreria.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */
public class InsertarLibrosViewController implements Initializable {

    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField autorTxt;
    @FXML
    private TextField editorialTxt;
    @FXML
    private Button aceptarbtn;
    @FXML
    private TextField idTxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aceptarbtn(ActionEvent event) {
    }
    
}
