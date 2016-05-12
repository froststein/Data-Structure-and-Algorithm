package question2and3;

//================================================================
// Program Name:	Student.java (Practical 5 Q 2)
// Description:		Student class implements Comparable Interface
//================================================================
import java.util.*;

public class Student implements Comparable<Student>{

	// Declare Instance variables
	private String adminNo;
	private String name;
	private int age;
	public Student(String adminNo, String name,int age) {
		this.adminNo = adminNo;
		this.name = name;
		this.age=age;
	}

	// ----------------------------------------------------------
	// Accessor methods to get and set attributes
	// ----------------------------------------------------------
	public String getAdminNo() {
		return adminNo;
	}

	public String getName() {
		return name;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString(){
		return "\n====================\nName: "+this.name+"\nAdmin: "+this.adminNo+"\nAge: "+this.age+"\n====================";
	}

	public int compareTo(Student s) {
		int result;
		if(name.equals(s.name)){
			result=age - s.age; // compareTo() returns 3 possible outcome
								// if the result is 0, its a tie
								// if the result is <0, its less than
								// if the result is >0, its more than
		}
		else{
			result=name.compareTo(s.name);
		}
		return result;
	}
	/*
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
	*/
	
	
}
