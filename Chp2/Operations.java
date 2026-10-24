/* Aitor Suarez
   Chp 2
   Homework 14 */
import java.util.Scanner;

public class Operations
{
    private double one, two, sum, difference, product, quotient, modulus;

    public Operations() {
        one = 0.0;
        two = 0.0;
    }

    public void setNums(double num1, double num2)
    {
        one = num1;
        two = num2;
        
        sum();
        difference();
        product();
        quotient();
        modulus();
    }

    public void sum()
    {
        sum = one + two;
    }

    public void difference()
    {
        difference = one - two;
    }

    public void product()
    {
        product = one * two;
    }

    public void quotient()
    {

       quotient = one / two;
    }

    public void modulus()
    {
       modulus = one % two;
  
    }

    public void print()
    {
        System.out.println("Operations");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);
    }

    public static void main (String [] args)
    {
        Scanner user = new Scanner(System.in);
        double first, second;
        
        System.out.print("Enter the first number: ");
        first = user.nextDouble();
        
        System.out.print("Enter the second number: ");
        second = user.nextDouble();

        Operations test = new Operations();

        test.setNums(first, second);

        test.print();
        
    }
}

 