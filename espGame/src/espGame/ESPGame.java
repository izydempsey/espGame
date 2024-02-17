/*
 * Class: CMSC203 CRN 31480
 * Instructor: Ashique Tanveer
 * Description: This is an Extrasensory Perception Game, 
 * where the program asks the user to guess what color the 
 * program is thinking. If the user is correct, they get a point. 
 * At the end the program tells the user how many points they got.
 * Due: 2/16/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Israel Dempsey
*/


package espGame;

import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args)
	{
		//Here we are declaring some variables and setting up to read input from the keyboard.
		Scanner stdin = new Scanner(System.in);
		Random randomColors = new Random();
		String name, description, dueDate, guessColor; 
		int tagColor = 5; 
		int computerColor;
		int wins = 0;
		
		//NOt sure about this YET bc i'm just copying whats in the template...
		final int COLOR_RED = 0,
				COLOR_GREEN = 1,
				COLOR_BLUE = 2,
				COLOR_ORANGE = 3,
				COLOR_YELLOW = 4,
				ROUNDS = 11;
		
		//This is the introduction
		System.out.print("Enter your name: ");
		name = stdin.nextLine();
		
		System.out.print("Describe yourself: ");
		description = stdin.nextLine();
		
		System.out.print("Due Date: ");
		dueDate = stdin.nextLine();
		
		System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
		

		//Here is the loop.
		
		for (int i = 0; i < 11; i++)
		{
			System.out.println("Round " + (i+1) + "\n");
			System.out.println("I am thinking of a color. \nIs it Red, Green, Blue, Orange, Or Yellow?\nEnter your guess: ");
			guessColor = stdin.nextLine();
			
			// Generate a random number
			computerColor = randomColors.nextInt(5);
			
			// Assign random number to a color
			switch(computerColor)
			{
			case COLOR_RED:
				System.out.println("I was thinking of Red.");
				break;
			case COLOR_GREEN:
				System.out.println("I was thinking of Green.");				
				break;
			case COLOR_BLUE:
				System.out.println("I was thinking of Blue.");
				break;
			case COLOR_ORANGE:
				System.out.println("I was thinking of Orange.");
				break;
			case COLOR_YELLOW:
				System.out.println("I was thinking of Yellow.");
				break;
			}
			
			// Assign user's color a number
			switch (guessColor)
			{
				case "Red":
				case "red":
					tagColor = 0;
					break;
				case "Green":
				case "green":
					tagColor = 1;
					break;
				case "Blue":
				case "blue":
					tagColor = 2;
					break;
				case "Orange":
				case "orange":
					tagColor = 3;
					break;
				case "Yellow":
				case "yellow":
					tagColor = 4;
					break;
				default:
					System.out.println("You didn't pick one of the offered colors.");
					break;
			}
		
			if (tagColor == computerColor)
			{
				wins++;
			}
		}
		
		System.out.println("\nGame Over\n\n");
		System.out.println("You guessed " + wins + " out of " + ROUNDS + " colors correctly.");
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
		
		stdin.close();
	}
}



	
	

