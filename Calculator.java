// Oscar Ortiz
// Week 5 Homework

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		
		char userOption;
		int sum = 0;
		int difference = 0;
		int product = 0;
		int quotient = 0;
		
		System.out.println("Welcome to Calculator 3000.");
		while(true)
		{
			System.out.print("What would you like to do?... ");
			userOption = input.next(".").charAt(0);
			if( userOption == 'q') break;
			
			else if(userOption == 'a')
			{
				System.out.print("Enter the first number: ");
				int number1 = input.nextInt();
				
				System.out.print("Enter the second number: ");
				int number2 = input.nextInt();
				
				sum = number1 + number2;
				
				System.out.println( "The sum is " + sum + ".");
				
			}
			else if(userOption == 's')
			{
				System.out.print("Enter the first number: ");
				int number1 = input.nextInt();
				
				System.out.print("Enter the second number: ");
				int number2 = input.nextInt();
				
				difference = number1 - number2;
				
				System.out.println( "The difference is " + difference + ".");
			}
			else if(userOption == 'm')
			{
				System.out.print("Enter the first number: ");
				int number1 = input.nextInt();
				
				System.out.print("Enter the second number: ");
				int number2 = input.nextInt();
				
				product = number1 * number2;
				
				System.out.println( "The product is " + product + ".");
			}
			else if(userOption == 'd')
			{
				System.out.print("Enter the first number: ");
				int number1 = input.nextInt();
				
				System.out.print("Enter the second number: ");
				int number2 = input.nextInt();
				
				quotient = number1 / number2;
				
				System.out.println( "The quotient is " + quotient + ".");
			}
			else
			{
				System.out.println("Press 'a' for addition "
						+ "\nPress 's' for subtraction"
						+ "\nPress 'm for multiplication"
						+ "\nPress 'd' for division"
						+ "\nPress 'q' to exit");
			}
		}
		
		System.out.println("Good bye!");
		System.exit(0);
	}

}
