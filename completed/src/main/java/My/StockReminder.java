//--IT20762568
//--W.B.M.S.R.Weerasekara
//////////////////////////
package My;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB.DbCon;
import My.Send_Email;


public class StockReminder {
	
	private Connection con=null; 
	  
	
	
	public void SendMailToSupplier() {
		
		con=new DbCon().getDbCon();
	
	    try {
    	
		
		
		String sql="select DISTINCT mail, disname,name from Supplier where qun<20";
		
		PreparedStatement ps=con.prepareStatement(sql);
	
		
		ResultSet rs = ps.executeQuery();
		
		String Email=null;
		String Name=null;
		String IName=null;
		while(rs.next()) {
			Email=rs.getString(1);
			Name=rs.getString(2);
			IName=rs.getString(3);
		
		
		String Subject="Stock Getting Low";
		String msg="Dear "+Name+",\n \nYou have supplied Item:-"+IName+" has been out of stock.\n \n \nIs there any inquiry Please contact us.+94 71 9603 963";
		new Send_Email().Email(Email,Subject,msg);
	
	
		
		}
		
		
		}
	catch(Exception e) {
		System.out.println(e);
	}  
}
}

