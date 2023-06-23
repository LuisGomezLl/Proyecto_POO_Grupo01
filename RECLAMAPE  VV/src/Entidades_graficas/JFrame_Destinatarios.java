/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import Entidades.Usuario;
import java.util.List;
import javax.swing.DefaultListModel;
import reclamape.RECLAMAPE;

/**
 *
 * @author USER
 */
public class JFrame_Destinatarios extends javax.swing.JFrame {

    public JFrame_AdminAtender padre;
    private List<Usuario> usuarios;
    private DefaultListModel<String> modeloListUsuarios;
    
    public JFrame_Destinatarios(JFrame_AdminAtender padre) {
        initComponents();
        this.padre = padre;
        this.usuarios = RECLAMAPE.listausuario;
        modeloListUsuarios = new DefaultListModel<>();
        this.lstdestinatario.setModel(modeloListUsuarios);
        Datos("");
        
    }
    
    private void Datos(String criterio){
        
        this.modeloListUsuarios.removeAllElements();
        
        for(Usuario usu : usuarios){
            if(usu.getNombre()!=null && usu.getNombre().contains(criterio)){
                this.modeloListUsuarios.addElement(usu.MostrarDatos());
            }
        }
    }
    
    public void agregarNuevoRegistro(Usuario usu){
        usuarios.add(usu);
        Datos("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstdestinatario = new javax.swing.JList<>();
        btn_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 116, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstdestinatario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstdestinatarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstdestinatario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 477, 215));

        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 167, 45));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIOS REGISTRADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        JFrame_Notifica_Admin llamada = new JFrame_Notifica_Admin();
        JFrame_AdminAtender mostrar = new JFrame_AdminAtender(llamada);
        mostrar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void lstdestinatarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstdestinatarioMouseClicked
        int indice = lstdestinatario.getSelectedIndex();
        if (indice != -1 && evt.getClickCount() == 2){
            Usuario usu = usuarios.get(indice);
            this.padre.setUsuario(usu);
            padre.setVisible(true);
            this.setVisible(false);
            
            
        }
        
    }//GEN-LAST:event_lstdestinatarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstdestinatario;
    // End of variables declaration//GEN-END:variables
}
