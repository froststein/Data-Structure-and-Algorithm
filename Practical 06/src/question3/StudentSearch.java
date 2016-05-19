package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentSearch {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		ArrayList<Student> studentList = Student.readStudent("testing.txt");
		ArrayList<String> adminList=new ArrayList<String>();
		Collections.sort(studentList);
		
		for(int i=0;i<studentList.size();i++){
			adminList.add(studentList.get(i).getAdminNo());
		}		
		for(;;){
			System.out.println("==Enter Student admin number: ");
			String admin=sc.next();
			if(admin.equalsIgnoreCase("quit")){
				break;
			}
			else{
				int index=Collections.binarySearch(adminList, admin);
				if(index>=0){
					System.out.println("AdminNo: "+studentList.get(index).getAdminNo());
					System.out.println("Name: "+studentList.get(index).getName());
					System.out.println("Test 1: "+studentList.get(index).getTest1());
					System.out.println("Test 2: "+studentList.get(index).getTest2());
					System.out.println("Test 3: "+studentList.get(index).getTest3());
				}
				else{
					System.out.println("No such record was found!");
				}
			}
		}
		System.out.println("Good Bye!");
		sc.close();
		
	}
}
