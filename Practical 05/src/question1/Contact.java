package question1;


public class Contact implements Comparable<Contact>{
	private String firstName; 
	private String lastName;
	private String phone;
		
	
	public Contact (String firstName, String lastName, String phone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;		
	}
	
	public String toString(){
		return "===============\nFirst Name: "+this.firstName+"\nLast Name: "+this.lastName +"\nContact: "+this.phone+"\n===============\n";
	}
	
	public int compareTo (Contact c){
		int result;
		if (lastName.equals(c.lastName))
			result = firstName.compareTo(c.firstName);
		else
			result = lastName.compareTo(c.lastName);
		return result;
	}
	
	
}












