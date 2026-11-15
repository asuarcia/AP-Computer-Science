// Aitor Suarez
// Chapter 02
// Homework 15

public class CharacterAnalyzer {
    private char theChar;

    public CharacterAnalyzer(){
        theChar = 'D';
    }

    public CharacterAnalyzer(char c){
        theChar = c;
    }

    public void setChar(String word){
        theChar = getChar(word, word.length() / 2); // Sets the instance variable to the middle char
    }

    public char getChar(String word, int n) {
        return word.charAt(n); // Returns the char value at index n
    }

    public boolean isUpper( ){
        return theChar >= 65 && theChar <= 90; // Checks if ASCII value falls in uppercase range
    }

    public boolean isLower( ){
        return theChar >= 97 && theChar <= 122; // Checks if ASCII value falls in lowercase range
    }

    public boolean isNumber( ){
        return theChar >= 48 && theChar <= 57; // Checks if ASCII value falls in digit range
    }

    public int getASCII( ){
        return (int) theChar; // Returns the integer value of the character
    }

    public String toString(){
        String result = "The value provided is " + theChar + ".\n";
        if (isUpper()) {
            result += theChar + " is an uppercase character. ASCII == " + getASCII() + ".";
        } else if (isLower()) {
            result += theChar + " is a lowercase character. ASCII == " + getASCII() + ".";
        } else if (isNumber()) {
            result += theChar + " is a number. ASCII == " + getASCII() + ".";
        }
        return result;
    }

    public static void main (String args []){
        //create an initialized object to start with D
        CharacterAnalyzer analyzer = new CharacterAnalyzer('D');
        System.out.println(analyzer);
        System.out.println();

        //use the setChar method to test the following
        analyzer.setChar("Hypotenuse");
        System.out.println(analyzer);
        System.out.println();

        analyzer.setChar("SunGlasses");
        System.out.println(analyzer);
        System.out.println();

        analyzer.setChar("Believe67 in your45 dreams 2026");
        System.out.println(analyzer);
    }
}
