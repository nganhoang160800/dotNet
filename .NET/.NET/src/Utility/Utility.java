/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author NHATHUYNH
 */
public class Utility extends PlainDocument {

    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if (str == null) {
            return;
        }
        char[] addedFigures = str.toCharArray();
        char c = 0;
        for (int i = addedFigures.length; i > 0; i--) {
            c = addedFigures[i - 1];
            if (Character.isDigit(c) || c == '.') {
                super.insertString(offs, new Character(c).toString(), a);
            }
        }
        
          boolean dot = false;

            if(c=='.') 
            { 
                if(!dot)
                {
                    dot = true;
                    super.insertString(offs, new String(new Character(c).toString()), a); 
                }
            }
            else if(Character.isDigit(c)) 
            { 
                super.insertString(offs, new String(new Character(c).toString()), a); 
            }  
    }
}
