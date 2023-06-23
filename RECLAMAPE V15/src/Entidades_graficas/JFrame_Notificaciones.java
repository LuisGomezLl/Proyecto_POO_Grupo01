/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import java.util.List;
import javax.swing.DefaultListModel;
import Entidades.Notificacion;
import javax.swing.JOptionPane;
import reclamape.RECLAMAPE;


public class JFrame_Notificaciones extends javax.swing.JFrame {

    private List<Notificacion> notificacioness;
    private DefaultListModel<String> modeloListNotificaciones;
    
    
   
    public JFrame_Notificaciones() {
        initComponents();
        
        this.notificacioness = RECLAMAPE.listaDeNotificacion;
        modeloListNotificaciones = new DefaultListModel<>();
        this.lstnotificaciones.setModel(modeloListNotificaciones);
        buscar("");
        
    }

    
    private void buscar(String criterio){
        
        this.modeloListNotificaciones.removeAllElements();
        this.modeloListNotificaciones.removeAllElements();
        
        for(Notificacion noti : notificacioness){
            if(noti.getEncargado()!=null && noti.getEncargado().contains(criterio)){
                this.modeloListNotificaciones.addElement(noti.MostrarDatos());
            }
        }
    }
    
    public void agregarNuevaNotificacion(Notificacion noti){
        notificacioness.add(noti);
        buscar("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnmostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstnotificaciones = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 116, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 41));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOTIFICACIONES GLOBALES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnmostrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmostrar.setText("MOSTRAR");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 330, 90, 41));

        lstnotificaciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstnotificaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 399, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        
        dispose();
        JFrane_Reclamo llamar = new JFrane_Reclamo();
        llamar.setLocationRelativeTo(null);
        llamar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        
        int row = lstnotificaciones.getSelectedIndex();
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Seleccione una fila","AVISO",JOptionPane.INFORMATION_MESSAGE);
        
        }
        else{
        
            JOptionPane.showMessageDialog(null,notificacioness.get(row).MostrarDatos(),"Mostrar",JOptionPane.PLAIN_MESSAGE);
        
        }
        
    }//GEN-LAST:event_btnmostrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstnotificaciones;
    // End of variables declaration//GEN-END:variables
}
