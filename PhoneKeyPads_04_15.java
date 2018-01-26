package Chapter_04;
import java.util.Scanner;
public class PhoneKeyPads_04_15 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a letter:");
	String letter = input.nextLine();
	
	//casting string to char to put in if statement
	char l = letter.charAt(0);
	
	if(l == 'a' || l == 'b' || l =='c') {
		System.out.println("The corresponding number is 2");
	}
	if(l=='d' || l=='e'||l=='f') {
		System.out.println("The corresponding numbr is 3");
	}
	else if(l =='g' || l=='h'||l=='i') {
		System.out.println("The corresponding numbr is 4");
	}
	else if(l=='j' || l=='k'||l=='l') {
		System.out.println("The corresponding numbr is 5");
	}
	else if(l=='m' || l=='n'||l=='o') {
		System.out.println("The corresponding numbr is 6");
	}
	else if(l=='p' || l=='q'||l=='r') {
		System.out.println("The corresponding numbr is 7");
	}
	else if(l=='s' || l=='t'||l=='u') {
		System.out.println("The corresponding numbr is 8");
	}
	else  {
		System.out.println("The corresponding numbr is 9");
	}
	}
}
