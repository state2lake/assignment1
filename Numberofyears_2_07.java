package Chapter2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Numberofyears_2_07 {

	public static void main(String[] args) {
	int minutesper = 24 * 60;
		
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of minutes: ");
	int minutes = input.nextInt();
	
	
	
	double sum = (minutes/minutesper)/365;
	DecimalFormat format = new DecimalFormat("0.00");
	System.out.println(minutes + " minutes is approximately " +format.format(sum)+ " years and");
		
	

	}

}
