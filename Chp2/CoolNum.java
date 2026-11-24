// Aitor Suarez
// Chapter: Chapter 02
// Program Number: Homework 19
public class CoolNum 
{
	// Added a private instance variable to store object state safely 
	private int number;

	// Added a default constructor so beginners can easily create an instance without complicated parameters.
	public CoolNum() {
		number = 0;
	}

	// Added a parameterized constructor to set the initial number if needed.
	public CoolNum(int n) {
		number = n;
	}

	// Setter method to update the number for the single object test cases
	public void setNumber(int n) {
		number = n;
	}

	/*
	 * method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 */
	public boolean isCoolNumber( int num ){
		// Check if the remainder is 1 for all divisors
		if (num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1) {
			return true;
		}
		return false;
	}
	
	/*
	 * method countCoolNumbers will return the count
	 * of the coolNumbers between 6 and stop
	 */
	public int countCoolNumbers( int stop ){
		// Initialize count variable to zero to keep track of cool numbers
		int count = 0;
		// Loop through all integers starting from 6 up to the stop value
		for (int i = 6; i <= stop; i++) {
			if (isCoolNumber(i)) {
				count++;
			}
		}
		return count;
	}

	public String toString( int stop ) {
		return countCoolNumbers(stop) + " cool numbers between 6 - " + stop;
	}

	public static void main( String[] args )
	{
		// Create a single CoolNum object as required by the assignment
		CoolNum myCoolNum = new CoolNum();
		
		// Print the formatted string result using the toString method
		System.out.println( myCoolNum.toString( 250 ) );
		System.out.println( myCoolNum.toString( 1250 ) );
		System.out.println( myCoolNum.toString( 2250 ) );
		System.out.println( myCoolNum.toString( 5500 ) );
		System.out.println( myCoolNum.toString( 9500 ) );
		System.out.println( myCoolNum.toString( 23500 ) );
		System.out.println( myCoolNum.toString( 32500 ) );
	}
}
