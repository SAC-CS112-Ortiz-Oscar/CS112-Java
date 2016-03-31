// Oscar Ortiz

import javax.swing.JOptionPane;

public void printArray
{
for( int index = 0; index < arraySize; index++)
{
	switch(index)
	{
	case  0: delimiter = " "; break;
	case  1: delimiter = " "; break;
	case  2: delimiter = "\n"; break;
	case  3: delimiter = " "; break;
	case  4: delimiter = " "; break;
	case  5: delimiter = "\n"; break;
	case  6: delimiter = " "; break;
	case  7: delimiter = " "; break;
	case  8: delimiter = ""; break;
	}
	System.out.print(board[index]+ delimiter);
	running = false;
}
}

public class TicTacToe 
{

	public static void main(String[] args) 
	{
		int arraySize = 9;
		String delimiter = " ";
		boolean running = true;
		
		
		String[] board = 
			{"_", "_", "_",
			 "_", "_", "_",
			 "_", "_", "_"};
		
	}
}
