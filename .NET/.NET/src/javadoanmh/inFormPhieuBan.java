/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoanmh;

import Bussiness.BPhieuBanHang;
import Bussiness.BSanPham;
import Bussiness.BThanhVien;
import Item.itemPhieuBanHang;
import java.awt.print.PrinterException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class inFormPhieuBan extends javax.swing.JInternalFrame {

    ArrayList<itemPhieuBanHang> listPhieuBan = new ArrayList<>();
    ArrayList<String> lsCombMaDia = new ArrayList<>();
    ArrayList<String> lsCombThanhVien = new ArrayList<>();

    public inFormPhieuBan() {
        initComponents();
        loadCombMaDia();
        loadCombThanhVien();
        BPhieuBanHang BPN = new BPhieuBanHang();
        try {
            ResultSet rs = BPN.getAllMaDiaPhieuBan("");
            displayDataPhieuBanHang(rs);
        } catch (Exception ex) {
        }
        lblvht.setVisible(false);
    }

    private void displayDataPhieuBanHang(ResultSet rs) {

        listPhieuBan.clear();
        DefaultTableModel model = (DefaultTableModel) this.jTableDanhSachPhieuBan.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {

            while (rs.next()) {
                itemPhieuBanHang item = new itemPhieuBanHang(
                        rs.getInt("SoPhieuBan"),
                        rs.getString("TenNhanVien"),
                        rs.getString("TenThanhVien"),
                        rs.getString("NgayBan"),
                        rs.getString("MaKH"),
                        rs.getString("MaNV"),
                        rs.getString("TongTien"));
                listPhieuBan.add(item);

                Vector vector = new Vector();
                vector.add(item.getSoPhieuBanHang());
                vector.add(item.getTenKhachHang());
                vector.add(item.getTenNhanVien());
                vector.add(item.getNgayBanHang());
                vector.add(item.getTongTien());
                model.addRow(vector);

            }

        } catch (Exception ex) {
            System.out.printf("Ngoại lệ tại displayDataPhieuNhap 2: " + ex.getMessage());
        }
    }

    private void loadCombMaDia() {
        cbbDia.removeAllItems();
        lsCombMaDia.clear();
        BSanPham BSP = new BSanPham();
        ResultSet rs = BSP.getAllMaDia();
        try {
            while (rs.next()) {

                cbbDia.addItem(rs.getString("TenDia"));
                lsCombMaDia.add(rs.getString("MaDia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormPhieuChoThue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadCombThanhVien() {
        cbbKhachHang.removeAllItems();
        lsCombThanhVien.clear();
        BThanhVien BNV = new BThanhVien();
        ResultSet rs = BNV.getBaseProperties();
        try {
            while (rs.next()) {
                cbbKhachHang.addItem(rs.getString("TenThanhVien"));
                lsCombThanhVien.add(rs.getString("MaThanhVien"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormPhieuChoThue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDanhSachPhieuBan = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CTPhieuBan = new javax.swing.JTable();
        txtSoLuong = new javax.swing.JSpinner();
        cbbDia = new javax.swing.JComboBox<String>();
        btncong = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnXoaBot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        rdoPhieuBan = new javax.swing.JRadioButton();
        rdoCtPhieuBan = new javax.swing.JRadioButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNgayLap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbKhachHang = new javax.swing.JComboBox<String>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtGiaBan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblvht = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Phiếu bán hàng");
        setName("PhieuBan"); // NOI18N
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

        jTableDanhSachPhieuBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên Khách", "Tên Nhân Viên", "Ngày Lập Phiếu", "Tồng Tiền"
            }
        ));
        jTableDanhSachPhieuBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDanhSachPhieuBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDanhSachPhieuBan);

        CTPhieuBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu Bán", "Mã Đĩa", "Tên Đĩa", "Số Lượng", "Đơn Giá"
            }
        ));
        CTPhieuBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CTPhieuBanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CTPhieuBan);

        cbbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btncong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        btnTru.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        btnXoaBot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoaBot.setText("X");
        btnXoaBot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBotActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm Kiếm:");

        buttonGroup1.add(rdoPhieuBan);
        rdoPhieuBan.setText("  Phiếu bán");

        buttonGroup1.add(rdoCtPhieuBan);
        rdoCtPhieuBan.setText(" Chi tiết phiếu bán");

        btnTimKiem.setText("Tìm Kiếm");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("CHI TIẾT PHIẾU BÁN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Phiếu Bán Hàng"));

        jLabel3.setText("Mã Nhân Viên:");

        txtMaNV.setEnabled(false);

        jLabel4.setText("Mã Phiếu:");

        jLabel5.setText("Ngày Lập:");

        txtNgayLap.setEnabled(false);

        jLabel6.setText("Mã KH:");

        cbbKhachHang.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnOK.setText("Lưu");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayLap)
                    .addComponent(txtMaPhieu)
                    .addComponent(txtMaNV)
                    .addComponent(cbbKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnOK)))
        );

        jButton1.setText("Làm Mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("In Hóa Đơn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtGiaBan.setEnabled(false);
        txtGiaBan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaBanFocusLost(evt);
            }
        });

        jLabel7.setText("Đơn Giá:");

        lblvht.setText("NhanVien hien tai:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoCtPhieuBan)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoPhieuBan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTimKiem))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btncong)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoaBot))
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblvht)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(lblvht))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoPhieuBan)
                                    .addComponent(btnTimKiem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoCtPhieuBan)
                                .addGap(23, 23, 23)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong)
                            .addComponent(cbbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncong)
                            .addComponent(btnTru)
                            .addComponent(btnXoaBot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jButton2))
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened


    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            BPhieuBanHang BPN = new BPhieuBanHang();

            ResultSet rs = BPN.getAllMaDiaPhieuBan("");
            displayDataPhieuBanHang(rs);
            this.jTableDanhSachPhieuBan.removeAll();
            loadCombThanhVien();
            loadCombMaDia();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi : " + e.getMessage(), "Lỗi!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableDanhSachPhieuBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDanhSachPhieuBanMouseClicked
        // TODO add your handling code here:

        int index = jTableDanhSachPhieuBan.getSelectedRow();

        int sophieuthue = listPhieuBan.get(index).getSoPhieuBanHang();

        BPhieuBanHang BPN = new BPhieuBanHang();
        try {
            ResultSet rs = BPN.getChiTietPhieuBan(sophieuthue);
            displayDataChiTietPhieuBan(rs);
        } catch (SQLException ex) {
            Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtMaPhieu.setText(String.valueOf(listPhieuBan.get(index).getSoPhieuBanHang()));

        cbbKhachHang.setSelectedItem(listPhieuBan.get(index).getTenKhachHang());

        txtMaNV.setText(listPhieuBan.get(index).getMaNV());

        txtNgayLap.setText(listPhieuBan.get(index).getNgayBanHang());
    }//GEN-LAST:event_jTableDanhSachPhieuBanMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //in Hóa Đơn

        try {

            this.CTPhieuBan.print();
        } catch (PrinterException pe) {
            System.err.println("Error printing: " + pe.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        // TODO add your handling code here:
        int madia = 0;
        try {
            madia = Integer.parseInt(lsCombMaDia.get(cbbDia.getSelectedIndex()));

        } catch (Exception ex) {
            madia = 0;
        }
        if (madia > 0) {
            try {
                int index = jTableDanhSachPhieuBan.getSelectedRow();

                int sophiueban = listPhieuBan.get(index).getSoPhieuBanHang();
                BPhieuBanHang BPDH = new BPhieuBanHang();
                int soluong = 0;

                try {
                    soluong = (int) this.txtSoLuong.getValue();

                } catch (Exception ex) {
                    soluong = 0;
                }
                if (soluong > 0) {
                    if (BPDH.insertChiTietPhieuBan(sophiueban, madia, soluong)) {
                        ResultSet rs = BPDH.getChiTietPhieuBan(sophiueban);
                        displayDataChiTietPhieuBan(rs);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ", "Lỗi!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Loi" + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Loi" + ex.getMessage());

            }
        }


    }//GEN-LAST:event_btncongActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        // TODO add your handling code here:

        int madia = 0;
        try {
            madia = Integer.parseInt(lsCombMaDia.get(cbbDia.getSelectedIndex()));

        } catch (Exception ex) {
            madia = 0;
        }
        if (madia > 0) {
            try {
                int index = jTableDanhSachPhieuBan.getSelectedRow();

                int sophiueban = listPhieuBan.get(index).getSoPhieuBanHang();
                BPhieuBanHang BPDH = new BPhieuBanHang();
                int soluong = 0;

                try {
                    soluong = (int) this.txtSoLuong.getValue();

                } catch (Exception ex) {
                    soluong = 0;
                }
                if (soluong > 0) {
                    if (BPDH.insertChiTietPhieuBan(sophiueban, madia, soluong * -1)) {
                        ResultSet rs = BPDH.getChiTietPhieuBan(sophiueban);
                        displayDataChiTietPhieuBan(rs);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ", "Lỗi!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Loi" + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Loi" + ex.getMessage());

            }
        }

    }//GEN-LAST:event_btnTruActionPerformed

    private void btnXoaBotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBotActionPerformed
        // TODO add your handling code here:
        int madia = 0;
        try {
            madia = Integer.parseInt(lsCombMaDia.get(cbbDia.getSelectedIndex()));
            int index = jTableDanhSachPhieuBan.getSelectedRow();
            int sophiueban = listPhieuBan.get(index).getSoPhieuBanHang();
            BPhieuBanHang BPDH = new BPhieuBanHang();
            if (BPDH.deleteMaDiaChiTietPhieuBan(sophiueban, madia)) {
                ResultSet rs = BPDH.getChiTietPhieuBan(sophiueban);
                displayDataChiTietPhieuBan(rs);
            }
        } catch (Exception ex) {

        }


    }//GEN-LAST:event_btnXoaBotActionPerformed

    private void txtGiaBanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaBanFocusLost
        // TODO add your handling code here:

        try {
            Double.parseDouble(txtGiaBan.getText());
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Đơn giá là số!", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
            txtGiaBan.setFocusable(true);
            return;
        }


    }//GEN-LAST:event_txtGiaBanFocusLost

    private void CTPhieuBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTPhieuBanMouseClicked
        // TODO add your handling code here:
        int index = CTPhieuBan.getSelectedRow();

        String maphieu = (this.CTPhieuBan.getModel().getValueAt(index, 0)).toString();
        String madia = (this.CTPhieuBan.getModel().getValueAt(index, 1)).toString();
        String soluong = (this.CTPhieuBan.getModel().getValueAt(index, 3)).toString();
        String DonGia = (this.CTPhieuBan.getModel().getValueAt(index, 4)).toString();

        cbbDia.setSelectedIndex(lsCombMaDia.indexOf(madia));

        txtGiaBan.setText(DonGia);

    }//GEN-LAST:event_CTPhieuBanMouseClicked

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:

        try {
            BPhieuBanHang BPN = new BPhieuBanHang();
            Date today = new Date(System.currentTimeMillis());
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
            String ngaylapphieu = timeFormat.format(today.getTime());
            if (txtMaPhieu.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không bỏ trống mã phiếu cho thuê!", "Chưa thêm!", JOptionPane.INFORMATION_MESSAGE);
            } else if (BPN.insertByProperties(Integer.parseInt(txtMaPhieu.getText()), ngaylapphieu,
                    lsCombThanhVien.get(cbbKhachHang.getSelectedIndex()), txtMaNV.getText(), "0")) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!", "Đã thêm", JOptionPane.INFORMATION_MESSAGE);
                btnXoa.setEnabled(true);
                btnSua.setEnabled(true);
                jButton1ActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Mã phiếu nhập đã tồn tại!", "Chưa thêm!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã phiếu nhập phải là số!", "Chưa thêm!", JOptionPane.INFORMATION_MESSAGE);
        }
