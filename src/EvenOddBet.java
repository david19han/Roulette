/**
 * Represents an even or odd bet.
 * @authors Betsey McCarthy and David Han
 */
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class EvenOddBet  extends TwoChoiceBet {

	 /**
	  * Creates a new even odd bet object.
	  * @param description
	  * @param odds
	  */
	public EvenOddBet(String description, int odds) {
		super(description, odds);
		Set<String>evenodd = new TreeSet<String>();
		evenodd.add("even");
		evenodd.add("odd");
		consolefiller.put(1,evenodd);
		
	}

    /** @Override
     * Checks whether the user won or lost the bet.
     * @param userNumber - the number the user placed a bet on
     * @param wheelNumber - the number the wheel lands on
     * @param wheelColor - the color the wheel lands on
     * @return
     */
	    public boolean check(int userNumber, int wheelNumber,String wheelColor){
	    	return ((wheelNumber % 2 == 0 && userBet.equals("even")) ||
            (wheelNumber % 2 == 1 && userBet.equals("odd")));	    
	    	}
}