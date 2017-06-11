/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import uvframework.models.entities.EstudianteEntity;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */
public class AgregarEstudiantesViewController implements Initializable {

    @FXML
    private TextField NombreCompleto;
    @FXML
    private TextField Carrera;

    @FXML
    private void AgregarAlumnosBtnClick() {

        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante.EstudianteNombre = NombreCompleto.getText();
        estudiante.EstudianteCarrera = Carrera.getText();

      EstudianteEntity dbuser = EstudiantesModel.insertarEstudiante(estudiante);
    }
}

/**
 * Initializes the controller class.
 */
@Override
        public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
