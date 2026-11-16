// Aitor Suarez
// Chapter 02
// Homework 16

import java.util.Scanner;

public class MuseumPricing {
    int age;
    boolean isMember;

    public MuseumPricing() {
        age = 0;
        isMember = false;
    }

    public MuseumPricing(int a) {
        age = a;
        isMember = false;
    }

    public MuseumPricing(int a, boolean mem) {
        age = a;
        isMember = mem;
    }

    public double priceBasedOnAge() {
        // I used an if-else chain because the age ranges are both exclusive and sequential.
        double cost = 0.0;
        
        if (age <= 5) {
            cost = 0.0;
        } else if (age >= 6 && age <= 12) {
            cost = 8.0;
        } else if (age >= 13 && age <= 64) {
            cost = 15.0;
        } else {
            cost = 10.0;
        }

        if (isMember) {
            cost *= 0.80; // Apply 20% discount
        }

        return cost;
    }

    public String toString() {
        // I had an issue printing raw boolean values cleanly, so I kept the output simple and readable.
        return "Age: " + age + " | Member: " + isMember + " | Total Price: $" + priceBasedOnAge();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int userAge = scanner.nextInt();

        System.out.print("Are you a member (true/false)? ");
        boolean userMember = scanner.nextBoolean();

        MuseumPricing visitor = new MuseumPricing(userAge, userMember);
        System.out.println(visitor);

        scanner.close();
    }
}

// We would need to track a group's composition (number of adults and kids) rather than just a single individual's age, update the constructors and inputs, and add a condition to check for the family pass flat rate.
