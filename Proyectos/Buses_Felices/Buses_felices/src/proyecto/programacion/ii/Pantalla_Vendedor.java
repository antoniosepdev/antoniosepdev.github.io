package proyecto.programacion.ii;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Pantalla_Vendedor extends javax.swing.JFrame {

        conectar_BD con = new conectar_BD();
        Connection cn = con.conexion();
    
    void mostrar_tabla_vendedor(String Valor){
        DefaultTableModel tabla_consulta_vendedor;
        tabla_consulta_vendedor = new DefaultTableModel();
        tabla_consulta_vendedor.addColumn("RUT");
        tabla_consulta_vendedor.addColumn("Nombre");
        tabla_consulta_vendedor.addColumn("Direccion");
        Tabla_Vendedor.setModel(tabla_consulta_vendedor);
        String sql = "";
        String Datos_vendedor[];
        Datos_vendedor = new String[3];
        if(Valor.equals("")){
            sql = "SELECT * FROM vendedor";
        }else{
            sql = "SELECT * FROM vendedor WHERE rut_vendedor='"+Valor+"'";
        }
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()){
                Datos_vendedor[0] = rs.getString(1);
                Datos_vendedor[1] = rs.getString(2);
                Datos_vendedor[2] = rs.getString(3);
                tabla_consulta_vendedor.addRow(Datos_vendedor);
            }
            Tabla_Vendedor.setModel(tabla_consulta_vendedor);
            
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
        }
    }
    void limpiar(){
        txtrutvendedor.setText("");
        txtnombrevendedor.setText("");
        txtdireccionvendedor.setText("");
    }
    
    public Pantalla_Vendedor() {
        initComponents();
        mostrar_tabla_vendedor("");
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Vendedor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrutvendedor = new javax.swing.JTextField();
        txtnombrevendedor = new javax.swing.JTextField();
        txtdireccionvendedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        BOTONBUSCAR = new javax.swing.JButton();
        BOTONTODOSLOSDATOS = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Crear/Consultar Vendedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Tabla_Vendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Vendedor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 170));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        jLabel3.setText("Tabla vendedores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setText("R.U.T:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jLabel7.setText("Direccion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        txtrutvendedor.setText("0.000.000-0");
        txtrutvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutvendedorActionPerformed(evt);
            }
        });
        getContentPane().add(txtrutvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, -1));
        getContentPane().add(txtnombrevendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));
        getContentPane().add(txtdireccionvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Modificar vendedor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel8.setText("r.u.t:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, -1));

        jLabel9.setText("Crear");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, -1));

        BOTONBUSCAR.setBackground(new java.awt.Color(255, 204, 0));
        BOTONBUSCAR.setText("Buscar");
        BOTONBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        BOTONTODOSLOSDATOS.setBackground(new java.awt.Color(255, 204, 0));
        BOTONTODOSLOSDATOS.setText("Mostrar Vendedores");
        BOTONTODOSLOSDATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONTODOSLOSDATOSActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONTODOSLOSDATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, -1));

        jLabel10.setText("Buscar por");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Actualizar Vendedor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Borrar Vendedor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Principal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pantalla_Principal ventana = new Pantalla_Principal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtrutvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutvendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutvendedorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try {
                PreparedStatement creavendedor = cn.prepareStatement("INSERT INTO vendedor(rut_vendedor,nombre_vendedor, direccion) VALUES(?,?,?)");
                creavendedor.setString(1, txtrutvendedor.getText());
                creavendedor.setString(2, txtnombrevendedor.getText());
                creavendedor.setString(3, txtdireccionvendedor.getText());
                creavendedor.executeUpdate();
                mostrar_tabla_vendedor("");
                JOptionPane.showMessageDialog(null,"Vendedor creado.");
                limpiar();
                System.out.println("Vendedor creado.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BOTONBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONBUSCARActionPerformed
        mostrar_tabla_vendedor(txtbuscar.getText());
    }//GEN-LAST:event_BOTONBUSCARActionPerformed

    private void BOTONTODOSLOSDATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONTODOSLOSDATOSActionPerformed
       mostrar_tabla_vendedor("");
    }//GEN-LAST:event_BOTONTODOSLOSDATOSActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        mostrar_tabla_vendedor(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila = Tabla_Vendedor.getSelectedRow();
        if(fila>=0){
            txtrutvendedor.setText(Tabla_Vendedor.getValueAt(fila, 0).toString());
            txtnombrevendedor.setText(Tabla_Vendedor.getValueAt(fila, 1).toString());
            txtdireccionvendedor.setText(Tabla_Vendedor.getValueAt(fila, 2).toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"Fila no selecionada.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try {
                PreparedStatement creavendedor = cn.prepareStatement("UPDATE vendedor SET rut_vendedor='"+txtrutvendedor.getText()+"',nombre_vendedor='"+txtnombrevendedor.getText()+"',direccion='"+txtdireccionvendedor.getText()+"' WHERE rut_vendedor='"+txtrutvendedor.getText()+"'");
                creavendedor.executeUpdate();
                JOptionPane.showMessageDialog(null,"Vendedor actualizado.");
                System.out.println("Vendedor actualizado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int fila = Tabla_Vendedor.getSelectedRow();
        String Valor = Tabla_Vendedor.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement creavendedor = cn.prepareStatement("DELETE FROM vendedor WHERE rut_vendedor='"+Valor+"'");
                creavendedor.executeUpdate();
                JOptionPane.showMessageDialog(null,"Vendedor borrado");
                System.out.println("Vendedor borrado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla_Vendedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONBUSCAR;
    private javax.swing.JButton BOTONTODOSLOSDATOS;
    private javax.swing.JTable Tabla_Vendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtdireccionvendedor;
    private javax.swing.JTextField txtnombrevendedor;
    private javax.swing.JTextField txtrutvendedor;
    // End of variables declaration//GEN-END:variables

}
