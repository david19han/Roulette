/**
 * Represents the two and three consecutive number bets.
 * @authors Betsey McCarthy and David Han
 */
import java.util.HashMap;

public class ConsecutiveBet extends Bet {
	
	private int howManyNumbers;
	   
    /**
     * Creates new ConsecutiveBet object
     * @param description the name of the bet
     * @param odds the payoff multiplier for the bet
     */
	public ConsecutiveBet(String description, int odds) {
		super(description, odds);
	}	    
	    
	/**
	 * @Override
	 * Checks if the user wants to bet on two or three consecutive numbers and prompts the user for a number to bet on
	 */
	    public void getUserInput(int num){
	    	if(myDescription.equals("Two Consecutive Numbers")){
	    	howManyNumbers = 2;
	    	}
	    	else{
	    		howManyNumbers = 3;	    		
	    	}
			 guess = reader.promptRange("Enter a number between", WHEEL_MIN, WHEEL_MAX - howManyNumbers);
	    }
	    
	    /** @Override
	     * Checks whether the user won or lost the bet.
	     * @param userNumber - the number the user placed a bet on
	     * @param wheelNumber - the number the wheel lands on
	     * @param wheelColor - the color the wheel lands on
	     * @return
	     */
	    public boolean check(int userNumber, int wheelNumber,String wheelColor){
	    	return((userNumber <= wheelNumber) && 
                    (wheelNumber < (userNumber + howManyNumbers)));	
	          }
	    
}
