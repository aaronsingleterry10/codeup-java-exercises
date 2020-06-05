import java.util.Scanner;

public class LoopsAndConditionalsBonuses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println(userInput);
//# Java Control Structures and Loops Bonuses
//
//### Simple Chat Bot
//
//Be creative in communicating with your
// user different options and for given scenerios. Create at least three phases of the chat, for example...
//
//			                 "How are you?" (AI says)
//			           |                              |
//			         good                        bad (user types)
//
//	   "Awesome! Are you super happy?" 	    "Will cake make you better?"
//
//	          yes          no                     yes             no
//
//Keep the chat options relatively simple and plan it out clearly before coding it.
		System.out.println("Wanna talk?");
		String response = sc.nextLine();
//		System.out.println(response.length());
		if (response.equalsIgnoreCase("no")) {
			System.out.println("Have a good day.");
		}
		while (response.equalsIgnoreCase("yes")) {
			System.out.println("How are you?");
			response = sc.nextLine();
			if (response.equalsIgnoreCase("good")) {
				System.out.println("Awesome! Are you super happy?");
				response = sc.nextLine();
				if (response.equalsIgnoreCase("yes")) {
					System.out.println("Well that's good to hear! Have a great day!");
					break;
				} else if (response.equalsIgnoreCase("no")) {
					System.out.println("Oh well lol");
					break;
				}
			} else if (response.equalsIgnoreCase("bad")) {
				System.out.println("Will cake make you better?");
				response = sc.nextLine();
				if (response.equalsIgnoreCase("yes")) {
					System.out.println("Good answer! Let's eat some cheesecake!");
					break;
				} else if (response.equalsIgnoreCase("no")) {
					System.out.println("What? Everyone loves cake..");
					break;
				}
			} else {
				System.out.println("Not a valid answer! Wanna try again?");
				response = sc.nextLine();
			}
		}
//
//### Hangman Game
//
//- prompt a player 1 to enter a word for player 2 to guess
//- track the number of guesses by player 2
//- display to the user the partially completed word
//- string methods from the lesson will be helpful for this bonus
		System.out.println("Time for some hangman!");
		System.out.println("Enter a word Player 1");
		String word = sc.nextLine();
		int guesses = 10;

	}
}