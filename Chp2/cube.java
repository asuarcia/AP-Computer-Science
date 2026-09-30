/*  Aitor Suarez
    Chp2
    Homework 8 */
	package Chp2;
public class cube {

	private int side;

	public cube()  {
		side = 0;
	}

	public cube(int s) {
		side = s;
	}

	public void setSide(int s) {
	side = s;
}
	public void calculateSurfaceArea() {
		int surfaceArea = 6 * side * side;
		System.out.println("Surface area of Cube with side " + side + ": " + surfaceArea);
}
public void calculateVolume(){
	int volume = side * side * side;
	System.out.println("Volume of Cube with side " + side + ": " + volume);
}

	public static void main (String []args) {
		cube test = new cube();

		test.setSide(112);
		test.calculateSurfaceArea();
		test.calculateVolume();

		test.setSide(42);
		test.calculateSurfaceArea();
		test.calculateVolume();

		test.setSide(11);
		test.calculateSurfaceArea();
		test.calculateVolume();

		test.setSide(37);
		test.calculateSurfaceArea();
		test.calculateVolume();
		
}
}


