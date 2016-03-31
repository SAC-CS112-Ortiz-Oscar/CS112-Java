// Oscar Ortiz

import java.util.Objects;

import javax.swing.JOptionPane;

public class DiceGame 
{

	public static void main(String[] args) 
	{
		int diceRoll    		= 0;
		int numberOfGamesPlayed = 0;
		int userWins 			= 0;
		int userEvenGuesses		= 0;
		int userOddGuesses		= 0;
		int evenNumbers 		= 0;
		int oddNumbers 			= 0;
		int percentageOfWins    = 0;
		int percentageOfEvenGuesses = 0;
		String message 			= " ";
		boolean isEven 			= false;
		boolean again			= true;
		
		while( again )
		{
			numberOfGamesPlayed++;
			
			while (diceRoll < 1 || diceRoll > 7)
			{
				diceRoll = 0 + (int)(Math.random() * 10);
			}
			if( diceRoll == 2 || diceRoll == 4 || diceRoll == 6)
			{
				evenNumbers++;
				isEven = true; // Checks if diceRoll is even. If it's not then it must be odd.
			}
			else 
			{
				oddNumbers++;
				isEven = false;
			}
			
			boolean userAnswerIsEven = false; // This will be used to compare the user's answer to the diceRoll.
			String userInput = JOptionPane.showInputDialog("A dice was rolled."
					+ " \nGuess if the number is even or odd."
					+ "\nEnter 'odd' or 'even'.");
			
			if ( Objects.equals(userInput,"even") )
			{
				userAnswerIsEven = true;
				userEvenGuesses++;
			}
			else if( Objects.equals(userInput,"odd"))
			{
				userAnswerIsEven = false;
				userOddGuesses++;
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Invalid answer.");
				break;
			}
			
			
			
			if( isEven == userAnswerIsEven) // Compares user's answer to diceRoll.
			{
				message = "You are correct!";
				userWins++;
			}
			else
				message = "You are wrong!";
			
			percentageOfWins = (userWins / numberOfGamesPlayed) * 100;
			percentageOfEvenGuesses = (userEvenGuesses / numberOfGamesPlayed) * 100;
			message = message + "\nNumber of games played: " + numberOfGamesPlayed + "."
					+ "\nPercentage of wins: " + percentageOfWins + "%."
					+ "\nPercentage of wins: " + percentageOfEvenGuesses + "%.";
					
			
			JOptionPane.showMessageDialog(null, message);
			
			int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to try again?");
			
			if( dialogResult == JOptionPane.YES_OPTION) again = true;
			else again = false;
		}
		
	}

}
