// Aitor Suarez
// Chapter 02
// Homework 20
public class WordTriangle
{
	// Added a private instance variable to store the word securely and make it accessible across methods.
	private String word;

	// Added a default constructor so beginners can create a WordTriangle object easily without arguments.
	public WordTriangle() {
		word = "";
	}

	// Added a parameterized constructor to initialize object with a starting word.
	public WordTriangle(String w) {
		word = w;
	}

	// Added a setter method to reuse single object in main for multiple tests
	public void setWord(String w) {
		word = w;
	}

	public void print( )
	{
		// Check if the word is less than 1 character long and return a warning if true
		if (word == null || word.length() < 1) {
			System.out.println("Warning: String is less than 1 character long, cannot produce a triangle.");
			return;
		}

		// Print the top half of the triangle using substrings of decreasing length
		for (int i = word.length(); i > 0; i--) {
			// Print a section of the word starting from index 0 up to i
			System.out.println(word.substring(0, i));
		}

		// Print the bottom half of the triangle building back up
		for (int i = 2; i <= word.length(); i++) {
			// Print an increasing substring section of the word from index 0 to i
			System.out.println(word.substring(0, i));
		}
	}

	public static void main ( String[] args )
	{
		WordTriangle triangleObj = new WordTriangle();

		triangleObj.setWord("hippo");
		triangleObj.print();

		triangleObj.setWord("abcd");
		triangleObj.print();

		triangleObj.setWord("it");
		triangleObj.print();

		triangleObj.setWord("a");
		triangleObj.print();

		triangleObj.setWord("chicken");
		triangleObj.print();
	}
}
