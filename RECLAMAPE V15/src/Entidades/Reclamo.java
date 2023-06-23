/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author brall
 */
public class Reclamo {
    private int area;
    private String asunto;
    private String descripcion;
    public Municipalidad municipalidad;
    public Usuario_Estatal admin;
    public Usuario_Final usuario;   
    
    public final static int INFRAESTRUCTURA = 0;
    public final static int SOCIAL = 1;
    public final static int MEDIOAMBIANTAL = 2; 
    
   
    public Reclamo() {
        usuario = new Usuario_Final();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public String MostrarDatos(){
        
        String nombreEntrada = "";
        switch(area){
             case INFRAESTRUCTURA:
                nombreEntrada = "INFRAESTRUCTURA";
                break;
            case SOCIAL:
                nombreEntrada = "SOCIAL";
                break;
            case MEDIOAMBIANTAL :
                nombreEntrada = "MEDIOAMBIANTAL";
                break;
        }
        
    
        return "NUEVO RECLAMO"+
                "\nAREA : "+nombreEntrada+
                "\nASUNTO : "+this.asunto+
                "\nDESCRIPCION : \n"+
                this.descripcion;
    
    }
    
    
    
    
   
    
}
