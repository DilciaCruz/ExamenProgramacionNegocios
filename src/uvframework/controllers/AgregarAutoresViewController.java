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
    private void btnInsertarClick() {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    }    
    
}
