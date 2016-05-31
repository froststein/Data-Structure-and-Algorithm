package PracticalTest;

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
	public int compareTo(Student s) {
		int result;
		String tempName = s.getName();
		result=getName().compareTo(tempName);
		return result;
	}
	*/
	/* Compare age
	public int compareTo(Student s) {
		int result;
		int tempage = s.getAge();
		result=getAge()-tempage;
		return result;
	}
	*/
	
	/* Compare Same Name with age
	public int compareTo(Student s) {
		int result;
		if(name.equalsIgnoreCase(s.getName())){
			result= age-s.getAge();
		}else{
			result=getName().compareTo(s.getName());
		}
		
		return result;
	}*/
	/* Compare by length of name
	public int compareTo(Student s) {
		int result;
		if(name.length()>s.getName().length()){
			return 1;
		}
		else if(name.length()<s.getName().length()){
			return -1;
		}
		else{
			result=name.compareTo(s.getName());
		}
		return result;
	}
	*/
	@Override
	public int compareTo(Person ppl) {
		if(ppl instanceof Student){
			return getAge()-ppl.getAge();
		}else if(ppl instanceof Teacher){
			return -1;
		}
		return 0;
	}
}
