package question2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Student {
	private String adminNo;
	private String name;
	private GregorianCalendar birthDate;
	private int test1;
	private int test2;
	private int test3;

	public Student(String adminNo, String name, String birthDate, int test1, int test2, int test3) {
		this.adminNo = adminNo;
		this.name = name;
		this.birthDate = convertDate(birthDate);
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	public Student(String studentRecord){
		Scanner sc=new Scanner(studentRecord);
		sc.useDelimiter(";");
		adminNo=sc.next();
		name=sc.next();
		birthDate=convertDate(sc.next());
		test1=sc.nextInt();
		test2=sc.nextInt();
		test3=sc.nextInt();

	}
	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public int getTest3() {
		return test3;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}

	public static GregorianCalendar convertDate(String ds){
		int date;
		int month;
		int year;
		Scanner sc=new Scanner(ds);
		sc.useDelimiter("/");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		GregorianCalendar d3=new GregorianCalendar(year,(month-1),date);
		sc.close();
		return d3;
	}

	public static double averageScore(int test1,int test2, int test3){
		double average=0;
		average=(test1+test2+test3)/3;
		return average;
	}
	public String toString(){
		String output=this.getAdminNo()+" "+this.getName()+" "+formatDate(this.getBirthDate())
		+" "+averageScore(this.getTest1(),this.getTest2(),this.getTest3());
		return output;

	}
	public static String formatDate (GregorianCalendar d1){
		int day = d1.get(Calendar.DATE);
		int month = d1.get(Calendar.MONTH)+ 1 ;
		int year = d1.get(Calendar.YEAR);
		return day + "/" + month + "/" + year;
	}

	public static ArrayList<Student> readStudent(String file){
		FileController file1 = new FileController(file);
		ArrayList<Student> recs = new ArrayList<Student>();
		ArrayList<String> recsReturn;
		
		
		recsReturn=file1.readLine();
		for(int i=0;i<recsReturn.size();i++){
			recs.add(new Student(recsReturn.get(i)));
		}
		return recs;
	}
	public static void main(String[] args) {
		readStudent("testing.txt");
	}





}
