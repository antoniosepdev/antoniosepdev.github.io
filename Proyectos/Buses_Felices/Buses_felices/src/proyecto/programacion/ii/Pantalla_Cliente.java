package proyecto.programacion.ii;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Pantalla_Cliente extends javax.swing.JFrame {

        conectar_BD con = new conectar_BD();
        Connection cn = con.conexion();
    void mostrar_tabla_cliente(String Valor){
        DefaultTableModel tabla_consulta_cliente;
        tabla_consulta_cliente = new DefaultTableModel();
        
        tabla_consulta_cliente.addColumn("RUT");
        tabla_consulta_cliente.addColumn("Nombre");
        tabla_consulta_cliente.addColumn("Direccion");
        Tabla_Cliente.setModel(tabla_consulta_cliente);
        String sql = "";
        String Datos_cliente[];
        Datos_cliente = new String[3];
        if(Valor.equals("")){
            sql = "SELECT * FROM cliente";
        }else{
            sql = "SELECT * FROM cliente WHERE rut='"+Valor+"'";
        }
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()){
                Datos_cliente[0] = rs.getString(1);
                Datos_cliente[1] = rs.getString(2);
                Datos_cliente[2] = rs.getString(3);
                tabla_consulta_cliente.addRow(Datos_cliente);
            }
            Tabla_Cliente.setModel(tabla_consulta_cliente);
            
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
        }
    }
    void limpiar(){
        txtrutcliente.setText("");
        txtnombrecliente.setText("");
        txtdireccion.setText("");
    }
    
    public Pantalla_Cliente() {
        initComponents();
        mostrar_tabla_cliente("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Cliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrutcliente = new javax.swing.JTextField();
        txtnombrecliente = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
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
        jLabel2.setText("Crear/Consultar Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Tabla_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Cliente);

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

        txtrutcliente.setText("0.000.000-0");
        txtrutcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtrutcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, -1));
        getContentPane().add(txtnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, -1));

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
        jButton4.setText("Modificar cliente");
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
        getContentPane().add(BOTONBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        BOTONTODOSLOSDATOS.setBackground(new java.awt.Color(255, 204, 0));
        BOTONTODOSLOSDATOS.setText("Mostrar clientes");
        BOTONTODOSLOSDATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONTODOSLOSDATOSActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONTODOSLOSDATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel10.setText("Buscar por");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Actualizar cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Borrar cliente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Principal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pantalla_Principal ventana = new Pantalla_Principal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtrutclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutclienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try {
                PreparedStatement creacliente = cn.prepareStatement("INSERT INTO cliente(rut,nombre, direccion) VALUES(?,?,?)");
                creacliente.setString(1, txtrutcliente.getText());
                creacliente.setString(2, txtnombrecliente.getText());
                creacliente.setString(3, txtdireccion.getText());
                creacliente.executeUpdate();
                mostrar_tabla_cliente("");
                JOptionPane.showMessageDialog(null,"Cliente creado.");
                System.out.println("Cliente creado.");
  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.out.println(e.getMessage());
            }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BOTONBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONBUSCARActionPerformed
        mostrar_tabla_cliente(txtbuscar.getText());
    }//GEN-LAST:event_BOTONBUSCARActionPerformed

    private void BOTONTODOSLOSDATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONTODOSLOSDATOSActionPerformed
       mostrar_tabla_cliente("");
    }//GEN-LAST:event_BOTONTODOSLOSDATOSActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        mostrar_tabla_cliente(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila = Tabla_Cliente.getSelectedRow();
        if(fila>=0){
            txtrutcliente.setText(Tabla_Cliente.getValueAt(fila, 0).toString());
            txtnombrecliente.setText(Tabla_Cliente.getValueAt(fila, 1).toString());
            txtdireccion.setText(Tabla_Cliente.getValueAt(fila, 2).toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"Fila no selecionada.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try {
                PreparedStatement creavendedor = cn.prepareStatement("UPDATE cliente SET rut='"+txtrutcliente.getText()+"',nombre='"+txtnombrecliente.getText()+"',direccion='"+txtdireccion.getText()+"' WHERE rut='"+txtrutcliente.getText()+"'");
                creavendedor.executeUpdate();
                JOptionPane.showMessageDialog(null,"Cliente actualizado.");
                System.out.println("Cliente actualizado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());            
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int fila = Tabla_Cliente.getSelectedRow();
        String Valor = Tabla_Cliente.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement creacliente = cn.prepareStatement("DELETE FROM cliente WHERE rut='"+Valor+"'");
                creacliente.executeUpdate();
                JOptionPane.showMessageDialog(null,"Cliente borrado");
                System.out.println("Cliente borrado.");
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
            java.util.logging.Logger.getLogger(Pantalla_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla_Cliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONBUSCAR;
    private javax.swing.JButton BOTONTODOSLOSDATOS;
    private javax.swing.JTable Tabla_Cliente;
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
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtrutcliente;
    // End of variables declaration//GEN-END:variables

}
