package question2and3;

import java.util.ArrayList;
import java.util.Collections;

import question1.Contact;


//==============================================================
//Program Name:	StudentSort.java (Practical 5 Q 2)
// Description:	...
//==============================================================
//import java.util.*;

public class StudentSort {
	public static void main (String args[]){
		ArrayList<Student> studentList=new ArrayList<Student>();
		Student s1=new Student("155125Y","Ronald",19);
		Student s2=new Student("155119F","Wilfred",20);
		Student s3=new Student("155678A","Ronald",25);
		Student s4=new Student("155125Y","Wally",29);
		Student s5=new Student("155119F","KangLI",20);
		Student s6=new Student("155678A","Mandeal",25);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		Collections.sort(studentList);
		for( Student s: studentList){
			System.out.println(s);
		}
	
	}
}