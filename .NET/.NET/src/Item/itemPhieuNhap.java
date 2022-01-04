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
public class itemPhieuNhap {

    int SoPhieuNhap;
    String TenNhaCC;
    String TenNhanVien;
    String NgayLap;

    public itemPhieuNhap() {
    }

    public itemPhieuNhap(int sophieunhap, String tennhacc, String tennhanvien, String ngaylapphieu) {
        SoPhieuNhap = sophieunhap;
        TenNhaCC = tennhacc;
        TenNhanVien = tennhanvien;
        NgayLap = ngaylapphieu;
    }

    public int getSoPhieuNhap() {
        return SoPhieuNhap;
    }

    public void setSoPhieuNhap(int SoPhieuNhap) {
        this.SoPhieuNhap = SoPhieuNhap;
    }
    public String getTenNhaCC()
    {
        return TenNhaCC;
    }
    public void setTenNhaCC(String TenNhaCC) {
        this.TenNhaCC = TenNhaCC;
    }
    public String getTenNhanVien()
    {
        return TenNhanVien;
    }
    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }
     public String getNgayLap()
    {
        return NgayLap;
    }
    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }
}
