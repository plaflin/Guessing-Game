// Class that does all of the I/O for the game
public class Prompter{
  
  // A method that asks the user for the item to be put in the jar.
  public void itemPrompt(){
    System.out.print("What type of item?  ");
  }  // End itemPrompt
  
  // A method to ask the maximum amount of items that could be in the jar.
  public void numPrompt(String itemType){
    System.out.printf("What is the maximum amount of %s  ", itemType);
  }  // End numPrompt
  
  // A method to ask the user for a guess.
  public void guessPrompt(String itemType, int numItems){
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d  ", itemType, numItems);
  }  // End guessPrompt
  
  // A method to let the user know that they won and in how many tries.
  public void winMessage(int numGuesses){
    System.out.printf("You got it in %d attempts\n", numGuesses);
  }  // End winMessage
  
  // A method to let the user know that their guess was higher than the maximum items in the jar.
  public void wayTooHigh(int numItems){
    System.out.printf("Your guess must be lower than %d\n", numItems);
  }  // End wayTooHigh
  
  // A method to let the user know that their guess was lower than the answer.
  public void tooLowMessage(){
    System.out.println("Your guess is too low");
  }  // End tooLowMessage
  
  // A method to let the user know that their guess was higher than the answer.
  public void tooHighMessage(){
    System.out.println("Your guess is too high");
  }  // End tooHighMessage
  
} // End Class Prompter