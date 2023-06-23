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
   
    public Notificacion() {
        admin = new Usuario_Estatal();
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
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
        
        return "NUEVA NOTIFICACION"+
                "\n Encargado : "+this.encargado+ 
                "\n Destino : "+this.getUsuario().getNombre()+      
                "\n Desripcion : "+this.descripcion+
                "\n Fecha : "+this.fecha;
         
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
