package Chapter3;
import java.util.Random;
public class RandomMonth_03_04 {

	public static void main(String[] args) {
	String [] month = new String[] {"January","February","March", "April", "May","June","July","August","September","October","November","December"};
	Random rnd = new Random();
	int monthInt = rnd.nextInt(12)+1;
	System.out.println(monthInt +  "\n");
	
	if (monthInt == 1) {
		System.out.println("January");
	}
	else if(monthInt == 2) {
		System.out.println("February");
	}
	else if(monthInt == 3) {
		System.out.println("March");
	}
	else if(monthInt == 4) {
		System.out.println("April");
	}
	else if (monthInt == 5) {
		System.out.println("May");
	}
	else if (monthInt == 6) {
		System.out.println("June");
	}
	else if (monthInt == 7) {
		System.out.println("July");
	}
	else if (monthInt == 8) {
		System.out.println("August");
	}
	else if (monthInt == 9) {
		System.out.println("September");
	}
	else if (monthInt == 10) {
		System.out.println("October");
	}
	else if (monthInt == 11) {
		System.out.println("November");
	}
	else {
		System.out.println("December");
	}
	}
}
