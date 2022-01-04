/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BTheLoai extends Bussiness {

    public BTheLoai() {
        Table = "TheLoai";
        ID = "MaTheLoai";
        SQL = "";
        DB = new classData();
    }

    public boolean insertByProperties(int matheloai, String tentheloai) {
        SQL = "INSERT INTO TheLoai VALUES("
                + "'" + matheloai + "',"
                + "N'" + tentheloai + "')";
        return insertBySQLString(SQL);
    }

    public boolean updateByProperties(int matheloai, String tentheloai) {
        SQL = "UPDATE TheLoai SET "
                + "TenTheLoai = N'" + tentheloai + "'"
                + " WHERE MaTheLoai = '" + matheloai + "'";
        return updateBySQLString(SQL);
    }

    public int getMaTheLoai(String tentheloai) {
        SQL = "SELECT MaTheLoai FROM TheLoai WHERE TenTheLoai = '" + tentheloai + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next()) {
                return rs.getInt("MaTheLoai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ResultSet getAllTenTheLoai() {
        SQL = "SELECT Distinct TenTheLoai FROM TheLoai";
        return super.getDataBySQLString(SQL);
    }

    public String getTenTheLoai(int matheloai) {
        SQL = "SELECT TenTheLoai FROM TheLoai WHERE MaTheLoai = '" + matheloai + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next()) {
                return rs.getString("TenTheLoai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Loại khác";
    }
}
