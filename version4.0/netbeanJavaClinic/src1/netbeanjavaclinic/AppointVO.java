/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanjavaclinic;

/**
 *
 * @author DELL
 */
public class AppointVO {
    int id;
    String name;
    String adr;
      AppointVO(int id,String name,String adr)
    {
        this.id=id;
        this.adr=adr;
       this.name=name;
        
    }
  public String toString()
  {
      return(id+"---"+name+"---"+adr);
  }
          
          
    
}
