import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class JDBitacora extends javax.swing.JDialog {
    private Conexion cnx;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JDBitacora.class.getName());

    
    public JDBitacora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void obtenerConexion(Conexion cnx) {
            this.cnx = cnx;
            
            cnx.seleccionar(infante.curps, cbtipo);
            cnx.seleccionar(educador.curps, cbtipo);
            cnx.seleccionar(responsable.curps, cbtipo);
        }
    
    public void obtenerBitacora(bitacora bit){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            // Asignando valores a los componentes de tu interfaz según la imagen
            txfolio.setText(bit.falta);
            txfecha.setText(bit.tiempo); // O si usas fecha actual, ajústalo aquí
            cbtipo.setSelectedItem(bit.tipo);
            txobservaciones.setText(bit.observaciones);
            CBInfante.setSelectedItem(bit.infantes_curp);
            DBResponsable.setSelectedItem(bit.responsables_curpr);
            CBEstado.setSelectedItem(bit.educadores_curpe); // o el campo correspondiente a estado
            
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Error al cargar la bitácora", ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txfecha = new javax.swing.JLabel();
        txfolio = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txobservaciones = new javax.swing.JTextArea();
        CBInfante = new javax.swing.JComboBox<>();
        DBResponsable = new javax.swing.JComboBox<>();
        CBEstado = new javax.swing.JComboBox<>();
        BRegistrar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        Bborrar = new javax.swing.JButton();
        bBCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BHoy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("folio");

        jLabel2.setText("fecha");

        jLabel3.setText("tipo");

        jLabel4.setText("infante");

        jLabel5.setText("observaciones");

        jLabel6.setText("responsable");

        jLabel7.setText("estado");

        txfecha.setText("----");

        txfolio.setText("----");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "entrada", "salida" }));

        txobservaciones.setColumns(20);
        txobservaciones.setRows(5);
        jScrollPane1.setViewportView(txobservaciones);

        CBInfante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DBResponsable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo", " " }));

        BRegistrar.setText("REGISTRAR");
        BRegistrar.setAlignmentY(0.1F);
        BRegistrar.addActionListener(this::BRegistrarActionPerformed);

        BActualizar.setText("ACTUALIZAR");
        BActualizar.setAlignmentY(0.1F);
        BActualizar.addActionListener(this::BActualizarActionPerformed);

        Bborrar.setText("BORRAR");
        Bborrar.setAlignmentY(0.1F);

        bBCancelar.setText("CANCELAR");
        bBCancelar.setAlignmentY(0.1F);

        jLabel10.setText("DATOS DE BITACORA");

        BHoy.setText("HOY");
        BHoy.addActionListener(this::BHoyActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txfecha)
                                .addGap(56, 56, 56)
                                .addComponent(BHoy))
                            .addComponent(txfolio)
                            .addComponent(DBResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBInfante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bborrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfolio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfecha)
                    .addComponent(BHoy))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(CBInfante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DBResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRegistrar)
                    .addComponent(BActualizar)
                    .addComponent(Bborrar)
                    .addComponent(bBCancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
      bitacora bit = new bitacora(
            txfolio.getText(),
            txfecha.getText(),
            cbtipo.getSelectedItem().toString(),
            txobservaciones.getText(),
            CBInfante.getSelectedItem().toString(),
            DBResponsable.getSelectedItem().toString(),
            CBEstado.getSelectedItem().toString()
        );
        
        if (bit.insertar(cnx.con) == 1) {
            JOptionPane.showMessageDialog(this, "Bitácora registrada con éxito");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "La bitácora no se pudo registrar");
        }
       
    
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHoyActionPerformed
        
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        txfecha.setText(s.format(new Date()));
        
    }//GEN-LAST:event_BHoyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDBitacora dialog = new JDBitacora(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BHoy;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JButton Bborrar;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBInfante;
    private javax.swing.JComboBox<String> DBResponsable;
    private javax.swing.JButton bBCancelar;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txfecha;
    private javax.swing.JLabel txfolio;
    private javax.swing.JTextArea txobservaciones;
    // End of variables declaration//GEN-END:variables
}
