/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoanmh;

import Data.classData;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class inFormBaoCaoThongKe extends javax.swing.JInternalFrame {

    public inFormBaoCaoThongKe() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButtonThongKe = new javax.swing.JButton();
        jButtonThongKe1 = new javax.swing.JButton();
        jButtonThongKe2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Phiếu bán hàng");
        setName("BaoCaoThongKe"); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jButtonThongKe.setText("Thống Kê Doanh Thu Bán Đĩa");
        jButtonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKeActionPerformed(evt);
            }
        });

        jButtonThongKe1.setText("Thống Kê Doanh Thu Thuê Đĩa");
        jButtonThongKe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKe1ActionPerformed(evt);
            }
        });

        jButtonThongKe2.setText("Thống Kê");
        jButtonThongKe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKe2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonThongKe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonThongKe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButtonThongKe)
                .addGap(18, 18, 18)
                .addComponent(jButtonThongKe1)
                .addGap(18, 18, 18)
                .addComponent(jButtonThongKe2)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened


    }//GEN-LAST:event_formInternalFrameOpened

    private void jButtonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKeActionPerformed

        String path = "";
        try {

            path = "E:\\JAVA\\ChuyenDe1Full\\JAVADoAnMH\\src\\javadoanmh\\BaoCaoDoanhThuThueDia.jrxml";
            
            path = URLDecoder.decode(path, "UTF-8");
            
            Connection conn = new classData().getDBConnection();

            //  Map map = new HashMap();
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            
            jasperViewer.setVisible(true);
            
            
            System.out.println("Len r");

        } catch (ClassNotFoundException | SQLException | JRException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(inFormBaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(inFormBaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonThongKeActionPerformed

    private void jButtonThongKe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKe1ActionPerformed
        // TODO add your handling code here:
        
          String path = "";
        try {

            path = "E:\\JAVA\\ChuyenDe1Full\\JAVADoAnMH\\src\\javadoanmh\\BaoCaoDoanhThu.jrxml";
            
            path = URLDecoder.decode(path, "UTF-8");
            
            Connection conn = new classData().getDBConnection();

            //  Map map = new HashMap();
            JasperReport jasperReport = JasperCompileManager.compileReport(path);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, conn);
            
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            
            jasperViewer.setVisible(true);
            
            
            System.out.println("Len r");

        } catch (ClassNotFoundException | SQLException | JRException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(inFormBaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(inFormBaoCaoThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButtonThongKe1ActionPerformed

    private void jButtonThongKe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThongKe2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonThongKe;
    private javax.swing.JButton jButtonThongKe1;
    private javax.swing.JButton jButtonThongKe2;
    // End of variables declaration//GEN-END:variables

}
