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
public class itemDia {

    int SoPhieuNhap;
    String TenDia;
    int MaDia;
    String TenTheLoai;
    String TenNhaCC;
    String QuocGia;
    int SoTap;
    String DienVienChinh;

    public itemDia(int sophieunhap, String tentheloai, String tendia, String quocgia,
            String tennhacc, String dienvienchinh, int madia, int sotap) {
        SoPhieuNhap = sophieunhap;
        TenDia = tendia;
        TenTheLoai = tentheloai;
        TenNhaCC = tennhacc;
        QuocGia = quocgia;
        DienVienChinh = dienvienchinh;
        SoTap = sotap;
        MaDia = madia;
    }

    public int getSoPhieuNhap() {
        return SoPhieuNhap;
    }

    public void setSoPhieuNhap(int SoPhieuNhap) {
        this.SoPhieuNhap = SoPhieuNhap;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }

    public int getMaDia() {
        return MaDia;
    }

    public void setMaDia(int MaDia) {
        this.MaDia = MaDia;
    }

    public String getTenDia() {
        return TenDia;
    }

    public void setTenDia(String TenDia) {
        this.TenDia = TenDia;
    }

    public String getTenNhaCC() {
        return TenNhaCC;
    }

    public void setTenNhaCC(String TenNhaCC) {
        this.TenNhaCC = TenNhaCC;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public String getDienVienChinh() {
        return DienVienChinh;
    }

    public void setDienVienChinh(String DienVienChinh) {
        this.DienVienChinh = DienVienChinh;
    }

    public int getSoTap() {
        return SoTap;
    }

    public void setSoTap(int SoTap) {
        this.SoTap = SoTap;
    }

}
