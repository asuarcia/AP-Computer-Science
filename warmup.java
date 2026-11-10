public class warmup{

public static boolean specialEleven(int n){

if(n % 11 == 0){
	return true;
}
if ((n-1) % 11 == 0){
	return true;
}
else{ 
	return false;
}

}
   


public static void main(String[] args) {
 
System.out.println(specialEleven(22));
System.out.println(specialEleven(23));
System.out.println(specialEleven(24));

}
}