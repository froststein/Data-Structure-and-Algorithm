package PracticalTest;

public class Teacher extends Person{
	private double salary;

	
	public Teacher(){
		
	}
	public Teacher(String name, String id, int age, double salary) {
		super(name,id,age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void view(){
		System.out.println("Teacher");
		super.view();
		System.out.println("Salary: "+getSalary());
		System.out.println("===================================");
	}
}
