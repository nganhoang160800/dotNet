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
public class BPhieuTra extends Bussiness {

    public BPhieuTra() {
        DB = new classData();
        SQL = "";
        Table = "VPhieuThue";
        ID = "SoPhieuThue";
    }

    public boolean insertByProperties(int sophieuTra, String ngaylap, String matv, String manv, String trangthai) throws ClassNotFoundException {

        int save = 0;
        try {
            SQL = "{call  PhieuTra_Insert(?,?,?,?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setString(1, String.valueOf(sophieuTra));
            csm.setString(2, ngaylap);
            csm.setString(3, matv);
            csm.setString(4, manv);
            csm.setString(5, trangthai);
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean insertChiTietPhieuTra(int sophieuTra, int madia, int soluong) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  CTPhieuTra_Insert(?,?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuTra);
            csm.setInt(2, madia);
            csm.setDouble(3, soluong);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public ResultSet getChiTietPhieuTra(int sophieuTra) throws SQLException, ClassNotFoundException {

        SQL = "{call  CTPhieuTra_SelectOne(?)}";

        CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

        csm.setInt(1, sophieuTra);

        return csm.executeQuery();

    }

    public boolean getAllTrangThai(int key) throws SQLException {

        int soluong = 0;
        try {
            SQL = "{call   [TrangThai](?)}";
            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);
            csm.setInt(1, key);
            ResultSet rs = csm.executeQuery();
            if (rs.next()) {
                soluong = Integer.parseInt(rs.getString("SoLuong"));
            }
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
            soluong = 0;
        }
        return soluong > 0;
    }

    public ResultSet getAllPhieuMuon(String key) throws SQLException {
        ResultSet rs = null;
        try {
            SQL = "{call   [PhieuMuon](?)}";
            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);
            csm.setString(1, key);
            rs = csm.executeQuery();
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }
        return rs;
    }

    //[]

    public ResultSet getAllPhieuMuon_SelectOne(int key) throws SQLException {
        ResultSet rs = null;
        try {
            SQL = "{call   [PhieuMuonSelectOne](?)}";
            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);
            csm.setInt(1, key);
            rs = csm.executeQuery();
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }
        return rs;
    }

    public boolean deleteMaDiaChiTietPhieuTra(int sophieuTra, int madia) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  CTPhieuTra_Delete(?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuTra);
            csm.setInt(2, madia);
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;

    }

    public boolean updateGiaTienChiTietPhieuTra(int sophieuTra, int madia, double gia) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  CTPhieuTra_Delete(?,?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuTra);
            csm.setInt(2, madia);
            csm.setDouble(3, gia);
            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean CapNhatPhieuTra(int soPhieu, int maKhachHang) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  PhieuTra_Update(?,?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, soPhieu);
            csm.setInt(2, maKhachHang);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean TraDia(int soPhieu) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  TraDia(?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, soPhieu);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public boolean XoaPhieuTra(int sophieuTra) throws ClassNotFoundException {
        int save = 0;
        try {
            SQL = "{call  PhieuTra_Delete(?)}";

            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieuTra);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuTra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;

    }

  
}
