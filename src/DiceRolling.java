import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {

		// extended challenge: break the code up into more methods

		System.out.println("Welcome to the Grand Circus Casino!\n");

		Scanner scan = new Scanner(System.in);
		String cont = "y";
		int userInput;
		int results1;
		int results2;

		System.out.println("The game of the day is Dice Rolling, where you will be rolling two dice.");
		
		do { // loop
		System.out.println("How many sides would you like your dice to have?"); // prompt user to roll the dice

			userInput = scan.nextInt(); // user input number of sides for a pair of dice

			System.out.println("Alright! Let's roll your " + userInput + " sided dice!\n");

			System.out.println("Results: "); // roll 2 n-sided dice
			results1 = (generateRandomDieRoll(userInput));
			results2 = (generateRandomDieRoll(userInput));
			System.out.println(results1);
			System.out.println(results2);

			// extended challenge: display special messages for snake eyes and box
			if ((results1 == 1) && (results2 == 1)) {
				System.out.println("Oh yeah! You rolled Snake Eyes!");
			}
			// extended challenge: display special messages for box car
			if ((results1 == 6) && (results2 == 6)) {
				System.out.println("Whoop whoop, you rolled a Box Car");
			}

			System.out.println("Would you like to play again? (y/n)"); // ask user if they want to roll the dice again
			cont = scan.next();
			
//			if (!((cont.equalsIgnoreCase("y")) || (cont.equalsIgnoreCase("yes")))
//					|| !((cont.equalsIgnoreCase("n")) || (cont.equalsIgnoreCase("no")))) {
//				System.out.println("Please say y/n if you want to keep playing or not.");
//				cont = scan.next();
//			}

		} while ((cont.equalsIgnoreCase("y")) || (cont.equalsIgnoreCase("yes"))); // loop

		System.out.println("Thanks for playing, come back anytime!");
		scan.close();

	}

	// parameter specifies number of sides on a die and returns a random number bet
	// 1 and that number
	public static int generateRandomDieRoll(int diceSides) {// static method generateRandomDieRoll
		Random rand = new Random(); // start with random() method of the Math class and Java's Random Class
		int x = rand.nextInt(diceSides);
		return x + 1;
	}

}
