/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uvframework.models.entities.EstudianteEntity;
import uvframework.tools.MySQLConn;

/**
 *
 * @author USUARIO
 */
public class EstudiantesModel {

    public static EstudianteEntity insertarEstudiante(EstudianteEntity estudiante) {
        Connection con = MySQLConn.conn;
        try {
            String insertarsql = "INSERT INTO estudiantes(idEstudiante,nombreEstudiante,carreraEstudiante) VALUES (?,?,?);";
            PreparedStatement pst = MySQLConn.conn.prepareStatement(insertarsql);
            pst.setInt(1, estudiante.EstudianteId);
            pst.setString(2, estudiante.EstudianteNombre);
            pst.setString(3, estudiante.EstudianteCarrera);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar estudiante");
        }
        return null;

    }
}
