/*
 * Class: CMSC203
 * Instructor:Khandan Monshi
 * Due: 28/04/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Hayatulllah Khan
*/


public class HolidayBonus extends TwoDimRaggedArrayUtility{

	public static final double LOW_BONUS = 1000, HIGH_BONUS = 5000, MIDDLE_BONUS = 2000;
	public HolidayBonus()
	{
	
	}
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		
		double[] totalAmount = new double[data.length];
		double[] bonusAmount = new double[data.length];
		for (int i = 0; i < data.length; i++)
		{
			totalAmount[i] = getRowTotal(data, i);
		}
		int lowest = 0, highest = 0;
		double lowestTotalAmount = totalAmount[0], highestTotalAmount = totalAmount[0];
		for(int i = 0; i < totalAmount.length;i++)
		{
			if(totalAmount[i] < lowestTotalAmount)
			{
				lowest = i;
				lowestTotalAmount = totalAmount[i];
			}
			if(totalAmount[i] > highestTotalAmount)
			{
				highest = i;
				highestTotalAmount = totalAmount[i];
			}
		}
		
		for (int i = 0; i < data.length; i++)
		{
			if(i == lowest)
			{
				bonusAmount[i]= LOW_BONUS * data[i].length ;
				
			}
			else if(i == highest)
			{
				bonusAmount[i] = HIGH_BONUS * data[i].length ;
			}	
			else 
			{
				bonusAmount[i] = MIDDLE_BONUS * data[i].length ;
			}
			
				
		}
		return(bonusAmount);
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double[] bonusAmount = calculateHolidayBonus(data);
		double calculatedTotal = 0;
		for(int i = 0; i < bonusAmount.length;i++)
		{
			calculatedTotal += bonusAmount[i];
		}
		return calculatedTotal;
	}
}