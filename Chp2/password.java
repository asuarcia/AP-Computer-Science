public class password {
    
public String passwordChecker(String password){
	
password = "AitorS28100026!";
int pass_length = length(password);


if (pass_length < 8) {
	System.out.println("Your password is too short! (You must have at least 8 characters");
}

if (pass_length >= 8) {
	if ((password.indexOf(!) || password.indexOf($) || password.indexOf(&)) < 0) //This is b/c if none is found it returns -1
System.out.println("Your password must contain at least one special character (“!”, “$”, “&”");
}
	if ((password.indexOf(!) || password.indexOf($) || password.indexOf(&)) >= 0) {
	System.out.println("Your password is valid");
}
}

}

public String alarmClock(int day, boolean vacation){
//your code goes here

if(day > 0 && day < 6 && vacation) {
	return("10:00");
}
if(day > 0 && day < 6 && ! vacation) {
	return("7:00");
}
if(day == 0 || day == 6 && vacation) {
	return("OFF");
}
if(day == 0 || day == 6 && ! vacation) {
	return("10:00");
}
}

