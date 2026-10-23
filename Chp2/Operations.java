import java.util.Scanner;
public class Operations
{
	//instance variables
	private double one, two, sum;


public void setNums(double num1, double num2)
	{//set the variables
	}
	public void sum( )
	{
	}
	//create methods to find difference, product quotient, modulus
	public void print( )
	{
	//instead of printing within each method, you must create a single print method that will show all results of each operation within a string
	}


	public static void main (String [] args){
	  	Scanner user = new Scanner(System.in);
double first, second;

System.out.print(“prompt user for a number”);
first = user.nextDouble();
//repeat process for the second number.
	
		//create object of type Operations

		Operations test = new Operations();
		// tell the system to use the user’s values 
		test.setNums(first, second);
		//call up and print all other operations

}
}
	


// jus write in numbers and do opertions so product is, sum is, diffrence is, etc


import java.util.Scanner; 
public class Quadratic {

private int a, b, c;
private double plusRoot, minusRoot;
private String equation;

public Quadratic(int quadA, int quadB, int quadC) {
    a = quadA;
    b = quadB;
    c = quadC;
    setEquation();
}

public void setEquation() {
    equation = a + "^2 " + b + "x + " + c;
}

public void calcRoots() {
    double discriminant = (b * b) - 4 * a * c;
    plusRoot = ( (b * -1) + Math.sqrt(discriminant)) / (2 * a);
    minusRoot = ( (b * -1) - Math.sqrt(discriminant)) / (2 * a);
}

public void print( ){
    System.out.println("What is the quadratic coefficient?  " + a);
    System.out.println("What is the linear coefficeint? " + b);
    System.out.println("What is the constant term? " + c);
    System.out.println("The roots of " + equation + " are: " + plusRoot + " and " + minusRoot);
    System.out.println("");
}
public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter 3 numbers, seperated by spaces: ");
    Quadratic calc1 = new Quadratic(input.nextInt(), input.nextInt(), input.nextInt());
    System.out.print("Enter 3 numbers, seperated by spaces: ");
    Quadratic calc2 = new Quadratic(input.nextInt(), input.nextInt(), input.nextInt());
    System.out.print("Enter 3 numbers, seperated by spaces: ");
    Quadratic calc3 = new Quadratic(input.nextInt(), input.nextInt(), input.nextInt());

    calc1.calcRoots();
    calc1.print();

    calc2.calcRoots();
    calc2.print();

    calc3.calcRoots();
    calc3.print();
 