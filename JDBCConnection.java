package java1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3360/anp_d0453","root","Praj@2811");
			System.out.println("Connected successfully");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from person");
			

			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.close();


			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
		
		
		

	}

}
