/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models.entities;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniela Ordoñez
 */
public class EstudiantesModel {
    
    public static boolean insertarEstudiante(String idEstudiante,String nombreEstudiante,String carreraEstudiante){
    Connection con = EstudiantesModel.con;
        
        try {
            
           String insertsql = "INSERT INTO estudiantes(idEstudiante,nombreEstudiante,carreraEstudiante) VALUES ('"idEstudiante"','"+nombreEstudiante+"',"+carreraEstudiante+");";
        
           Statement st;
           st = con.createStatement();
           st.executeUpdate(insertsql);
            
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
