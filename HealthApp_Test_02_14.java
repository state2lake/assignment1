package Chapter2;
import java.util.Scanner;
public class HealthApp_Test_02_14 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your weight in pounds: ");
	double weight = input.nextDouble();
	System.out.println("Enter your height in inches: ");
	double height = input.nextDouble();
	
	double finalweight = (double)  (weight * 0.45359237);
	double finalheight = (double) (height * 0.0254)*(height*0.0254);
	
	double BMI = finalweight/finalheight;
	
	System.out.println(BMI);
	

	}

}
