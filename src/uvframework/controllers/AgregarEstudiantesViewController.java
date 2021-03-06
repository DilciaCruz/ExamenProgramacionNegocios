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
import uvframework.tools.WindowsManager;

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
        JOptionPane.showMessageDialog(null, "Su registro se ha guardado exitosamente en la Base de Datos");
        NombreCompleto.setText("");
        Carrera.setText("");

    }

    @FXML
    private void AgregarEstudiantesRegresarBtnClick() {

        WindowsManager.getStage("/agregarEstudiantes").hide();
        WindowsManager.getStage("/menu").show();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
