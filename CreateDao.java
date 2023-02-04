package com.student.management;
import java.sql.*;
public class CreateDao {
   public static boolean insertStudentToDB(StudentData obj)
   {
	   boolean f=false;
	   //Create the connection
	   
	   try
	   {
		   
		   Connection con=CreateConnectionDB.createCon();
		   
		   String q="insert into students(sname,sphone,scity) values(?,?,?)";
		   
		   
		   // PreparedStatement
		   
		   PreparedStatement ps=con.prepareStatement(q);
		   
		   // set the value of student
		   
		   ps.setString(1, obj.getStudentName());
		   ps.setString(2, obj.getStudentPhone());
		   ps.setString(3, obj.getStudentCity());
		   ps.executeUpdate();
		   f=true;
		   
	   }catch(Exception e)
	   {
		e.printStackTrace();   
	   }
	   return f;
   }

public static boolean deleteStudent(int userId) {
	   boolean f=false;
	   //Create the connection
	  
	   try
	   {
		   
		   Connection con=CreateConnectionDB.createCon();
		   
		   String q="delete from students where sid=?";
		   
		   
		   // PreparedStatement
		   
		   PreparedStatement ps=con.prepareStatement(q);
		   
		   // set the value of student
		   
		 ps.setInt(1, userId);
		   ps.executeUpdate();
		   f=true;
		   
	   }catch(Exception e)
	   {
		e.printStackTrace();   
	   }
	   return f;
	
	
}

public static void showAllData() {
	
	   boolean f=false;
	   //Create the connection
	  
	   try
	   {
		   
		   Connection con=CreateConnectionDB.createCon();
		   
		   String q="select * from students";
		   System.out.println("=========================");
		   
		   Statement st=con.createStatement();
		   ResultSet set=st.executeQuery(q);
		   // PreparedStatement
		   
		   while(set.next())
		   {
			   int id=set.getInt(1);
			   String name=set.getString(2);
			   String phone=set.getString(3);
			   String city=set.getString(4);
			   System.out.println("Student id is:"+id);
			   System.out.println("Student name is:"+name);
			   System.out.println("Student phone is:"+phone);
			   System.out.println("Studdent city is:"+city);
			   System.out.println("==================================");
		   }
		   
		   // set the value of student
		   
		  
		   f=true;
		   
	   }catch(Exception e)
	   {
		e.printStackTrace();   
	   }
	 
	
	
}



public static boolean updateStudentData(int studentId) {
	// TODO Auto-generated method stub
	boolean f=false;
	try
	   {
		   
		   Connection con=CreateConnectionDB.createCon();
		   
		   String q="update students set scity='Lucknow' where sid=?";
		   
		   
		   // PreparedStatement
		   
		   PreparedStatement ps=con.prepareStatement(q);
		   
		   // set the value of student
		   
		 ps.setInt(1, studentId);
		   ps.executeUpdate();
		   f=true;
		   
	   }catch(Exception e)
	   {
		e.printStackTrace();   
	   }
	
	return f;
}
}
