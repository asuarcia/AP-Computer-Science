/* Aitor Suarez
   Chp 1
   Homework 5 */
class Egg{
    public static void EggTop(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");}


    public static void EggBottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
}

    public static void Line(){
        System.out.println("-\"-'-\"-'-\"-");
}

	public static void main(String[] args){
	Egg test = new Egg();
    //  Egg 1
        test.EggTop();
        test.EggBottom();
        test.Line();
        System.out.println("");
    //  Egg 2
        test.EggTop();
        test.EggBottom();
        test.Line();
        System.out.println("");
    //  Egg 3
        test.EggTop();
        test.Line();
        test.EggBottom();
        
 }
}
/* System output:
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-

  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/ 

*/

