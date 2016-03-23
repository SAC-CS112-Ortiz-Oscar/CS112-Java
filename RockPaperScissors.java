// Oscar Ortiz

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		String rock = "rock";
		String paper = "paper";
		String scissors = "scissors";
		for( int count = 0; count < 3; count++)
		{
			String userAction = JOptionPane.showInputDialog("Choose paper, rock, or scissors:");
		
			if( new String(userAction).equals(rock))
			{
				JOptionPane.showMessageDialog(null, "You loose! \nComputer chose: paper.");
			}
		
			if( new String(userAction).equals(paper))
			{
				JOptionPane.showMessageDialog(null, "You loose! \nComputer chose: scissors.");
			}
		
			if( new String(userAction).equals(scissors))
			{
				JOptionPane.showMessageDialog(null, "You loose! \nComputer chose: rock.");
			}
		}
	
	}

}

// You ned to generate Computer choice using Random function, Oscar
