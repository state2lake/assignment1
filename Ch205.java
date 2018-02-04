package cis3270assignment1;

import java.util.Scanner;

public class Ch205 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//let user enter Subtotal and gratuity
		System.out.println ("Enter subtotal and gratuity rate");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		//calculate gratuity and total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuityRate;
		
		//display results 
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
		
	}

}
