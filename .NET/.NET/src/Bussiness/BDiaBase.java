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
public class BDiaBase extends Bussiness {

    public BDiaBase() {
        Table = "Dia";
        ID = "MaDia";
        DB = new classData();
        SQL = "";
    }

    public boolean insertBaseProperties(int matheloai, int madia, String tendia, String QuocGia, String DienVienChinh, int SoTap, double dongiaban, double dongiamua, double dongiathue) {
        SQL = "Insert into Dia(MaTheLoai,MaDia,TenDia,QuocGia,DienVienChinh,SoTap,DonGiaBan,DonGiaMua,DonGiaThue) values ('" + matheloai + "',"
                + "'" + madia + "','" + tendia + "','" + QuocGia + "','" + DienVienChinh + "','" + SoTap + "'," + dongiaban + "," + dongiamua + "," + dongiathue + ")";
        return insertBySQLString(SQL);
    }

    public boolean updateBaseProperties(int matheloai, int madia, String tendia, String QuocGia, String DienVienChinh, int SoTap, double dongiaban, double dongiamua, double dongiathue) {
        SQL = "UPDATE Dia SET "
                + " MaTheLoai = '" + matheloai + "',"
                + " TenDia = N'" + tendia + "',"
                + " QuocGia = N'" + QuocGia + "',"
                + " DienVienChinh = N'" + DienVienChinh + "',"
                + " SoTap = '" + SoTap + "',"
                + " DonGiaBan=" + dongiaban + ","
                + " DonGiaMua=" + dongiamua + ", "
                + " DonGiaThue=" + dongiathue + ", "
                + " WHERE MaDia = '" + madia + "'";
        return updateBySQLString(SQL);
    }

    public ResultSet getBaseProperties() {
        SQL = "SELECT * FROM Dia";
        return getDataBySQLString(SQL);
    }
}
