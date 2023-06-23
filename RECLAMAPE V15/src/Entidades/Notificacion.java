/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static Entidades.Reclamo.INFRAESTRUCTURA;
import static Entidades.Reclamo.MEDIOAMBIANTAL;
import static Entidades.Reclamo.SOCIAL;

/**
 *
 * @author brall
 */
public class Notificacion {
    
    private String encargado;
    public Usuario usuario;
    private int asunto;
    private String descripcion;
    private String fecha;  
    public Usuario_Estatal admin;
   

    public Notificacion(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
   
    public final static int INFRAESTRUCTURA = 0;
    public final static int SOCIAL = 1;
    public final static int MEDIOAMBIANTAL = 2; 

    public Notificacion() {
        admin = new Usuario_Estatal();
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getAsunto() {
        return asunto;
    }

    public void setAsunto(int asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String MostrarDatos(){
        
         String nombreEntrada = "";
        switch(asunto){
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
            
        return "NUEVA NOTIFICACION"+
                "\n Encargado : "+this.encargado+ 
                "\n Destino : "+this.getUsuario().getNombre()+
                "\n Asunto : "+nombreEntrada+
                "\n Desripcion : "+this.descripcion+
                "\n Fecha : "+this.fecha;
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
