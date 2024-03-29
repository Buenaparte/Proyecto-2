/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Clases.Global;


public class V1_2Archivos extends javax.swing.JFrame {
    

    /**
     * Creates new form V1
     */
    public V1_2Archivos() {
        setTitle("Hotel Ávila");
        setResizable(false);
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        reservas = new javax.swing.JButton();
        historico = new javax.swing.JButton();
        habitaciones = new javax.swing.JButton();
        estado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 250, 249));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(253, 250, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inicio.setBackground(new java.awt.Color(0, 169, 105));
        inicio.setText("Iniciar");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel2.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 130, -1));

        reservas.setBackground(new java.awt.Color(0, 169, 105));
        reservas.setText("Cargar Reservas");
        reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasActionPerformed(evt);
            }
        });
        jPanel2.add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 140, -1));

        historico.setBackground(new java.awt.Color(0, 169, 105));
        historico.setText("Cargar Historico");
        historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoActionPerformed(evt);
            }
        });
        jPanel2.add(historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 140, -1));

        habitaciones.setBackground(new java.awt.Color(0, 169, 105));
        habitaciones.setText("Cargar Habitaciones");
        habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitacionesActionPerformed(evt);
            }
        });
        jPanel2.add(habitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, -1));

        estado.setBackground(new java.awt.Color(0, 169, 105));
        estado.setText("Cargar Estado");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        jPanel2.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sin título (550 x 400 px) (3).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        Global.historico();
        //Global.habitaciones();
       
        V2Menu ventana = new V2Menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void reservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv", "csv");
        file.setFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int result = file.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            Global.setReservations(file.getSelectedFile());
            JOptionPane.showMessageDialog(null, "Su archivo de Reservas sido cargado con exito");
        } 
    }//GEN-LAST:event_reservasActionPerformed

    private void historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv", "csv");
        file.setFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int result = file.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            Global.setHistoric(file.getSelectedFile());
            JOptionPane.showMessageDialog(null, "Su archivo de Historico sido cargado con exito");
        }
    }//GEN-LAST:event_historicoActionPerformed

    private void habitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitacionesActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv", "csv");
        file.setFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int result = file.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            Global.setRooms(file.getSelectedFile());
            JOptionPane.showMessageDialog(null, "Su archivo de Habitaciones sido cargado con exito");
        }
    }//GEN-LAST:event_habitacionesActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv", "csv");
        file.setFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int result = file.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            Global.setStatus(file.getSelectedFile());
            JOptionPane.showMessageDialog(null, "Su archivo de Estado sido cargado con exito");
        }
    }//GEN-LAST:event_estadoActionPerformed

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
            java.util.logging.Logger.getLogger(V1_2Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V1_2Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V1_2Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V1_2Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new V1_2Archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton estado;
    private javax.swing.JButton habitaciones;
    private javax.swing.JButton historico;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reservas;
    // End of variables declaration//GEN-END:variables
}