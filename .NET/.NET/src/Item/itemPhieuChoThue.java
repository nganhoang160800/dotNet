/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author Admin
 */
public class itemPhieuChoThue {

    int SoLuongNgayThue;
    int SoPhieuThue;
    String TenNhanVien;
    String TenKhachHang;
    String NgayThue;
    String MaNV;
    String MaKH;

    public itemPhieuChoThue() {
    }

    public itemPhieuChoThue(int sophieuthue, String tennhanvien, String tenkhachhang, String ngaythue, String MaKH, String MaNV,int SoNgayThue) {
        SoPhieuThue = sophieuthue;
        TenNhanVien = tennhanvien;
        TenKhachHang = tenkhachhang;
        NgayThue = ngaythue;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.SoLuongNgayThue = SoNgayThue;
    }

    public int getSoPhieuThue() {
        return SoPhieuThue;
    }

    public void setSoPhieuThue(int SoPhieuThue) {
        this.SoPhieuThue = SoPhieuThue;
    }

    public int getSoLuongNgayThue() {
        return SoLuongNgayThue;
    }

    public void setSoLuongNgayThue(int SoLuongNgayThue) {
        this.SoLuongNgayThue = SoLuongNgayThue;
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

    public String getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(String NgayThue) {
        this.NgayThue = NgayThue;
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
}
