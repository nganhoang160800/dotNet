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
public class BThanhVien extends Bussiness{
    public BThanhVien(){
        DB= new classData();
        Table="vchitietthanhvien";
        ID="mathanhvien";
        
    }
    public ResultSet getAllThanhVienNative(){
        Table="LoaiThanhVien";
        return getAll();
    }
     public ResultSet getBaseProperties() {
        SQL = "SELECT MaThanhVien, TenThanhVien From ThanhVien";
        return getDataBySQLString(SQL);
    }
    public boolean updateByProperties( String tenloaithanhvien, String mathanhvien, String tenthanhvien,
            String ngaysinh,int gioitinh, String diachi, String sdt, 
            String email, String ghichu){
        
        String maloaithanhvien;
        BLoaiThanhVien BCV =new BLoaiThanhVien();
        maloaithanhvien=BCV.getMaLoaiThanhVien(tenloaithanhvien);
        
        SQL="UPDATE ThanhVien SET "
                +" MaLoaiThanhVien = '"+maloaithanhvien+"',"
                +" TenThanhVien = N'"+tenthanhvien+"',"
                +" NgaySinh = N'"+ngaysinh+"',"
                +" GioiTinh = '"+gioitinh+"',"
                +" DiaChi = N'"+diachi+"',"
                +" SDT = '"+sdt+"',"
                +" Email = '"+email+"',"
                +" GhiChu = N'"+ghichu+"'"
                +" where MaThanhVien = '"+mathanhvien+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties( String tenloaithanhvien, String mathanhvien, String tenthanhvien,
            String ngaysinh,int gioitinh, String diachi, String sdt, 
            String email, String ghichu){
        
        String maloaithanhvien;
        BLoaiThanhVien BLTV =new BLoaiThanhVien();
        maloaithanhvien=BLTV.getMaLoaiThanhVien(tenloaithanhvien);
        
        SQL="INSERT INTO ThanhVien VALUES( "
                +"'"+maloaithanhvien+"',"
                +"'"+mathanhvien+"',"
                +"N'"+tenthanhvien+"',"
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
            +" TenLoaiThanhVien like N'%"+s+"%' or "
            +" MaThanhVien like N'%"+s+"%' or "
            +" TenThanhVien like N'%"+s+"%' or "
            +" NgaySinh like N'%"+s+"%' or "
            +" DiaChi like N'%"+s+"%' or "
            +" SDT like '%"+s+"%' or "
            +" Email like N'%"+s+"%' or "                
            +" Ghichu like N'%"+s+"%'";
        return super.searchAll(SQL);
    }
    @Override
    public boolean deleteByID(String id){
        BTaiKhoanTV TKTV = new BTaiKhoanTV();
        if( TKTV.deleteByID(id)){
            Table="ThanhVien";
            return super.deleteByID(id);
        }
        else return false;
            
    }
}
