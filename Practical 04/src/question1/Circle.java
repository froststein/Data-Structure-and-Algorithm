package question1;

public class Circle implements Shape{
	private double radius;

	public Circle(){
		radius=1.0;
	}
	public Circle(double radius){
		this.radius=radius;
	}

	public String toString(){
		return "Radius: "+radius;
	}

	public double area() {
		return PI*(radius*radius);
	}

	public String getName() {
		return "Circle";
	}

}
