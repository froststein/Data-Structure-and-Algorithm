package PracticalTest;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	private String name;
	private String id;
	private int age;
	
	public Person(){
		
	}
	public Person(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void view(){
		System.out.println("===================================");
		System.out.println("Name: "+getName());
		System.out.println("ID: "+getId());
		System.out.println("Age: "+getAge());
	}
	
	/* Compare Name by alphabet order
	public int compareTo(Person ppl) {
		int result;
		String tempName = ppl.getName();
		result=getName().compareTo(tempName);
		return result;
	}
	*/
	/* Compare age
	public int compareTo(Person ppl) {
		int result;
		int tempage = ppl.getAge();
		result=getAge()-tempage;
		return result;
	}
	*/
	
	/* Compare Name and age
	public int compareTo(Person ppl) {
		int result;
		if(name.equalsIgnoreCase(ppl.getName())){
			result= age-ppl.getAge();
		}else{
			result=getName().compareTo(ppl.getName());
		}
		
		return result;
	}*/
	/* Compare by length of name
	public int compareTo(Person ppl) {
		int result;
		if(name.length()>ppl.getName().length()){
			return 1;
		}
		else if(name.length()<ppl.getName().length()){
			return -1;
		}
		else{
			result=name.compareTo(ppl.getName());
		}
		return result;
	}
	*/
	/* Compare and sort by object type
	 public int compareTo(Person ppl) {
		if(ppl instanceof Student){
			return 1;
		}else if(ppl instanceof Teacher){
			return -1;
			}
		return 0;
	}*/
	public static Comparator<Person> COMPARE_BY_AGE = new Comparator<Person>() {
        public int compare(Person one, Person other) {
        	if(other instanceof Student){
            return one.age-other.age;
        	}
        	else return 0;
        }
    };
    
	public int compareTo(Person ppl) {
		int result=0;
		if(ppl instanceof Student){
			result=1;
			if (this instanceof Student)
				result = this.age - ppl.age;
		}else if(ppl instanceof Teacher){
			result=-1;
			if (this instanceof Teacher)
				result = this.age - ppl.age;
		}
		return result;
	}

    /*
	public int compareTo(Person ppl) {
		int result=0;
		if(ppl instanceof Student){
			result= this.age-ppl.getAge();
		}else 
			result=this.age-ppl.getAge();
		
		return result;
	}
	*/
	
}
