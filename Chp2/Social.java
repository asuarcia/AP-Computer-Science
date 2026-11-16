// Aitor Suarez
// Chapter 02
// Homework 17

import java.util.Scanner;

public class Social {
    private String socialNum;

    public Social() {
        socialNum = "456-56-234";
    }

    public Social(String soc) {
        socialNum = soc;
    }

    public int chopAndAdd(String soc) {
        socialNum = soc;
        
        // indexOf() finds the index of a specific character, and substring() extracts a portion of the string. The parameters require target characters and index boundaries.
        int firstDash = socialNum.indexOf("-");
        int secondDash = socialNum.indexOf("-", firstDash + 1);
        
        String part1 = socialNum.substring(0, firstDash);
        String part2 = socialNum.substring(firstDash + 1, secondDash);
        String part3 = socialNum.substring(secondDash + 1);
        
        return Integer.parseInt(part1) + Integer.parseInt(part2) + Integer.parseInt(part3);
    }

    public String toString() {
        int total = chopAndAdd(socialNum);
        String result = "SS# " + socialNum + " has a total of " + total;
        if (socialNum.equals("1-1-1") || socialNum.equals("0-0-0")) {
            result += " (there must be a data entry error)";
        }
        return result;
        
        // If another method were required, I would create a validation helper method to check if the string format and segment lengths are correct before parsing.
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // use a Scanner and update the single instance of the class with varying test cases
        Social mySocial = new Social("456-56-234");
        
        System.out.println(mySocial);
        
        mySocial.chopAndAdd("1-1-1");
        System.out.println(mySocial);
        
        mySocial.chopAndAdd("102-2-12");
        System.out.println(mySocial);
        
        mySocial.chopAndAdd("0-0-0");
        System.out.println(mySocial);
        
        scanner.close();
    }
}

//To handle dirty data like periods instead of hyphens, we would need to check for and replace those characters or sanitize the input string before processing it.
