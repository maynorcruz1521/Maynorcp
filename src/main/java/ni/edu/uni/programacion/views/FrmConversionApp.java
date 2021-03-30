/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import ni.edu.uni.programacion.controllers.CalculatorController;
import ni.edu.uni.programacion.controllers.PnlTemperatureController;
import ni.edu.uni.programacion.controllers.PnlVehicleController;
import ni.edu.uni.programacion.views.panels.PnlCalculator;
import ni.edu.uni.programacion.views.panels.PnlConversionTemplate;
import ni.edu.uni.programacion.views.panels.PnlVehicle;

/**
 *
 * @author Sistemas-05
 */
public class FrmConversionApp extends javax.swing.JFrame {

    private PnlCalculator pnlCalculator;
    private CalculatorController calculatorController;
    private PnlConversionTemplate pnlConversionTemplate;
    private PnlTemperatureController pnlTemperatureController;
    private PnlVehicle pnlVehicle;
    private PnlVehicleController pnlVehicleController;
    /**
     * Creates new form FrmConversionApp
     */
    public FrmConversionApp() {
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

        pnlLeftButtons = new javax.swing.JPanel();
        btnCalc = new javax.swing.JButton();
        btnTemp = new javax.swing.JButton();
        btnCurr = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversion App");
        getContentPane().setLayout(new java.awt.BorderLayout(3, 0));

        pnlLeftButtons.setBackground(new java.awt.Color(204, 204, 204));
        pnlLeftButtons.setPreferredSize(new java.awt.Dimension(120, 300));
        pnlLeftButtons.setLayout(new java.awt.GridLayout(3, 1));

        btnCalc.setText("Calculadora");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        pnlLeftButtons.add(btnCalc);

        btnTemp.setText("Temperatura");
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
            }
        });
        pnlLeftButtons.add(btnTemp);

        btnCurr.setText("Moneda");
        btnCurr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrActionPerformed(evt);
            }
        });
        pnlLeftButtons.add(btnCurr);

        getContentPane().add(pnlLeftButtons, java.awt.BorderLayout.LINE_START);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        if (pnlCalculator == null) {
            pnlCalculator = new PnlCalculator();
            calculatorController = new CalculatorController(pnlCalculator);
        }

        addComponent(pnlCalculator);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void addComponent(JComponent component) {
        pnlContent.removeAll();
        pnlContent.add(component, BorderLayout.CENTER);
        
        validate();
        repaint();
    }

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        if (pnlConversionTemplate == null) {
            pnlConversionTemplate = new PnlConversionTemplate();
            pnlTemperatureController = new PnlTemperatureController(pnlConversionTemplate);
        }

        addComponent(pnlConversionTemplate);
    }//GEN-LAST:event_btnTempActionPerformed

    private void btnCurrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrActionPerformed
        if(pnlVehicle == null){
            pnlVehicle = new PnlVehicle();
            try {
                pnlVehicleController = new PnlVehicleController(pnlVehicle);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmConversionApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        addComponent(pnlVehicle);
    }//GEN-LAST:event_btnCurrActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConversionApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConversionApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnCurr;
    private javax.swing.JButton btnTemp;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlLeftButtons;
    // End of variables declaration//GEN-END:variables

}
