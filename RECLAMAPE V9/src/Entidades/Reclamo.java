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
    private String asunto;
    private String descripcion;
    public Municipalidad municipalidad;
    public Usuario_Estatal admin;
    public Usuario_Final usuario;   

    public Reclamo() {
        usuario = new Usuario_Final();
    }
    void asignar_usuario_estatal (Usuario_Estatal admin){
        
    }
    
    void asignar_municipalidad(Municipalidad municipalidad){
        
    }
    
    
    

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
