/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Helping user with wifi diagnosis and then finding a solution for connectivity 
 * Due: 01/06/2023
 * Platform/compiler: Mac OS using eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Hayat Khan
*/


import java.util.Scanner;
/**
 * 
 * @author hayatullahkhan
 * @version 01/06/2023
 */
public class WifiDiagnosis 
{
	//main method
	public static void main (String []args) 
	{
		final String s1 = "yes";
		final String s2 = "no";
		final String s3 = "Done.";
		final String s4 = "Did that fix the problem? (Yes or No)";
		final String invalid = "Invalid answer; try again";
		
		Scanner input = new Scanner(System.in); //creating a scanner class
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work. \n");
		System.out.println("Reboot the computer and try to connect \n" + s4);
		String answer = input.next(); //taking in user's answer
		//control sequence and printing the correct reply to the user's answer
		//step 1
		if (answer.equalsIgnoreCase(s1)) 
		{
			System.out.println(s3);
		}
		//step 2
		else if (answer.equalsIgnoreCase(s2))
			//if answer is no
		{
			System.out.println("Reboot your router\n" + s4);
					
			 answer = input.next();
			 if (answer.equalsIgnoreCase(s1)) 
				{
					System.out.println(s3);
				}
			//step 3
				else if (answer.equalsIgnoreCase(s2)) 
					//if answer is no
				{
					System.out.println("Make sure the cables connecting the router are firmly \n"
							+ "plugged in and power is getting to the router \n"
							+ s4);
							
					 answer = input.next();
					 if (answer.equalsIgnoreCase(s1)) 
						{
							System.out.println(s3);
						}
					//step 4
						else if (answer.equalsIgnoreCase(s2))
							//if answer is no
						{
							System.out.println("Move your computer closer to your router\n"
									+ s4);
									
							 answer = input.next();
							 if (answer.equalsIgnoreCase(s1)) 
								{
									System.out.println(s3);
								}
							//step 5
								else if (answer.equalsIgnoreCase(s2))
									//if answer is no
								{
									System.out.println("Contact your ISP\n"
											+ "Make sure your ISP is hooked up to your router.\n"
											+ s3);										
						}
								else
									System.out.println(invalid);
				}
						else
							System.out.println(invalid);
		}
				else
					System.out.println(invalid);

	}
		else 
			System.out.println(invalid);
		
		System.out.println("\nProgrammer name: Hayat Khan");
		System.exit(0);
}
}
