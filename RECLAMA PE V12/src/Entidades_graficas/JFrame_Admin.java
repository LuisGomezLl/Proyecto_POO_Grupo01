/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import Entidades.Notificacion;
import Entidades.Reclamo;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import reclamape.RECLAMAPE;


public class JFrame_Admin extends javax.swing.JFrame {

    private List<Reclamo> reclamos;
    private DefaultListModel<String> modeloListReclamos;
    
    
   
    public JFrame_Admin() {
        initComponents();
        
        this.reclamos = RECLAMAPE.listaDeReclamo;
        modeloListReclamos = new DefaultListModel<>();
        this.lstnotificaciones.setModel(modeloListReclamos);
        buscar("");
   
    }
    
    private void buscar(String criterio){
        this.modeloListReclamos.removeAllElements();
        
        for(Reclamo recla : reclamos){
            if(recla.getAsunto() !=null && recla.getAsunto().contains(criterio)){
                this.modeloListReclamos.addElement(recla.MostrarDatos());
            }
        }
    }
    
    public void agregarNuevoReclamo2(Reclamo recla){
        reclamos.add(recla);
        buscar("");
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstnotificaciones = new javax.swing.JList<>();
        BtnRegresar = new javax.swing.JButton();
        BtnAtenderReclamo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 116, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(lstnotificaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 171, 419, 260));

        BtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 38));

        BtnAtenderReclamo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnAtenderReclamo.setText("ATENDER");
        BtnAtenderReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtenderReclamoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAtenderReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 90, 38));

        btn_buscar.setBackground(new java.awt.Color(204, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 100, 42));

        btn_mostrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_mostrar.setText("MOSTRAR");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 90, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE EL ASUNTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 287, 30));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMINISTRADOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
         //Llamar al JFrame_MenuInicio
        JFrame_MenuInicio pantallaInicio= new JFrame_MenuInicio();
        //Centrar el JFrame
        pantallaInicio.setLocationRelativeTo(this);
        //hacer visible
        pantallaInicio.setVisible(true);
        //hacer visible a la ventana actual
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnAtenderReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtenderReclamoActionPerformed
        
        JFrame_Notifica_Admin llamada = new JFrame_Notifica_Admin();
        llamada.setLocationRelativeTo(null);
        llamada.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BtnAtenderReclamoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscar(txt_buscar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        buscar(txt_buscar.getText());
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        
        int row = lstnotificaciones.getSelectedIndex();
        if(row == -1){
            JOptionPane.showMessageDialog(null,"Seleccione una fila","AVISO",JOptionPane.INFORMATION_MESSAGE);
        
        }
        else{
        
            JOptionPane.showMessageDialog(null,reclamos.get(row).MostrarDatos(),"Mostrar",JOptionPane.PLAIN_MESSAGE);
        
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtenderReclamo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstnotificaciones;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
