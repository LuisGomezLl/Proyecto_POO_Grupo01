/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import Entidades.Notificacion;
import javax.swing.JOptionPane;
import reclamape.RECLAMAPE;



public class JFrame_AdminAtender extends javax.swing.JFrame {

    private JFrame_Notifica_Admin padre;
    private Notificacion notificacionn;

    

    public Notificacion getNotificacionn() {
        return notificacionn;
    }

    public void setNotificacionn(Notificacion notificacionn) {
        this.notificacionn = notificacionn;
    }
    
    
    public JFrame_AdminAtender(JFrame_Notifica_Admin padre) {
        initComponents();
        
        this.padre=padre;
        
        
    }

    private void crearNuevaNotificacion(){
        
        
        String encarg = txtencargado.getText();
        String desti = txtdestino1.getText();
        String asuntt = String.valueOf(cmbarea.getSelectedIndex());
        String descrip = txtdescripcion.getText();
        String fechaa = txtfecha.getText();
        
        if(encarg.isEmpty()||desti.isEmpty()||asuntt.isEmpty()||descrip.isEmpty()||fechaa.isEmpty()){
        
            JOptionPane.showMessageDialog(this, "Hay campos que faltan rellenar","ATENCIÓN",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            notificacionn = new Notificacion();
            notificacionn.setEncargado(txtencargado.getText());
            notificacionn.setDestino(txtdestino1.getText());

            int asunt = this.cmbarea.getSelectedIndex();
            notificacionn.setAsunto(asunt);

            notificacionn.setDescripcion(txtdescripcion.getText());
            notificacionn.setFecha(txtfecha.getText());

            this.padre.agregarNuevaNotificacion(notificacionn);
            JOptionPane.showMessageDialog(null, "La confirmación se ha enviado correctamente");
       
        }
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnenviarguardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtencargado = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        cmbarea = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        txtdestino1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 116, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATENDER RECLAMO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 80));

        BtnRegresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 110, 38));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ENCARGADO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DESTINO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 98, 31));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DESCRIPCION");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        btnenviarguardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        btnenviarguardar.setText("ENVIAR CONFIRMACION");
        btnenviarguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnenviarguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, 38));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AREA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 98, 31));

        txtencargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtencargadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtencargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 250, 30));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 30));

        cmbarea.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        cmbarea.setForeground(new java.awt.Color(153, 153, 153));
        cmbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFRAESTRUCTURA", "SOCIAL", "MEDIOAMBIENTAL" }));
        jPanel1.add(cmbarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, 30));

        txtdescripcion.setColumns(20);
        txtdescripcion.setLineWrap(true);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 430, 90));
        jPanel1.add(txtdestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 250, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoadminn.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 190, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtencargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtencargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtencargadoActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        //Llamar al JFrame_Admin
        JFrame_Admin pantallaAdministrador= new JFrame_Admin();
        //Centrar el JFrame
        pantallaAdministrador.setLocationRelativeTo(this);
        //hacer visible
        pantallaAdministrador.setVisible(true);
        //hacer visible a la ventana actual
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void btnenviarguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarguardarActionPerformed
        
        crearNuevaNotificacion();      
        padre.setVisible(true);
        this.dispose();
     
    }//GEN-LAST:event_btnenviarguardarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton btnenviarguardar;
    private javax.swing.JComboBox<String> cmbarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtdestino1;
    private javax.swing.JTextField txtencargado;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}
