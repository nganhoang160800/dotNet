/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

    /**
 *
 * @author Admin
 */
public class itemNhanVien extends Object {

    private String ChucVu;
    private String MaNhanVien;
    private String TenNhanVien;
    private Boolean GioiTinh;
    private String NgaySinh;
    private String DiaChi;
    private String SDT;
    private String Email;
    private String GhiChu;

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getChucVu() {
        return ChucVu;
    }
    public void setChucVu(String TenChucVu) {
        this.ChucVu = TenChucVu;
    }
    public String getMaNhanVien() {
        return MaNhanVien;
    }
    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
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
    public itemNhanVien() {
    }
    public itemNhanVien(String chucvu, String manhanvien, String ten, String ngaysinh, boolean gioitinh, String diachi,
            String sdt,  String email, String ghichu) {
        ChucVu=chucvu;
        MaNhanVien=manhanvien;
        TenNhanVien = ten;
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
        return MaNhanVien;
    }
}
