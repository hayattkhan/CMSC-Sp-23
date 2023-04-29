import java.io.File;
import java.util.Scanner;
import java.io.*;

public class TwoDimRaggedArrayUtility {

	
	public static final int MAX_SIZE = 10;
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	public static double getAverage(double[][] data)
	{
		double addedAmount = 0;
		int total = 0;
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            addedAmount += data[i][j];
	            total++;
	        } 
	    }
		return (double)addedAmount/total;
	}
	
	public static double getColumnTotal(double[][] data, int col)
	{
		double columnTotal = 0;
		for (int i = 0; i < data.length; i++)
		{
			columnTotal += data[i][col];
		}
		return columnTotal;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highestAmount = 0;
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            if(data[i][j] > highestAmount)
	            {
	            	highestAmount = data[i][j];
	            }
	        } 
	    }
		return highestAmount;
	}
	
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highestAmount = 0;
		for (int i = 0; i < data.length; i++)
		{
			if(data[i][col] > highestAmount)
			{
				highestAmount = data[i][col];
			}
		}
		return highestAmount;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		double highestIndex = 0;
		int current = 0;
		for (int i = 0; i < data.length; i++)
		{
			
			{
			if(data[i][col] > highestIndex)
				highestIndex = data[i][col];
			current = i;
			}
		}
		return current;
	}
	
	public static double getHighestInRow(double[][] data, int row)
	{
		double highestAmount = 0;
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highestAmount)
			{
				highestAmount = data[row][i];
			}
		}
		return highestAmount;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		double highestIndex = 0;
		int current = 0;
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] > highestIndex)
			{
				highestIndex = data[row][i];
			}
				current = i;
		}
		return current;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowestAmount = data[0][0];
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            if(data[i][j] < lowestAmount)
	            {
	            	lowestAmount = data[i][j];
	            }
	        } 
	    }
		return lowestAmount;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowestIndex = data[0][col];
		for (int i = 0; i < data.length; i++)
		{
			if(data[i][col] < lowestIndex)
			{
				lowestIndex = data[i][col];
			}
		}
		return lowestIndex;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int current = 0;
		double lowestIndex = data[0][col];
		for (int i = 0; i < data.length; i++)
		{
			if(data[i][col] < lowestIndex)
			{
				lowestIndex = data[i][col];
				current = i;
			}
		}
		return current;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowestAmount = data[row][0];
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowestAmount)
			{
				lowestAmount = data[row][i];
			}
		}
		return lowestAmount;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int current = 0;
		double lowestIndex = data[row][0];
		for (int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowestIndex)
			{
				lowestIndex = data[row][i];
				current = i;
			}
		}
		return current;
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double addedAmount = 0;
		for(int i = 0; i < data[row].length;i++)
		{
			addedAmount += data[row][i];
		}
		return addedAmount;
	}
	
	public static double getTotal(double[][] data)
	{
		double addedAmount = 0;
		
		for (int i = 0; i < data.length; i++) 
		{
	        for (int j = 0; j < data[i].length; j++) 
	        {
	            addedAmount += data[i][j];
	            
	        } 
	    }
		return addedAmount;
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		String inputFile = file.getName();
		String str;
		
		Scanner HP = new Scanner(new BufferedReader(new FileReader(inputFile)));
		
		double[][] data = new double[MAX_SIZE][MAX_SIZE];
		
		for (int i = 0; i < MAX_SIZE; i++)
		{
			for (int j = 0; j < MAX_SIZE; j++)
			{
				data[i][j] = 0;
			}
		}
		
		for(int i = 0; i < MAX_SIZE; i++)
		{
			str = HP.nextLine();
			if(str == null)
				break;
			String breaks[] = str.split(" ");
			int index = 0;
			for(int j=0;j < breaks.length;j++)
			{
				if(index<MAX_SIZE)
				{
					if(breaks[j].length()>0)
					{
						data[i][j] = Double.parseDouble(breaks[j]);
					}
					else break;
				}
			}
		}
		return(data);
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter printOutput = new PrintWriter(outputFile);
		String dataString;
		for (int i = 0; i < data.length;i++)
		{
			dataString = "";
			for (int j = 0; j < data[i].length;j++)
			{
				dataString += data[i][j] + " ";
			}
			dataString += "\n";
			printOutput.write(dataString);
		}
		printOutput.close();
	}
}