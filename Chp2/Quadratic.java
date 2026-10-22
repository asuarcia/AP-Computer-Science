package Chp2;

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
    Scanner scanner = new Scanner(System.in);

    Quadratic calc1 = new Quadratic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    Quadratic calc2 = new Quadratic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    Quadratic calc3 = new Quadratic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

    calc1.calcRoots();
    calc1.print();

    calc2.calcRoots();
    calc2.print();

    calc3.calcRoots();
    calc3.print();

}
 }

 /*
package Chp2;

public class Quadratic {

private int a, b, c;
private double plusRoot, minusRoot;
private String equation;

public Quadratic(int quadA, int quadB, int quadC) { // initialization constructor
    a = quadA;
    b = quadB;
    c = quadC;
    setEquation();
}

public void setEquation() {
    equation = a + "^2 " + b + "x + " + c; // write out equation

 	}

public void calcRoots() {
    double discriminant = (b * b) - 4 * a * c;
    plusRoot = ( (b * -1) + Math.sqrt(discriminant)) / (2 * a); // calculate quadratic roots
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
    Quadratic calc1 = new Quadratic(5,-8, 3);
    Quadratic calc2 = new Quadratic(3,2, -7);
    Quadratic calc3 = new Quadratic(9,6, 1);

    calc1.calcRoots();
    calc1.print();

    calc2.calcRoots();
    calc2.print();

    calc3.calcRoots();
    calc3.print();


}
 }

/* System output: 

What is the quadratic coefficient?  5
What is the linear coefficeint? -8
What is the constant term? 3
The roots of 5^2 -8x + 3 are: 1.0 and 0.6

What is the quadratic coefficient?  3
What is the linear coefficeint? 2
What is the constant term? -7
The roots of 3^2 2x + -7 are: 1.2301385866078098 and -1.8968052532744766

What is the quadratic coefficient?  9
What is the linear coefficeint? 6
What is the constant term? 1
The roots of 9^2 6x + 1 are: -0.3333333333333333 and -0.3333333333333333 */


