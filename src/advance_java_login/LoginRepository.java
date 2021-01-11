package advance_java_login;

import java.sql.Connection;
import java.sql.*;

public class LoginRepository {
	
	public boolean viewEmployee(String userName,String password)
	{
		Connection conn=DBUtil.mySQLdbConnection();
		boolean result=false;
		String sql="select * from login where userName=? ";
		
		try {
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, userName);
			
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{
				String pass=rs.getString("password");
				System.out.println(pass);
				if(pass.equals(password))
				result=true;
			}
		}catch(Exception e)
		{
			System.out.println("Eception occured "+e);
		}
		
		System.out.println(result);
		return result;
	}

}
