package Encrypt;
import java.security.*;
import java.math.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MD5 {
   // private MessageDigest m=MessageDigest.getInstance("MD5");
    String Text;

    public MD5(){  
    }
    public MD5(String checkText){
            Text=checkText;
    }
    public String getMD5Code(){
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.update(Text.getBytes(),0,Text.length());
        return new BigInteger(1,m.digest()).toString(16);
    }
    boolean MD5CodeEquals(String checkText){
        if((checkText==null) || (Text==null))
            return false;
        else {
            String s1=this.getMD5Code();
            String s2=this.getMD5Code();
            if(s1.equals(s2))
                return true;
            else return false;
        }
    }
    public static boolean MD5CodeEquals(String text1, String text2){
        
        if((text1==null) || (text2==null))
            return false;
        else {
            String s1=getMD5CodeOf(text1);
            String s2=getMD5CodeOf(text2);
            if(s1.equals(s2))
                return true;
            else
                return false;
        }
    }
    public static String getMD5CodeOf(String checkText){
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(MD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.update(checkText.getBytes(),0,checkText.length());
        return new BigInteger(1,m.digest()).toString(16);
    }
}