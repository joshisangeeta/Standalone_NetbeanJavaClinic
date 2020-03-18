/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanjavaclinic;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class PrintFrame {
   PatientVO pvo;
    void setCvo(PatientVO obj) {
        
        pvo=obj;
       
            try {
             //   FileWriter  fos=new FileWriter("F:\\hadapasar\\PatientDetails1.txt");
               
                DataOutputStream dos =new DataOutputStream(new FileOutputStream("F:\\hadapasar\\PatientDetails1.txt"));
                 
              //  String s=pvo.toString();
                String s=pvo.toPrint();
                dos.writeUTF(s);
                
                
                
                
              //  System.out.println("pvo"+pvo);
                
                
                
                  //throw new UnsupportedOperationException("Not yet implemented");
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(PrintFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    
    

