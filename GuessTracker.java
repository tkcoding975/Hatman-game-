import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Random;
// This class is responsible for keeping
// track of the following pieces of data:
// 1. how many guesses you got left
// 2. How many letters have you guessed correctly so far
// 3. The correct word to guess

// It should be able to perform the following actions:
// 1. Guess one letter
//    Determine if letter is in the word.
//    If not:
//        subtract one available guess
//    If it is in the word:
//        add it to the collection of correctly guessed letters
// 2. Check if we've won or lost
//    If all guesses are used up, we've lost. And tell which word it was
//    We've guessed all the correct letters. And tell which word it was


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

   

public class GuessTracker {
    // This class is responsible for keeping track of how many guesses you have left.
    // It also keeps track of how many letters you have guessed correctly so far.
    int guessesLeft;
    Dictionary<String, Boolean> letterGuessedCorrectly;
    String wordToGuess;

    public GuessTracker(int maxGuesses, String word) {
        this.guessesLeft = maxGuesses;
        this.wordToGuess = word;
        this.letterGuessedCorrectly = new Hashtable<>() ;
        // Iterate over every letter in word, and assign it the value of "false"
        // in our letterGuessedCorrectly variable
        for (int i = 0; i < word.length(); i++) {
            this.letterGuessedCorrectly.put(String.valueOf(word.charAt(i)), false);
        }

    }  

    



    public static void main(String [] args) {
        GuessTracker guessTracker = new GuessTracker(5, tracker.pickedWord);
        Scanner scanner = new Scanner(System.in);
       while (guessTracker.guessesLeft > 0) {
        System.out.println("You have " + guessTracker.guessesLeft + " guesses left.");
        System.out.println("Guess a letter");
        String letter = scanner.nextLine();

          guessTracker.guessLetter(letter);
         boolean allGuessed = true;
        Enumeration<String> keys = guessTracker.letterGuessedCorrectly.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if (!guessTracker.letterGuessedCorrectly.get(key)) {
                allGuessed = false;
                break;
       }
        }
        if (allGuessed) {
            System.out.println("You have guessed all the letters correctly! The word was: " + guessTracker.wordToGuess);
            break;
        }    
    }
    
            
        }
    
  public boolean guessLetter(String letter){
        // Check if the letter is in the word
        if (wordToGuess.contains(letter)) {
           this.letterGuessedCorrectly.put(letter, true);
           System.out.println("You have guessed the letter correctly!");           
        } else {
            guessesLeft--;
            System.out.println("You have guessed the letter incorrectly!");
        }
        return false;
  }
}

 // To change the value of a letter in letterGuessedCorrectly, just do 
        // this:
        // this.letterGuessedCorrectly.put(letter, true) 
        // or you can do 
        // this.letterGuessedCorrectly.put(letter, false) 
        // To check the value of a letter, you call
        // this.letterGuessedCorrectly.get(letter)
        // Finally, to iterate over all letters in letterGuessedCorrectly, just do this:
        // Enumeration<String> k = d.keys();
        // while (k.hasMoreElements) {
        //     String key = k.nextElement();
        //     letterGuessedCorrectly.get(key);

