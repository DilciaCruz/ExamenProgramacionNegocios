/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import org.codehaus.jackson.map.ObjectMapper;
import uvframework.tools.MySQLConn;
import uvframework.tools.WindowsManager;

/**
 *
 * @author Lab7-35
 */
public class ExamenLibreria extends Application {

//    public static Object conn;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        testJackson();
      /*  if(MySQLConn.InitConn()){
          //  WindowsManager.getStage("/agregarlibros").show();
            WindowsManager.getStage("/menu").show();
        }else{
            JOptionPane.showMessageDialog(null, "Error Conectando a la DB");
        }*/
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }
   
     public static void testJackson(){
        try {
            Informacion info = new Informacion();
            info.setGrupo("Grupo Jackson");
            info.setIntegrantes(5);
            info.setClase("Programacion de Negocios");
            info.setCarrera("Ingenieria en Sistemas");
            info.setCatedratico("Ing. Rafael Maldonado");
            ObjectMapper mapper = new ObjectMapper();
            String json= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(info);
            System.out.println("SALIDA JSON:\n"+json);
        } catch (IOException ex) {
            Logger.getLogger(ExamenLibreria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    

   
    
}
