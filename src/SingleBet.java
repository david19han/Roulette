/**
 * Represents a single number bet.
 * @authors Betsey McCarthy and David Han
 */
import java.util.HashMap;

public class SingleBet extends Bet {
	private HashMap<Integer,Integer> multipliers = new HashMap();
    /**
     * Creates new single bet object.
     * @param description the name of the bet
     * @param odds the payoff multiplier for the bet
     */
	public SingleBet(String description, int odds) {
		super(description, odds);
	}	    

	    /**
	     * @Override
	     * Prompts the user to enter an integer to guess the number
	     */
	    public void getUserInput(int num){
			guess = reader.promptRange("Enter a number between", WHEEL_MIN, WHEEL_MAX - 1);
	    }
	    
	    /** @Override
	     * Checks whether the user won or lost the bet.
	     * @param userNumber - the number the user placed a bet on
	     * @param wheelNumber - the number the wheel lands on
	     * @param wheelColor - the color the wheel lands on
	     * @return
	     */
	    public boolean check(int userNumber, int wheelNumber,String wheelColor){
	    return (userNumber == wheelNumber);
	    }
}
