package Chp2;

public class LetterFun {
	public String strange;
	
	public LetterFun(String w) {
		strange = w;
	}
	
	public void setString(String w) {
		strange = w;
	}
	
	public char getLastLetter() {
		return strange.charAt(strange.length() - 1);
	}
	
	public char getFirstLetter() {
		return strange.charAt(0);
	}
	
	public String toString() {
		// Calls the methods and combines them into the requested multiline format
		return "The first letter is : " + getFirstLetter() + "\n" +
		       "The last letter is : " + getLastLetter() + "\n" +
		       "The whole word is : " + strange;
	}
	
	public static void main(String args[]) {
		LetterFun getIt = new LetterFun("Spider");
		System.out.println(getIt.toString());
	}
}
