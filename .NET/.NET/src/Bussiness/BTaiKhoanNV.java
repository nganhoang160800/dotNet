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
public class BTaiKhoanNV extends Bussiness{
    public BTaiKhoanNV(){
        DB= new classData();
        Table="TaiKhoanNhanVien";
        ID="MaNhanVien";
    }
    public boolean updateByProperties(String manhanvien, String matkhaunhanvien){
        SQL="UPDATE "+Table+" SET "
                +" MatKhauNhanVien = '"+matkhaunhanvien+"'"
                +" WHERE MaNhanvien = '"+manhanvien+"'";
        return super.updateBySQLString(SQL);
    }
    public boolean insertByProperties(String manhanvien, String matkhaunhanvien){
        SQL="INSERT INTO "+Table+" values('"+manhanvien+"','"+matkhaunhanvien+"')";
        return super.insertBySQLString(SQL);
    }
}
