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
public class BChucVu extends Bussiness{
    public BChucVu(){
        DB= new classData();
        Table="ChucVu";
        ID="MaChucVu";
    }
    public String getMaChucVu(String tenchucvu){
        SQL="SELECT * FROM CHUCVU WHERE TenChucVu"
                + " = N'"+tenchucvu+"'";
        ResultSet rs= DB.getData(SQL);
        try {
            if(rs.next())
                return rs.getString("MaChucVu");
        } catch (SQLException ex) {
            Logger.getLogger(BLoaiThanhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "default";
    }
    public boolean updateBySQLString(String machucvu, String tenchucvu, String ghichu){
        SQL="UPDATE CHUCVU SET "
                +" TenChucVu = N'"+tenchucvu+"',"
                +" GhiChu = N'"+ghichu+"'"
                +" where MaChucVu = '"+machucvu+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties(String machucvu, String tenchucvu, String ghichu){
        SQL="INSERT INTO CHUCVU VALUES("
                +"'"+machucvu+"',"
                +"N'"+tenchucvu+"',"
                +"N'"+ghichu+"')";
        return super.insertBySQLString(SQL);
    }
            
}
