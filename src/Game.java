import java.util.*;

/**
 * Plays a game of roulette.
 * @authors Betsey McCarthy, David Han, Robert and Shannon Duvall
 */
public class Game {
	// name of the game
	private static final String DEFAULT_NAME = "Roulette";

	private Wheel myWheel;
	private int WHEEL_MAX = 37;
	private Bet[] myPossibleBets = { new RedBlackBet("Red or Black", 1), new EvenOddBet("Odd or Even", 1),
			new ConsecutiveBet("Three in a Row", 11), new SingleBet("Single Number", 35),
			new ConsecutiveBet("Two Consecutive Numbers", 17), new HighLowBet("High/Low", 1) };

	/**
	 * Construct the game.
	 */
	public Game() {
		myWheel = new Wheel();
	}

	/**
	 * @return name of the game
	 */
	public String getName() {
		return DEFAULT_NAME;
	}

	/**
	 * Asks the user for their name and their initial amount of money
	 */
	public Gambler getGambler() {
		String playerName = ConsoleReader.promptForLine("What is your name?");
		int initialAmount = ConsoleReader.promptForInt("How much money are you starting with?");
		Gambler player = new Gambler(playerName, initialAmount);
		return player;
	}

	/**
	 * Play a round of this game.
	 *
	 * For Roulette, this means prompting the player to make a bet, spinning the
	 * roulette wheel, and then verifying that the bet is won or lost.
	 *
	 * @param player
	 *            one that wants to play a round of the game
	 */
	public void play() {
		Gambler player = getGambler();
		System.out.println("Hello " + player.myName + ", let's play " + getName());
		System.out.println();
		do {
			int amount = ConsoleReader.promptRange("How much do you want to bet", 0, player.myMoney);
			int whichBet = promptForBet();
			Bet chosenBet = myPossibleBets[whichBet];
			chosenBet.getUserInput(whichBet);
			int bet = chosenBet.getGuess();
			System.out.print("Spinning ...");
			myWheel.spin();
			if(myWheel.getNumber() == WHEEL_MAX){
				System.out.println("Dropped into green 00");
			}
			else{
			System.out.println("Dropped into " + myWheel.getColor() + " " + myWheel.getNumber());
			}
			if (chosenBet.check(bet, myWheel.getNumber(), myWheel.getColor())) {
				System.out.println("*** Congratulations :) You win ***");
				amount *= myPossibleBets[whichBet].myOdds;
			} else {
				System.out.println("*** Sorry :( You lose ***");
				amount *= -1;
			}
			player.updateBankroll(amount);
		} while (player.isSolvent());
		System.out.println();
		System.out.println("Goodbye " + player.myName + ", thanks for playing!");
	}

	/**
	 * Prompt the user to make a bet from a menu of choices.
	 */
	private int promptForBet() {
		System.out.println("You can make one of the following types of bets:");
		for (int k = 0; k < myPossibleBets.length; k++) {
			System.out.println((k + 1) + ") " + myPossibleBets[k].getDescription());
		}

		return ConsoleReader.promptRange("Please make a choice", 1, myPossibleBets.length) - 1;
	}

}
