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
    System.out.println("The length is set to " + length);
    System.out.println("The width is set to " + width);
}
	public void calculatePerimeter(){
        perimeter = (length * 2) + (width * 2);
}
	public void calculateArea(){
        area = length * width;  // Formula for calculating area
}
	public void print(){
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
}
public static void main(String args[]){
//don’t touch this part, its done for you. 
	PerimeterAreaRec test = new PerimeterAreaRec();
	test.setLengthWidth(2, 3);
	test.calculatePerimeter();
	test.calculateArea();
	test.print();    
}
 }