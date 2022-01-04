/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BPhieuBanHang extends Bussiness {

    public BPhieuBanHang() {
        DB = new classData();
        SQL = "";
        Table = "VPhieuThue";
        ID = "SoPhieuThue";
    }

    public boolean insertByProperties(int sophieuban, String ngaylap, String matv, String manv, String trangthai) throws ClassNotFoundException {

        int save = 0;
        try {
            SQL = "{call  PhieuBan_Insert(?,?,?,?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setString(1, String.valueOf(sophieuban));
            csm.setString(2, ngaylap);
            csm.setString(3, matv);
            csm.setString(4, manv);
            csm.setString(5, trangthai);
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean insertChiTietPhieuBan(int sophieuBan, int madia, int soluong) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  CTPhieuBan_Insert(?,?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuBan);
            csm.setInt(2, madia);
            csm.setDouble(3, soluong);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public ResultSet getChiTietPhieuBan(int sophieuban) throws SQLException, ClassNotFoundException {

        SQL = "{call  CTPhieuBan_SelectOne(?)}";

        CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

        csm.setInt(1, sophieuban);

        return csm.executeQuery();

    }

    public ResultSet getAllMaDiaPhieuBan(String key) throws SQLException {
        ResultSet rs = null;
        try {
            SQL = "{call   PhieuBan_SelectAll(?)}";
            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);
            csm.setString(1, key);
            rs = csm.executeQuery();
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }
        return rs;
    }

    public boolean deleteMaDiaChiTietPhieuBan(int sophieuBan, int madia) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  CTPhieuBan_Delete(?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuBan);
            csm.setInt(2, madia);
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;

    }

    public boolean updateGiaTienChiTietPhieuBan(int sophieuBan, int madia, double gia) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  CTPhieuBan_Delete(?,?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuBan);
            csm.setInt(2, madia);
            csm.setDouble(3, gia);
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean CapNhatPhieuBan(int soPhieu, int maKhachHang) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  PhieuBan_Update(?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, soPhieu);
            csm.setInt(2, maKhachHang);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean XoaPhieuBan(int sophieuBan) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  PhieuBan_Delete(?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuBan);
          
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;

    }

}
