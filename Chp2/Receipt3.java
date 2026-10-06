package Chp2;

/*  Aitor Suarez
    Program 3
    Chp 2
 */ 
public class Receipt3{
   public static void main(String[] args){
      String highSchoolName = "Trevor Packer HS";
      double drinkCost = 1.50;
      double candyCost = 1.25;
      double hotDogCost = 2.75;
      double hamburgerCost = 3.50;

      int order_num = (int)(Math.random() * 100) + 1;
      int drink_amt = (int)(Math.random() * 3);
      int candy_amt = (int)(Math.random() * 3);
      int hotdog_amt = (int)(Math.random() * 3);
      int hamburger_amt = (int)(Math.random() * 3);

      double drink_tot = drinkCost * drink_amt;
      double candy_tot = candyCost * candy_amt;
      double hotdog_tot = hotDogCost * hotdog_amt;
      double hamburger_tot = hamburgerCost * hamburger_amt;
     
      double total = drink_tot + candy_tot + hotdog_tot + hamburger_tot;
      double tax = total * 0.06;
      


    System.out.println("***************************************");
    System.out.println("*                                     *");
    System.out.println("*              Welcome                *");
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
    System.out.println("\t" + drink_amt + "\tDrink\t" + drinkCost);   
    System.out.println("\t" + candy_amt + "\tDrink\t" + candyCost); 
    System.out.println("\t" + hotdog_amt + "\tDrink\t" + hotDogCost);
    System.out.println("\t" + hamburger_amt + "\tDrink\t" + hamburgerCost);
    System.out.println("**************************************");
    System.out.println("   Subtotal\t" + total);
    System.out.println("   Tax\t\t"+ tax);
    System.out.println("   Total\t" + (total + tax));

      }
}

