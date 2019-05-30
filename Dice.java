package Pkg;

import java.util.Random;
import java.util.Scanner;

public class Dice {
///sets wins and losses to 0
	static int wins= 0;
	static int loss= 0;
	public static void main(String[] args) {
		
		
System.out.println("Welcome!");
	Menu();
	}
	// menu that has the options to play, check score board and exit
	public static void Menu() {
		Scanner myObj = new Scanner(System.in);  
		System.out.println("Press 1 to Play, 2 for score board, 3 to Exit");

		String Menu = myObj.nextLine(); 
		System.out.println(" You chose " + Menu); 
    //created if else statements to allow the user to choose whether to play, check score board or exit the game
    //
		if (Menu.equals("1")){
			System.out.println ("Let's Play!");
			System.out.println ( "Rolling 7 or 11 on the first try is a WIN " +
				"Rolling 2, 3 or 12 on the first try is a LOSE!");
			System.out.print("first roll: ");
			System.out.println ("You " + Logic(roll()));
			Menu();
	
		}
		else if (Menu.equals("2")) {
			System.out.println ("Your score board is " + "wins = " + wins + " " + "losses = " + loss);
			Menu();
		}	
		else if (Menu.contentEquals("3")) {
			System.out.println ("Exiting");
    	
		}
		else {
			System.out.println ("Not sure what happened!");
			Menu();
		}
    
	}
// roll function is going to make 2 random numbers between 1 and 6 and add them together then returns the sum
	
	public static int roll() {
		Random rndm = new Random();
		int randomHand = rndm.nextInt(6) + (1);
		int randomHand2= rndm.nextInt(6) + (1);
		int sum= randomHand + randomHand2;
		System.out.println ("You rolled a "+ sum);
		return sum;
	

	}
//logic function is going to take sum of random numbers do some logic and return win or loss 

	public static String Logic(int roll) {
		Scanner myObj = new Scanner(System.in);  
	
		if (roll == 7 || roll == 11 ) {
			wins++;
			//adds 1 for each roll to keep the score
			return "Win";
		} else if(roll == 2 || roll == 3 || roll == 12){
			loss++;
			// adds 1 for each loss to keep score
			return "Lose";
		
		}
		else {
			System.out.println ("Choose to reroll, if you roll 7 you lose!");
//			System.out.println ("Hit enter to reroll!");
//			String enter = myObj.nextLine();
			int point = roll;
			int reroll = 0;
			while (reroll != point && reroll != 7) {
			
				System.out.println ("Hit enter to reroll!");
				
				String enter2 = myObj.nextLine();
				reroll = roll();
			}
			if ( reroll == 7) {
				loss++;
				return "Lose";
			} else {
				wins++;
				return "Win";
			}

		}
	// point = roll
	//reroll is set to 0
	//while reroll is not equal to point and reroll is not equal to 7 continue to roll by calling the roll function
	//if reroll is equal to 7 return lose else you win
	}
}