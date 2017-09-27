// Class that administers the game for the user
public class Administrator {
  
  // Creating an object of Prompter so we can use their methods to do I/O.
  Prompter prompt = new Prompter();  
  
  // Creating an object of jar to get the values to run the game
  Jar jar = new Jar();
  
  // Creating a variable to hold the number of guesses.
  private int numGuesses = 1;     
 
  
  public boolean hasWon(int guess){
    if(guess == jar.getSomeNumber()){      
      prompt.winMessage(numGuesses);
      return true;
    }
    else if (guess > jar.getMaxItemsAllowed()) {
      prompt.wayTooHigh(jar.getMaxItemsAllowed());
      return false;
    }
    else if(guess < jar.getSomeNumber()) {
      prompt.tooLowMessage();
      numGuesses++;
      return false;
    }
    else {
      prompt.tooHighMessage();
      numGuesses++;
      return false;
    }
  }
}