/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanjavaclinic;

/**
 *
 * @author satish
 */
class PhoneVO {
    
    String name;
    String phone;
    
    public PhoneVO(String name,String phone)
    {
        this.name=name;
        this.phone=phone;
        
    }
    
     public String toString()
  {
      return("---"+name+"---"+phone);
  }
    
    
    
    
    
}
