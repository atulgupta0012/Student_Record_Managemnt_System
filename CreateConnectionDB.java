package com.student.management;
import java.sql.*;
public class CreateConnectionDB {
	static Connection con;
	
	public static Connection createCon()
	{
		
	

	try
	{
        //load the driver
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		//Craete the connection
		
		String url="jdbc:mysql://localhost:3306/student_db";
		String username="root";
		String password="Atul@1122334455667788";
		 con=DriverManager.getConnection(url,username,password);
	
	
	
	
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return  con;

}
}
