/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanjavaclinic;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class DateFormat {
    
    public  static void main(String[] args)
    {
        
        String s="2000-10-23";
        Date d=Date.valueOf(s);
        System.out.println("d"+d);
    }
    
}
