/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entidades.ConeccionAlLogin;


/**
 *
 * @author RYZEN3
 */
public class JFrame_MenuInicio extends javax.swing.JFrame {

   
    
    public JFrame_MenuInicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario_usu = new javax.swing.JTextField();
        btniniciarsesion = new javax.swing.JButton();
        btnregistrarse = new javax.swing.JButton();
        txt_contraseña_usu = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtusuario_ad = new javax.swing.JTextField();
        txtcontraseña_ad = new javax.swing.JPasswordField();
        btniniciarsesion_ad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(66, 116, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECLAMAPE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bienvenida2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(36, 34, 34));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INGRESO USUARIO");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTRASEÑA");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel4.add(txt_usuario_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 30));

        btniniciarsesion.setBackground(new java.awt.Color(204, 204, 204));
        btniniciarsesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btniniciarsesion.setText("INICIAR SESIÓN");
        btniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesionActionPerformed(evt);
            }
        });
        jPanel4.add(btniniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 30));

        btnregistrarse.setBackground(new java.awt.Color(204, 204, 204));
        btnregistrarse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregistrarse.setText("REGISTRARSE");
        btnregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarseActionPerformed(evt);
            }
        });
        jPanel4.add(btnregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, 30));
        jPanel4.add(txt_contraseña_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 30));

        jTabbedPane2.addTab("USUARIO", jPanel4);

        jPanel2.setBackground(new java.awt.Color(36, 34, 34));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESO ADMINISTRADOR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USUARIO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONTRASEÑA");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel2.add(txtusuario_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 30));
        jPanel2.add(txtcontraseña_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 200, 30));

        btniniciarsesion_ad.setBackground(new java.awt.Color(204, 204, 204));
        btniniciarsesion_ad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btniniciarsesion_ad.setText("INICIAR SESIÓN");
        btniniciarsesion_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesion_adActionPerformed(evt);
            }
        });
        jPanel2.add(btniniciarsesion_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 30));

        jTabbedPane2.addTab("ADMINISTRADOR", jPanel2);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 330, 339));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciarsesion_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesion_adActionPerformed
        
        String usuario= txtusuario_ad.getText();
        String contraseña=txtcontraseña_ad.getText();
        if(usuario.isEmpty() || contraseña.isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Hay campos por rellenar");
            
        }else{
            
            if(usuario.equals("Administrador") && contraseña.equals("4321")){
                
                JOptionPane.showMessageDialog(null, "Bienvenido");
                dispose();
                JFrame_Admin pc = new JFrame_Admin();
                pc.setLocationRelativeTo(null);
                pc.setVisible(true);
            }
            else{
            
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            
            
            }
        
        }
        
    }//GEN-LAST:event_btniniciarsesion_adActionPerformed

    private void btniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesionActionPerformed
        
        String usuario=txt_usuario_usu.getText();
        String contraseña=String.valueOf(txt_contraseña_usu.getPassword());
        if(usuario.isEmpty() || contraseña.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Usuario o contraseña estan vacios","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        
            //hacemos el proceso del login
            
            UsuarioLogin(usuario,contraseña);
            
        }
        
        
    }//GEN-LAST:event_btniniciarsesionActionPerformed

    private void btnregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarseActionPerformed
        
        dispose();
        
        JFrame_Registro r = new JFrame_Registro();
        r.setTitle("Registro De Usuario");
        r.setLocationRelativeTo(null);
        r.setVisible(true);
        
    }//GEN-LAST:event_btnregistrarseActionPerformed

    private void cerrar(){
    
        String botones[]={"SALIR","CANCELAR"};
        int eleccion = JOptionPane.showOptionDialog(this,"¿ESTA SEGURO DE QUE QUIERE SALIR?",
                "MENSAJE",0,0,null,botones,this);
        
        if(eleccion==JOptionPane.YES_OPTION){
        
           System.exit(0);
            
        }else if(eleccion==JOptionPane.NO_OPTION){
        
            System.out.println("Estamos de vuelta");            
        }
        
        
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciarsesion;
    private javax.swing.JButton btniniciarsesion_ad;
    private javax.swing.JButton btnregistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPasswordField txt_contraseña_usu;
    private javax.swing.JTextField txt_usuario_usu;
    private javax.swing.JPasswordField txtcontraseña_ad;
    private javax.swing.JTextField txtusuario_ad;
    // End of variables declaration//GEN-END:variables

    private void UsuarioLogin(String usuario, String contraseña) {
        
        Connection dbconn =ConeccionAlLogin.connectDB();
        if(dbconn != null){
        
        try {
            PreparedStatement st= (PreparedStatement) dbconn.prepareStatement("Select * from datos WHERE usuario = ? AND contraseña = ?");
            
           
            st.setString(1,usuario);
            st.setString(2,contraseña);
            ResultSet res=st.executeQuery();
            if(res.next()){
                
                JOptionPane.showMessageDialog(null, "Bienvenido");
                dispose();
                JFrane_Reclamo d = new JFrane_Reclamo();
                d.setLocationRelativeTo(null);
                d.setVisible(true);
            }
            else{
                System.out.println("Usuario"+usuario);
                System.out.println("Contraseña"+contraseña);
               JOptionPane.showMessageDialog(this, "Usuario o contraseña no encontrados","Error",JOptionPane.ERROR_MESSAGE);
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JFrame_MenuInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
        
        
            System.out.println("la coneccion no es valida ");
        }
        
        
        
        
    }
}
