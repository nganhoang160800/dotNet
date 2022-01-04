/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author Admin
 */
public class itemLoaiThanhVien{
    String MaLoaiThanhVien;
    String TenLoaiThanhVien;
    String GhiChu;
    public itemLoaiThanhVien(){
        
    }
    public itemLoaiThanhVien(String maloaithanhvien, String tenloaithanhvien, String ghichu){
        MaLoaiThanhVien=maloaithanhvien;
        TenLoaiThanhVien=tenloaithanhvien;
        GhiChu=ghichu;
    }
    public String getMaLoaiThanhVien() {
        return MaLoaiThanhVien;
    }

    public void setMaLoaiThanhVien(String MaLoaiThanhVien) {
        this.MaLoaiThanhVien = MaLoaiThanhVien;
    }

    public String getTenLoaiThanhVien() {
        return TenLoaiThanhVien;
    }

    public void setTenLoaiThanhVien(String TenLoaiThanhVien) {
        this.TenLoaiThanhVien = TenLoaiThanhVien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}
