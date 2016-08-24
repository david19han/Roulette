/**
 * Represents a players attempt to make a bet on the outcome of
 * the roulette wheel's spin.
 * 
 * @authors Betsey McCarthy, David Han, Robert and Shannon Duvall
 */
public abstract class Bet
{
	public final int WHEEL_MAX = 38;
	public final int WHEEL_MIN = 0;
    public String myDescription;
    public int myOdds;
    public int guess;
    public ConsoleReader reader;
    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds)
    {
        myDescription = description;
        myOdds = odds;
        reader = new ConsoleReader();
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription ()
    {
        return myDescription;
    }
    
    
  /**
   * Returns what the user placed a bet on.
   * @param num
   */
    public void getUserInput(int num){
    }
    
    /** Gets the user's bet number where applicable
     * 
     * @return guess - the user's bet
     */
  public int getGuess(){
	  return guess;
  }
  /**
   * Checks whether the user won or lost the bet.
   * @param userNumber - the number the user placed a bet on
   * @param wheelNumber - the number the wheel lands on
   * @param wheelColor - the color the wheel lands on
   * @return
   */
    public boolean check(int userNumber, int wheelNumber,String wheelColor){
    	return(guess == wheelNumber);
    }
}
