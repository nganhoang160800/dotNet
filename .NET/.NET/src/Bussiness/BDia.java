/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class BDia extends Bussiness {

    public BDia() {
        DB = new classData();
        Table = "VChiTietDia";
        ID = "MaDia";
    }

    public ResultSet getSoPhieuNhap() {
        SQL = "SELECT Distinct SoPhieuNhap FROM PhieuNhap";
        return super.getDataBySQLString(SQL);
    }

    public ResultSet getAllMaDia() {
        SQL = "SELECT MaDia, TenDia FROM Dia";
        return super.getDataBySQLString(SQL);
    }

    public ResultSet getMaDiaBaSoPhieuNhap(int sophieunhap) {
        SQL = "SELECT DISTINCT MaDia FROM CTPhieuNhap WHERE SoPhieuNhap = '" + sophieunhap + "'";
        return super.getDataBySQLString(SQL);
    }

    public ResultSet searchByProperties(int[] pro, String value) {
        SQL = "SELECT *FROM " + Table + " WHERE MaDia ='' ";

        if (pro[0] == 1) {
            SQL += " OR TenTheLoai like '%" + value + "%'";
        }
        if (pro[1] == 1) {
            SQL += " OR MaDia like '%" + value + "%'";
        }
        if (pro[2] == 1) {
            SQL += " OR TenDia like '%" + value + "%'";
        }
        if (pro[3] == 1) {
            SQL += " OR TenNhaCC like '%" + value + "%'";
        }

        if (pro[4] == 1) {
            SQL += " OR QuocGia like '%" + value + "%'";
        }
        if (pro[5] == 1) {
            SQL += " OR DienVien like '%" + value + "%'";
        }
        if (pro[6] == 1) {
            SQL += " OR SoTap like '%" + value + "%'";
        }
        if (pro[8] == 1) {
            SQL += " OR SoPhieuNhap like '%" + value + "%'";
        }

        SQL += " OR MaDia = ''";

        return super.searchAll(SQL);

    }

    public boolean updateByProperties(int madia, String tendia, String tentheloai,
            String quocgia, int sotap, String dienvienchinh) {
        int matheloai = (new BTheLoai()).getMaTheLoai(tentheloai);
        SQL = "UPDATE Dia SET"
                + " TenDia = N'" + tendia + "',"
                + " MaTheLoai = N'" + matheloai + "',"
                + " QuocGia = N'" + quocgia + "',"
                + " SoTap = '" + sotap + "',"
                + " DienVienChinh = N'" + dienvienchinh + "'"
                + " WHERE MaDia = '" + madia + "'";
        return super.updateBySQLString(SQL);
    }
}
