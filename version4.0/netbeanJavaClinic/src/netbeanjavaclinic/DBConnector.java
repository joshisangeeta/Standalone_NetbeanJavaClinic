package netbeanjavaclinic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
		static int ctr=0;
	static DBConnector d;
	 private DBConnector()
	 {
		 ctr++;
		 try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    // Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
   public static DBConnector getInstance()
   {
	   if(ctr==0)
		   d=new DBConnector();
	   return d;
   }
	  public Connection getNewConnection()
	  {
		  Connection con = null;
		  
		  try {
                  //   con=DriverManager.getConnection("jdbc:odbc:sj4", "system", "san227");//solya
                //   con=DriverManager.getConnection("jdbc:odbc:sj2", "system", "san227");//hadpasar
                    con=DriverManager.getConnection("jdbc:odbc:sj", "system", "san227");//sjJayBh
                     //  con=DriverManager.getConnection("jdbc:odbc:smj", "system", "san227");
			// con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "san227");
		      System.out.println("con recd");
		  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  return  con;
		  
		  
		  
	  }

}
