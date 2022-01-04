/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class BSanPham extends Bussiness {

    public BSanPham() {
        DB = new classData();
        Table = "VChiTietDia";
        ID = "MaDia";
    }
    public ResultSet getMaPhieuNhap() {
        SQL = "SELECT Distinct SoPhieuNhap FROM PHIEUNHAP";
        return super.getDataBySQLString(SQL);
    }
    public ResultSet getAllMaDia() {
        SQL = "SELECT MaDia, TenDia FROM Dia";
        return super.getDataBySQLString(SQL);
    }

    public ResultSet getMaDiaByMaPhieuNhap(int sophieunhap) {
        SQL = "SELECT DISTINCT MaDia FROM CTPhieuNhap WHERE SoPhieuNhap = '" + sophieunhap + "'";
        return super.getDataBySQLString(SQL);
    }

    public ResultSet searchByProperties(int[] pro, String value) {
        SQL = "SELECT *FROM " + Table + " WHERE MaDia ='' ";

        if (pro[0] == 1) {
            SQL += " OR TenTheLoai like N'%" + value + "%'";
        }
        if (pro[1] == 1) {
            SQL += " OR MaDia like N'%" + value + "%'";
        }
        if (pro[2] == 1) {
            SQL += " OR TenDia like N'%" + value + "%'";
        }
        if (pro[3] == 1) {
            SQL += " OR TenNhaCC like N'%" + value + "%'";
        }
        if (pro[4] == 1) {
            SQL += " OR DienVienChinh like N'%" + value + "%'";
        }
        if (pro[5] == 1) {
            SQL += " OR SoTap like N'%" + value + "%'";
        }
        if (pro[6] == 1) {
            SQL += " OR QuocGia like N'%" + value + "%'";
        }
    
        SQL += " OR MaDia = ''";

        return super.searchAll(SQL);
    }

    public boolean updateByProperties(int madia, String tendia, int matheloai,
            String quocgia, int sotap, String dienvienchinh) {
        String tentheloai = (new BTheLoai()).getTenTheLoai(matheloai);
        SQL = "UPDATE Dia SET"
                + " TenDia = N'" + tendia + "',"
                + " MaTheLoai = N'" + matheloai + "',"
                + " QuocGia = N'" + quocgia + "',"
                + " DienVienChinh = '" + dienvienchinh + "',"
                + " SoTap = N'" + sotap + "',"
                + " WHERE MaDia = '" + madia + "'";
        return super.updateBySQLString(SQL);
    }
}
