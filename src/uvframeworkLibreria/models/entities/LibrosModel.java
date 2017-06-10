/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframeworkLibreria.models.entities;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import uvframeworkLibreria.ExamenLibreria;

/**
 *
 * @author Lab7-35
 */
public class LibrosModel {
    
    
         public static void crear( String id ,String nombre, String descripcion, String autor, String editorial ){
        
        Statement st;
        
        try {
            
            st = ExamenLibreria.conn.createStatement(); 
            st.executeUpdate("INSERT INTO usuarios VALUES ('"+id+"','"+nombre+"', '"+descripcion+"', '"+autor+"','"+editorial+"');");
            
        } catch (SQLException ex) {
            Logger.getLogger(LibrosModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
