package proyecto.programacion.ii;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Pantalla_Pasaje extends javax.swing.JFrame {

        conectar_BD con = new conectar_BD();
        Connection cn = con.conexion();
        String atributo = "folio";   
    
    void mostrar_tabla_pasaje(String Valor){
        DefaultTableModel tabla_consulta_psje;
        tabla_consulta_psje = new DefaultTableModel();

        tabla_consulta_psje.addColumn("Folio");
        tabla_consulta_psje.addColumn("Codigo Viaje");
        tabla_consulta_psje.addColumn("Fecha Venta");
        tabla_consulta_psje.addColumn("R.u.t vendedor");
        tabla_consulta_psje.addColumn("Precio");
        Tabla_Pasaje.setModel(tabla_consulta_psje);
        String sql = "";
        String Datos_psje[];
        Datos_psje = new String[5];
   
        if(Valor.equals("")){
            sql = "SELECT * FROM pasaje";
        }else{
            sql = "SELECT * FROM pasaje WHERE "+atributo+"='"+Valor+"'";
        }
        Statement st;
        try{
            st = cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()){
                Datos_psje[0] = rs.getString(1);
                Datos_psje[1] = rs.getString(2);
                Datos_psje[2] = rs.getString(3);
                Datos_psje[3] = rs.getString(4);
                Datos_psje[4] = rs.getString(5);
                tabla_consulta_psje.addRow(Datos_psje);
            }
            Tabla_Pasaje.setModel(tabla_consulta_psje);
            
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
        }
    }
    void limpiar(){
        txtfolio.setText("");
        txtcodigoviaje.setText("");
        txtfechaventa.setText("");
        txtrutvendedor2.setText("");
        txtprecio.setText("");
    }
    
    public Pantalla_Pasaje() {
        initComponents();
        mostrar_tabla_pasaje("");
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Pasaje = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtfechaventa_cuadrar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtrutvendedor_cuadrar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrutvendedor2 = new javax.swing.JTextField();
        txtfolio = new javax.swing.JTextField();
        txtcodigoviaje = new javax.swing.JTextField();
        txtfechaventa = new javax.swing.JTextField();
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
        txtprecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BOTONBUSCAR1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Crear/Consultar Pasaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Tabla_Pasaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Pasaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 380, 170));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel3.setText("Cuadrar ventas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txtfechaventa_cuadrar.setText("00-00-0000");
        getContentPane().add(txtfechaventa_cuadrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 100, -1));

        jLabel4.setText("Fecha Venta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 20));

        txtrutvendedor_cuadrar.setText("0.000.000-0");
        txtrutvendedor_cuadrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutvendedor_cuadrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtrutvendedor_cuadrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 100, -1));

        jLabel5.setText("Precio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel6.setText("Codigo Viaje:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel7.setText("Fecha Venta:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        txtrutvendedor2.setText("0.000.000-0");
        txtrutvendedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutvendedor2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtrutvendedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, -1));

        txtfolio.setText("0");
        txtfolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfolioActionPerformed(evt);
            }
        });
        getContentPane().add(txtfolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, -1));

        txtcodigoviaje.setText("0000");
        getContentPane().add(txtcodigoviaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, -1));

        txtfechaventa.setText("00-00-0000");
        txtfechaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaventaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfechaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Modificar psje");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel8.setText("por Codigo V:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jLabel9.setText("Crear");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, -1));

        BOTONBUSCAR.setBackground(new java.awt.Color(255, 204, 0));
        BOTONBUSCAR.setText("Listar");
        BOTONBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        BOTONTODOSLOSDATOS.setBackground(new java.awt.Color(255, 204, 0));
        BOTONTODOSLOSDATOS.setText("Mostrar Pasaje");
        BOTONTODOSLOSDATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONTODOSLOSDATOSActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONTODOSLOSDATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 20));

        jLabel10.setText("Listar psjes");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Actualizar psje");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Borrar psje");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        txtprecio.setText("0");
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, -1));

        jLabel11.setText("Folio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel12.setText("Tabla buses");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel13.setText("Rut Vendedor:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel14.setText("Rut Vendedor:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 20));

        BOTONBUSCAR1.setBackground(new java.awt.Color(255, 204, 0));
        BOTONBUSCAR1.setText("Buscar");
        BOTONBUSCAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONBUSCAR1ActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONBUSCAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Principal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pantalla_Principal ventana = new Pantalla_Principal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfolioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

            try {
                
                    PreparedStatement creapsje = cn.prepareStatement("INSERT INTO pasaje(folio, codigo_viaje, fecha_vta, rut_vendedor, precio) VALUES(?,?,?,?,?)");
                    creapsje.setString(1, txtfolio.getText());
                    creapsje.setString(2, txtcodigoviaje.getText());
                    creapsje.setString(3, txtfechaventa.getText());
                    creapsje.setString(4, txtrutvendedor2.getText());
                    creapsje.setString(5, txtprecio.getText());
                    creapsje.executeUpdate();
                    mostrar_tabla_pasaje("");
                       JOptionPane.showMessageDialog(null,"Pasaje creado.");
                       limpiar();
                       System.out.println("Pasaje creado.");
   
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.out.println(e.getMessage());
            }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BOTONBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONBUSCARActionPerformed
        atributo = "codigo_viaje";
        mostrar_tabla_pasaje(txtbuscar.getText());
    }//GEN-LAST:event_BOTONBUSCARActionPerformed

    private void BOTONTODOSLOSDATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONTODOSLOSDATOSActionPerformed
       mostrar_tabla_pasaje("");
    }//GEN-LAST:event_BOTONTODOSLOSDATOSActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        mostrar_tabla_pasaje(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila = Tabla_Pasaje.getSelectedRow();
        if(fila>=0){
            txtfolio.setText(Tabla_Pasaje.getValueAt(fila, 0).toString());
            txtcodigoviaje.setText(Tabla_Pasaje.getValueAt(fila, 1).toString());
            txtfechaventa.setText(Tabla_Pasaje.getValueAt(fila, 2).toString());
            txtrutvendedor2.setText(Tabla_Pasaje.getValueAt(fila, 3).toString());
            txtprecio.setText(Tabla_Pasaje.getValueAt(fila, 4).toString());
        }
        else{
            JOptionPane.showMessageDialog(null,"Fila no selecionada.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try {
                PreparedStatement creapasaje = cn.prepareStatement("UPDATE pasaje SET folio='"+txtfolio.getText()+"',codigo_viaje='"+txtcodigoviaje.getText()+"',fecha_vta='"+txtfechaventa.getText()+"',rut_vendedor='"+txtrutvendedor2.getText()+"', precio='"+txtprecio.getText()+"' WHERE folio='"+txtfolio.getText()+"'");
                creapasaje.executeUpdate();
                JOptionPane.showMessageDialog(null,"Pasaje actualizado.");
                System.out.println("Pasaje actualizado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int fila = Tabla_Pasaje.getSelectedRow();
        String Valor = Tabla_Pasaje.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement creapasaje = cn.prepareStatement("DELETE FROM pasaje WHERE folio='"+Valor+"'");
                creapasaje.executeUpdate();
                JOptionPane.showMessageDialog(null,"Pasaje borrado");
                System.out.println("Pasaje borrado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtrutvendedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutvendedor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutvendedor2ActionPerformed

    private void txtrutvendedor_cuadrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutvendedor_cuadrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutvendedor_cuadrarActionPerformed

    private void BOTONBUSCAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONBUSCAR1ActionPerformed
        atributo = "rut_vendedor";
        mostrar_tabla_pasaje(txtrutvendedor_cuadrar.getText());
        atributo = "fecha_vta";
        mostrar_tabla_pasaje(txtfechaventa_cuadrar.getText());
        
            try {
               String sql =("SELECT SUM(precio) from pasaje group by "+atributo);
               PreparedStatement preparedStatement = cn.prepareStatement(sql);
               ResultSet rs = preparedStatement.executeQuery(sql);


               while(rs.next()){
                   String sum = rs.getString("sum(precio)");
                   int Sum = Integer.parseInt(sum);
                   JOptionPane.showMessageDialog(null,"Monto Total Ganado en el dia:\n$"+Sum);                      
               }     
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.out.println(e.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
    }//GEN-LAST:event_BOTONBUSCAR1ActionPerformed

    private void txtfechaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaventaActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Pasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pasaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla_Pasaje().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONBUSCAR;
    private javax.swing.JButton BOTONBUSCAR1;
    private javax.swing.JButton BOTONTODOSLOSDATOS;
    private javax.swing.JTable Tabla_Pasaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigoviaje;
    private javax.swing.JTextField txtfechaventa;
    private javax.swing.JTextField txtfechaventa_cuadrar;
    private javax.swing.JTextField txtfolio;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtrutvendedor2;
    private javax.swing.JTextField txtrutvendedor_cuadrar;
    // End of variables declaration//GEN-END:variables

}
