/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Data.classData;

/**
 *
 * @author Admin
 */
public class BTaiKhoanTV extends Bussiness{
    public BTaiKhoanTV(){
        DB= new classData();
        Table="TaiKhoanThanhVien";
        ID="MaThanhVien";
    }
    public boolean updateByProperties(String mathanhvien, String matkhauthanhvien){
        SQL="UPDATE "+Table+" SET "
                +" MatKhauThanhVien = '"+matkhauthanhvien+"'"
                +" WHERE MaThanhVien = '"+mathanhvien+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties(String manhanvien, String matkhaunhanvien){
        SQL="INSERT INTO "+Table+" values('"+manhanvien+"','"+matkhaunhanvien+"')";
        return super.insertBySQLString(SQL);
    }
}
