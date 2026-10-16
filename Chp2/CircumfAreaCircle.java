package Chp2;
/* Aitor Suarez
   Chp 2
   Homework 9
*/

public class CircumfAreaCircle{
    private double radius;

	public CircumfAreaCircle(double r) {
	radius = r;
	}

	public double getCircumference(){
        double circumference = 2 * 3.14159 * radius;
        return circumference;
    }
    public double calculateArea(){
        double area = 3.14159 * radius * radius;
        return area;
    }

    public void Print() {
        System.out.println("The Radius of the circle is: " + radius);
        System.out.println("The circumference of the circle is: " + getCircumference());
        System.out.println("The area of the circle is: " + calculateArea());
    }
public static void main(String [] args){
    CircumfAreaCircle circle = new CircumfAreaCircle(7.0);

    circle.Print();
}
}
