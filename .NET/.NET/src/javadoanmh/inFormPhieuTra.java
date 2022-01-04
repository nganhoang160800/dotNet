/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoanmh;

import Bussiness.BPhieuTra;
import Item.itemPhieuTra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class inFormPhieuTra extends javax.swing.JInternalFrame {

    ArrayList<itemPhieuTra> listPhieuTra = new ArrayList<>();
    int sophieu = -1;

    public inFormPhieuTra() {
        initComponents();

        BPhieuTra BPN = new BPhieuTra();
        try {
            ResultSet rs = BPN.getAllPhieuMuon("");
            displayDataPhieuMuon(rs);
            jButton3.setEnabled(false);
        } catch (Exception ex) {
        }
    }

    private void displayDataPhieuMuon(ResultSet rs) {

        listPhieuTra.clear();
        DefaultTableModel model = (DefaultTableModel) this.jTableDanhSachPhieuMuon.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {

            while (rs.next()) {
                itemPhieuTra item = new itemPhieuTra(
                        rs.getInt("SoPhieuThue"),
                        rs.getString("TenNhanVien"),
                        rs.getString("TenThanhVien"),
                        rs.getString("NgayThue"),
                        rs.getString("MaKH"),
                        rs.getString("MaNV"));
                listPhieuTra.add(item);

                Vector vector = new Vector();
                vector.add(item.getSoPhieuTra());
                vector.add(item.getTenKhachHang());
                vector.add(item.getTenNhanVien());
                vector.add(item.getNgayTra());
                vector.add(item.getTrangThai());
                model.addRow(vector);

            }

        } catch (Exception ex) {
            System.out.printf("Ngoại lệ tại displayDataPhieuNhap 2: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDanhSachPhieuMuon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Phiếu Trả Đĩa");
        setName("PhieuTra"); // NOI18N
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

        jTableDanhSachPhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên Khách", "Tên Nhân Viên", "Ngày Lập Phiếu", "Trạng Thái"
            }
        ));
        jTableDanhSachPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDanhSachPhieuMuonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDanhSachPhieuMuon);

        jLabel1.setText("Tìm Kiếm:");

        btnTimKiem.setText("Tìm Kiếm");

        jButton3.setBackground(new java.awt.Color(51, 204, 0));
        jButton3.setText("Trả Đĩa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem)
                        .addGap(126, 126, 126)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened


    }//GEN-LAST:event_formInternalFrameOpened

    private void jTableDanhSachPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhSachPhieuMuonMouseClicked
        // TODO add your handling code here:

        int index = jTableDanhSachPhieuMuon.getSelectedRow();

        sophieu = listPhieuTra.get(index).getSoPhieuTra();
        String TrangThai = jTableDanhSachPhieuMuon.getValueAt(index, 4).toString();

        if (sophieu != -1) {
            jButton3.setEnabled(true);
        }
        if (TrangThai.equals("Đã Trả")) {
            jButton3.setEnabled(false);
        }


    }//GEN-LAST:event_jTableDanhSachPhieuMuonMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        BPhieuTra BPN = new BPhieuTra();

        try {

            if (BPN.TraDia(sophieu)) {
                ResultSet rs = BPN.getAllPhieuMuon("");
                displayDataPhieuMuon(rs);
                sophieu = -1;
            }

        } catch (Exception ex) {

        }
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDanhSachPhieuMuon;
    private javax.swing.JTextField txtkey;
    // End of variables declaration//GEN-END:variables

}
