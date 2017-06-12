/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uvframework.models.entities.AutorEntity;
import uvframework.tools.MySQLConn;

/**
 *
 * @author Astrid
 */
public class AutorModel {
    public static AutorEntity insertarAutor(AutorEntity autor) {
        Connection con = MySQLConn.conn;
        try {
            String insertarsql = "INSERT INTO autores(idAutor,nombreAutor,cantidadLibros) VALUES (?,?,?);";
            PreparedStatement pst = MySQLConn.conn.prepareStatement(insertarsql);
            pst.setInt(1, autor.idAutor);
            pst.setString(2, autor.NombreAutor);
            pst.setString(3, autor.cantidadLibros);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar Autor");
        }
        return null;

    }
}
