package com.dbutil.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
public static void main(String[] args) {
	try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","sys as SYSDBA","tiger");  
		  
		if(con!=null)
		{
			System.out.println("Connected");
			
		}
		
		Statement stmt=con.createStatement();  
		  
		
		ResultSet rs=stmt.executeQuery("select * from lokendra");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
}
}
