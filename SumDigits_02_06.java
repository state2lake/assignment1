package Chapter2;
import java.util.Scanner;
public class SumDigits {


	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number between 0 and 1000: ");
	int number = input.nextInt();
	
	int tenth = number % 10;
	int twotenth = (number / 10) % 10;
	int oneHundredth =(number/100) % 10;
	int sum = tenth + twotenth + oneHundredth;
	System.out.println(sum);
	
	}
	
		
	
}
