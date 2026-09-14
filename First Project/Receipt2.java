 // Aitor Suarez
 // Period 3


public class Receipt2{
   public static void main(String [] args){


	String ans1 = "String"; // choose: int; double; boolean;  String;
	System.out.println("The variable for high school name should be of type " + ans1 + " because it will contain letters.");
	
	String ans2 = "double"; // choose: int; double; boolean;  String;
	System.out.println("The variables for the cost of a drink, candy, hotdog, and hamburger should be of type " + ans2 + " because each of them will contain a real number value.");

    String schoolname = "Newtown High School"; // variable for high school name
    double drink = 1.50; // variable for drink cost
    double candy = 1.25; // variable for candy cost
    double hotdog = 2.75; // variable for hotdog cost
    double hamburger = 3.50; // variable for hamburger cost


//here is the receipt


      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*    " + schoolname + " Snack Bar   *");
      System.out.println("*                                    *");
      System.out.println("*     Drink .........." + drink + "            *");                      
      System.out.println("*     Candy .........." + candy + "           *");     
      System.out.println("*     Hot Dog ........" + hotdog + "           *");    
      System.out.println("*     Hamburger ......" + hamburger + "            *");
      System.out.println("*                                    *");    
      System.out.println("**************************************");
   }
}
