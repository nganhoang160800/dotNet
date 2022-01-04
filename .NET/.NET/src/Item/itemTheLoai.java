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
public class itemTheLoai {

    int MaTheLoai;
    String TenTheLoai;

    public itemTheLoai() {
    }

    public itemTheLoai(int matheloai, String tentheloai) {
        MaTheLoai = matheloai;
        TenTheLoai = tentheloai;
    }

    public int getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(int MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }
}
