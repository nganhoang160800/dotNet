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
public class BLoaiThanhVien extends Bussiness{
    public BLoaiThanhVien(){
        DB= new classData();
        Table="LoaiThanhVien";
        ID="MaLoaiThanhVien";
    }
    public String getMaLoaiThanhVien(String tenloaithanhvien){
        SQL="SELECT * FROM "+Table+" WHERE TenLoaiThanhVien = N'"+tenloaithanhvien+"'";
        ResultSet rs= DB.getData(SQL);
        try {
            if(rs.next()){
                return rs.getString("MaLoaiThanhVien");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLoaiThanhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "default";
    }
    public boolean updateByProperties(String maloaithanhvien, String tenloaithanhvien, String ghichu){
        SQL="UPDATE LoaiThanhVien SET "
                +"TenLoaiThanhVien = '"+tenloaithanhvien+"', ghichu = '"+ghichu+"' where MaLoaiThanhVien = '"+maloaithanhvien+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties(String maloaithanhvien, String tenloaithanhvien, String ghichu){
        SQL="INSERT INTO LOAITHANHVIEN VALUES("
                +"'"+maloaithanhvien+"',"
                +"'"+tenloaithanhvien+"',"
                +"'"+ghichu+"')";
        return insertBySQLString(SQL);
    }         
}
