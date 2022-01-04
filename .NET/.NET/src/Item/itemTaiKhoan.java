/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;

public class itemTaiKhoan extends Object{
    private String ID;
    private String Password;
    public itemTaiKhoan(){
        
    }
    public itemTaiKhoan(String _ID, String _Password){
        ID=_ID;
        Password=_Password;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    @Override
    public String toString(){
        return ID.toString();
    }
}
