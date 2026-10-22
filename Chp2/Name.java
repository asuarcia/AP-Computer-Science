<<<<<<< HEAD
package Chp2;

public {
    
}
=======
// Aitor Suarez
// Chapter 02
// Honework 12

public class Name
{
    private String 


    public Name()
    {
        name = "";
    }


    public Name(String s)
    {
        name = s; 
    }

    // Setter method for name
    public void setName(String s)
    {
        name = s;
    }

  
    public String getFirst()
    {
        int spaceIndex = name.indexOf(" "); // Find the index where the first name ends
        return name.substring(0, spaceIndex);
    }


    public String getLast()
    {
        int spaceIndex = name.indexOf(" "); // Find the index where the first name ends
        return name.substring(spaceIndex + 1);
    }

ñ
    public String toString()
    {
        return "The first name is " + getFirst() + ".\n" +
               "The last name is " + getLast() + ".\n" +
               "The whole name together is " + name + ".";
    }

    public static void main(String args[])
    {
        // Sandy Painter
        Name n1 = new Name("Sandy Painter");
        System.out.println(n1.toString());
        System.out.println();

        // Benny Programmer
        Name n2 = new Name("Benny Programmer");
        System.out.println(n2.toString());
        System.out.println();

        // Sally Baker
        Name n3 = new Name("Sally Baker");
        System.out.println(n3.toString());
        System.out.println();

        // John Doe
        Name n4 = new Name("John Doe");
        System.out.println(n4.toString());
        System.out.println();

        // Sammy Lammy
        Name n5 = new Name("Sammy Lammy");
        System.out.println(n5.toString());
    }
}
/*
OUTPUT:
The first name is Sandy. The last name is Painter. The whole name together is Sandy Painter.

The first name is Benny. The last name is Programmer. The whole name together is Benny Programmer.

The first name is Sally. The last name is Baker. The whole name together is Sally Baker.

The first name is John. The last name is Doe. The whole name together is John Doe.

The first name is Sammy. The last name is Lammy. The whole name together is Sammy Lammy.
*/
>>>>>>> a301c25eccb82a1aa6ec4e3df675b289d95589aa
