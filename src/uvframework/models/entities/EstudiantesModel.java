/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import uvframework.tools.MySQLConn;

/**
 *
 * @author Daniela Ordoñez
 */
public class EstudiantesModel {

    public static boolean insertarEstudiante(EstudianteEntity estudiante) {
        Connection con = MySQLConn.conn;

        try {

            String insertsql = "INSERT INTO estudiantes(nombreEstudiante,carreraEstudiante) VALUES ('?', '?');";
            
            PreparedStatement pst = MySQLConn.conn.prepareStatement(insertsql);

            pst.setString(1, estudiante.EstudianteNombre);
            pst.setString(2, estudiante.EstudianteCarrera);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                EstudianteEntity dbuser = new EstudianteEntity();
                dbuser.EstudianteNombre = rs.getString("nombreEstudiante");
                dbuser.EstudianteCarrera = rs.getString("carreraEstudiante");

                return dbuser;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudiantesModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
