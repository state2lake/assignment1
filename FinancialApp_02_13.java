package Chapter2;
import java.util.Scanner;
public class FinancialApp {


	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What is the bill amount?");
	double bill = input.nextDouble();
	System.out.println("What percent gratuity?");
	double tip = input.nextDouble();
	
	double gratuity = bill * tip;
	double total = bill * tip + bill;
	System.out.println("your total is: $" + total + ", including a $" + gratuity + " tip") ;
	}

}
