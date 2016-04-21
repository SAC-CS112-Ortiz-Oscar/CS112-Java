
public class Week10RandomNumber 
{
	private double number = 0;
	
	private double generateRandomNumber(double lowerBound, double upperBound)
	{
		return lowerBound + (double)(Math.random() * upperBound);
	}
	
	public double getANumber()
	{
		number = generateRandomNumber(0, 10);
		return number;
	}
	
	public double getANumber(double upperBound)
	{
		number = generateRandomNumber(0, upperBound);
		return number;
	}
	
	public double getANumber(double lowerBound, double upperBound)
	{
		number = generateRandomNumber(lowerBound, upperBound);
		return number;
	}
}