//        .setEnabled(false);
//        buttonXoa.setEnabled(false);
//        buttonThem.setEnabled(true);
//        buttonSua.setEnabled(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        txtMaNV.setText(lblvht.getText());
        Date today = new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        String ngaylapphieu = timeFormat.format(today.getTime());
        txtNgayLap.setText(ngaylapphieu);
        btnXoa.setEnabled(false);
        btnSua.setEnabled(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

        try {
            BPhieuBanHang BPN = new BPhieuBanHang();
            int index = jTableDanhSachPhieuBan.getSelectedRow();
            String sophieu = (String) jTableDanhSachPhieuBan.getModel().getValueAt(index, 0).toString();
            int ans = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Xác nhận xóa.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (ans == 0) {

                boolean save = BPN.XoaPhieuBan(Integer.parseInt(sophieu));
                if (save) {
                    JOptionPane.showMessageDialog(this, "Thành công", "Đã xóa", JOptionPane.INFORMATION_MESSAGE);
                    jButton1ActionPerformed(evt);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "phiếu này có hóa đơn không được xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int index = jTableDanhSachPhieuBan.getSelectedRow();
        String matv = lsCombThanhVien.get(cbbKhachHang.getSelectedIndex());
        String manhanvien = txtMaNV.getText();
        String ngaylapphieu = txtNgayLap.getText();
        String sophieuthue = txtMaPhieu.getText();

        BPhieuBanHang BPN = new BPhieuBanHang();
        try {
            if (BPN.CapNhatPhieuBan(Integer.parseInt(sophieuthue), Integer.parseInt(matv))) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!", "Đã cập nhật!", JOptionPane.INFORMATION_MESSAGE);
                jButton1ActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Xảy ra lỗi trong khi cập nhật!", "Chưa cập nhật!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(inFormPhieuBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void displayDataChiTietPhieuBan(ResultSet rs) {

       

        DefaultTableModel model = (DefaultTableModel) CTPhieuBan.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            while (rs.next()) {

                Vector vector = new Vector();
                vector.add(rs.getInt("SoPhieuBan"));
                vector.add(rs.getInt("MaDia"));
                vector.add(rs.getString("TenDia"));
                vector.add(rs.getBigDecimal("SoLuong"));
                vector.add(rs.getBigDecimal("DonGia"));

                model.addRow(vector);

            }

        Vector summaryvector = new Vector();
        int row = CTPhieuBan.getRowCount();
        double tongtien = 0;
        for (int i = 0; i < row; i++) {
            int soluong = Integer.parseInt(CTPhieuBan.getValueAt(i, 3).toString());
            double DonGia = Double.parseDouble(CTPhieuBan.getValueAt(i, 4).toString());
            tongtien += soluong * DonGia;
        }

        int index = jTableDanhSachPhieuBan.getSelectedRow();

        String hoTenKhach = jTableDanhSachPhieuBan.getValueAt(index, 1).toString();

        summaryvector.add("Tổng: ");
        summaryvector.add("");
        summaryvector.add(hoTenKhach);
        summaryvector.add("");
        summaryvector.add(tongtien);
            model.addRow(summaryvector);
        } catch (Exception ex) {
            System.out.printf("Ngoại lệ tại displayDataChiTietPhieuThue 2: " + ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CTPhieuBan;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaBot;
    private javax.swing.JButton btncong;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbDia;
    private javax.swing.JComboBox<String> cbbKhachHang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDanhSachPhieuBan;
    private javax.swing.JLabel lblvht;
    private javax.swing.JRadioButton rdoCtPhieuBan;
    private javax.swing.JRadioButton rdoPhieuBan;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtNgayLap;
    private javax.swing.JSpinner txtSoLuong;
    private javax.swing.JTextField txtkey;
    // End of variables declaration//GEN-END:variables
public void setTextID(String id) {
        lblvht.setText(id);
    }
}
