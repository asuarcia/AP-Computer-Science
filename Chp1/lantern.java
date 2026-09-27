class Lantern{

  public void Small(){
    System.out.println("*****");
  }

    public void Medium(){
    System.out.println("*********");
  }

    public void Large(){
    System.out.println("*************");
  }

    public void Middle(){
    System.out.println("");
  }

  public static void Pyrmaid(){
    System.out.println(Small());
    System.out.println(Medium());
    System.out.println(Large());
  }

 



	public static void main(String[] args){
    lantern test = new lantern();
    test.Pyramid();
  }

}










/*Task: Write a complete Java program in a class named Lanter that generates the following output.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****



Conditions:
Create a new class named Lantern
Your name, the chapter, and program number should be commented into the first three lines.
You must write AT LEAST three methods 
One must be void (please don’t attach the static to it)
One must be return
Be sure you work smarter, not harder by calling at least one other method within another method.
I have given you the start to a main. Please use it.
When your work has been graded it will be returned to you via GClassroom please look for comments. Any comments indicating you could make corrections please resubmit your work if you choose to make the corrections.
*/