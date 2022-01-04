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
public class itemPhieuBanHang {

    int SoPhieuBanHang;
    String TenNhanVien;
    String TenKhachHang;
    String NgayBanHang;
    String MaNV;
    String MaKH;
    String TongTien;

    public itemPhieuBanHang() {
    }

    public itemPhieuBanHang(int sophieuthue, String tennhanvien, String tenkhachhang, String ngaythue, String MaKH, String MaNV,String TongTien) {
        SoPhieuBanHang = sophieuthue;
        TenNhanVien = tennhanvien;
        TenKhachHang = tenkhachhang;
        NgayBanHang = ngaythue;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.TongTien = TongTien;
    }

    public int getSoPhieuBanHang() {
        return SoPhieuBanHang;
    }

    public void setSoPhieuBanHang(int SoPhieuBanHang) {
        this.SoPhieuBanHang = SoPhieuBanHang;
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

    public String getNgayBanHang() {
        return NgayBanHang;
    }

    public void setNgayBanHang(String NgayBanHang) {
        this.NgayBanHang = NgayBanHang;
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
    
      public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }
}
