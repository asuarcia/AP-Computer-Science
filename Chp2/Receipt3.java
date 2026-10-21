package Chp2;

/*  Aitor Suarez
    Program 3
    Chp 2
 */ 
public class Receipt3 {
   public static void main(String[] args) {
String highSchoolName = "Trevor Packer HS";
double drinkCost = 1.50;
double candyCost = 1.25;
double hotDogCost = 2.75;
double hamburgerCost = 3.50;

     
int order_num = (int)(Math.random() * 100) + 1; // 1 to 100 inclusive
int drink_amt = (int)(Math.random() * 2) + 1;   // 1 to 2 inclusive
int candy_amt = (int)(Math.random() * 3);       // 0 to 2 inclusive
int hotdog_amt = (int)(Math.random() * 3);      // 0 to 2 inclusive
int hamburger_amt = (int)(Math.random() * 3);   // 0 to 2 inclusive

double drink_tot = drinkCost * drink_amt;
double candy_tot = candyCost * candy_amt;
double hotdog_tot = hotDogCost * hotdog_amt;
double hamburger_tot = hamburgerCost * hamburger_amt;
      
double ctTaxRate = 0.0635; // CT sales tax (6.35%)
double subtotal = drink_tot + candy_tot + hotdog_tot + hamburger_tot;
double tax = subtotal * ctTaxRate;
double total = subtotal + tax;

      System.out.println("***************************************");
      System.out.println("*                                     *");
      System.out.println("*               Welcome               *");
      System.out.println("*     " + highSchoolName + " Snack Bar      *");
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

/* System output: 
***************************************
*                                     *
*               Welcome               *
*     Trevor Packer HS Snack Bar      *
*                                     *
*     Drink ..............$ 1.5       *
*     Candy ..............$ 1.25      *
*     Hot Dog ............$ 2.75      *
*     Hamburger ..........$ 3.5       *
*                                     *
***************************************
*     Order Number: 81                *
*                                     *
*  QTY        ITEM         TOTAL      *
***************************************
        1       Drink   1.5
        0       Candy   0.0
        2       Hot Dog 5.5
        1       Hamburger  3.5
**************************************
   Subtotal     10.5
   Tax          0.66675
   Total        11.16675 */