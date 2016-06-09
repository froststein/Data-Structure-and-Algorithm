package PracticalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Application {

	public static void main(String[] args) {
		Student s1=new Student("Roy","155125Y",19,2000);
		Student s2=new Student("Ronald","155122Q",26,600);
		Student s3=new Student("Wilfred","153456Q",51,10000);
		
		Teacher t1=new Teacher("John","123456Y",49,10000);
		Teacher t2=new Teacher("Tom","987456A",31,60000);
		Teacher t3=new Teacher("Kenny","987412W",45,100000);
		ArrayList<Person> pplList=new ArrayList<Person>();
		ArrayList<String> idList=new ArrayList<String>();
		
		pplList.add(t3);
		pplList.add(s3);
		pplList.add(s1);
		pplList.add(s2);
		pplList.add(t2);
		pplList.add(t1);
		Collections.sort(pplList);
		for( Person ppl:pplList){
			ppl.view();
		}
		
		
		Scanner sc=new Scanner(System.in);
		for(;;){
			System.out.println("==Enter Person ID: ");
			String id=sc.next();
			if(id.equalsIgnoreCase("quit")){
				break;
			}
			else{
				int index = Collections.binarySearch(idList,id);
				if(index>=0){
					System.out.println("AdminNo: "+pplList.get(index).getId());
					System.out.println("Name: "+pplList.get(index).getName());
					
				}
				else{
					System.out.println("No such record was found!");
				}
			}
		}
		
		
		
 
			
	}
}
