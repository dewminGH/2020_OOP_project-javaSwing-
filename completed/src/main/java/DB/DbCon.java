//--IT20762568
//--W.B.M.S.R.Weerasekara
////////////////////////////
package DB;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbCon {
    
   

	public Connection getDbCon() {
		 Connection con=null;
	        
	        try{
	            
	            con=DriverManager.getConnection("jdbc:sqlserver://DEWMIN\\SQLEXPRESS;databaseName=Rust;user=dewmin;password=123");
	          
	        }
	        catch(Exception e){
	            System.out.println(e);
	        }
	        
	        return con;
    
            }
}
