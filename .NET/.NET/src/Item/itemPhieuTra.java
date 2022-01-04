/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

import Bussiness.BPhieuTra;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class itemPhieuTra {

    int SoPhieuTra;
    String TenNhanVien;
    String TenKhachHang;
    String NgayTra;
    String MaNV;
    String MaKH;
    String TrangThai;

    public itemPhieuTra() {
    }

    public itemPhieuTra(int sophieuthue, String tennhanvien, String tenkhachhang, String ngaythue, String MaKH, String MaNVs) {
        SoPhieuTra = sophieuthue;
        TenNhanVien = tennhanvien;
        TenKhachHang = tenkhachhang;
        NgayTra = ngaythue;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        
    }

    public int getSoPhieuTra() {
        return SoPhieuTra;
    }

    public void setSoPhieuTra(int SoPhieuTra) {
        this.SoPhieuTra = SoPhieuTra;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }
    
      public String getTrangThai() {
          
        try {
            BPhieuTra item = new BPhieuTra();
          boolean tt =  item.getAllTrangThai(this.SoPhieuTra);
          if(tt)
            return "Đã Trả";
          else 
              return "Chưa Trả";
        } catch (SQLException ex) {
            Logger.getLogger(itemPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public void setTrangThai(String TrangThai) {
        
        
        this.TrangThai = TrangThai;
    }
}
