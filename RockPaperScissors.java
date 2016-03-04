// Oscar Ortiz
// Week 4 Homework

import java.util.Scanner;

public class RockPaperScissors {
	public static void main( String[] arg)
	{
		Scanner input = new Scanner( System.in );
		
		char userAction;
		
		System.out.println("Welcome!\n");
		System.out.println("Use the following commands:");
		System.out.println("Papper = \"p\"");
		System.out.println("Rock = \"r\"");
		System.out.println("Scissors = \"s\"\n");
		
		System.out.print("Choose paper, rocks, or scissors: ");
		userAction = input.next(".").charAt(0);
		
		if( userAction == 'r')
		{
			System.out.println("You lose!");
			System.out.println("Computer chose: Paper");
		}
		
		if( userAction == 'p')
		{
			System.out.println("You lose!");
			System.out.println("Computer chose: Scissors");
		}
		
		if( userAction == 's')
		{
			System.out.println("You lose!");
			System.out.println("Computer chose: Rock");
		}
		
		
		
	}

}
