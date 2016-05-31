package PracticalTest;

import java.util.ArrayList;
import java.util.Collections;

public class Application {
	public static void main(String[] args) {
		Student s1=new Student("Roy","155125Y",19,2000);
		Student s2=new Student("Ronald","155122Q",26,600);
		Student s3=new Student("Wilfred","153456Q",51,10000);
		
		Teacher t1=new Teacher("John","123456Y",49,10000);
		Teacher t2=new Teacher("Tom","987456A",31,60000);
		Teacher t3=new Teacher("Kenny","987412W",45,100000);
		ArrayList<Person> pplList=new ArrayList<Person>();
		
		pplList.add(t3);
		pplList.add(s3);
		pplList.add(s1);
		pplList.add(s2);
		pplList.add(t2);
		pplList.add(t1);
		
		Collections.sort(pplList);
		
		for(int i=0;i<pplList.size();i++){
			pplList.get(i).view();
		}
	}
}
