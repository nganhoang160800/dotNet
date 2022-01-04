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
public class itemNhaCungCap {

    int MaNhaCC;
    String TenNhaCC;
    String DiaChiNhaCC;
    String SDTNhaCC;

    public itemNhaCungCap() {
    }

    public itemNhaCungCap(int manhacc, String tennhacc, String diachinhacc,
            String sdtnhacc) {
        MaNhaCC = manhacc;
        TenNhaCC = tennhacc;
        DiaChiNhaCC = diachinhacc;
        SDTNhaCC = sdtnhacc;
    }
  
    public int getMaNhaCungCap() {
        return MaNhaCC;
    }

    public void setMaNhaCungCap(int MaNhaCC) {
        this.MaNhaCC = MaNhaCC;
    }

    public String getTenNhaCungCap() {
        return TenNhaCC;
    }

    public void setTenNhaCungCap(String TenNhaCungCap) {
        this.TenNhaCC = TenNhaCungCap;
    }

    public String getDiaChiNhaCungCap() {
        return DiaChiNhaCC;
    }

    public void setDiaChiNhaCungCap(String DiaChiNhaCungCap) {
        this.DiaChiNhaCC = DiaChiNhaCungCap;
    }

    public String getDienThoaiNhaCungCap() {
        return SDTNhaCC;
    }

    public void setDienThoaiNhaCungCap(String DienThoaiNhaCungCap) {
        this.SDTNhaCC = DienThoaiNhaCungCap;
    }

}
