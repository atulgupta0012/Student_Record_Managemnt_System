package com.student.management;


public class StudentData {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	
	
	//This is getter and setter
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	// This is parameterized constructor
	
	
	public StudentData(int studentId, String studentName, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public StudentData(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	
	// This is super constructor
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentClass [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone="
				+ studentPhone + ", studentCity=" + studentCity + "]";
	}
	
	

	

}
