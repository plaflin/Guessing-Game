import java.util.Scanner;

// Class where the user plays the game.
public class GuessingGame {
  
    // Main class for the Guessing Game
    public static void main(String[] args) {
      
      // Creating objects from our other classes so we can use their methods to play the game.
      Scanner scanner = new Scanner(System.in);
      Administrator admin = new Administrator();
      Prompter prompt = new Prompter();
      
      // Variables used to play the game.
      int guess = 0;
      String itemType = "";
      int numItems = 0;
      
      // This is where we ask the user for what we are putting into the jar.
      prompt.itemPrompt();
      itemType = scanner.nextLine();      
      
      // This is where we ask the user for the maximum number of items that can be in the jar.
      prompt.numPrompt(itemType);
      numItems = scanner.nextInt();
           
      // This is where we create the jar item with the type of item and the maximum number of them.
      Jar jar = new Jar(itemType, numItems);
           
      // This is where we ask the user for the guess.
      // The loop conditional statement checks for the win so the program can eventually end.
      do {
        prompt.guessPrompt(jar.getItemName(), jar.getMaxItemsAllowed());
        guess = scanner.nextInt();
      } while(!admin.hasWon(guess));  // End do-while loop
      
    }  // End Class Main
  
} // End Class GuessingGame /  End Program
