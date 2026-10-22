import java.util.Scanner;

public class ScannerStuff {
    
    private String name;
    private int age;
    private double height;

public ScannerStuff(){
    name = "Aitor";
    age = 0;
    height = 0.0;
}
public ScannerStuff(String n){
    name = n;
    age = 0;
    height = 0.0;
}    
public ScannerStuff(String n, int a){
    name = n;
    age = a;
    height = 0.0;
}
public ScannerStuff(String n, int a, double h){
    name = n;
    age = a;
    height = a;
}

public String toString(){
    return "The name you gave me is: " + name  + " you are " + age + " years old, and you are " + height + " inches tall.";
}


public static void main(String[] args) {
    Scanner Rioman = new Scanner(System.in);
    System.out.println("What is yo name boy? ");
    String userName = Rioman.nextLine();
    ScannerStuff obj1 = new ScannerStuff(userName);

    System.out.println(obj1.toString());

}
 }
