package netbeanjavaclinic;

//package netbeanjavaclinic;
import dumps.CustValuObj;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PatientDao {
	
	public static int getLastCid()
	{
		Connection con=DBConnector.getInstance().getNewConnection();
		Statement st;
		int x = 0;
		try {
			st = con.createStatement();
		
		ResultSet rs=st.executeQuery("select Reg_No from Main1 order by Reg_No desc");
		
		     rs.next();
		
		
		      x=rs.getInt(1);
		      System.out.println(""+x);
		
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally{
			try {
				con.close();
                                System.out.println("Con closed");
                                
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return x;
		
	}
	
	public static int insertCust(PatientVO cvo)
	{
            System.out.println("insert");
		Connection con=DBConnector.getInstance().getNewConnection();
		try {
			//PreparedStatement pst=con.prepareStatement("insert into customer values(?,?,?)");
		   PreparedStatement pst=con.prepareStatement("insert into Main1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1,cvo.reg);
		    pst.setDate(2,cvo.d1);
		    pst.setString(3,cvo.name);
		    pst.setString(4,cvo.adr);
		    pst.setString(5,cvo.phone);
		    pst.setString(6,cvo.gender);
		    pst.setString(7,cvo.MarSt);
		    pst.setString(8,cvo.child);
		    pst.setString(9,cvo.age);
		    pst.setString(10,cvo.educt);
		    pst.setString(11,cvo.occup);
		    pst.setString(12,cvo.refby);
		    pst.setString(13,cvo.durill);
		    pst.setString(14,cvo.pastfh);
		    pst.setString(15,cvo.medh);
		    pst.setString(16,cvo.sleep);
		    pst.setString(17,cvo.aptit);
		    pst.setString(18,cvo.palpi);
		    pst.setString(19,cvo.trem);
		    pst.setString(20,cvo.hallu);
		    pst.setString(21,cvo.delu);
		    
		    pst.setString(22,cvo.insight);
		    pst.setString(23,cvo.judg);
		    pst.setString(24,cvo.others);
		    pst.setString(25,cvo.dreaming);
		    pst.setString(26,cvo.pers1);
		    pst.setString(27,cvo.pers2);
		    pst.setString(28,cvo.pers3);
		    pst.setString(29,cvo.pers4);
		    pst.setString(30,cvo.pers5);
		    
		    pst.setString(31,cvo.pers6);
		    pst.setString(32,cvo.orien);
		    pst.setString(33,cvo.remotm);
		    pst.setString(34,cvo.recentm);
		    pst.setString(35,cvo.cstate);
		    pst.setString(36,cvo.mood);
		    pst.setString(37,cvo.digno);
		    pst.setString(38,cvo.m1);
		    pst.setString(39,cvo.m2);
		    pst.setString(40,cvo.m3);
		    
		    pst.setDate(41,cvo.followdt);
		    pst.setString(42,cvo.followc);
		    pst.setDate(43,cvo.fd2);
		    pst.setInt(44,cvo.fd3);
		    pst.setDate(45,cvo.fd4);
		    pst.setDate(46,cvo.fd5);
		    pst.setDate(47,cvo.fd6);
		   
		    
		    int x=pst.executeUpdate();
                //  PreparedStatement pst1=con.prepareStatement("insert into Appointments values(?,?,?,?)");  
                //  pst1.setInt(1,cvo.reg);
                //   pst1.setString(2,cvo.name);
                //   pst1.setDate(3,cvo.followdt);
                //   pst1.setString(4, null); 
                //   int y=pst1.executeUpdate();
                 //  System.out.println("In appointmnts y"+y);
                  
		    return x;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
                        
			try {
                            con.close();
                            System.out.println("Con closed");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
		
	}
        
        public static CustValuObj selectById (String id) //throws SQLException
        {
            Connection con=DBConnector.getInstance().getNewConnection();
		try {
			//PreparedStatement pst=con.prepareStatement("select * from customer where name=?");
		     // pst.setString(1, searchString);
		      PreparedStatement pst=con.prepareStatement("select * from sjtab where id=?");
		     
                      pst.setInt(1,Integer.parseInt(id));
		      ResultSet rs=pst.executeQuery();
		     rs.next();
		      
		    	  return(new CustValuObj(rs.getInt(1),rs.getString(2),rs.getString(3)));
		    	  
		      
		     
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{ try {
			con.close();
                        System.out.println("Con closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
        return null;
        
        }
        //new method for phone nos
        
           public static Collection selectPatient(Date fd1,Date fd2) throws SQLException
        {
            
           Vector<PhoneVO> ar=null ;
		Connection con=DBConnector.getInstance().getNewConnection();
		try {
			//PreparedStatement pst=con.prepareStatement("select * from customer where name=?");
		       System.out.println("selectPT called");
         
                         PreparedStatement pst=con.prepareStatement(" select * from Main1 where sfdt between ? and  ?");
                                //   PreparedStatement pst=con.prepareStatement("select * from Main1 where 'follow-dt' = ?");
                         pst.setDate(1, fd1);
                        pst.setDate(2, fd2);


                                       //PreparedStatement pst=con.prepareStatement("select * from Main1 where name=?");
                                       //  pst.setString(1, searchString);
                        ResultSet rs=pst.executeQuery();

                    
                     // System.out.println("rs"+rs.getString(1));
                       if(rs!=null)
                          {
                           ar = new Vector<PhoneVO>();
		          while(rs.next())
		         { 
                          ar.add(new PhoneVO(rs.getString(3),rs.getString(5)));
                          
                         
                      
                          }
                      return ar;
                       } 
                      
                  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{ try {
                     System.out.println("finally called");
			con.close();
                        System.out.println("Con closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
            
           
            
           return null; 
        }
        
        
        
        
        
      //  */
        
        public static Collection selectPatient(Date fd) throws SQLException
        {
            
           Vector<AppointVO> ar=null ;
		Connection con=DBConnector.getInstance().getNewConnection();
		try {
			//PreparedStatement pst=con.prepareStatement("select * from customer where name=?");
		       System.out.println("selectPT called");
		     PreparedStatement pst=con.prepareStatement("select * from Main1 where sfdt = ?");
                    //   PreparedStatement pst=con.prepareStatement("select * from Main1 where 'follow-dt' = ?");
                     pst.setDate(1, fd);
		    //PreparedStatement pst=con.prepareStatement("select * from Main1 where name=?");
                    //  pst.setString(1, searchString);
		      ResultSet rs=pst.executeQuery();
                      
                    
                     // System.out.println("rs"+rs.getString(1));
                   if(rs!=null)
                       {
                           ar = new Vector<AppointVO>();
		      while(rs.next())
		      { 
                          ar.add(new AppointVO(rs.getInt(1),rs.getString(3),rs.getString(4)));
                          
                         
                      
                      }
                      return ar;
                       } 
                      
                  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{ try {
                     System.out.println("finally called");
			con.close();
                        System.out.println("Con closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
            
           
            
           return null; 
        }
	//@SuppressWarnings({ "unchecked", "null" })
	public static Vector selectCust (String searchString) //throws SQLException
	{
		Vector<PatientVO> ar=null ;
		Connection con=DBConnector.getInstance().getNewConnection();
		try {
			//PreparedStatement pst=con.prepareStatement("select * from customer where name=?");
		       System.out.println("select called");
		      PreparedStatement pst=con.prepareStatement("select * from Main1 where name like ? order by name");
                     pst.setString(1, "%"+searchString+"%");
		    //PreparedStatement pst=con.prepareStatement("select * from Main1 where name=?");
                    //  pst.setString(1, searchString);
		      ResultSet rs=pst.executeQuery();
                                            
                       if(rs!=null)
                       {
                           ar = new Vector<PatientVO>();
		      while(rs.next())
		      { 
                          PatientVO cvo=new PatientVO();
                          
                          cvo.reg=rs.getInt(1);
                          cvo.d1=rs.getDate(2);
                          cvo.name=rs.getString(3);
                          
                          cvo.adr=rs.getString(4);
                          cvo.phone=rs.getString(5);
                          cvo.gender=rs.getString(6);
                          cvo.MarSt=rs.getString(7);
                          cvo.child=rs.getString(8);
                          cvo.age=rs.getString(9);
                          cvo.educt=rs.getString(10);
                          cvo.occup=rs.getString(11);
                          cvo.refby=rs.getString(12);
                          
                          cvo.durill=rs.getString(13); 
                          cvo.pastfh=rs.getString(14); 
                          cvo.medh=rs.getString(15);
                         cvo.sleep=rs.getString(16); 
                         cvo.aptit=rs.getString(17); 
                         cvo.palpi=rs.getString(18); 
        
                
                          cvo.trem=rs.getString(19); 
        cvo.hallu=rs.getString(20); 
         cvo.delu=rs.getString(21); 
        cvo.insight=rs.getString(22); 
          cvo.judg=rs.getString(23); 
           cvo.others=rs.getString(24); 
        cvo.dreaming=rs.getString(25); 
        
          cvo.pers1=rs.getString(26);
        cvo.pers2=rs.getString(27);
        cvo.pers3=rs.getString(28);
         cvo.pers4=rs.getString(29);
        cvo.pers5=rs.getString(30);
         cvo.pers6=rs.getString(31);
                          
         
         
        cvo.orien=rs.getString(32); 
        cvo.recentm=rs.getString(33); 
       cvo.remotm=rs.getString(34); 
        cvo.cstate=rs.getString(35); 
        cvo.mood=rs.getString(36); 
         
         
         cvo.digno=rs.getString(37); 
         cvo.m1=rs.getString(38); 
         cvo.m2=rs.getString(39); 
          cvo.m3=rs.getString(40);                   
                          
           cvo.followdt=rs.getDate(41); 
         cvo.followc=rs.getString(42);                 
                          
            cvo.fd2=rs.getDate(43);  
            cvo.fd3=rs.getInt(44);
             cvo.fd4=rs.getDate(45);
              cvo.fd5=rs.getDate(46);
                cvo.fd6=rs.getDate(47);           
		    	  ar.add(cvo);
		    	  
		      }
                       }
                       
                   else
                     {
                          System.out.println("in select null");
                          
                          
                      }
		      return ar;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{ try {
                     System.out.println("finally called");
			con.close();
                        System.out.println("Con closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		return ar;
	}

    static void updatePatient(int reg, String followc, Date followdt) {
        
             Connection con=DBConnector.getInstance().getNewConnection();
        try {
                System.out.println("in update"+followc+reg+followdt);
                
                
              //  Statement st=con.createStatement();
              //int  numUpd = st.executeUpdate( "UPDATE Main1 SET followcmt='4657' WHERE Reg_No=reg");
                
                
               // numUpd = stmt.executeUpdate(
 // "UPDATE EMPLOYEE SET PHONENO='4657' WHERE EMPNO='000010'");
                
             //   PreparedStatement pst=con.prepareStatement("update Main1 set followcmt=?  where Reg_No=?");
             //PreparedStatement pst=con.prepareStatement("update Main1 set address=?  where Reg_No=?");
               // PreparedStatement pst=con.prepareStatement("update Main1 set scmt=? where Reg_No=?");
            PreparedStatement pst=con.prepareStatement("update Main1 set scmt=? , sfdt=? where Reg_No=?");
              //  PreparedStatement pst=con.prepareStatement("update Main1 set 'follow-cmt'=? , 'follow-dt'=? where Reg_No=?");
                // "update " + dbName + ".COFFEES " +
                 //         "set SALES = ? where COF_NAME = ?";
              // PreparedStatement pst=con.prepareStatement("update Main1 set scmt=?  where Reg_No=?");
                pst.setString(1, followc);
               pst.setDate(2, followdt);
             pst.setInt(3, reg);
                int x=pst.executeUpdate();
                System.out.println("update x");
                
         //       PreparedStatement pst2=con.prepareStatement("update Appointments set Adate=? where ID=?");
           //     pst2.setDate(1, followdt);
         //        pst2.setInt(2, reg);
         //    int x1=pst2.executeUpdate();
         //     System.out.println("update x"+x1);
               
                
                
                
                
                
                
             //   PreparedStatement pst1=con.prepareStatement("update Main1 set  sfdt=?  where Reg_No=?");
                           
            // pst1.setDate(1, followdt);
            //  pst1.setInt(2, reg);
            //  int x1=pst1.executeUpdate();
            //   System.out.println("update x"+x1);
               
                
            //   con.close();
               System.out.println("con NOT closed");
            
            //throw new UnsupportedOperationException("Not yet implemented");
        } catch (SQLException ex) {
            try {
                con.close();
            } catch (SQLException ex1) {
                Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
            ex.printStackTrace();
            Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
             try {
                 if(con!=null)
                con.close();
                
            } catch (SQLException ex1) {
                Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
             
        }
    }

    static int updatePatient(int reg, Date ud) {
        Connection con=null;
        try {
             con=DBConnector.getInstance().getNewConnection();
      
                  System.out.println("in update"+reg+ud);
                  
                  
                //  Statement st=con.createStatement();
                //int  numUpd = st.executeUpdate( "UPDATE Main1 SET followcmt='4657' WHERE Reg_No=reg");
                  
                  
                 // numUpd = stmt.executeUpdate(
   // "UPDATE EMPLOYEE SET PHONENO='4657' WHERE EMPNO='000010'");
                  
               //   PreparedStatement pst=con.prepareStatement("update Main1 set followcmt=?  where Reg_No=?");
               //PreparedStatement pst=con.prepareStatement("update Main1 set address=?  where Reg_No=?");
                 // PreparedStatement pst=con.prepareStatement("update Main1 set scmt=? where Reg_No=?");
                PreparedStatement pst=con.prepareStatement("update Main1 set  sfdt=? where Reg_No=?");
                 // PreparedStatement pst=con.prepareStatement("update Main1 set  'follow-dt'=? where Reg_No=?");
                  // "update " + dbName + ".COFFEES " +
                   //         "set SALES = ? where COF_NAME = ?";
                 
                  pst.setDate(1, ud);
                  pst.setInt(2, reg);
             //  pst.setInt(3, reg);
                  int x=pst.executeUpdate();
                  System.out.println("update x....now");
          
               return x;
               
        //  throw new UnsupportedOperationException("Not yet implemented");
        } catch (SQLException ex) {
            Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
         finally{
             try {
                 if(con!=null)
                con.close();
              System.out.println("con closed");  
            } catch (SQLException ex1) {
                Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
             
        }
        
    }
}
