import java.io.InputStreamReader;

import com.student.management.CreateDao;
import com.student.management.StudentData;

import java.io.BufferedReader;
import java.io.IOException;
public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Student Management System..");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to  Add student");
			System.out.println("Press 2 to delete the student");
			System.out.println("Press 3 to display the student");
			System.out.println("Press 4 to update or modify  the data");
			System.out.println("Press 5 to exit the data");
			
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				//Add student
				
				System.out.println("Enter the student name");
				String name=br.readLine();
				
				
				System.out.println("Enter the student phone");
				String phone=br.readLine();
				
				
				System.out.println("Enter the student city");
			    String city =br.readLine();
			    
			    
			    StudentData obj=new StudentData(name,phone,city);
			     boolean b=CreateDao.insertStudentToDB(obj);
			     if(b)
			     {
			    	 System.out.println("Data added succesfully....");
			     }
			     
			     else
			     {
			    	    System.out.println("Data not added successfully");
			     }
			    
			   
			}
			
			else if(c==2)
			{
				System.out.println("Enter the student id:");
				int userId=Integer.parseInt(br.readLine());
				
				boolean f=CreateDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("Data deleted succesfully");
				}
				
				else
				{
					  System.out.println("Data is not deleted successfulyy");
				}
				
				// Delete the student
			}
			
			else if(c==3)
			{
				// display the student
				CreateDao.showAllData();
			}
			
			else if(c==4)
			{
				System.out.println("Enter the student id:");
				int studentId=Integer.parseInt(br.readLine());
				
				 boolean g=CreateDao.updateStudentData(studentId);
				 if(g)
				 {
					 System.out.println("Student data update succesfully....");
				 }
				 
				 else
				 {
					 System.out.println("Student data is not updated successfully....");
				 }
			}
			else if(c==5)
			{
				
				break;
			}
			
			else
			{
				
			}
		}
		System.out.println("Thank you using my application" );
		System.out.println("=============================");
       	}

}
