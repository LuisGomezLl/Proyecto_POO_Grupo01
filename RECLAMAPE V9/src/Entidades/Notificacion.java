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
public class Notificacion {
    private String nombre;
    public Usuario_Estatal admin;
    public Usuario_Final usuario;

    public Notificacion() {
        admin = new Usuario_Estatal();
    }
    
    void asignar_usuario_Final(Usuario_Final usuario){
        
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
