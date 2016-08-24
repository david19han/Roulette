/**
 * Represents a red or black bet.
 * @authors Betsey McCarthy and David Han
 */
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class RedBlackBet extends TwoChoiceBet {

	/**
	 * Constructs a red black bet object. 
	 * @param description
	 * @param odds
	 */
	public RedBlackBet(String description, int odds) {
		super(description, odds);
		Set<String>redblack = new TreeSet<String>();
		redblack.add(Wheel.BLACK);
		redblack.add(Wheel.RED);
		consolefiller.put(0,redblack);
	}

    /** @Override
     * Checks whether the user won or lost the bet.
     * @param userNumber - the number the user placed a bet on
     * @param wheelNumber - the number the wheel lands on
     * @param wheelColor - the color the wheel lands on
     * @return
     */
	public boolean check(int userNumber, int wheelNumber,String wheelColor){
		return wheelColor.equals(userBet);
    }
}