/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reclamape;

import Entidades_graficas.JFrame_MenuInicio;



/**
 *
 * @author RYZEN3
 */
public class RECLAMAPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Incio la ventana principal de gestor de cita
        JFrame_MenuInicio menu_principal =new JFrame_MenuInicio();  //llamar la ventana princal
        menu_principal.setLocationRelativeTo(null); //Para centrar en la ventana 
        menu_principal.setVisible(true); //Hacer visible el formulario
        
        // TODO code application logic here
    }
    
}
