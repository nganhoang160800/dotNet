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
public class iteamBaseDia {

    int MaTheLoai;
    int MaDia;
    String TenDia;
    String QuocGia;
    String DienVienChinh;
    int SoTap;

    public iteamBaseDia() {
    }

    public iteamBaseDia(int matheloai, int madia, String tendia, String quocgia, String dienvienchinh, int sotap) {
        MaTheLoai = matheloai;
        MaDia = madia;
        TenDia = tendia;
        QuocGia = quocgia;
        DienVienChinh = dienvienchinh;
        SoTap = sotap;
    }

    public int getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public int getMaDia() {
        return MaDia;
    }

    public void setMaLinhkien(int MaDia) {
        this.MaDia = MaDia;
    }

    public String getTenDia() {
        return TenDia;
    }

    public void setTenDia(String TenDia) {
        this.TenDia = TenDia;
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
