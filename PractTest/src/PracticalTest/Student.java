package PracticalTest;

public class Student extends Person{
	private double fees;
	
	public Student(){
		
	}
	public Student(String name, String id, int age, double fees) {
		super(name,id,age);
		this.fees = fees;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public void view(){
		super.view();
		System.out.println("Fees: "+getFees());
		System.out.println("===================================");
	}
}
