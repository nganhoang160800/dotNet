/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

    /**
 *
 * @author Admin
 */
public class itemThanhVien extends Object {

    private String TenLoaiThanhVien;
    private String MaThanhVien;
    private String TenThanhVien;
    private Boolean GioiTinh;
    private String NgaySinh;
    private String DiaChi;
    private String SDT;
    private String Email;
    private String GhiChu;

    public String getTenLoaiThanhVien() {
        return TenLoaiThanhVien;
    }

    public void setTenLoaiThanhVien(String LoaiThanhVien) {
        this.TenLoaiThanhVien = LoaiThanhVien;
    }

    public String getMaThanhVien() {
        return MaThanhVien;
    }

    public void setMaThanhVien(String MaThanhVien) {
        this.MaThanhVien = MaThanhVien;
    }

    public String getTenThanhVien() {
        return TenThanhVien;
    }

    public void setTenThanhVien(String TenThanhVien) {
        this.TenThanhVien = TenThanhVien;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public itemThanhVien() {
    }
    public itemThanhVien(String loaithanhvien, String mathanhvien, String ten, String ngaysinh, boolean gioitinh, String diachi,
            String sdt,  String email, String ghichu) {
        TenLoaiThanhVien=loaithanhvien;
        MaThanhVien=mathanhvien;
        TenThanhVien = ten;
        GioiTinh=gioitinh;
        NgaySinh=ngaysinh;
        DiaChi=diachi;
        SDT=sdt;
        Email=email;
        GhiChu=ghichu;
    }

/**
     *
     * @return
     */
    @Override
    public String toString() {
        return MaThanhVien;
    }
}
