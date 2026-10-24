/* Aitor Suarez
   Chp 2
   Program 4 */
import java.util.Scanner;

public class Receipt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full high school name: ");
        String fullSchoolName = scanner.nextLine();

        int firstSpace = fullSchoolName.indexOf(" ");
        int secondSpace = fullSchoolName.indexOf(" ", firstSpace + 1);

        String initials = fullSchoolName.substring(0, 1) + 
                          fullSchoolName.substring(firstSpace + 1, firstSpace + 2) + 
                          fullSchoolName.substring(secondSpace + 1, secondSpace + 2);
        initials = initials.toUpperCase();

        double drinkCost = 1.50;
        double candyCost = 1.25;
        double hotDogCost = 2.75;
        double hamburgerCost = 3.50;

        System.out.print("Enter quantity of drinks: ");
        int drink_amt = scanner.nextInt();

        System.out.print("Enter quantity of candy: ");
        int candy_amt = scanner.nextInt();

        System.out.print("Enter quantity of hot dogs: ");
        int hotdog_amt = scanner.nextInt();

        System.out.print("Enter quantity of hamburgers: ");
        int hamburger_amt = scanner.nextInt();

        int order_num = (int)(Math.random() * 100) + 1;

        double drink_tot = drinkCost * drink_amt;
        double candy_tot = candyCost * candy_amt;
        double hotdog_tot = hotDogCost * hotdog_amt;
        double hamburger_tot = hamburgerCost * hamburger_amt;
      
        double ctTaxRate = 0.0635; 
        double subtotal = drink_tot + candy_tot + hotdog_tot + hamburger_tot;
        double tax = subtotal * ctTaxRate;
        double total = subtotal + tax;

        System.out.println("\n***************************************");
        System.out.println("*                                     *");
        System.out.println("*               Welcome               *");
        System.out.println("*     " + initials + " Snack Bar      *");
        System.out.println("*                                     *");
        System.out.println("*     Drink ..............$ " + drinkCost +  "       *");                      
        System.out.println("*     Candy ..............$ " + candyCost +  "      *");    
        System.out.println("*     Hot Dog ............$ " + hotDogCost + "      *");     
        System.out.println("*     Hamburger ..........$ " + hamburgerCost + "       *");       
        System.out.println("*                                     *");    
        System.out.println("***************************************");  
        System.out.println("*     Order Number: " + order_num + "                *");
        System.out.println("*                                     *");       
        System.out.println("*  QTY        ITEM         TOTAL      *");
        System.out.println("***************************************"); 
        System.out.println("\t" + drink_amt + "\tDrink\t" + drink_tot);   
        System.out.println("\t" + candy_amt + "\tCandy\t" + candy_tot); 
        System.out.println("\t" + hotdog_amt + "\tHot Dog\t" + hotdog_tot);
        System.out.println("\t" + hamburger_amt + "\tHamburger  " + hamburger_tot);
        System.out.println("**************************************");
        System.out.println("   Subtotal\t" + subtotal);
        System.out.println("   Tax\t\t" + tax);
        System.out.println("   Total\t" + total);

    }
}
