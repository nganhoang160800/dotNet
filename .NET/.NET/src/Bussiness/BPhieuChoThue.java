/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BPhieuChoThue extends Bussiness {

    public BPhieuChoThue() {
        DB = new classData();
        SQL = "";
        Table = "VPhieuThue";
        ID = "SoPhieuThue";
    }

    public boolean insertByProperties(int sophieuthue, String ngaylap, String matv, String manv, int soluongngay) {
        SQL = "Insert into PhieuThue(SoPhieuThue,NgayThue,MaKH,MaNV,SoLuongNgayThue) values('" + sophieuthue + "','"
                + ngaylap + "','"
                + matv + "','"
                + manv + "', " + soluongngay + " )";
        return insertBySQLString(SQL);
    }

    public boolean insertChiTietPhieuThue(int sophieuthue, int madia, int soluong, BigDecimal dongia) {
        SQL = "SELECT SoLuong FROM CTPhieuThue WHERE SoPhieuThue = '" + sophieuthue + "' AND MaDia = '" + madia + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next() && rs.getInt("SoLuong") >= 0) {
                soluong += rs.getInt("SoLuong");
                SQL = "UPDATE CTPhieuThue SET SoLuong = '" + soluong + "' WHERE SoPhieuThue = '" + sophieuthue + "'"
                        + " AND MaDia = '" + madia + "'";
            } else {
                SQL = "INSERT INTO CTPhieuThue VALUES("
                        + "'" + sophieuthue + "',"
                        + "'" + madia + "',"
                        + "'" + soluong + "',"
                        + "'" + dongia + "')";
            }
            return insertBySQLString(SQL);

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuNhap.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet getChiTietPhieuThue(int sophieuthue) {
        SQL = "select CTPhieuThue.MaDia,TenDia, SoLuong, GiaThue"
                + " from CTPhieuThue,Dia"
                + " where CTPhieuThue.MaDia=Dia.MaDia"
                + " and CTPhieuThue.SoPhieuThue= '" + sophieuthue + "'";
        return getDataBySQLString(SQL);
    }

    public ResultSet getAllMaDiaPhieuThue(int sophieuthue) {
        SQL = "select TenDia, CTPhieuThue.MaDia from Dia, CTPhieuThue where "
                + "CTPhieuThue.MaDia = Dia.MaDia and SoPhieuThue= '" + sophieuthue + "'";
        return getDataBySQLString(SQL);
    }

    public boolean updateByProperties(int sophieuthue, String ngaythue, String mathanhvien, String manhanvien, int soluongngay) {

        SQL = "UPDATE PhieuThue SET "
                + " MaKH = '" + mathanhvien + "', "
                + " MaNV = '" + manhanvien + "',"
                + " NgayThue = '" + ngaythue + "',"
                + " SoLuongNgayThue = " + soluongngay 
                + " WHERE SoPhieuThue = '" + sophieuthue + "'";
        return updateBySQLString(SQL);
    }

    public boolean deleteMaDiaChiTietPhieuThue(int sophieuthue, int madia) {
        SQL = "DELETE CTPhieuThue WHERE SoPhieuThue = '" + sophieuthue + "' AND MaDia = '" + madia + "'";
        return updateBySQLString(SQL);
    }

    public boolean updateSoLuongChiTietPhieuThue(int sophieuthue, int madia, int soluong) {
        if (soluong <= 0) {
            SQL = "DELETE CTPhieuThue WHERE SoPhieuThue = '" + sophieuthue + "' AND MaDia = '" + madia + "'";
            return updateBySQLString(SQL);
        } else {
            SQL = "UPDATE CTPhieuThue SET "
                    + "SoLuong = '" + soluong + "'"
                    + " WHERE SoPhieuThue = '" + sophieuthue + "'"
                    + " AND MaDia = '" + madia + "'";
            return updateBySQLString(SQL);
        }
    }

    public ResultSet searchAllPhieuThue(String S) {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " SoPhieuThue LIKE N'%" + S + "%'"
                + " OR TenThanhVien LIKE N'%" + S + "%'"
                + " OR TenNhanVien LIKE N'%" + S + "%'"
                + " OR NgayThue LIKE N'%" + S + "%'";
        return getDataBySQLString(SQL);
    }

    public ResultSet getAllPhieuThueNative() {
        SQL = "select sophieuthue,NhanVien.TenNhanVien,ThanhVien.TenThanhVien,NgayThue from PhieuThue ,NhanVien,ThanhVien where PhieuThue.MaThanhVien=ThanhVien.MaThanhVien and PhieuThue.MaNhanVien=NhanVien.MaNhanVien";
        return getDataBySQLString(SQL);
    }

    public ResultSet searchAllChiTietPhieuThue(String S1, String S2) {
        SQL = "select TenDia, CTPhieuThue.MaDia, SoLuong, DonGia"
                + " from CTPhieuThue, Dia"
                + " where CTPhieuThue.MaDia=Dia.MaDia"
                + " and CTPhieuThue.SoPhieuNhap= '" + S1 + "'"
                + " AND (TenDia LIKE'%" + S2 + "%'"
                + " OR CTPhieuThue.MaDia LIKE '%" + S2 + "%'"
                + " OR SoLuong LIKE '%" + S2 + "%'"
                + " OR DonGia LIKE '%" + S2 + "%')";
        return getDataBySQLString(SQL);
    }

    public String getMaNV(String tennhanvien) {
        SQL = "SELECT MaNhanVien FROM NhanVien WHERE TenNhanVien = '" + tennhanvien + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next()) {
                return rs.getString("MaNhanVien");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BPhieuChoThue.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public boolean XoaPhieuVaChiTietPhieuThue(int sophieuthue) {
        SQL = "delete CTPhieuThue where SoPhieuThue =" + sophieuthue + "delete PhieuThue where SoPhieuThue =" + sophieuthue;
        return updateBySQLString(SQL);
    }

    public boolean CapNhatSoLuongCTPT(int sophieu, int soluong, int madia) throws ClassNotFoundException {

        int save = 0;
        try {
            SQL = "{call  [CTPhieuThueUpdate](?,?,?)}";
            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);

            csm.setInt(1, sophieu);
            csm.setInt(2, madia);
            csm.setInt(3, soluong);

            save = csm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BPhieuChoThue.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save > 0;
    }

    public ResultSet GetCTPTByPhieuThueID(int maphieuThue) {

        ResultSet rs = null;
        try {
            SQL = "{call   [CTPhieuThue_SelectAll](?)}";
            CallableStatement csm = DB.getDBConnection().prepareCall(SQL);
            csm.setInt(1, maphieuThue);
            rs = csm.executeQuery();
        } catch (Exception e) {
            System.out.println("Loi" + e.getMessage());
        }
        return rs;
    }
}
