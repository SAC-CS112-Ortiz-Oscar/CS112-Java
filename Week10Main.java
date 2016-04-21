// Oscar Ortiz

import java.util.Scanner;

public class Week10Main {

	public static void main(String[] args) 
	{
		Week10RandomNumber newRandomNumber = new Week10RandomNumber();
		Scanner input = new Scanner( System.in );
		
		double high = 10;
		
		double randomNumber = newRandomNumber.getANumber(high);
		
		System.out.print("Please enter a number between 1 and 10: "); 
		double userNumber= input.nextDouble();
		
		if (userNumber == randomNumber)
			System.out.printf("Congrats, you guessed it. The correct number is %f.\n", randomNumber); 
		else if (userNumber > randomNumber) System.out.println("Your number is too large."); 
		else System.out.println("Your number is too small.");


	}

}
