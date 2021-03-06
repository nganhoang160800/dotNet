/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javadoanmh;

import Bussiness.BDia;
import Bussiness.BNhaCungCap;
import Bussiness.BTheLoai;
import Bussiness.BSanPham;
import Item.itemDia;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lvdinh
 */
public class inFormSanPham extends javax.swing.JInternalFrame {

    /**
     * Creates new form inFormLinhKien
     */
    ArrayList<itemDia> listDia = new ArrayList<>();
    ArrayList<String> listCombTheLoai = new ArrayList<>();
    ArrayList<String> listCombSoPhieuNhap = new ArrayList<>();
    ArrayList<String> listCombMaDia = new ArrayList<>();
    ArrayList<String> listCombNhaCC = new ArrayList<>();
    int[] arrayTimKiem = new int[9];

    public inFormSanPham() {
        initComponents();

        textTimKiem.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(DocumentEvent e) {
                //System.out.println("removeUpdate");
                buttonTimKiemActionPerformed(null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                buttonTimKiemActionPerformed(null);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buttonTimKiemActionPerformed(null);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textTimKiem = new javax.swing.JTextField();
        buttonTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        combTenTheLoai = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDienVien = new javax.swing.JTextField();
        buttonXoaTruong = new javax.swing.JButton();
        buttonLuu = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        buttonThem = new javax.swing.JButton();
        buttonLamMoi = new javax.swing.JButton();
        checkTheLoai = new javax.swing.JCheckBox();
        checkMaDia = new javax.swing.JCheckBox();
        checkTenDia = new javax.swing.JCheckBox();
        checkHangSanXuat = new javax.swing.JCheckBox();
        checkTatCa = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        combSoPhieuNhap = new javax.swing.JComboBox();
        combMaDia = new javax.swing.JComboBox();
        spinSoTap = new javax.swing.JLabel();
        txtQuocGia = new javax.swing.JTextField();
        txtTenDia = new javax.swing.JTextField();
        combNhaCC = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("??i??a");
        setName("SanPham"); // NOI18N
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        tableDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "S???? phi???u nh???p", "Th???? loa??i", "Ma?? ??i??a", "T??n ??i??a", "Nha?? cung c????p", "Di????n vi??n chi??nh", "S???? t????p   ", "Qu????c gia "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        tableDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableDia);
        if (tableDia.getColumnModel().getColumnCount() > 0) {
            tableDia.getColumnModel().getColumn(4).setResizable(false);
            tableDia.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setText("T??m ki???m");

        textTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTimKiemKeyPressed(evt);
            }
        });

