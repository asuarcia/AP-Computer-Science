package Chp2;

public class Car {
    private String color;
    private int year;
    private String make;
    private String model;

// Constructors
    public Car(String mk, String mdl, int y) {
        make = mk;
        model = mdl;
        year = y;
    }

    public Car(int y, String c, String m) {
    
        year = y;
        color = c;
        make = m;
    }

// Methods
    public void Print() {

        String Sentence = "The make is a " + make + ", the model is " + model + ", the year is " + year + ".";
        System.out.println(Sentence);

    }

    public void Abbrev() {
        String makeAbbrev = make.substring(0, 2);
        String modelAbbrev = model.substring(0,2);
        System.out.println("Make: " + makeAbbrev + " Model: " + modelAbbrev);
    }


	public static void main (String []args) {
        Car MomCar = new Car("Honda", "Odyssey", 2023);
        Car GrampyCar = new Car(1974, "Red", "Dodge");
        Car TeenCar = new Car("Ford", "Ranger", 2001);

        MomCar.Print();
        GrampyCar.Print();
        TeenCar.Print();

        MomCar.Abbrev();
       


}
}