/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

/**
 *
 * @author Admin
 */
public class itemChucVu {
    String MaChucVu;
    String TenChucVu;
    String GhiChuChucVu;
    public itemChucVu(){
        
    }
    public itemChucVu(String machucvu, String tenchucvu, String ghichu){
        MaChucVu=machucvu;
        TenChucVu=tenchucvu;
        GhiChuChucVu=ghichu;
    }
    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public String getGhiChuChucVu() {
        return GhiChuChucVu;
    }

    public void setGhiChuChucVu(String GhiChu) {
        this.GhiChuChucVu = GhiChu;
    }
}