        buttonTimKiem.setText("T??m");
        buttonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimKiemActionPerformed(evt);
            }
        });

        jLabel2.setText("Theo");

        combTenTheLoai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        combTenTheLoai.setEnabled(false);

        jLabel3.setText("Loa??i ??i??a");

        jLabel4.setText("M?? ??i??a");

        jLabel5.setText("T??n ??i??a");

        jLabel6.setText("Di????n vi??n chi??nh");

        jLabel7.setText("Qu????c gia");

        jLabel8.setText("S???? t????p");

        jLabel9.setText("Nha?? sa??n xu????t");

        txtDienVien.setEnabled(false);

        buttonXoaTruong.setText("X??a tr?????ng");
        buttonXoaTruong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaTruongActionPerformed(evt);
            }
        });

        buttonLuu.setText("L??u");
        buttonLuu.setEnabled(false);
        buttonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuActionPerformed(evt);
            }
        });

        buttonSua.setText("S???a");
        buttonSua.setActionCommand("Sua");
        buttonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaActionPerformed(evt);
            }
        });

        buttonThem.setText("Th??m");
        buttonThem.setActionCommand("Them");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        buttonLamMoi.setText("L??m m???i");
        buttonLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLamMoiActionPerformed(evt);
            }
        });

        checkTheLoai.setText("Lo???i ??i??a");
        checkTheLoai.setName("0"); // NOI18N
        checkTheLoai.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkHangSanXuatStateChanged(evt);
            }
        });
        checkTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkHangSanXuatMouseClicked(evt);
            }
        });

        checkMaDia.setText("M?? ??i??a");
        checkMaDia.setName("1"); // NOI18N
        checkMaDia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkHangSanXuatStateChanged(evt);
            }
        });
        checkMaDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkHangSanXuatMouseClicked(evt);
            }
        });

        checkTenDia.setText("T??n ??i??a");
        checkTenDia.setName("2"); // NOI18N
        checkTenDia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkHangSanXuatStateChanged(evt);
            }
        });
        checkTenDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkHangSanXuatMouseClicked(evt);
            }
        });

        checkHangSanXuat.setText("Nha?? Sa??n Xu????t");
        checkHangSanXuat.setName("3"); // NOI18N
        checkHangSanXuat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkHangSanXuatStateChanged(evt);
            }
        });
        checkHangSanXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkHangSanXuatMouseClicked(evt);
            }
        });

        checkTatCa.setText("T??m theo t???t c???");
        checkTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkTatCaMouseClicked(evt);
            }
        });

        jLabel11.setText("S???? phi???u nh???p");

        combSoPhieuNhap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        combSoPhieuNhap.setEnabled(false);
        combSoPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combSoPhieuNhapMouseClicked(evt);
            }
        });

        combMaDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        combMaDia.setEnabled(false);

        spinSoTap.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        spinSoTap.setForeground(new java.awt.Color(0, 0, 204));
        spinSoTap.setText("0");

        txtQuocGia.setEnabled(false);

        txtTenDia.setEnabled(false);

        combNhaCC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        combNhaCC.setEnabled(false);
        combNhaCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combNhaCCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(checkTatCa)
                            .addGap(269, 269, 269)
                            .addComponent(buttonLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(combTenTheLoai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combSoPhieuNhap, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combMaDia, javax.swing.GroupLayout.Alignment.LEADING, 0, 175, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTenDia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(checkTheLoai)
                                .addGap(18, 18, 18)
                                .addComponent(checkMaDia)
                                .addGap(18, 18, 18)
                                .addComponent(checkTenDia)
                                .addGap(18, 18, 18)
                                .addComponent(checkHangSanXuat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(buttonXoaTruong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinSoTap, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combNhaCC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(buttonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonTimKiem)
                        .addComponent(checkTatCa)
                        .addComponent(buttonLamMoi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkTheLoai)
                    .addComponent(jLabel2)
                    .addComponent(checkMaDia)
                    .addComponent(checkTenDia)
                    .addComponent(checkHangSanXuat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinSoTap)
                            .addComponent(jLabel8))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(combNhaCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(combSoPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combMaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTenDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonXoaTruong)
                            .addComponent(buttonSua)
                            .addComponent(buttonLuu)
                            .addComponent(buttonThem))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void displayData(ResultSet rs) {

        listDia.clear();
        DefaultTableModel model;
        model = (DefaultTableModel) tableDia.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            while (rs.next()) {
                itemDia item = new itemDia(rs.getInt("SoPhieuNhap"),
                        (rs.getString("TenTheLoai")),
                        (rs.getString("TenDia")),
                        (rs.getString("QuocGia")),
                        (rs.getString("TenNhaCC")),
                        (rs.getString("DienVienChinh")),
                        (rs.getInt("MaDia")),
                        (rs.getInt("SoTap"))
                );

                listDia.add(item);

                Vector vector = new Vector();

                vector.add(item.getSoPhieuNhap());
                vector.add(item.getTenTheLoai());
                vector.add(item.getMaDia());
                vector.add(item.getTenDia());
                vector.add(item.getTenNhaCC());
                vector.add(item.getDienVienChinh());
                vector.add(item.getSoTap());
                vector.add(item.getQuocGia());
                model.addRow(vector);

            }
        } catch (Exception ex) {
            System.out.printf("[Ngo???i l??? displayData] " + ex.getMessage());
        }
        System.out.println("Rows loaded: " + listDia.toArray().length);
    }

    private void loadComboLoaiLinhKien() {
        listCombTheLoai.clear();
        combTenTheLoai.removeAllItems();
        BTheLoai BTL = new BTheLoai();
        ResultSet rs = BTL.getAllTenTheLoai();
        try {
            while (rs.next()) {
                combTenTheLoai.addItem(rs.getString("TenTheLoai"));
                listCombTheLoai.add(rs.getString("TenTheLoai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("L???i load comboBox m?? th???? loa??i! " + ex.getMessage());
        }
    }

    private void loadComboSoPhieuNhap() {
        listCombSoPhieuNhap.clear();
        combSoPhieuNhap.removeAllItems();
        BDia BSP = new BDia();
        ResultSet rs = BSP.getSoPhieuNhap();
        try {
            while (rs.next()) {
                combSoPhieuNhap.addItem(rs.getString("SoPhieuNhap"));
                listCombSoPhieuNhap.add(rs.getString("SoPhieuNhap"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("L???i load comboBox m?? phi???u nh???p! " + ex.getMessage());
        }
    }

    private void loadComboNhaCC() {
        listCombNhaCC.clear();
        combNhaCC.removeAllItems();
        BNhaCungCap BNCC = new BNhaCungCap();
        ResultSet rs = BNCC.getAllTenNhaCC();
        try {
            while (rs.next()) {
                combNhaCC.addItem(rs.getString("TenNhaCC"));
                listCombNhaCC.add(rs.getString("TenNhaCC"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("L???i load comboBox m?? th???? loa??i! " + ex.getMessage());
        }
    }

    private void loadCombMaDia() {
        int sophieunhap = Integer.parseInt(combSoPhieuNhap.getSelectedItem().toString());
        String spn = String.valueOf(sophieunhap);
        if (spn == null || "".equals(spn)) {

        }
        listCombMaDia.clear();
        combMaDia.removeAllItems();
        BDia BSP = new BDia();
        ResultSet rs = BSP.getMaDiaBaSoPhieuNhap(sophieunhap);
        try {
            while (rs.next()) {
                combMaDia.addItem(rs.getString("MaDia"));
                listCombMaDia.add(rs.getString("MaDia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(inFormSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buttonLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLamMoiActionPerformed
        // TODO add your handling code here:
        BSanPham BSP = new BSanPham();
        ResultSet rs = BSP.getAll();
        loadComboSoPhieuNhap();
        loadCombMaDia();
        loadComboLoaiLinhKien();
        loadComboNhaCC();
        displayData(rs);
    }//GEN-LAST:event_buttonLamMoiActionPerformed

    private void tableDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDiaMouseClicked
        int index = tableDia.getSelectedRow();
        combSoPhieuNhap.setSelectedItem(listDia.get(index).getSoPhieuNhap());
        combMaDia.setSelectedIndex(listCombMaDia.indexOf((listDia.get(index)).getMaDia()));
        combTenTheLoai.setSelectedIndex(listCombTheLoai.indexOf((listDia.get(index)).getTenTheLoai()));

        txtTenDia.setText(listDia.get(index).getTenDia());
        spinSoTap.setText("" + listDia.get(index).getSoTap());
        combNhaCC.setSelectedIndex(listCombNhaCC.indexOf((listDia.get(index)).getTenNhaCC()));
        txtDienVien.setText(listDia.get(index).getDienVienChinh());
        txtQuocGia.setText(listDia.get(index).getQuocGia());
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDiaMouseClicked

    private void buttonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimKiemActionPerformed
        // TODO add your handling code here:
        BSanPham BSP = new BSanPham();
        ResultSet rs = BSP.searchByProperties(arrayTimKiem, textTimKiem.getText());
        displayData(rs);
    }//GEN-LAST:event_buttonTimKiemActionPerformed

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        // TODO add your handling code here:
        if (buttonThem.getActionCommand().equals("Them")) {
            combMaDia.setEnabled(true);
            combSoPhieuNhap.setEnabled(true);
            combTenTheLoai.setEnabled(true);
            txtTenDia.setEnabled(true);
            spinSoTap.setEnabled(true);
            combNhaCC.setEnabled(true);
            txtDienVien.setEnabled(true);
            txtQuocGia.setEnabled(true);

            buttonLuu.setEnabled(true);
            buttonSua.setEnabled(false);
            buttonThem.setActionCommand("Huy");
            buttonThem.setText("H???y");

            //---
            loadComboSoPhieuNhap();
            loadCombMaDia();
            loadComboLoaiLinhKien();
            loadComboNhaCC();

        } else {
            combMaDia.setEnabled(false);
            combSoPhieuNhap.setEnabled(false);
            combTenTheLoai.setEnabled(false);
            txtTenDia.setEnabled(false);
            txtDienVien.setEnabled(false);
            combNhaCC.setEnabled(false);
            txtQuocGia.setEnabled(false);
            spinSoTap.setEnabled(false);

            buttonLuu.setEnabled(false);
            buttonSua.setEnabled(true);
            buttonThem.setActionCommand("Th??m");
            buttonThem.setText("Th??m");
        }
    }//GEN-LAST:event_buttonThemActionPerformed

    private void buttonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuActionPerformed
        // TODO add your handling code here:
        int index = tableDia.getSelectedRow();
        BSanPham BSP = new BSanPham();
        if (BSP.updateByProperties(listDia.get(index).getMaDia(),
                txtTenDia.getText(),
                Integer.parseInt(combTenTheLoai.getSelectedItem().toString()),
                txtQuocGia.getText(),
                Integer.parseInt(spinSoTap.getText()),
                txtDienVien.getText())) ;
        {
            buttonLamMoiActionPerformed(evt);

            JOptionPane.showMessageDialog(this, "C???p nh???t linh ki???n th??nh c??ng!", "C???p nh???t th??nh c??ng!", JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(this, "C?? l???i khi c???p nh???t linh ki???n!", "Ch??a c???p nh???t!", JOptionPane.ERROR_MESSAGE);

        // buttonLuu.setEnabled(false);
        buttonThem.setEnabled(true);
        buttonSua.setEnabled(true);
    }//GEN-LAST:event_buttonLuuActionPerformed

    private void checkTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkTatCaMouseClicked
        // TODO add your handling code here:
        if (checkTatCa.isSelected()) {
            checkMaDia.setSelected(true);
            checkTenDia.setSelected(true);
            checkTheLoai.setSelected(true);
            //  checkQuocGia.setSelected(true);

            checkHangSanXuat.setSelected(true);
            //   checkDienVien.setSelected(true);
            //   checkSoTap.setSelected(true);
            //  checkSoPhieuNhap.setSelected(true);
        } else {
            checkMaDia.setSelected(false);
            checkTenDia.setSelected(false);
            checkTheLoai.setSelected(false);
            //  checkQuocGia.setSelected(false);
            checkHangSanXuat.setSelected(false);
            //   checkDienVien.setSelected(false);
            //  checkSoTap.setSelected(false);
            //.setSelected(false);
        }
    }//GEN-LAST:event_checkTatCaMouseClicked

    private void checkHangSanXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkHangSanXuatMouseClicked
        // TODO add your handling code here:
        int index;
        JCheckBox check = (JCheckBox) evt.getSource();
        index = Integer.valueOf(check.getName());
        if (check.isSelected()) {
            arrayTimKiem[index] = 1;
        } else {
            arrayTimKiem[index] = 0;
        }
    }//GEN-LAST:event_checkHangSanXuatMouseClicked

    private void checkHangSanXuatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkHangSanXuatStateChanged
        // TODO add your handling code here:
        int index;
        JCheckBox check = (JCheckBox) evt.getSource();
        index = Integer.valueOf(check.getName());
        if (check.isSelected()) {
            arrayTimKiem[index] = 1;
        } else {
            arrayTimKiem[index] = 0;
        }
    }//GEN-LAST:event_checkHangSanXuatStateChanged

    private void textTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buttonTimKiemActionPerformed(null);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_textTimKiemKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            buttonLamMoiActionPerformed(null);
        }
    }//GEN-LAST:event_formKeyPressed

    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
        // TODO add your handling code here:
        if (buttonSua.getActionCommand().equals("Sua")) {
            combMaDia.setEnabled(true);
            combSoPhieuNhap.setEnabled(true);
            combTenTheLoai.setEnabled(true);

            txtDienVien.setEnabled(true);
            combNhaCC.setEnabled(true);
            txtQuocGia.setEnabled(true);
            txtTenDia.setEnabled(true);
            spinSoTap.setEnabled(true);

            buttonLuu.setEnabled(true);
            buttonThem.setEnabled(false);
            buttonSua.setActionCommand("Huy");
            buttonSua.setText("H???y");
        } else {
            combMaDia.setEnabled(false);
            combSoPhieuNhap.setEnabled(false);
            combTenTheLoai.setEnabled(false);

            txtDienVien.setEnabled(false);
            combNhaCC.setEnabled(false);
            txtQuocGia.setEnabled(false);
            txtTenDia.setEnabled(false);
            spinSoTap.setEnabled(false);

            buttonLuu.setEnabled(false);
            buttonThem.setEnabled(true);
            buttonSua.setActionCommand("Sua");
            buttonSua.setText("S???a");
        }
    }//GEN-LAST:event_buttonSuaActionPerformed

    private void buttonXoaTruongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaTruongActionPerformed
        txtDienVien.setText("");
        txtTenDia.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonXoaTruongActionPerformed

    private void combSoPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combSoPhieuNhapMouseClicked
        // TODO add your handling code here:
        loadCombMaDia();
    }//GEN-LAST:event_combSoPhieuNhapMouseClicked

    private void combNhaCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combNhaCCMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combNhaCCMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLamMoi;
    private javax.swing.JButton buttonLuu;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonTimKiem;
    private javax.swing.JButton buttonXoaTruong;
    private javax.swing.JCheckBox checkHangSanXuat;
    private javax.swing.JCheckBox checkMaDia;
    private javax.swing.JCheckBox checkTatCa;
    private javax.swing.JCheckBox checkTenDia;
    private javax.swing.JCheckBox checkTheLoai;
    private javax.swing.JComboBox combMaDia;
    private javax.swing.JComboBox combNhaCC;
    private javax.swing.JComboBox combSoPhieuNhap;
    private javax.swing.JComboBox combTenTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel spinSoTap;
    private javax.swing.JTable tableDia;
    private javax.swing.JTextField textTimKiem;
    private javax.swing.JTextField txtDienVien;
    private javax.swing.JTextField txtQuocGia;
    private javax.swing.JTextField txtTenDia;
    // End of variables declaration//GEN-END:variables
}
