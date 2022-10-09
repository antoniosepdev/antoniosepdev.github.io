package proyecto.programacion.ii;
/**
 *
 * @author Sufielron
 */
public class Pantalla_Principal extends javax.swing.JFrame {

    public Pantalla_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonBus = new javax.swing.JButton();
        Botoncliente = new javax.swing.JButton();
        BotonVendedor = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Creditos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setText("Menu Principal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, -1));

        BotonBus.setBackground(new java.awt.Color(255, 255, 0));
        BotonBus.setText("Crear/Modificar/Consultar bus");
        BotonBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 310, -1));

        Botoncliente.setBackground(new java.awt.Color(255, 255, 0));
        Botoncliente.setText("Crear/Modificar/Consultar Cliente");
        Botoncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonclienteActionPerformed(evt);
            }
        });
        getContentPane().add(Botoncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 310, 30));

        BotonVendedor.setBackground(new java.awt.Color(255, 255, 0));
        BotonVendedor.setText("Crear/Modificar/Consultar vendedor");
        BotonVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 310, 30));

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setText("Crear/Consultar Viaje");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 30));

        Creditos.setBackground(new java.awt.Color(255, 153, 0));
        Creditos.setText("Créditos");
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });
        getContentPane().add(Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 80, 30));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setText("Crear/Consultar Pasaje");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 310, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Principal.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusActionPerformed
        Pantalla_Bus ventana2 = new Pantalla_Bus();
        ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonBusActionPerformed

    private void BotonclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonclienteActionPerformed
       Pantalla_Cliente ventana4 = new Pantalla_Cliente();
       ventana4.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BotonclienteActionPerformed

    private void BotonVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVendedorActionPerformed
        Pantalla_Vendedor ventana3 = new Pantalla_Vendedor();
        ventana3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVendedorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Pantalla_Pasaje ventana5 = new Pantalla_Pasaje();
       ventana5.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Pantalla_Viaje ventana6 = new Pantalla_Viaje();
        ventana6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        Pantalla_Creditos ventana = new Pantalla_Creditos();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CreditosActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBus;
    private javax.swing.JButton BotonVendedor;
    private javax.swing.JButton Botoncliente;
    private javax.swing.JButton Creditos;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
