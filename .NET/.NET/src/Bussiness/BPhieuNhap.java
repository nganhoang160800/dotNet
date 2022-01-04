/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BPhieuNhap extends Bussiness {

    public BPhieuNhap() {
        DB = new classData();
        SQL = "";
        Table = "VPhieuNhap";
        ID = "SoPhieuNhap";
    }

    public boolean insertByProperties(int sophieunhap, int manhacungcap, String manhanvien, String ngaylapphieu) {
        SQL = "INSERT INTO PhieuNhap(SoPhieuNhap,MaNhaCC,MaNhanVien,NgayNhap) VALUES('"
                + sophieunhap + "','"
                + manhacungcap + "','"
                + manhanvien + "','"
                + ngaylapphieu + "')";
        return insertBySQLString(SQL);
    }

    public boolean insertChiTietPhieuNhap(int sophieunhap, int madia, int soluong, BigDecimal dongia) {
        SQL = "SELECT SoLuong FROM CTPhieuNhap WHERE SoPhieuNhap = '" + sophieunhap + "' AND MaDia = '" + madia + "'";
        ResultSet rs = getDataBySQLString(SQL);
        try {
            if (rs.next() && rs.getInt("SoLuong") >= 0) {
                soluong += rs.getInt("SoLuong");
                SQL = "UPDATE CTPhieuNhap SET SoLuong = '" + soluong + "' WHERE SoPhieuNhap = '" + sophieunhap + "'"
                        + " AND MaDia = '" + madia + "'";
            } else {
                SQL = "INSERT INTO CTPhieuNhap VALUES("
                        + "'" + sophieunhap + "',"
                        + "'" + madia + "',"
                        + "'" + soluong + "',"
                        + "'" + dongia + "')";
            }
            return insertBySQLString(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(BPhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet getChiTietPhieuNhap(int sophieunhap) {
        SQL = "select CTPhieuNhap.MaDia,TenDia, SoLuong, DonGia"
                + " from CTPhieuNhap,Dia"
                + " where CTPhieuNhap.MaDia=Dia.MaDia"
                + " and CTPhieuNhap.SoPhieuNhap= '" + sophieunhap + "'";
        return getDataBySQLString(SQL);
    }

    public ResultSet getAllMaDiaPhieuNhap(int sophieunhap) {
        SQL = "select TenDia, CTPhieuNhap.MaDia from Dia, CTPhieuNhap where "
                + "CTPhieuNhap.MaDia = Dia.MaDia and SoPhieuNhap= '" + sophieunhap + "'";
        return getDataBySQLString(SQL);
    }

    public boolean updateByProperties(int sophieunhap, int manhacungcap, String manhanvien, String ngaylap) {

        SQL = "UPDATE PhieuNhap SET "
                + " MaNhaCC = '" + manhacungcap + "', "
                + " MaNhanVien = '" + manhanvien + "',"
                + " NgayNhap = '" + ngaylap + "'"
                + " WHERE SoPhieuNhap = '" + sophieunhap + "'";
        return updateBySQLString(SQL);
    }

    public boolean deleteMaDiaChiTietPhieuNhap(int sophieunhap, int madia) {
        SQL = "DELETE CTPhieuNhap WHERE SoPhieuNhap = '" + sophieunhap + "' AND MaDia = '" + madia + "'";
        return updateBySQLString(SQL);
    }

    public boolean updateSoLuongChiTietPhieuNhap(int sophieunhap, int madia, int soluong) {
        if (soluong <= 0) {
            SQL = "DELETE CTPhieuNhap WHERE SoPhieuNhap = '" + sophieunhap + "' AND MaDia = '" + madia + "'";
            return updateBySQLString(SQL);
        } else {
            SQL="UPDATE CTPhieuNhap SET "
                +"SoLuong = '"+soluong+"'"
                +" WHERE SoPhieuNhap = '"+sophieunhap+"'"
                +" AND MaDia = '"+madia+"'";
            return updateBySQLString(SQL);
        }
    }

    public ResultSet searchAllPhieuNhap(String S) {
        SQL = "SELECT * FROM " + Table + " WHERE "
                + " SoPhieuNhap LIKE N'%" + S + "%'"
                + " OR TenNhaCC LIKE N'%" + S + "%'"
                + " OR TenNhanVien LIKE N'%" + S + "%'"
                + " OR NgayNhap LIKE N'%" + S + "%'";
        return getDataBySQLString(SQL);
    }

    public ResultSet getAllPhieuNhapHangNative() {
        // SQL = "SELECT * FROM PhieuNhap";
        SQL = "select sophieunhap,NhanVien.TenNhanVien,NhaCungCap.MaNhaCC,NgayNhap from PhieuNhap ,NhanVien,NhaCungCap where PhieuNhap.MaNhaCC=NhaCungCap.MaNhaCC and PhieuNhap.MaNhanVien=NhanVien.MaNhanVien";
        return getDataBySQLString(SQL);
    }

    public ResultSet searchAllChiTietPhieuNhapHang(String S1, String S2) {
        SQL = "select TenDia, CTPhieuNhap.MaDia, SoLuong, DonGia"
                + " from CTPhieuNhap, Dia"
                + " where CTPhieuNhap.MaDia=Dia.MaDia"
                + " and CTPhieuNhap.SoPhieuNhap= '" + S1 + "'"
                + " AND (TenDia LIKE'%" + S2 + "%'"
                + " OR CTPhieuNhap.MaDia LIKE '%" + S2 + "%'"
                + " OR SoLuong LIKE '%" + S2 + "%'"
                + " OR DonGia LIKE '%" + S2 + "%')";
        return getDataBySQLString(SQL);
    }
    public boolean  XoaPhieuVaChiTietPhieuNhap(int sophieunhap){
        SQL = "delete CTPhieuNhap where SoPhieuNhap ="+sophieunhap +"delete PhieuNhap where SoPhieuNhap ="+sophieunhap;
        return updateBySQLString(SQL);
    }
}
