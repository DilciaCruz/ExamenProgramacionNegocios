/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models;

import java.sql.Connection;
import uvframework.models.entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uvframework.ExamenLibreria;
import uvframework.tools.MySQLConn;
/**
 *
 * @author Lab7-35
 */
public class LibrosModel {
    
     public static LibroEntity insertarlibro(LibroEntity libro) {
        Connection con = MySQLConn.conn;
        try {
            String insertarsql = "INSERT INTO libros(idlibro,descripcionLibro,fechaPublicacion) VALUES (?,?,?);";
            PreparedStatement pst = MySQLConn.conn.prepareStatement(insertarsql);
            pst.setInt(1, libro.IdLibro);
            pst.setString(2, libro.LibroNombre);
            pst.setString(3, libro.LibroFecha);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar libro");
        }
        return null;

    }

  //  public static LibroEntity insertarlibro(LibroEntity libro) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}

