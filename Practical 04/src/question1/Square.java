package question1;

public class Square implements Shape {
     private double length;

     public Square() {
          length = 1;
     }

     public Square(double length) {
     	this.length = length;
     }
     
      public String toString() {
          return "Length: " + length;	
     }

     public double area() {
          return length * length;
     }

     public String getName() {
          return "Square";
     }

}
