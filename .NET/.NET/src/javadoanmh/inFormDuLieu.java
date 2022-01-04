/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoanmh;

import Bussiness.BChucVu;
import Bussiness.BDiaBase;
import Bussiness.BTheLoai;
import Bussiness.BLoaiThanhVien;
import Bussiness.BNhaCungCap;
import Bussiness.BThanhVien;
import Item.iteamBaseDia;
import Item.itemChucVu;
import Item.itemTheLoai;
import Item.itemLoaiThanhVien;
import Item.itemNhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class inFormDuLieu extends javax.swing.JInternalFrame {

    ArrayList<itemChucVu> listChucVu = new ArrayList<>();
    ArrayList<itemTheLoai> listTheLoai = new ArrayList<>();
    ArrayList<itemNhaCungCap> listNhaCC = new ArrayList<>();
    ArrayList<itemLoaiThanhVien> ListLoaiTV = new ArrayList<>();
    ArrayList<String> lsCombLoaiLK = new ArrayList<>();
    ArrayList<iteamBaseDia> listBaseDia = new ArrayList<>();

    public inFormDuLieu() {
        initComponents();
        loadCombTenLoaiLK();
        if (this.isVisible()) {
            phanquyen();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSoTap1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        panelLoaiLK = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableTheLoai = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        textTimTheLoai = new javax.swing.JTextField();
        buttonTimTheLoai = new javax.swing.JButton();
        buttonLamMoiTheLoai = new javax.swing.JButton();
        buttonThemTheLoai = new javax.swing.JButton();
        buttonSuaTheLoai = new javax.swing.JButton();
        buttonXoaTheLoai = new javax.swing.JButton();
        textTenTheLoai = new javax.swing.JTextField();
        textMaTheLoai = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonLuuTheLoai = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        panelLK = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableDia = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        textTimDia = new javax.swing.JTextField();
        buttonTimDia = new javax.swing.JButton();
        buttonLamMoiDia = new javax.swing.JButton();
        buttonThemDia = new javax.swing.JButton();
        buttonSuaDia = new javax.swing.JButton();
        buttonXoaDia = new javax.swing.JButton();
        textMaDia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        buttonLuuDia = new javax.swing.JButton();
        combTenTheLoai = new javax.swing.JComboBox();
        textTenDia = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtQuocGia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDienVien = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSoTap = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtGiaMua = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtGiaThue = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelChucVu = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableChucVu = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        textTimChucVu = new javax.swing.JTextField();
        buttonTimChucVu = new javax.swing.JButton();
        buttonLamMoiChucVu = new javax.swing.JButton();
        buttonThemChucVu = new javax.swing.JButton();
        buttonSuaChucVu = new javax.swing.JButton();
        buttonXoaChucVu = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        textGhiChuChucVu = new javax.swing.JTextArea();
        textTenChucVu = new javax.swing.JTextField();
        textMaChucVu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        buttonLuuChucVu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        panelTV = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableThanhVien = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        textTimThanhVien = new javax.swing.JTextField();
        buttonTimLoaiThanhVien = new javax.swing.JButton();
        buttonLamMoiLoaiThanhVien = new javax.swing.JButton();
        buttonThemLoaiThanhVien = new javax.swing.JButton();
        buttonSuaLoaiThanhVien = new javax.swing.JButton();
        buttonXoaLoaiThanhVien = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textGhiChuThanhVien = new javax.swing.JTextArea();
        textTenLoaiThanhVien = new javax.swing.JTextField();
        textMaLoaiThanhVien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonLuuLoaiThanhVien = new javax.swing.JButton();
        panelNCC = new javax.swing.JPanel();
        panelNhaCC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textMaNhaCungCap = new javax.swing.JTextField();
        textTenNhaCungCap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhaCungCap = new javax.swing.JTable();
        textDiaChiNhaCungCap = new javax.swing.JTextField();
        textDienThoaiNhaCungCap = new javax.swing.JTextField();
        buttonXoaNhaCungCap = new javax.swing.JButton();
        buttonSuaNhaCungCap = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buttonThemNhaCungCap = new javax.swing.JButton();
        buttonTimNhaCungCap = new javax.swing.JButton();
        textTimNhaCungCap = new javax.swing.JTextField();
        buttonLuuNhaCungCap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonLamMoiNhaCungCap = new javax.swing.JButton();

        jLabel27.setText(" Số Tập:");

        setClosable(true);
        setTitle("Cơ sở dữ liệu");
        setName("DuLieu"); // NOI18N

        tableTheLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Thể Loại", "Tên Thể Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTheLoaiMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableTheLoai);
        if (tableTheLoai.getColumnModel().getColumnCount() > 0) {
            tableTheLoai.getColumnModel().getColumn(0).setMinWidth(70);
            tableTheLoai.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        jLabel12.setText("Tìm kiếm");

        buttonTimTheLoai.setText("Tìm kiếm");

        buttonLamMoiTheLoai.setText("Làm mới");
        buttonLamMoiTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLamMoiTheLoaiActionPerformed(evt);
            }
        });

        buttonThemTheLoai.setText("Thêm");
        buttonThemTheLoai.setActionCommand("Them");
        buttonThemTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemTheLoaiActionPerformed(evt);
            }
        });

        buttonSuaTheLoai.setText("Sửa");
        buttonSuaTheLoai.setActionCommand("Sua");
        buttonSuaTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaTheLoaiActionPerformed(evt);
            }
        });

        buttonXoaTheLoai.setText("Xóa");
        buttonXoaTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaTheLoaiActionPerformed(evt);
            }
        });

        jLabel13.setText("Ma loai:");

        jLabel14.setText("Ten Loai:");

        buttonLuuTheLoai.setText("Lưu");
        buttonLuuTheLoai.setActionCommand("Luu");
        buttonLuuTheLoai.setEnabled(false);
        buttonLuuTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuTheLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoaiLKLayout = new javax.swing.GroupLayout(panelLoaiLK);
        panelLoaiLK.setLayout(panelLoaiLKLayout);
        panelLoaiLKLayout.setHorizontalGroup(
            panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoaiLKLayout.createSequentialGroup()
                .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoaiLKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTimTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTimTheLoai)
                        .addGap(60, 60, 60)
                        .addComponent(buttonLamMoiTheLoai))
                    .addGroup(panelLoaiLKLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textTenTheLoai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMaTheLoai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoaiLKLayout.createSequentialGroup()
                        .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSuaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonLuuTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonXoaTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelLoaiLKLayout.setVerticalGroup(
            panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoaiLKLayout.createSequentialGroup()
                .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoaiLKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(textMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(textTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonThemTheLoai)
                            .addComponent(buttonLuuTheLoai))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSuaTheLoai)
                            .addComponent(buttonXoaTheLoai))
                        .addGap(66, 66, 66))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLoaiLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textTimTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimTheLoai)
                    .addComponent(buttonLamMoiTheLoai))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(panelLoaiLK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panelLoaiLK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thể Loại", jPanel3);

        tableDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Thể Loại", "Mã Đĩa", "Tên Đĩa", "Quốc Gia", " Diễn Viên", " Số Tập", "Giá Mua", "Giá Bán", " Giá Thuê"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDiaMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tableDia);

        jLabel20.setText("Tìm kiếm");

        buttonTimDia.setText("Tìm kiếm");

        buttonLamMoiDia.setText("Làm mới");
        buttonLamMoiDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLamMoiDiaActionPerformed(evt);
            }
        });

        buttonThemDia.setText("Thêm");
        buttonThemDia.setActionCommand("Them");
        buttonThemDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemDiaActionPerformed(evt);
            }
        });

        buttonSuaDia.setText("Sửa");
        buttonSuaDia.setActionCommand("Sua");
        buttonSuaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaDiaActionPerformed(evt);
            }
        });

        buttonXoaDia.setText("Xóa");
        buttonXoaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaDiaActionPerformed(evt);
            }
        });

        jLabel21.setText("Tên loại");

        jLabel22.setText("Mã Đĩa:");

        jLabel23.setText(" Tên Đĩa:");

        buttonLuuDia.setText("Lưu");
        buttonLuuDia.setActionCommand("Luu");
        buttonLuuDia.setEnabled(false);
        buttonLuuDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuDiaActionPerformed(evt);
            }
        });

        combTenTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTenTheLoaiActionPerformed(evt);
            }
        });

        jLabel24.setText(" Diễn Viên:");

        jLabel25.setText("Quốc Gia:");

        jLabel26.setText(" Số Tập:");

        jLabel28.setText("Giá Mua:");

        jLabel29.setText("Giá Bán:");

        jLabel30.setText("Giá Thuê:");

        javax.swing.GroupLayout panelLKLayout = new javax.swing.GroupLayout(panelLK);
        panelLK.setLayout(panelLKLayout);
        panelLKLayout.setHorizontalGroup(
            panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLKLayout.createSequentialGroup()
                .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTimDia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTimDia)
                        .addGap(60, 60, 60)
                        .addComponent(buttonLamMoiDia))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addComponent(jLabel24)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGiaMua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoTap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDienVien, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMaDia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLKLayout.createSequentialGroup()
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSuaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThemDia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonLuuDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonXoaDia, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                    .addComponent(combTenTheLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textTenDia, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuocGia)
                    .addComponent(txtGiaThue))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelLKLayout.setVerticalGroup(
            panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLKLayout.createSequentialGroup()
                .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(combTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(textMaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(textTenDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoTap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonThemDia)
                            .addComponent(buttonLuuDia)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(textTimDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimDia)
                    .addComponent(buttonLamMoiDia)
                    .addComponent(buttonXoaDia)
                    .addComponent(buttonSuaDia)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(panelLK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panelLK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đĩa", jPanel8);

        tableChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã chức vụ", "Tên chức vụ", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChucVuMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableChucVu);

        jLabel16.setText("Tìm kiếm");

        buttonTimChucVu.setText("Tìm kiếm");

        buttonLamMoiChucVu.setText("Làm mới");
        buttonLamMoiChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLamMoiChucVuActionPerformed(evt);
            }
        });

        buttonThemChucVu.setText("Thêm");
        buttonThemChucVu.setActionCommand("Them");
        buttonThemChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemChucVuActionPerformed(evt);
            }
        });

        buttonSuaChucVu.setText("Sửa");
        buttonSuaChucVu.setActionCommand("Sua");
        buttonSuaChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaChucVuActionPerformed(evt);
            }
        });

        buttonXoaChucVu.setText("Xóa");
        buttonXoaChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaChucVuActionPerformed(evt);
            }
        });

        textGhiChuChucVu.setColumns(20);
        textGhiChuChucVu.setRows(5);
        jScrollPane8.setViewportView(textGhiChuChucVu);

        jLabel17.setText("Mã chức vụ");

        jLabel18.setText("Tên chức vụ");

        jLabel19.setText("Ghi chú");

        buttonLuuChucVu.setText("Lưu");
        buttonLuuChucVu.setActionCommand("Luu");
        buttonLuuChucVu.setEnabled(false);
        buttonLuuChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuChucVuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChucVuLayout = new javax.swing.GroupLayout(panelChucVu);
        panelChucVu.setLayout(panelChucVuLayout);
        panelChucVuLayout.setHorizontalGroup(
            panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChucVuLayout.createSequentialGroup()
                .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChucVuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(textTimChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTimChucVu)
                        .addGap(60, 60, 60)
                        .addComponent(buttonLamMoiChucVu))
                    .addComponent(jScrollPane7))
                .addGap(18, 18, 18)
                .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textTenChucVu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMaChucVu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelChucVuLayout.createSequentialGroup()
                        .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSuaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThemChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonLuuChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonXoaChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelChucVuLayout.setVerticalGroup(
            panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChucVuLayout.createSequentialGroup()
                .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChucVuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(textMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(textTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonThemChucVu)
                            .addComponent(buttonLuuChucVu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addGroup(panelChucVuLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(panelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textTimChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimChucVu)
                    .addComponent(buttonLamMoiChucVu)
                    .addComponent(buttonXoaChucVu)
                    .addComponent(buttonSuaChucVu)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(panelChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panelChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jTabbedPane1.addTab("Chức vụ", jPanel2);

        tableThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã loại thành viên", "Tên loại thành viên", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThanhVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableThanhVien);

        jLabel11.setText("Tìm kiếm");

        buttonTimLoaiThanhVien.setText("Tìm kiếm");

        buttonLamMoiLoaiThanhVien.setText("Làm mới");
        buttonLamMoiLoaiThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLamMoiLoaiThanhVienActionPerformed(evt);
            }
        });

        buttonThemLoaiThanhVien.setText("Thêm");
        buttonThemLoaiThanhVien.setActionCommand("Them");
        buttonThemLoaiThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemLoaiThanhVienActionPerformed(evt);
            }
        });

        buttonSuaLoaiThanhVien.setText("Sửa");
        buttonSuaLoaiThanhVien.setActionCommand("Them");
        buttonSuaLoaiThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaLoaiThanhVienActionPerformed(evt);
            }
        });

        buttonXoaLoaiThanhVien.setText("Xóa");

        textGhiChuThanhVien.setColumns(20);
        textGhiChuThanhVien.setRows(5);
        jScrollPane4.setViewportView(textGhiChuThanhVien);

        jLabel8.setText("Mã loại thành viên");

        jLabel9.setText("Tên loại thành viên");

        jLabel10.setText("Ghi chú");

        buttonLuuLoaiThanhVien.setText("Lưu");
        buttonLuuLoaiThanhVien.setActionCommand("Luu");
        buttonLuuLoaiThanhVien.setEnabled(false);
        buttonLuuLoaiThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuLoaiThanhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTVLayout = new javax.swing.GroupLayout(panelTV);
        panelTV.setLayout(panelTVLayout);
        panelTVLayout.setHorizontalGroup(
            panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTVLayout.createSequentialGroup()
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTVLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textTimThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTimLoaiThanhVien)
                        .addGap(60, 60, 60)
                        .addComponent(buttonLamMoiLoaiThanhVien))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelTVLayout.createSequentialGroup()
                        .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonThemLoaiThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSuaLoaiThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonXoaLoaiThanhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(buttonLuuLoaiThanhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(textTenLoaiThanhVien, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textMaLoaiThanhVien, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelTVLayout.setVerticalGroup(
            panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTVLayout.createSequentialGroup()
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTVLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonLuuLoaiThanhVien)))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textTimThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimLoaiThanhVien)
                    .addComponent(buttonLamMoiLoaiThanhVien)
                    .addComponent(buttonXoaLoaiThanhVien)))
            .addGroup(panelTVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textMaLoaiThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textTenLoaiThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(buttonThemLoaiThanhVien)
                .addGap(18, 18, 18)
                .addComponent(buttonSuaLoaiThanhVien))
        );

        buttonThemLoaiThanhVien.getAccessibleContext().setAccessibleName("Them");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(panelTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(panelTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jTabbedPane1.addTab("Loại thành viên", jPanel4);

        jLabel1.setText("Mã nhà cung cấp");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("Điện thoại");

        tableNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNhaCungCap);

        buttonXoaNhaCungCap.setText("Xóa");
        buttonXoaNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonXoaNhaCungCapMouseClicked(evt);
            }
        });
        buttonXoaNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaNhaCungCapActionPerformed(evt);
            }
        });

        buttonSuaNhaCungCap.setText("Sửa");
        buttonSuaNhaCungCap.setActionCommand("Sua");
        buttonSuaNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaNhaCungCapActionPerformed(evt);
            }
        });

        jLabel7.setText("Tìm kiếm");

        buttonThemNhaCungCap.setText("Thêm");
        buttonThemNhaCungCap.setActionCommand("Them");
        buttonThemNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemNhaCungCapActionPerformed(evt);
            }
        });

        buttonTimNhaCungCap.setText("Tìm");
        buttonTimNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimNhaCungCapActionPerformed(evt);
            }
        });

        buttonLuuNhaCungCap.setText("Lưu");
        buttonLuuNhaCungCap.setActionCommand("Them");
        buttonLuuNhaCungCap.setEnabled(false);
        buttonLuuNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuNhaCungCapActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên nhà cung cấp");

        buttonLamMoiNhaCungCap.setText("Làm mới");
        buttonLamMoiNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLamMoiNhaCungCapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNhaCCLayout = new javax.swing.GroupLayout(panelNhaCC);
        panelNhaCC.setLayout(panelNhaCCLayout);
        panelNhaCCLayout.setHorizontalGroup(
            panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhaCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNhaCCLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(textTimNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonTimNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(buttonLamMoiNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhaCCLayout.createSequentialGroup()
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDienThoaiNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(textTenNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textDiaChiNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textMaNhaCungCap)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhaCCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonThemNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSuaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLuuNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonXoaNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelNhaCCLayout.setVerticalGroup(
            panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhaCCLayout.createSequentialGroup()
                .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNhaCCLayout.createSequentialGroup()
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textMaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textTenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textDiaChiNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textDienThoaiNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSuaNhaCungCap)
                            .addComponent(buttonLuuNhaCungCap))
                        .addGap(18, 18, 18)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonThemNhaCungCap)
                            .addComponent(buttonXoaNhaCungCap))
                        .addGap(146, 146, 146)
                        .addGroup(panelNhaCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonLamMoiNhaCungCap)
                            .addComponent(buttonTimNhaCungCap)
                            .addComponent(textTimNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelNCCLayout = new javax.swing.GroupLayout(panelNCC);
        panelNCC.setLayout(panelNCCLayout);
        panelNCCLayout.setHorizontalGroup(
            panelNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNCCLayout.createSequentialGroup()
                .addComponent(panelNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelNCCLayout.setVerticalGroup(
            panelNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNCCLayout.createSequentialGroup()
                .addComponent(panelNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Nhà cung cấp", panelNCC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static void phanquyen() {
        switch (formMain.maChucVu) {
            case "GD":
                panelChucVu.setVisible(true);
                panelLK.setVisible(true);
                panelLoaiLK.setVisible(true);
                panelNhaCC.setVisible(true);
                panelTV.setVisible(true);
                break;
            case "Mana":
                panelChucVu.setVisible(false);
                panelLK.setVisible(true);
                panelLoaiLK.setVisible(true);
                panelNhaCC.setVisible(true);
                panelTV.setVisible(false);
                break;
            case "Admin":
                panelChucVu.setVisible(true);
                panelLK.setVisible(false);
                panelLoaiLK.setVisible(false);
                panelNhaCC.setVisible(false);
                panelTV.setVisible(true);
                break;
            default:
                panelChucVu.setVisible(false);
                panelLK.setVisible(false);
                panelLoaiLK.setVisible(false);
                panelNhaCC.setVisible(false);
                panelTV.setVisible(false);
                break;
        }
    }

    private void displayDataChucVu(ResultSet rs) {
        DefaultTableModel model = (DefaultTableModel) tableChucVu.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listChucVu.clear();
        try {

            while (rs.next()) {
                itemChucVu item = new itemChucVu(rs.getString("MaChucVu"), rs.getString("TenChucVu"), rs.getString("GhiChu"));
                listChucVu.add(item);

                Vector v = new Vector();
                v.add(item.getMaChucVu());
                v.add(item.getTenChucVu());
                v.add(item.getGhiChuChucVu());
                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayTheLoai(ResultSet rs) {
        DefaultTableModel model = (DefaultTableModel) tableTheLoai.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listTheLoai.clear();
        try {

            while (rs.next()) {
                itemTheLoai item = new itemTheLoai(rs.getInt("MaTheLoai"), rs.getString("TenTheLoai"));
                listTheLoai.add(item);

                Vector v = new Vector();
                v.add(item.getMaTheLoai());
                v.add(item.getTenTheLoai());
                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayNhaCungCap(ResultSet rs) {
        DefaultTableModel model = (DefaultTableModel) tableNhaCungCap.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listNhaCC.clear();
        try {

            while (rs.next()) {
                itemNhaCungCap item = new itemNhaCungCap(rs.getInt("MaNhaCC"), rs.getString("TenNhaCC"),
                        rs.getString("DiaChiNhaCC"), rs.getString("SDTNhaCC"));
                listNhaCC.add(item);

                Vector v = new Vector();
                v.add(item.getMaNhaCungCap());
                v.add(item.getTenNhaCungCap());
                v.add(item.getDiaChiNhaCungCap());
                v.add(item.getDienThoaiNhaCungCap());
                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayLoaiThanhVien(ResultSet rs) {
        DefaultTableModel model = (DefaultTableModel) tableThanhVien.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        ListLoaiTV.clear();
        try {

            while (rs.next()) {
                itemLoaiThanhVien item = new itemLoaiThanhVien(rs.getString("MaLoaiThanhVien"), rs.getString("TenLoaiThanhVien"), rs.getString("GhiChu"));
                ListLoaiTV.add(item);

                Vector v = new Vector();
                v.add(item.getMaLoaiThanhVien());
                v.add(item.getTenLoaiThanhVien());
                v.add(item.getGhiChu());
                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayDia(ResultSet rs) {
        DefaultTableModel model = (DefaultTableModel) tableDia.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {

            while (rs.next()) {

                iteamBaseDia item = new iteamBaseDia(rs.getInt("MaTheLoai"), rs.getInt("MaDia"), rs.getString("TenDia"),
                        rs.getString("QuocGia"), rs.getString("DienVienChinh"), rs.getInt("SoTap"));
                listBaseDia.add(item);

                String tentheloai = (new BTheLoai()).getTenTheLoai(rs.getInt("MaTheLoai"));
                Vector v = new Vector();
                v.add(tentheloai);
                v.add(rs.getInt("MaDia"));
                v.add(rs.getString("TenDia"));
                v.add(rs.getString("QuocGia"));
                v.add(rs.getString("DienVienChinh"));
                v.add(rs.getInt("SoTap"));
                v.add(rs.getDouble("DonGiaMua"));
                v.add(rs.getDouble("DonGiaBan"));
                v.add(rs.getDouble("DonGiaThue"));

                model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadCombTenLoaiLK() {
        lsCombLoaiLK.clear();
        combTenTheLoai.removeAllItems();

        BTheLoai BLLK = new BTheLoai();
        ResultSet rs = BLLK.getAll();
        try {
            while (rs.next()) {
                lsCombLoaiLK.add(rs.getString("MaTheLoai"));
                combTenTheLoai.addItem(rs.getString("TenTheLoai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormDuLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void buttonLamMoiChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLamMoiChucVuActionPerformed
        BChucVu BCV = new BChucVu();
        ResultSet rs = BCV.getAll();
        displayDataChucVu(rs);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLamMoiChucVuActionPerformed

    private void buttonLamMoiTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLamMoiTheLoaiActionPerformed

        BTheLoai BLKL = new BTheLoai();
        ResultSet rs = BLKL.getAll();
        displayTheLoai(rs);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLamMoiTheLoaiActionPerformed

    private void buttonLamMoiLoaiThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLamMoiLoaiThanhVienActionPerformed
        // TODO add your handling code here:
        BThanhVien BTV = new BThanhVien();
        ResultSet rs = BTV.getAllThanhVienNative();
        displayLoaiThanhVien(rs);
    }//GEN-LAST:event_buttonLamMoiLoaiThanhVienActionPerformed

    private void buttonLamMoiNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLamMoiNhaCungCapActionPerformed
        // TODO add your handling code here:
        BNhaCungCap BNCC = new BNhaCungCap();
        ResultSet rs = BNCC.getAll();
        displayNhaCungCap(rs);
    }//GEN-LAST:event_buttonLamMoiNhaCungCapActionPerformed

    private void buttonThemNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemNhaCungCapActionPerformed
        // TODO add your handling code here:
        if (buttonThemNhaCungCap.getActionCommand().equals("Them")) {
            buttonThemNhaCungCap.setActionCommand("Huy");
            buttonThemNhaCungCap.setText("Hủy");

            buttonSuaNhaCungCap.setEnabled(false);
            buttonXoaNhaCungCap.setEnabled(false);

            buttonLuuNhaCungCap.setActionCommand("Them");
            buttonLuuNhaCungCap.setEnabled(true);
        } else {
            buttonThemNhaCungCap.setActionCommand("Them");
            buttonThemNhaCungCap.setText("Thêm");

            buttonSuaNhaCungCap.setEnabled(true);
            buttonXoaNhaCungCap.setEnabled(true);

            buttonLuuNhaCungCap.setActionCommand("Luu");
            buttonLuuNhaCungCap.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonThemNhaCungCapActionPerformed

    private void buttonSuaNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaNhaCungCapActionPerformed
        // TODO add your handling code here:
        if (buttonSuaNhaCungCap.getActionCommand().equals("Sua")) {
            buttonSuaNhaCungCap.setActionCommand("Huy");
            buttonSuaNhaCungCap.setText("Hủy");

            buttonThemNhaCungCap.setEnabled(false);
            buttonXoaNhaCungCap.setEnabled(false);

            buttonLuuNhaCungCap.setActionCommand("Sua");
            buttonLuuNhaCungCap.setEnabled(true);
        } else {
            buttonSuaNhaCungCap.setActionCommand("Sua");
            buttonSuaNhaCungCap.setText("Sửa");

            buttonThemNhaCungCap.setEnabled(true);
            buttonXoaNhaCungCap.setEnabled(true);

            buttonLuuNhaCungCap.setActionCommand("Luu");
            buttonLuuNhaCungCap.setEnabled(false);
        }
    }//GEN-LAST:event_buttonSuaNhaCungCapActionPerformed

    private void buttonTimNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimNhaCungCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTimNhaCungCapActionPerformed

    private void buttonThemChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemChucVuActionPerformed
        // TODO add your handling code here:
        if (buttonThemChucVu.getActionCommand().equals("Them")) {
//            textMaChucVu.setText("");
//            textTenChucVu.setText("");
//            textGhiChuChucVu.setText("");
            textMaChucVu.requestFocus();

            buttonThemChucVu.setActionCommand("Huy");
            buttonThemChucVu.setText("Hủy");

            buttonSuaChucVu.setEnabled(false);
            buttonXoaChucVu.setEnabled(false);

            buttonLuuChucVu.setActionCommand("Them");
            buttonLuuChucVu.setEnabled(true);
        } else {
            buttonThemChucVu.setActionCommand("Them");
            buttonThemChucVu.setText("Thêm");

            buttonSuaChucVu.setEnabled(true);
            buttonXoaChucVu.setEnabled(true);

            buttonLuuChucVu.setActionCommand("Luu");
            buttonLuuChucVu.setEnabled(false);
        }
    }//GEN-LAST:event_buttonThemChucVuActionPerformed

    private void buttonSuaChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaChucVuActionPerformed
        if (buttonSuaChucVu.getActionCommand().equals("Sua")) {
            buttonSuaChucVu.setActionCommand("Huy");
            buttonSuaChucVu.setText("Hủy");

            buttonThemChucVu.setEnabled(false);
            buttonXoaChucVu.setEnabled(false);

            buttonLuuChucVu.setActionCommand("Sua");
            buttonLuuChucVu.setEnabled(true);
        } else {
            buttonSuaChucVu.setActionCommand("Sua");
            buttonSuaChucVu.setText("Sửa");

            buttonThemChucVu.setEnabled(true);
            buttonXoaChucVu.setEnabled(true);

            buttonLuuChucVu.setActionCommand("Luu");
            buttonLuuChucVu.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSuaChucVuActionPerformed

    private void buttonThemTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemTheLoaiActionPerformed
        if (buttonThemTheLoai.getActionCommand().equals("Them")) {

            buttonThemTheLoai.setActionCommand("Huy");
            buttonThemTheLoai.setText("Hủy");

            buttonSuaTheLoai.setEnabled(false);
            buttonXoaTheLoai.setEnabled(false);

            buttonLuuTheLoai.setActionCommand("Them");
            buttonLuuTheLoai.setEnabled(true);
        } else {
            buttonThemTheLoai.setActionCommand("Them");
            buttonThemTheLoai.setText("Thêm");

            buttonSuaTheLoai.setEnabled(true);
            buttonXoaTheLoai.setEnabled(true);

            buttonLuuTheLoai.setActionCommand("Luu");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonThemTheLoaiActionPerformed

    private void buttonSuaTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaTheLoaiActionPerformed
        if (buttonSuaTheLoai.getActionCommand().equals("Sua")) {
            buttonSuaTheLoai.setActionCommand("Huy");
            buttonSuaTheLoai.setText("Hủy");

            buttonThemTheLoai.setEnabled(false);
            buttonXoaTheLoai.setEnabled(false);

            buttonLuuTheLoai.setActionCommand("Sua");
            buttonLuuTheLoai.setEnabled(true);
        } else {
            buttonSuaTheLoai.setActionCommand("Sua");
            buttonSuaTheLoai.setText("Sửa");

            buttonThemTheLoai.setEnabled(true);
            buttonXoaTheLoai.setEnabled(true);

            buttonLuuTheLoai.setActionCommand("Luu");
            buttonLuuTheLoai.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSuaTheLoaiActionPerformed

    private void buttonThemLoaiThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemLoaiThanhVienActionPerformed
        if (buttonThemLoaiThanhVien.getActionCommand().equals("Them")) {
            buttonThemLoaiThanhVien.setActionCommand("Huy");
            buttonThemLoaiThanhVien.setText("Hủy");

            buttonSuaLoaiThanhVien.setEnabled(false);
            buttonXoaLoaiThanhVien.setEnabled(false);

            buttonLuuLoaiThanhVien.setActionCommand("Them");
            buttonLuuLoaiThanhVien.setEnabled(true);
        } else {
            buttonThemLoaiThanhVien.setActionCommand("Them");
            buttonThemLoaiThanhVien.setText("Thêm");

            buttonSuaLoaiThanhVien.setEnabled(true);
            buttonXoaLoaiThanhVien.setEnabled(true);

            buttonLuuLoaiThanhVien.setActionCommand("Luu");
            buttonLuuLoaiThanhVien.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_buttonThemLoaiThanhVienActionPerformed

    private void buttonSuaLoaiThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaLoaiThanhVienActionPerformed
        if (buttonSuaLoaiThanhVien.getActionCommand().equals("Sua")) {
            buttonSuaLoaiThanhVien.setActionCommand("Huy");
            buttonSuaLoaiThanhVien.setText("Hủy");

            buttonThemLoaiThanhVien.setEnabled(false);
            buttonXoaLoaiThanhVien.setEnabled(false);

            buttonLuuLoaiThanhVien.setActionCommand("Sua");
            buttonLuuLoaiThanhVien.setEnabled(true);
        } else {
            buttonSuaLoaiThanhVien.setActionCommand("Sua");
            buttonSuaLoaiThanhVien.setText("Sửa");

            buttonThemLoaiThanhVien.setEnabled(true);
            buttonXoaLoaiThanhVien.setEnabled(true);

            buttonLuuLoaiThanhVien.setActionCommand("Luu");
            buttonLuuLoaiThanhVien.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSuaLoaiThanhVienActionPerformed

    private void buttonLuuChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuChucVuActionPerformed
        if (buttonLuuChucVu.getActionCommand().equals("Them")) {

            //them
            BChucVu BCV = new BChucVu();
            if (BCV.insertByProperties(textMaChucVu.getText(), textTenChucVu.getText(), textGhiChuChucVu.getText())) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!", "Đã thêm!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Mã chức vụ đã tồn tại!", "Chưa thêm!", JOptionPane.ERROR_MESSAGE);
            }

            //-them
            buttonLuuChucVu.setActionCommand("Luu");
            buttonLuuChucVu.setEnabled(false);

            buttonThemChucVu.setText("Thêm");
            buttonThemChucVu.setActionCommand("Them");

            buttonSuaChucVu.setEnabled(true);

            buttonXoaChucVu.setEnabled(true);
        } else if (buttonLuuChucVu.getActionCommand().equals("Sua")) {
            //them
            BChucVu BCV = new BChucVu();
            if (BCV.updateBySQLString(textMaChucVu.getText(), textTenChucVu.getText(), textGhiChuChucVu.getText())) {
                JOptionPane.showMessageDialog(this, "Thêm sửa thành công!", "Đã sửa!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Có lỗi khi sửa!", "Chưa sửa!", JOptionPane.ERROR_MESSAGE);
            }

            //-them
            buttonLuuChucVu.setActionCommand("Luu");
            buttonLuuChucVu.setEnabled(false);

            buttonSuaChucVu.setText("Sửa");
            buttonSuaChucVu.setActionCommand("Sua");

            buttonThemChucVu.setEnabled(true);

            buttonXoaChucVu.setEnabled(true);
        }
        buttonLamMoiChucVuActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLuuChucVuActionPerformed

    private void tableChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChucVuMouseClicked
        int index = tableChucVu.getSelectedRow();
        if (index >= 0) {
            textMaChucVu.setText(listChucVu.get(index).getMaChucVu());
            textTenChucVu.setText(listChucVu.get(index).getTenChucVu());
            textGhiChuChucVu.setText(listChucVu.get(index).getGhiChuChucVu());

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tableChucVuMouseClicked

    private void buttonXoaChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaChucVuActionPerformed
        // TODO add your handling code here:
        int index = tableChucVu.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng có dữ liệu!", "Rỗng!", JOptionPane.ERROR_MESSAGE);
        } else if (0 == JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Xóa", JOptionPane.OK_CANCEL_OPTION)) {
            BChucVu BCV = new BChucVu();
            String machucvu = listChucVu.get(index).getMaChucVu();

            if (BCV.deleteByID(machucvu)) {
                JOptionPane.showMessageDialog(this, "Đã xóa thành công!", "Đã xóa!", JOptionPane.INFORMATION_MESSAGE);
                buttonLamMoiChucVuActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Đã có tài khoản thuộc chức vụ này!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonXoaChucVuActionPerformed

    private void buttonLuuTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuTheLoaiActionPerformed
        // TODO add your handling code here:
        if (buttonLuuTheLoai.getActionCommand().equals("Them")) {

            //them
            BTheLoai BTL = new BTheLoai();
            try {
                if (BTL.insertByProperties(Integer.parseInt(textMaTheLoai.getText()), textTenTheLoai.getText())) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công!", "Đã thêm!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Mã thể loại đã tồn tại!", "Chưa thêm!", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Mã thể loại phải là số!");
            }

            //-them
            buttonLuuTheLoai.setActionCommand("Luu");
            buttonLuuTheLoai.setEnabled(false);

            buttonThemTheLoai.setText("Thêm");
            buttonThemTheLoai.setActionCommand("Them");

            buttonSuaTheLoai.setEnabled(true);

            buttonXoaTheLoai.setEnabled(true);
        } else if (buttonLuuTheLoai.getActionCommand().equals("Sua")) {
            //them
            BTheLoai BTL = new BTheLoai();
            try {
                if (BTL.updateByProperties(Integer.parseInt(textMaTheLoai.getText()), textTenTheLoai.getText())) {
                    JOptionPane.showMessageDialog(this, "Thêm sửa thành công!", "Đã sửa!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Mã thể loại đã tồn tại!", "Chưa sửa!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Mã thể loại phải là số!");
            }

            //-them
            buttonLuuTheLoai.setActionCommand("Luu");
            buttonLuuTheLoai.setEnabled(false);

            buttonSuaTheLoai.setText("Sửa");
            buttonSuaTheLoai.setActionCommand("Sua");

            buttonThemTheLoai.setEnabled(true);

            buttonXoaTheLoai.setEnabled(true);
        }
        buttonLamMoiTheLoaiActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLuuTheLoaiActionPerformed

    private void buttonXoaTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaTheLoaiActionPerformed
        // TODO add your handling code here:
        int index = tableTheLoai.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng có dữ liệu!", "Rỗng!", JOptionPane.ERROR_MESSAGE);
        } else if (0 == JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Xóa", JOptionPane.OK_CANCEL_OPTION)) {
            BTheLoai BTL = new BTheLoai();
            int matheloai = listTheLoai.get(index).getMaTheLoai();
            if (BTL.deleteByID(String.valueOf(matheloai))) {
                JOptionPane.showMessageDialog(this, "Đã xóa thành công!", "Đã xóa!", JOptionPane.INFORMATION_MESSAGE);
                buttonLamMoiChucVuActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Có đĩa thuộc thể loại này, vui lòng xóa đĩa trước!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonXoaTheLoaiActionPerformed

    private void tableTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTheLoaiMouseClicked

        int index = tableTheLoai.getSelectedRow();
        if (index >= 0) {
            textMaTheLoai.setText(String.valueOf(listTheLoai.get(index).getMaTheLoai()));
            textTenTheLoai.setText(listTheLoai.get(index).getTenTheLoai());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tableTheLoaiMouseClicked

    private void buttonLuuLoaiThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuLoaiThanhVienActionPerformed
        if (buttonLuuLoaiThanhVien.getActionCommand().equals("Them")) {

            //them
            BLoaiThanhVien BLTV = new BLoaiThanhVien();
            if (BLTV.insertByProperties(textMaLoaiThanhVien.getText(), textTenLoaiThanhVien.getText(), textGhiChuThanhVien.getText())) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!", "Đã thêm!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Mã thành viên đã tồn tại!", "Chưa thêm!", JOptionPane.ERROR_MESSAGE);
            }

            //-them
            buttonLuuLoaiThanhVien.setActionCommand("Luu");
            buttonLuuLoaiThanhVien.setEnabled(false);

            buttonThemLoaiThanhVien.setText("Thêm");
            buttonThemLoaiThanhVien.setActionCommand("Them");

            buttonSuaLoaiThanhVien.setEnabled(true);

            buttonXoaLoaiThanhVien.setEnabled(true);
        } else if (buttonLuuLoaiThanhVien.getActionCommand().equals("Sua")) {
            //them
            BLoaiThanhVien BLTV = new BLoaiThanhVien();
            if (BLTV.updateByProperties(textMaLoaiThanhVien.getText(), textTenLoaiThanhVien.getText(), textGhiChuThanhVien.getText())) {
                JOptionPane.showMessageDialog(this, "Thêm sửa thành công!", "Đã sửa!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Mã thành viên đã tồn tại!", "Chưa sửa!", JOptionPane.ERROR_MESSAGE);
            }

            //-them
            buttonLuuLoaiThanhVien.setActionCommand("Luu");
            buttonLuuLoaiThanhVien.setEnabled(false);

            buttonSuaLoaiThanhVien.setText("Sửa");
            buttonSuaLoaiThanhVien.setActionCommand("Sua");

            buttonThemLoaiThanhVien.setEnabled(true);

            buttonXoaLoaiThanhVien.setEnabled(true);
        }
        buttonLamMoiLoaiThanhVienActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLuuLoaiThanhVienActionPerformed

    private void tableThanhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThanhVienMouseClicked
        // TODO add your handling code here:
        int index = tableThanhVien.getSelectedRow();
        if (index >= 0) {
            textMaLoaiThanhVien.setText(ListLoaiTV.get(index).getMaLoaiThanhVien());
            textTenLoaiThanhVien.setText(ListLoaiTV.get(index).getTenLoaiThanhVien());
            textGhiChuThanhVien.setText(ListLoaiTV.get(index).getGhiChu());

        }
    }//GEN-LAST:event_tableThanhVienMouseClicked

    private void buttonLuuNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuNhaCungCapActionPerformed
        // TODO add your handling code here:
        if (buttonLuuNhaCungCap.getActionCommand().equals("Them")) {

            //them
            BNhaCungCap BNCC = new BNhaCungCap();
            try {
                if (BNCC.insertByProperties(Integer.parseInt(textMaNhaCungCap.getText()), textTenNhaCungCap.getText(), textDiaChiNhaCungCap.getText(),
                        textDienThoaiNhaCungCap.getText())) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công!", "Đã thêm!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Mã nhà cung cấp đã tồn tại!", "Chưa thêm!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Mã nhà cung cấp phải là số!");
            }

            //-them
            buttonLuuNhaCungCap.setActionCommand("Luu");
            buttonLuuNhaCungCap.setEnabled(false);

            buttonThemNhaCungCap.setText("Thêm");
            buttonThemNhaCungCap.setActionCommand("Them");

            buttonSuaNhaCungCap.setEnabled(true);

            buttonXoaNhaCungCap.setEnabled(true);
        } else if (buttonLuuNhaCungCap.getActionCommand().equals("Sua")) {
            //them
            BNhaCungCap BNCC = new BNhaCungCap();
            try {
                if (BNCC.updateByProperties(Integer.parseInt(textMaNhaCungCap.getText()), textTenNhaCungCap.getText(), textDiaChiNhaCungCap.getText(),
                        textDienThoaiNhaCungCap.getText())) {
                    JOptionPane.showMessageDialog(this, "Thêm sửa thành công!", "Đã sửa!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Mã nhà cung cấp đã tồn tại!", "Chưa sửa!", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Mã nhà cung cấp phải là số!");
            }

            //-them
            buttonLuuNhaCungCap.setActionCommand("Luu");
            buttonLuuNhaCungCap.setEnabled(false);

            buttonSuaNhaCungCap.setText("Sửa");
            buttonSuaNhaCungCap.setActionCommand("Sua");

            buttonThemNhaCungCap.setEnabled(true);

            buttonXoaNhaCungCap.setEnabled(true);
        }
        buttonLamMoiNhaCungCapActionPerformed(evt);
    }//GEN-LAST:event_buttonLuuNhaCungCapActionPerformed

    private void buttonXoaNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonXoaNhaCungCapMouseClicked

        //ling code here:
    }//GEN-LAST:event_buttonXoaNhaCungCapMouseClicked

    private void buttonXoaNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaNhaCungCapActionPerformed
        // TODO add your handling code here:
        int index = tableNhaCungCap.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng có dữ liệu!", "Rỗng!", JOptionPane.ERROR_MESSAGE);
        } else if (0 == JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Xóa", JOptionPane.OK_CANCEL_OPTION)) {
            BNhaCungCap BNCC = new BNhaCungCap();
            String machucvu = String.valueOf(listNhaCC.get(index).getMaNhaCungCap());

            if (BNCC.deleteByID(machucvu)) {
                JOptionPane.showMessageDialog(this, "Đã xóa thành công!", "Đã xóa!", JOptionPane.INFORMATION_MESSAGE);
                buttonLamMoiNhaCungCapActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Đã có đơn đặt hàng từ nhà cung cấp này!!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        }// TODO add your hand
    }//GEN-LAST:event_buttonXoaNhaCungCapActionPerformed

    private void tableNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNhaCungCapMouseClicked
        int index = tableNhaCungCap.getSelectedRow();
        if (index >= 0) {
            textMaNhaCungCap.setText(String.valueOf(listNhaCC.get(index).getMaNhaCungCap()));
            textTenNhaCungCap.setText(listNhaCC.get(index).getTenNhaCungCap());
            textDiaChiNhaCungCap.setText(listNhaCC.get(index).getDiaChiNhaCungCap());
            textDienThoaiNhaCungCap.setText(listNhaCC.get(index).getDienThoaiNhaCungCap());
            buttonLamMoiLoaiThanhVienActionPerformed(null);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNhaCungCapMouseClicked

    private void tableDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDiaMouseClicked
        // TODO add your handling code here:
        int index = tableDia.getSelectedRow();
        if (index >= 0) {
            String tentheloai = (new BTheLoai()).getTenTheLoai(listBaseDia.get(index).getMaTheLoai());
            combTenTheLoai.setSelectedItem(tentheloai);

            textMaDia.setText(String.valueOf(listBaseDia.get(index).getMaDia()));
            textTenDia.setText(listBaseDia.get(index).getTenDia());
            txtQuocGia.setText(listBaseDia.get(index).getQuocGia());
            txtDienVien.setText(listBaseDia.get(index).getDienVienChinh());
            txtSoTap.setText(String.valueOf(listBaseDia.get(index).getSoTap()));
            txtGiaMua.setText(this.tableDia.getValueAt(index, 6).toString());
            txtGiaBan.setText(this.tableDia.getValueAt(index, 7).toString());
            txtGiaThue.setText(this.tableDia.getValueAt(index, 8).toString());

        }
    }//GEN-LAST:event_tableDiaMouseClicked

    private void buttonLamMoiDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLamMoiDiaActionPerformed
        // TODO add your handling code here:
        BDiaBase BLKB = new BDiaBase();
        ResultSet rs = BLKB.getBaseProperties();
        displayDia(rs);
        loadCombTenLoaiLK();
    }//GEN-LAST:event_buttonLamMoiDiaActionPerformed

    private void buttonThemDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemDiaActionPerformed
        // TODO add your handling code here:
        if (buttonThemDia.getActionCommand().equals("Them")) {
            buttonThemDia.setActionCommand("Huy");
            buttonThemDia.setText("Hủy");

            buttonSuaDia.setEnabled(false);
            buttonXoaDia.setEnabled(false);

            buttonLuuDia.setActionCommand("Them");
            buttonLuuDia.setEnabled(true);
        } else {
            buttonThemDia.setActionCommand("Them");
            buttonThemDia.setText("Thêm");

            buttonSuaDia.setEnabled(true);
            buttonXoaDia.setEnabled(true);

            buttonLuuDia.setActionCommand("Luu");
            buttonLuuDia.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_buttonThemDiaActionPerformed

    private void buttonSuaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaDiaActionPerformed
        if (buttonSuaDia.getActionCommand().equals("Sua")) {
            buttonSuaDia.setActionCommand("Huy");
            buttonSuaDia.setText("Hủy");

            buttonThemDia.setEnabled(false);
            buttonXoaDia.setEnabled(false);

            buttonLuuDia.setActionCommand("Sua");
            buttonLuuDia.setEnabled(true);
        } else {
            buttonSuaDia.setActionCommand("Sua");
            buttonSuaDia.setText("Sửa");

            buttonThemDia.setEnabled(true);
            buttonXoaDia.setEnabled(true);

            buttonLuuDia.setActionCommand("Luu");
            buttonLuuDia.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_buttonSuaDiaActionPerformed

    private void buttonXoaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaDiaActionPerformed
        // TODO add your handling code here:
        int index = tableDia.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 dòng có dữ liệu!", "Rỗng!", JOptionPane.ERROR_MESSAGE);
        } else if (0 == JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Xóa", JOptionPane.OK_CANCEL_OPTION)) {
            BDiaBase BTL = new BDiaBase();
            int madia = listBaseDia.get(index).getMaDia();
            if (BTL.deleteByID(String.valueOf(madia))) {
                JOptionPane.showMessageDialog(this, "Đã xóa thành công!", "Đã xóa!", JOptionPane.INFORMATION_MESSAGE);
                buttonLamMoiDiaActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Đĩa đã cho thuê hoặc bán!", "Lỗi!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonXoaDiaActionPerformed

    private void buttonLuuDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuDiaActionPerformed
        BTheLoai BLLK = new BTheLoai();
        int matheloai = Integer.parseInt(lsCombLoaiLK.get(combTenTheLoai.getSelectedIndex()));
        if (buttonLuuDia.getActionCommand().equals("Them")) {

            //them
            BDiaBase BLKB = new BDiaBase();
            if (BLKB.insertBaseProperties(matheloai,
                    Integer.parseInt(textMaDia.getText()),
                    textTenDia.getText(),
                    txtQuocGia.getText(),
                    txtDienVien.getText(),
                    Integer.parseInt(txtSoTap.getText()),
                    Double.parseDouble(txtGiaMua.getText()),
                    Double.parseDouble(txtGiaBan.getText()),
                    Double.parseDouble(txtGiaThue.getText()))) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!", "Đã thêm!", JOptionPane.INFORMATION_MESSAGE);
                buttonLamMoiDiaActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Mã đĩa đã tồn tại!", "Chưa thêm!", JOptionPane.ERROR_MESSAGE);
            }

            //-them
            buttonLuuDia.setActionCommand("Luu");
            buttonLuuDia.setEnabled(false);

            buttonThemDia.setText("Thêm");
            buttonThemDia.setActionCommand("Them");

            buttonSuaDia.setEnabled(true);

            buttonXoaDia.setEnabled(true);
        } else if (buttonLuuDia.getActionCommand().equals("Sua")) {
            //Sua
            BDiaBase BLKB = new BDiaBase();

            if (BLKB.updateBaseProperties(matheloai,
                    Integer.parseInt(textMaDia.getText()),
                    textTenDia.getText(), txtQuocGia.getText(),
                    txtDienVien.getText(),
                    Integer.parseInt(txtSoTap.getText()),
                    Double.parseDouble(txtGiaMua.getText()),
                    Double.parseDouble(txtGiaBan.getText()),
                    Double.parseDouble(txtGiaThue.getText()))) {
                JOptionPane.showMessageDialog(this, "Thêm sửa thành công!", "Đã sửa!", JOptionPane.INFORMATION_MESSAGE);
                buttonLamMoiDiaActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Mã đĩa đã tồn tại!", "Chưa sửa!", JOptionPane.ERROR_MESSAGE);
            }

            //-them
            buttonLuuDia.setActionCommand("Luu");
            buttonLuuDia.setEnabled(false);

            buttonSuaDia.setText("Sửa");
            buttonSuaDia.setActionCommand("Sua");

            buttonThemDia.setEnabled(true);

            buttonXoaDia.setEnabled(true);
        }
    }//GEN-LAST:event_buttonLuuDiaActionPerformed

    private void combTenTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTenTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combTenTheLoaiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLamMoiChucVu;
    private javax.swing.JButton buttonLamMoiDia;
    private javax.swing.JButton buttonLamMoiLoaiThanhVien;
    private javax.swing.JButton buttonLamMoiNhaCungCap;
    private javax.swing.JButton buttonLamMoiTheLoai;
    private javax.swing.JButton buttonLuuChucVu;
    private javax.swing.JButton buttonLuuDia;
    private javax.swing.JButton buttonLuuLoaiThanhVien;
    private javax.swing.JButton buttonLuuNhaCungCap;
    private javax.swing.JButton buttonLuuTheLoai;
    private javax.swing.JButton buttonSuaChucVu;
    private javax.swing.JButton buttonSuaDia;
    private javax.swing.JButton buttonSuaLoaiThanhVien;
    private javax.swing.JButton buttonSuaNhaCungCap;
    private javax.swing.JButton buttonSuaTheLoai;
    private javax.swing.JButton buttonThemChucVu;
    private javax.swing.JButton buttonThemDia;
    private javax.swing.JButton buttonThemLoaiThanhVien;
    private javax.swing.JButton buttonThemNhaCungCap;
    private javax.swing.JButton buttonThemTheLoai;
    private javax.swing.JButton buttonTimChucVu;
    private javax.swing.JButton buttonTimDia;
    private javax.swing.JButton buttonTimLoaiThanhVien;
    private javax.swing.JButton buttonTimNhaCungCap;
    private javax.swing.JButton buttonTimTheLoai;
    private javax.swing.JButton buttonXoaChucVu;
    private javax.swing.JButton buttonXoaDia;
    private javax.swing.JButton buttonXoaLoaiThanhVien;
    private javax.swing.JButton buttonXoaNhaCungCap;
    private javax.swing.JButton buttonXoaTheLoai;
    private javax.swing.JComboBox combTenTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JPanel panelChucVu;
    protected static javax.swing.JPanel panelLK;
    protected static javax.swing.JPanel panelLoaiLK;
    protected static javax.swing.JPanel panelNCC;
    protected static javax.swing.JPanel panelNhaCC;
    static javax.swing.JPanel panelTV;
    private javax.swing.JTable tableChucVu;
    private javax.swing.JTable tableDia;
    private javax.swing.JTable tableNhaCungCap;
    private javax.swing.JTable tableThanhVien;
    private javax.swing.JTable tableTheLoai;
    private javax.swing.JTextField textDiaChiNhaCungCap;
    private javax.swing.JTextField textDienThoaiNhaCungCap;
    private javax.swing.JTextArea textGhiChuChucVu;
    private javax.swing.JTextArea textGhiChuThanhVien;
    private javax.swing.JTextField textMaChucVu;
    private javax.swing.JTextField textMaDia;
    private javax.swing.JTextField textMaLoaiThanhVien;
    private javax.swing.JTextField textMaNhaCungCap;
    private javax.swing.JTextField textMaTheLoai;
    private javax.swing.JTextField textTenChucVu;
    private javax.swing.JTextField textTenDia;
    private javax.swing.JTextField textTenLoaiThanhVien;
    private javax.swing.JTextField textTenNhaCungCap;
    private javax.swing.JTextField textTenTheLoai;
    private javax.swing.JTextField textTimChucVu;
    private javax.swing.JTextField textTimDia;
    private javax.swing.JTextField textTimNhaCungCap;
    private javax.swing.JTextField textTimThanhVien;
    private javax.swing.JTextField textTimTheLoai;
    private javax.swing.JTextField txtDienVien;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiaMua;
    private javax.swing.JTextField txtGiaThue;
    private javax.swing.JTextField txtQuocGia;
    private javax.swing.JTextField txtSoTap;
    private javax.swing.JTextField txtSoTap1;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel tableDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
