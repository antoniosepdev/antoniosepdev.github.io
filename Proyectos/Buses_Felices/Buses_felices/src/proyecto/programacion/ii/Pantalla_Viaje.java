package proyecto.programacion.ii;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Pantalla_Viaje extends javax.swing.JFrame {
        conectar_BD con = new conectar_BD();
        Connection cn = con.conexion();

    void mostrar_tabla_viaje(String Valor){
        DefaultTableModel tabla_consulta_viaje;
        tabla_consulta_viaje = new DefaultTableModel();
        
        tabla_consulta_viaje.addColumn("Codigo Viaje");
        tabla_consulta_viaje.addColumn("Fecha");
        tabla_consulta_viaje.addColumn("Patente Bus");
        tabla_consulta_viaje.addColumn("Conductor");
        tabla_consulta_viaje.addColumn("Origen");
        tabla_consulta_viaje.addColumn("Destino");
        tabla_consulta_viaje.addColumn("Precio");
        tabla_consulta_viaje.addColumn("Cantidad Asientos");
        tabla_consulta_viaje.addColumn("Disponibilidad");
        tabla_consulta_viaje.addColumn("Estado");
        Tabla_Viaje.setModel(tabla_consulta_viaje);
        String sql = "";
        String Datos_viaje[];
        Datos_viaje = new String[10];
        String Contador_Pasaje;
        if( Valor.equals("")){
            sql = "SELECT * FROM viaje";
        }else{
            sql = "SELECT * FROM viaje WHERE cod_viaje='"+Valor+"'";
        }
        Statement st;
        try{
            
            st = cn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()){
                Datos_viaje[0] = rs.getString(1);
                Datos_viaje[1] = rs.getString(2);
                Datos_viaje[2] = rs.getString(3);
                Datos_viaje[3] = rs.getString(4);
                Datos_viaje[4] = rs.getString(5);
                Datos_viaje[5] = rs.getString(6);
                Datos_viaje[6] = rs.getString(7);
                Datos_viaje[7] = rs.getString(8);
                Datos_viaje[8] = rs.getString(9);
                Datos_viaje[9] = rs.getString(10);
                tabla_consulta_viaje.addRow(Datos_viaje);
            }
            Tabla_Viaje.setModel(tabla_consulta_viaje);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    void estados(){
        txtestado.addItem("p");
        txtestado.addItem("r");
        txtestado.addItem("a");
    }
    
    void limpiar(){
        txtcodviaje.setText("");
        txtfecha.setText("");
        txtpatentedelbus.setText("");
        txtconductor.setText("");
        txtorigen.setText("");
        txtdestino.setText("");        
        txtprecioviaje.setText("");
        txtcantidad_de_asientos.setText("");
        txtdisponibilidad.setText("");
    }
    
    public Pantalla_Viaje() {
        initComponents();
        mostrar_tabla_viaje("");
        estados();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Viaje = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtorigen = new javax.swing.JTextField();
        txtcodviaje = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtconductor = new javax.swing.JTextField();
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
        txtdisponibilidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        txtprecioviaje = new javax.swing.JTextField();
        txtcantidad_de_asientos = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtpatentedelbus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtestado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Crear/Consultar Viaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Tabla_Viaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Viaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 730, 170));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jLabel3.setText("Tabla buses");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setText("Origen:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 20));

        jLabel5.setText("Estado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 20));

        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel7.setText("Conductor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        txtorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorigenActionPerformed(evt);
            }
        });
        getContentPane().add(txtorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, -1));

        txtcodviaje.setText("0");
        txtcodviaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodviajeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodviaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 100, -1));

        txtfecha.setText("00-00-0000");
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, -1));
        getContentPane().add(txtconductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Modificar viaje");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jLabel8.setText("Codigo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, -1));

        jLabel9.setText("Crear");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, -1));

        BOTONBUSCAR.setBackground(new java.awt.Color(255, 204, 0));
        BOTONBUSCAR.setText("Buscar");
        BOTONBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        BOTONTODOSLOSDATOS.setBackground(new java.awt.Color(255, 204, 0));
        BOTONTODOSLOSDATOS.setText("Mostrar Viajes");
        BOTONTODOSLOSDATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONTODOSLOSDATOSActionPerformed(evt);
            }
        });
        getContentPane().add(BOTONTODOSLOSDATOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel10.setText("Buscar por");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Actualizar viaje");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 51));
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Borrar viaje");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        txtdisponibilidad.setText("0");
        txtdisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisponibilidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtdisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 100, -1));

        jLabel11.setText("Codigo Viaje:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        jLabel12.setText("Destino:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 20));

        jLabel13.setText("Precio: $");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 20));

        jLabel14.setText("Cantidad");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, 20));

        jLabel15.setText("Asientos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 20));

        jLabel16.setText("Pasaje");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, 20));

        txtdestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinoActionPerformed(evt);
            }
        });
        getContentPane().add(txtdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, -1));

        txtprecioviaje.setText("0");
        txtprecioviaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioviajeActionPerformed(evt);
            }
        });
        getContentPane().add(txtprecioviaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, -1));

        txtcantidad_de_asientos.setText("0");
        txtcantidad_de_asientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidad_de_asientosActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidad_de_asientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 100, -1));

        jLabel17.setText("Disp:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 20));

        txtpatentedelbus.setText("0000-0000");
        getContentPane().add(txtpatentedelbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));

        jLabel18.setText("Patente Bus:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_Viajes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pantalla_Principal ventana = new Pantalla_Principal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcodviajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodviajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodviajeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            try {
                PreparedStatement creaviaje = cn.prepareStatement("INSERT INTO viaje(cod_viaje, fecha, patente_bus, conductor, origen, destino, precio, cant_asientos, pasaje_disp, estado) VALUES(?,?,?,?,?,?,?,?,?,?)");
                creaviaje.setString(1, txtcodviaje.getText());
                creaviaje.setString(2, txtfecha.getText());
                creaviaje.setString(3, txtpatentedelbus.getText());
                creaviaje.setString(4, txtconductor.getText());
                creaviaje.setString(5, txtorigen.getText());
                creaviaje.setString(6, txtdestino.getText());
                creaviaje.setString(7, txtprecioviaje.getText());
                creaviaje.setString(8, txtcantidad_de_asientos.getText());
                creaviaje.setString(9, txtdisponibilidad.getText());
                creaviaje.setString(10, txtestado.getSelectedItem().toString());

                creaviaje.executeUpdate();
                mostrar_tabla_viaje("");
                JOptionPane.showMessageDialog(null,"Viaje creado.");
                limpiar();
                System.out.println("Viaje creado.");
                
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BOTONBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONBUSCARActionPerformed
        mostrar_tabla_viaje(txtbuscar.getText());
    }//GEN-LAST:event_BOTONBUSCARActionPerformed

    private void BOTONTODOSLOSDATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONTODOSLOSDATOSActionPerformed
       mostrar_tabla_viaje("");
    }//GEN-LAST:event_BOTONTODOSLOSDATOSActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        mostrar_tabla_viaje(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int fila = Tabla_Viaje.getSelectedRow();
        if(fila>=0){
            txtcodviaje.setText(Tabla_Viaje.getValueAt(fila, 0).toString());
            txtfecha.setText(Tabla_Viaje.getValueAt(fila, 1).toString());
            txtpatentedelbus.setText(Tabla_Viaje.getValueAt(fila, 2).toString());
            txtconductor.setText(Tabla_Viaje.getValueAt(fila, 3).toString());
            txtorigen.setText(Tabla_Viaje.getValueAt(fila, 4).toString());
            txtdestino.setText(Tabla_Viaje.getValueAt(fila, 5).toString());
            txtprecioviaje.setText(Tabla_Viaje.getValueAt(fila, 6).toString());
            txtcantidad_de_asientos.setText(Tabla_Viaje.getValueAt(fila, 7).toString());
            txtdisponibilidad.setText(Tabla_Viaje.getValueAt(fila, 8).toString());

        }
        else{
            JOptionPane.showMessageDialog(null,"Fila no selecionada.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try {
                PreparedStatement creaviaje = cn.prepareStatement("UPDATE pasaje SET cod_viaje='"+txtcodviaje.getText()+"',fecha='"+txtfecha.getText()+"',patente_bus='"+txtpatentedelbus.getText()+"',conductor='"+txtconductor.getText()+"',origen='"+txtorigen.getText()+"',destino='"+txtdestino.getText()+"',precio='"+txtprecioviaje.getText()+"', cant_asientos='"+txtcantidad_de_asientos+"',pasaje_disp='"+txtdisponibilidad+"',estado='"+txtestado.getSelectedItem().toString()+" WHERE cod_viaje='"+txtcodviaje.getText()+"'");
                creaviaje.executeUpdate();
                JOptionPane.showMessageDialog(null,"Viaje actualizado.");
                System.out.println("Viaje actualizado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int fila = Tabla_Viaje.getSelectedRow();
        String Valor = Tabla_Viaje.getValueAt(fila, 0).toString();
        if (fila>=0){
            try {
                PreparedStatement creaviaje = cn.prepareStatement("DELETE FROM viaje WHERE cod_viaje='"+Valor+"'");
                creaviaje.executeUpdate();
                JOptionPane.showMessageDialog(null,"Viaje borrado");
                System.out.println("Viaje borrado.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
                System.out.println(ex.getMessage());
            }
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorigenActionPerformed

    private void txtdisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisponibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisponibilidadActionPerformed

    private void txtprecioviajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioviajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioviajeActionPerformed

    private void txtcantidad_de_asientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidad_de_asientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidad_de_asientosActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoActionPerformed

    private void txtdestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdestinoActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla_Viaje().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONBUSCAR;
    private javax.swing.JButton BOTONTODOSLOSDATOS;
    private javax.swing.JTable Tabla_Viaje;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField txtcantidad_de_asientos;
    private javax.swing.JTextField txtcodviaje;
    private javax.swing.JTextField txtconductor;
    private javax.swing.JTextField txtdestino;
    private javax.swing.JTextField txtdisponibilidad;
    private javax.swing.JComboBox<String> txtestado;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtorigen;
    private javax.swing.JTextField txtpatentedelbus;
    private javax.swing.JTextField txtprecioviaje;
    // End of variables declaration//GEN-END:variables

}
