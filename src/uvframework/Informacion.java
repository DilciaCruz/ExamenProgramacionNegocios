/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework;
/**
 *
 * @author USUARIO
 */
public class Informacion {
    private String Grupo;
    private int Integrantes;
    private String Clase;
    private String Carrera;
    private String Catedratico;
    
    public void setGrupo(String Grupo){
        this.Grupo=Grupo;
    }
    public String getGrupo(){
        return Grupo;
    }
    public void setIntegrantes(int Integrantes){
        this.Integrantes=Integrantes;
    }
    public int getIntegrantes(){
        return Integrantes;
    }
    public void setClase(String Clase){
        this.Clase=Clase;
    }
    public String getClase(){
        return Clase;
    }
     public void setCarrera(String Carrera){
        this.Carrera=Carrera;
    }
    public String getCarrera(){
        return Carrera;
    }
     public void setCatedratico(String Catedratico){
        this.Catedratico=Catedratico;
    }
    public String getCatedratico(){
        return Catedratico;
    }
}


