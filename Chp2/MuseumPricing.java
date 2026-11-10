import java.util.Scanner;

class MuseumPricing{

	int age;
	boolean isMember;
	double price;

	public MuseumPricing(){
	int age;
	boolean isMember;
	}
	public MuseumPricing(int a){
	age = a;
	boolean isMember;
	}
	public MuseumPricing(int a, boolean mem){
	int age = a;
	boolean isMember = mem;

	}
	public double priceBasedOnAge(){
	if(age > 65) {
		price = 10.00;
	}
	else if (age <= 5) {
		price = 0.00;
	}
	else if (age >= 6 && age <= 12) {
		price = 8.00;
	}
	else if (age >= 13 && age <= 64) {
		price = 15.00;
	}

	if (isMember) {
		price = price * 0.8; // 20% discount
	}

	}
	public String toString(){

		return ("Visitor age: " + age + "Price: " + priceBasedOnAge());

	}
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
	}
}




