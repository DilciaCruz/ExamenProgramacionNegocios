/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframeworkLibreria;

import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import uvframeworkLibreria.tools.MySQLConn;
import uvframeworkLibreria.tools.WindowsManager;

/**
 *
 * @author Lab7-35
 */
public class ExamenLibreria extends Application {

    public static Object conn;
    
    
     @Override
    public void start(Stage stage) throws Exception {
        if(MySQLConn.InitConn()){
            WindowsManager.getStage("/agregarlibros").show();
        }else{
            JOptionPane.showMessageDialog(null, "Error Conectando a la DB");
        }
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
   
    

   
    
}
