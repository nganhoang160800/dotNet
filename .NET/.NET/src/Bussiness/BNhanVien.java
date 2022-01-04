/*
 * To change this template, choose Tools | Templates
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
public class BNhanVien extends Bussiness{
    public BNhanVien(){
        DB= new classData();
        Table="VChiTietNhanVien";
        ID="MaNhanVien";
        
    }
    public BNhanVien(String table){
        DB= new classData();
        Table=table;
        ID="MaNhanVien";
        
    }
    public ResultSet getAllNhanVienNative(){
        Table="NhanVien";
        return getAll();
    }
    public ResultSet getAllNhanVienXN(){
        SQL="SELECT * FROM NHANVIEN WHERE MACHUCVU LIKE 'NX%'";
        return getDataBySQLString(SQL);
    }
    public boolean updateByProperties( String tenchucvu, String manhanvien, String tennhanvien,
            String ngaysinh,int gioitinh, String diachi, String sdt, 
            String email, String ghichu){
        
        String machucvu;
        BChucVu BCV =new BChucVu();
        machucvu=BCV.getMaChucVu(tenchucvu);
        
        SQL="UPDATE Nhanvien SET "
                +" MaChucVu = '"+machucvu+"',"
                +" TenNhanVien = N'"+tennhanvien+"',"
                +" NgaySinh = N'"+ngaysinh+"',"
                +" GioiTinh = '"+gioitinh+"',"
                +" DiaChi = N'"+diachi+"',"
                +" SDT = '"+sdt+"',"
                +" Email = '"+email+"',"
                +" GhiChu = N'"+ghichu+"'"
                +" where MaNhanvien = '"+manhanvien+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties( String tenchucvu, String manhanvien, String tennhanvien,
            String ngaysinh,int gioitinh, String diachi, String sdt, 
            String email, String ghichu){
        
        String machucvu;
        BChucVu BCV =new BChucVu();
        machucvu=BCV.getMaChucVu(tenchucvu);
        
        SQL="INSERT INTO Nhanvien VALUES( "
                +"'"+machucvu+"',"
                +"'"+manhanvien+"',"
                +"N'"+tennhanvien+"',"
                +"N'"+ngaysinh+"',"
                +"'"+gioitinh+"',"
                +"N'"+diachi+"',"
                +"'"+sdt+"',"
                +"'"+email+"',"
                +"N'"+ghichu+"')";
                
        return super.insertBySQLString(SQL);
    }
    @Override
    public ResultSet searchAll(String s){
        SQL="SELECT *FROM "+Table+" WHERE "
            +" TenChucVu like N'%"+s+"%' or "
            +" MaNhanVien like N'%"+s+"%' or "
            +" TenNhanVien like N'%"+s+"%' or "
            +" NgaySinh like N'%"+s+"%' or "
            +" DiaChi like N'%"+s+"%' or "
            +" SDT like '%"+s+"%' or "
            +" Email like N'%"+s+"%' or "                
            +" Ghichu like N'%"+s+"%'";
        return super.searchAll(SQL);
    }
    public ResultSet getMaNhanVienChuaLapTaiKhoan(){
        SQL="select * from vmanhanvien_chualap_taikhoan";
        return super.getDataBySQLString(SQL);
    }
//    public String getMaNhanVien(String tenNhanVien){
//        
//    }
    @Override
    public boolean deleteByID(String id){
        BTaiKhoanNV TKNV = new BTaiKhoanNV();
        if( TKNV.deleteByID(id)){
            Table="NhanVien";
            return super.deleteByID(id);
        }
        else return false;
            
    }
}
