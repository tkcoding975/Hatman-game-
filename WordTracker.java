// This class is simply responsible for the following
// tasks:
// 1. Keeping a big list of words
// 2. Picking a word at random
import java.util.Random;
public class WordTracker {

    String[] dictionary;
    String pickedWord;
    
    // Constructor
    public WordTracker(String [] words) {
        dictionary = new String[21];
        dictionary[0] = "bee";
        dictionary[1] = "apple";
        dictionary[2] = "banana";
        dictionary[3] = "cat";
        dictionary[4] = "dog";
        dictionary[5] = "elephant"; 
        dictionary[6] = "fish";
        dictionary[7] = "grape";
        dictionary[8] = "hat";
        dictionary[9] = "igloo";
        dictionary[10] = "jacket";
        dictionary[11] = "kite";
        dictionary[12] = "lemon";
        dictionary[13] = "monkey";
        dictionary[14] = "notebook";
        dictionary[15] = "orange";
        dictionary[16] = "penguin";
        dictionary[17] = "quilt";
        dictionary[18] = "rabbit";
        dictionary[19] = "snake";
        dictionary[20] = "tiger";  
      

    }
       
    // Define a method called pickWord that just picks
      public void pickWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(dictionary.length);
        pickedWord = dictionary[randomIndex];
      }
   public static void main(String[] args) {
    String[] words = {"bee", "apple", "banana", "cat", "dog", "elephant", "fish", "grape", "hat", "igloo", "jacket", "kite", "lemon", "monkey", "notebook", "orange", "penguin", "quilt", "rabbit", "snake", "tiger"};
    WordTracker tracker = new WordTracker(words);
    tracker.pickWord();
    System.out.println("Picked Word: " + tracker.pickedWord);
}
    // a random word from your dictionary and sets it 
    // to the pickedWord property.


}