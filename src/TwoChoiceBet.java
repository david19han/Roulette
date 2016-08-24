/**
 * Represents a single number bet.
 * @authors Betsey McCarthy and David Han
 */
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public abstract class TwoChoiceBet extends Bet{
	public HashMap<Integer,Set<String>> consolefiller = new HashMap();
	public String userBet;
	/**
	 * Creates a two choice bet object. 
	 * @param description
	 * @param odds
	 */
	public TwoChoiceBet(String description, int odds) {
		super(description, odds);
		
	}
	    /**
	     * @Override
	     * Prompts the user to enter an integer to guess the number
	     */
	    public void getUserInput(int betNum){
	    	userBet = reader.promptOneOf("Please bet ", consolefiller.get(betNum));
	    }
}
