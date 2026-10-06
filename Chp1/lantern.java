/*  Aitor Suarez
    Chp2
    Homework 7 */

public class lantern {

    public void printFiveStars() {
        System.out.println("    *****");
    }

    public String getNineStars() {
        return "  *********";
    }

    public void printTopShape() {
        printFiveStars();                          
        System.out.println(getNineStars());          
        System.out.println("*************");
    }

    public void printLanternBody() {
        System.out.println("* | | | | | *");
    }

    public static void main(String[] args) {

        lantern myLantern = new lantern(); // Creates an object

        myLantern.printTopShape();
        System.out.println();

        myLantern.printTopShape();
        myLantern.printLanternBody();
        System.out.println("*************");

        myLantern.printTopShape();
        System.out.println();

        myLantern.printTopShape();
        myLantern.printFiveStars();
        myLantern.printLanternBody();
        myLantern.printLanternBody();
        myLantern.printFiveStars();
        myLantern.printFiveStars();
    }
}
 