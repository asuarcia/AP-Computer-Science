<<<<<<< HEAD
public class PerimeterAreaRec {
    
}
=======
/* Aitor Suarez
   Chp1
   Homework 4 */

public class PerimeterAreaRec {
	
    private int length;
	private int width;
	private int perimeter;
	private int area;

	public void setLengthWidth(int len, int wid){
		length = len;
		width = wid;
    System.out.println("The length of the rectangle is " + length);
    System.out.println("The width of the rectangle is " + width);
}
	public void calculatePerimeter(){
        perimeter = (length * 2) + (width * 2);
}
	public void calculateArea(){
        area = length * width;  // Formula for calculating area
}
	public void print(){
        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
        System.out.println("The area of the rectangle is " + area + ".");
}
public static void main(String args[]){
	PerimeterAreaRec test = new PerimeterAreaRec();
	test.setLengthWidth(2, 3);
	test.calculatePerimeter();
	test.calculateArea();
	test.print();    
}
 }
>>>>>>> 28789a239c39cab6bea4bb9e7688cb30ff9af0e3
