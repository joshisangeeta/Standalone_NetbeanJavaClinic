/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanjavaclinic;

/**
 *
 * @author DELL
 */
public class ShortVO {
    int id;
    String adr;
    String age;
    String name;
    ShortVO(int id,String name,String adr,String age)
    {
        this.id=id;
        this.name=name;
        this.adr=adr;
       this.age=age;
        
    }
  public String toString()
  {
      return(name+"---"+adr+"---"+age);
  }
          
          
    
    
}

