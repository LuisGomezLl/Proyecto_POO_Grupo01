/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import Entidades.Reclamo;
import reclamape.RECLAMAPE;
import javax.swing.JOptionPane;



/**
 *
 * @author brall
 */
public class JFrame_NuevoReclamo extends javax.swing.JFrame {

    private JFrame_BuscarReclamo padre;
    
    private Reclamo reclamo;

    public Reclamo getReclamo() {
        return reclamo;
    }

    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }
    
    public JFrame_NuevoReclamo(JFrame_BuscarReclamo padre) {
        initComponents();
        this.padre = padre;
        
       
    }

    private void crearNuevoReclamo(){
        
        String areaa=String.valueOf(cbarea.getSelectedIndex());
        String asuntoo=txtasunto.getText();
        String descrip = txtdescripcion.getText();
        
        if(areaa.isEmpty()||asuntoo.isEmpty()||descrip.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Hay campos que faltan rellenar","ATENCIÓN",
                    JOptionPane.INFORMATION_MESSAGE);
        
        }else{
        
            reclamo = new Reclamo();
        
            int area = this.cbarea.getSelectedIndex();  
            reclamo.setArea(area);

            reclamo.setAsunto(txtasunto.getText());
            reclamo.setDescripcion(txtdescripcion.getText());

            this.padre.agregarNuevoReclamo(reclamo);
            JOptionPane.showMessageDialog(null, "El reclamo se ha enviado correctamente");
        
        }
        
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbarea = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        BtnGuardarReclamo = new javax.swing.JButton();
        txtasunto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 116, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO RECLAMO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cbarea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbarea.setForeground(new java.awt.Color(51, 51, 51));
        cbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFRAESTRUCTURA", "SOCIAL", "MEDIOAMBIENTAL" }));
        cbarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbareaActionPerformed(evt);
            }
        });
        jPanel1.add(cbarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 30));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DESCRIPCIÓN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        BtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 110, 50));

        BtnGuardarReclamo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnGuardarReclamo.setText("GUARDAR");
        BtnGuardarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarReclamoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardarReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 110, 50));
        jPanel1.add(txtasunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 30));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ASUNTO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("AREA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setLineWrap(true);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RYZEN3\\Desktop\\RECLAMAPE V10\\src\\Imagenes\\nuevorecla.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 190, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarReclamoActionPerformed

        crearNuevoReclamo();
        padre.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnGuardarReclamoActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

        //Llamar al JFrame_BuscarReclamo
        JFrame_BuscarReclamo pantallaReclamo= new JFrame_BuscarReclamo();
        //Centrar el JFrame
        pantallaReclamo.setLocationRelativeTo(this);
        //hacer visible
        pantallaReclamo.setVisible(true);
        //hacer visible a la ventana actual
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void cbareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbareaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarReclamo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> cbarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtasunto;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
