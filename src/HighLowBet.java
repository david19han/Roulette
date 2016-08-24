/**
 * Represents a high or low bet.
 * @authors Betsey McCarthy and David Han
 */
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class HighLowBet extends TwoChoiceBet {
	 /**
	  * Constructs a high low bet object.
	  * @param description
	  * @param odds
	  */
	public HighLowBet(String description, int odds) {
		super(description, odds);
		Set<String>highlow = new TreeSet<String>();
		highlow.add("high");
		highlow.add("low");
		consolefiller.put(5,highlow);
		
	}

    /** @Override
     * Checks whether the user won or lost the bet.
     * @param userNumber - the number the user placed a bet on
     * @param wheelNumber - the number the wheel lands on
     * @param wheelColor - the color the wheel lands on
     * @return
     */
	    public boolean check(int userNumber, int wheelNumber,String wheelColor){	    	
	    	return (wheelNumber >= WHEEL_MAX / 2 && userBet.equals("high") ||
    		(wheelNumber < WHEEL_MAX / 2 && userBet.equals("low")));
	    }	    	
}