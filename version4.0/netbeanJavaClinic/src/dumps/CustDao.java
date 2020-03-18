package dumps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import netbeanjavaclinic.DBConnector;


public class CustDao {
	
	public static int getLastCid()
	{
		Connection con=DBConnector.getInstance().getNewConnection();
		Statement st;
		int x = 0;
		try {
			st = con.createStatement();
		
		ResultSet rs=st.executeQuery("select id from sjtab order by id desc");
		
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
                                System.out.println("called");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return x;
		
	}
	
	public static int insertCust(CustValuObj cvo)
	{
		Connection con=DBConnector.getInstance().getNewConnection();
		try {
			//PreparedStatement pst=con.prepareStatement("insert into customer values(?,?,?)");
		   PreparedStatement pst=con.prepareStatement("insert into sjtab values(?,?,?)");
                        pst.setInt(1,cvo.cid);
		    pst.setString(2,cvo.name);
		    pst.setString(3,cvo.adres);
		    int x=pst.executeUpdate();
		    return x;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
        return null;
        
        }
	//@SuppressWarnings({ "unchecked", "null" })
	public static Collection selectCust (String searchString) //throws SQLException
	{
		ArrayList ar = new ArrayList();
		Connection con=DBConnector.getInstance().getNewConnection();
		try {
                    
                    System.out.println("select called");
			//PreparedStatement pst=con.prepareStatement("select * from customer where name=?");
		     // pst.setString(1, searchString);
		      PreparedStatement pst=con.prepareStatement("select * from customer where name like ?");
		      pst.setString(1, "%"+searchString+"%");
		      ResultSet rs=pst.executeQuery();
		      while(rs.next())
		      {
		    	  ar.add(new CustValuObj(rs.getInt(1),rs.getString(2),rs.getString(3)));
		    	  
		      }
		      return ar;
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally{ try {
                        System.out.println("finally called");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		return ar;
	}  
}
