// Student Name
// Chapter 02
// Program: AddStrings Class

public class AddStrings
{
    private String first;
    private String last;

    public AddStrings()
    {
        first = "";
        last = "";
    }

    public AddStrings(String one, String two)
    {
        first = one; // Assigns the first word to the instance variable first
        last = two;  // Assigns the second word to the instance variable last
    }

    public void setStrings(String one, String two)
    {
        first = one;
        last = two;
    }

    public String add()
    {
        return first + last; // Concatenates the first and last strings into a single word
    }

    public int findLength()
    {
        return add().length(); // Returns the total character length of the concatenated string
    }

    public String toString()
    {
        // be sure to call the add()and the findLength()methods to your string.
        return "Here is the “sum” of the words " + add() + ".\n" +
               "The length of the name “" + add() + "” is " + findLength() + ".";
    }

    public static void main(String args[])
    {
        // create an AddStrings object to test the names provided
        AddStrings name1 = new AddStrings("Maria", "Sanchez");
        System.out.println(name1.toString());
        System.out.println();

        AddStrings name2 = new AddStrings("Frida", "Kahlo");
        System.out.println(name2.toString());
        System.out.println();

        AddStrings name3 = new AddStrings("Salvador", "Dali");
        System.out.println(name3.toString());
        System.out.println();

        // Testing my name
        AddStrings name4 = new AddStrings("Alex", "Smith");
        System.out.println(name4.toString());
        System.out.println();

        // Testing a friend's name
        AddStrings name5 = new AddStrings("Taylor", "Swift");
        System.out.println(name5.toString());
        System.out.println();

        // what happens if you only call setStrings() and the toString()? Why?
        /* If you only call setStrings() and toString() without wrapping them in 
           System.out.println(), nothing will appear on the console because those 
           methods process data or return strings, but only print statements actually 
           output text to the screen. */
    }
}
/*
OUTPUT:
Here is the “sum” of the words MariaSanchez.
The length of the name “MariaSanchez” is 13.

Here is the “sum” of the words FridaKahlo.
The length of the name “FridaKahlo” is 11.

Here is the “sum” of the words SalvadorDali.
The length of the name “SalvadorDali” is 13.

Here is the “sum” of the words AlexSmith.
The length of the name “AlexSmith” is 9.

Here is the “sum” of the words TaylorSwift.
The length of the name “TaylorSwift” is 12.
*/
