/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Clases.Global;
import EDD.Nodo;
import Clases.ClienteReservas;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JOptionPane;

public class V4Busqueda extends javax.swing.JFrame {

    DefaultTableModel mt = new DefaultTableModel();

    public V4Busqueda() {
        setTitle("Hotel Ávila");
        setResizable(false);
        initComponents();
        Color color = new Color(0,169,105);
        String ids[] = {"Cedula","Nombre", "Apellido","Correo", "Genero", "Celular", "Tipo de Habitacion", "Llegada", "Salida" };
        mt.setColumnIdentifiers(ids);
        jTable1.setModel(mt);
        jTable1.setBackground(color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelRound1 = new Clases.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 250, 249));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        volver.setBackground(new java.awt.Color(0, 169, 105));
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jPanel2.setBackground(new java.awt.Color(253, 250, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 120));

        panelRound1.setBackground(new java.awt.Color(0, 169, 105));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula");
        panelRound1.add(jLabel4);

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, -1));

        buscar.setBackground(new java.awt.Color(0, 169, 105));
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel2.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        cedula.setBackground(new java.awt.Color(0, 169, 105));
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setBorder(null);
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        jPanel2.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BR5.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        V2Menu ventana = new V2Menu();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_volverActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        ClienteReservas clienteRerservas = null;
        String cedula = this.cedula.getText();
        System.out.println(cedula);
        int cedula2 = Global.convertirCedula(cedula);
        System.out.println(cedula2);
        Global.getArbol().searchCedula(cedula2, Global.getArbol().getRoot());
        
        if ( Global.getArbol().getBuscado() == null){
            JOptionPane.showMessageDialog(this, "No existe un cliente registrado con ese nombre y apellido");
        }else{
        System.out.println();
        clienteRerservas = Global.getArbol().getBuscado().getElement(); //clienteReserva
        Global.getArbol().setBuscado(null);
        try{
            
            mt.addRow(new Object[] {clienteRerservas.getCedula(),clienteRerservas.getNombre(), clienteRerservas.getApellido(), clienteRerservas.getCorreo(), clienteRerservas.getGenero(),   clienteRerservas.getCelular(),clienteRerservas.getTipohabitacion(), clienteRerservas.getLlegada(),clienteRerservas.getSalida()});
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe un cliente registrado con ese nombre y apellido");
        }
        }
       
        
        
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(V4Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V4Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V4Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V4Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V4Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Clases.PanelRound panelRound1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
