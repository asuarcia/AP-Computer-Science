// Aitor Suarez
// Chapter 02
// Homework 18

import java.util.Scanner;

public class WordsCompare {
    private String wordOne, wordTwo;
    private int compare;

    public WordsCompare() {
        wordOne = "";
        wordTwo = "";
        compare = 0;
    }

    public WordsCompare(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public void setWords(String one, String two) {
        wordOne = one;
        wordTwo = two;
    }

    public int compare() {
        compare = wordOne.compareTo(wordTwo); // Compares the two strings 
        return compare;
    }

    public String toString() {
        compare(); 
        if (compare < 0) {
            return wordOne + " should be placed before " + wordTwo + "\n";
        } else if (compare > 0) {
            return wordOne + " should be placed after " + wordTwo + "\n";
        } else {
            return wordOne + " and " + wordTwo + " are identical\n";
        }
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input

        // First test case using the initialization constructor
        WordsCompare comparator = new WordsCompare("abe", "ape");
        System.out.println(comparator);

        // Remaining test cases using setWords method
        comparator.setWords("giraffe", "gorilla");
        System.out.println(comparator);

        comparator.setWords("one", "two");
        System.out.println(comparator);

        comparator.setWords("fun", "funny");
        System.out.println(comparator);

        comparator.setWords("123", "19");
        System.out.println(comparator);

        comparator.setWords("193", "1910");
        System.out.println(comparator);

        comparator.setWords("goofy", "godfather");
        System.out.println(comparator);

        comparator.setWords("funnel", "fun456");
        System.out.println(comparator);

        comparator.setWords("Hello", "Hello");
        System.out.println(comparator);

        // User prompt test case
        System.out.print("Enter first word: ");
        String first = scanner.next(); // Reads the first word from user input
        System.out.print("Enter second word: ");
        String second = scanner.next(); // Reads the second word from user input

        comparator.setWords(first, second);
        System.out.println(comparator);

        scanner.close();
    }
}
