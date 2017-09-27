import java.util.Random;

// Class that holds the items for the game.
public class Jar {
  
  // Create an object of the Random class to create a random number of items in the jar for the game.
  private Random random = new Random();
  
  // Create private variables to be used by the class only.
  private static String itemName = "";
  private static int maxItemsAllowed = 0;
  private static int someNumber = 0;
  
  // Creating a default constructor to allow the Administrator class to be able to grab the static variable values from the class.
  public Jar() {}
  
  // Constructor with parameters to set the values for itemName and maxItemsAllowed.
  // Constructor calls private method fill to create a random amount of items in the jar.
  public Jar(String itemName, int maxItemsAllowed){
    this.itemName = itemName;
    this.maxItemsAllowed = maxItemsAllowed;
    fill();
  }  // End Jar
  
  // Private function to fill the jar with a random amount of items.
  private void fill(){
    someNumber = random.nextInt(maxItemsAllowed) + 1;
  }  // End fill
  
  // Public function that returns the amount of items in the jar.
  public int getSomeNumber(){
    return someNumber;
  }  // End getSomeNumber
  
  // Public function that returns the name of the items in the jar.
  public String getItemName(){
    return itemName;
  }  // End getItemName
  
  // Public function that returns the maximum number of items that could be in the jar.
  public int getMaxItemsAllowed(){
    return maxItemsAllowed;
  }  // End getMaxItemsAllowed
  
} // End Class Jar