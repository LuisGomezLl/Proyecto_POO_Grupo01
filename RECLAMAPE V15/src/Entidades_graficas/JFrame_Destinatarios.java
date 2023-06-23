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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lstdestinatario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstdestinatarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstdestinatario);

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USUARIOS REGISTRADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame_Notifica_Admin llamada = new JFrame_Notifica_Admin();
        JFrame_AdminAtender mostrar = new JFrame_AdminAtender(llamada);
        mostrar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstdestinatario;
    // End of variables declaration//GEN-END:variables
}
