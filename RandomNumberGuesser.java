/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: A program that generates a random number 
 * and lets the user guess it but not more than 7 times.
 * Due: 02/22/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Hayat Khan
*/

import java.util.Scanner;

public class RandomNumberGuesser 
{
	public static void main(String[] args) 
	{
		// Declaring variables
		int userGuess = 0,lowGuess = 0, highGuess = 0;
		boolean bool = false;
		String choice = null;
		/*
		 * Creating an Scanner class object which is used to get the inputs
		 * entered by the user
		 */
		Scanner scan = new Scanner(System.in);
		

		   /* This while loop continues to execute 
		    * until the user enters either 'No' or 'no'
		    */
		while(true)
		{
			lowGuess = 1;
			highGuess = 100;
			int randomNumber = RNG.rand();
			System.out.println("This application generates a random integer between 0 and 100");
			System.out.println(" and asks the user to guess repeatedly  until they guess correctly.");
			System.out.println("\nEnter the first guess:");
			userGuess = scan.nextInt();
			
				if(userGuess == randomNumber)
				{
					System.out.println("Congratulations, you guessed correctly");
				}
				else
				{	
						while(true)
						{
							do
							{
								bool = RNG.inputValidation(userGuess,lowGuess,highGuess);
								if(bool)
								{
									break;
								}
								userGuess = scan.nextInt();
							}
							while(!bool);
							
							if(userGuess < randomNumber)
							{
								lowGuess = userGuess;// + 1;
								System.out.println("Your guess is too low");
							}
							else if(userGuess > randomNumber)
							{
								highGuess = userGuess;// - 1;
								System.out.println("Your guess is too high");
							}
							else if(RNG.getCount() == 7)
							{
								System.out.println("You have exceeded the maximum number of guesses, " + RNG.getCount()+ ". Try again");
								System.exit(0);
							}
							else
							{
								System.out.println("Congratulations, you guessed correctly");
								break;
							}
							System.out.println("Number of guesses is: " + RNG.getCount());
							System.out.println("Enter your next guess between " + lowGuess+ " and " + highGuess);
							userGuess = scan.nextInt();
						}
				
				
				}
			System.out.println("Try again? (yes or no)");
			scan.nextLine();
			choice = scan.nextLine();
			if(choice.equalsIgnoreCase("no"))
			{
				System.out.println("Thanks for playing...");
				break;
			}
			else
			{
				RNG.resetCount();
			}

		}
		
          System.out.println("Programmer name: Hayat Khan");
	}
   

}
