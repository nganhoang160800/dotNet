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
public class BNhaCungCap extends Bussiness {

    public BNhaCungCap() {
        Table = "NhaCungCap";
        DB = new classData();
        ID = "MaNhaCC";
        SQL = "";
    }

    public boolean updateByProperties(int manhacungcap, String tennhacungcap, String diachinhacungcap,
            String dienthoainhacungcap) {

        SQL = "UPDATE NHACUNGCAP SET "
                + " TenNhaCC = N'" + tennhacungcap + "',"
                + " DiaChiNhaCC = N'" + diachinhacungcap + "',"
                + " SDTNhaCC = N'" + dienthoainhacungcap + "'"
                + "WHERE  MaNhaCC = N'" + manhacungcap + "'";
        return super.updateBySQLString(SQL);
    }

    public boolean insertByProperties(int manhacungcap, String tennhacungcap, String diachinhacungcap,
            String dienthoainhacungcap) {
        SQL = "INSERT INTO NHACUNGCAP(MaNhaCC,TenNhaCC,DiaChiNhaCC,SDTNhaCC) VALUES('" + manhacungcap + "',"
                + "'" + tennhacungcap + "','" + diachinhacungcap + "','" + dienthoainhacungcap + "')";
        return insertBySQLString(SQL);
    }

    public String getMaNhaCungCap(String tennhacungcap) {
        SQL = "SELECT MaNhaCC WHERE TenNhaCC = '" + tennhacungcap + "'";
        try {
            return super.getDataBySQLString(ID).getString("MaNhaCC");
        } catch (SQLException ex) {
            Logger.getLogger(BNhaCungCap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "null";
    }

    public ResultSet getAllTenNhaCC() {
        SQL = "SELECT Distinct TenNhaCC FROM NhaCungCap";
        return super.getDataBySQLString(SQL);
    }
}
