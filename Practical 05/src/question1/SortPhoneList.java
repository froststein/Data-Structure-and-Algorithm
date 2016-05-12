package question1;

import java.util.*;


public class SortPhoneList{
	//-----------------------------------------------------------------
	//  Creates an array of Contact objects, sorts them, then prints
	//  them.
	//-----------------------------------------------------------------
	public static void main (String[] args){
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		Contact c1=new Contact("Roy","Tang","91373633");
		Contact c2=new Contact("Wilfred","Kang","96238709");
		Contact c3=new Contact("Ronald","Tang","84530887");
		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);
		Collections.sort(contactList);
		for( Contact c: contactList){
			System.out.println(c);
		}
		
		
	}
}
