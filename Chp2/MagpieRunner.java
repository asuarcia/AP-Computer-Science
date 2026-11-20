/*
  Aitor Suarez
  Chp 02
  Program 5
  
 * MagpieRunner.java
 * A program to carry on conversations with a human user.
 * Create a Magpie, give it user input, and print its replies.
 */

import java.util.Scanner;      // class necessary to read input from the keyboard
public class MagpieRunner
{   
   public static void main(String[] args)
   {
      Magpie maggie = new Magpie();  // creates a Magpie object named maggie		
      String greeting = maggie.getGreeting();  // calls the getGreeting method 
                                               //     on the maggie object
      System.out.println(greeting);

      Scanner in = new Scanner (System.in);   // creates a Scanner object
                                              //   to read from the keyboard
      
      String statement = in.nextLine();       // reads a line of text 
                                              //   from the keyboard
		
      while (!statement.equals("Bye"))       // loop stopping condition
      {                  // calls the getResponse method on the maggie object
         String response = maggie.getResponse(statement);                    
         System.out.println(response);         
         statement = in.nextLine();          // reads in the users response
      }
      in.close();                            // closes the input file
   }
	/*Comment here: what happens when you run the code like it is given? (prompt/converse with at least 5 different inputs)
	When running the code as originally given, no matter what input is typed (e.g., "Hi", "How are you?", "What is the weather?", "Tell me a joke", "Java is fun"), the program replies with "Interesting." every single time because whichResponse is hardcoded to 0. It continues replying "Interesting." until "Bye" is typed, which terminates the program.
	*/
}
