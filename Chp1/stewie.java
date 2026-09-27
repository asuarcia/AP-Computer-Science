/* Aitor Suarez
   Chp 1
   Homework 6 */
public class stewie {
    public static void FwdSlash(){
        System.out.println("//////////////////////");
 }
        public static void BwdSlash(){
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
}
        public static void Victory(){
        System.out.println("|| Victory is mine! ||");
        }
    
	public static void main(String[] args){
        stewie test = new stewie();
    test.FwdSlash();
    test.Victory();
    test.BwdSlash();
    test.Victory();
    test.BwdSlash();
    test.Victory();
    test.BwdSlash();
    test.Victory();
    test.BwdSlash();
    test.Victory();
    test.BwdSlash();
	}

}

/* System output: 
//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\ */