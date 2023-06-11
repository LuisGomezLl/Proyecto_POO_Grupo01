/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades_graficas;

import Entidades.Reclamo;
import reclamape.RECLAMAPE;


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
        
        reclamo = new Reclamo();
        
        int area = this.cbarea.getSelectedIndex();  
        reclamo.setArea(area);
        
        reclamo.setAsunto(txtasunto.getText());
        reclamo.setDescripcion(txtdescripcion.getText());
        
        this.padre.agregarNuevoReclamo(reclamo);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO RECLAMO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        cbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFRAESTRUCTURA", "SOCIAL", "MEDIOAMBIENTAL", " " }));
        jPanel1.add(cbarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 30));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 110, 50));

        BtnGuardarReclamo.setText("GUARDAR");
        BtnGuardarReclamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarReclamoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardarReclamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 390, 110, 50));
        jPanel1.add(txtasunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, 30));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ASUNTO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Imagen)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 270, 240));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("AREA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setLineWrap(true);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void BtnGuardarReclamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarReclamoActionPerformed
        
        crearNuevoReclamo();        
        padre.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtnGuardarReclamoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarReclamo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> cbarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtasunto;
    private javax.swing.JTextArea txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
