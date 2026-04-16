import java.util.Scanner;

        /*
        Potential Improvements for later versions:

        - Allow the user to play multiple rounds of the game (i.e., keep playing until the user decides to quit).
            You can do this by asking the user if they want to play again after each round.
        - Add a timer to see how long it takes the user to guess the number.
        - Implement a hint system that provides clues to the user if they are stuck. -> Not necessary already has hints.
        - Keep track of the user's high score (i.e., the fewest number of attempts it took to guess the number under a
            specific difficulty level).

         */

public class Main{
    public static void main(String[] args){


        // Initialization of helpful values
        final int lower = 1; // Lower range of guess
        final int upper = 100; // Upper range of guess
        final int range = upper - lower + 1; // Range
        int numberOfGuesses = 5; // Has a default of 5, and then is modified later according to difficulty
        final int randomNumber = (int) (Math.random() * range) + lower; // Generates the "random" number
        // System.out.println(randomNumber); Test if randomNumber works


        Scanner scanner = new Scanner(System.in);


        // Introductory Message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lower + " and " + upper + ".");
        System.out.println("By default you have " + numberOfGuesses + " chances to guess the correct number.\n");

        // Difficulty Selection
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("1. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        System.out.println();


        // Select Difficulty Level and update the number of guesses accordingly (Also includes potential edge case).
        System.out.print("Enter your choice: ");
        int difficultyLevel = Integer.parseInt(scanner.nextLine());

        if(difficultyLevel == 1){
            numberOfGuesses = 10;
            System.out.println("Great! You have selected the Easy difficulty level.");
            System.out.println("Let's start the game!");
        }else if(difficultyLevel == 2){
            // Number of Guesses does not need to be updated because the default is already 5
            System.out.println("Great! You have selected the Medium difficulty level.");
            System.out.println("Let's start the game!");
        }else if (difficultyLevel == 3){
            numberOfGuesses = 3;
            System.out.println("Great! You have selected the Hard difficulty level.");
            System.out.println("Let's start the game!");
        }else{
            System.out.println("Sorry that is not a difficulty level, you are now assigned level insane, 0 chances");
            System.out.println("Sorry that is incorrect, thanks for playing!");
            System.exit(0);
        }


        // Keeps track of number of guesses made by the user.
        int numberOfAttempts = 0;


        // Continuously asks the user for there guess until they either guess it correctly or run out of guesses.
        while(numberOfGuesses > 0){
            System.out.print("Enter your guess: ");
            int guess = Integer.parseInt(scanner.nextLine());
            if(guess == randomNumber){
                numberOfAttempts++;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfAttempts + " attempts");
                break;
            } else if(guess > randomNumber){
                numberOfAttempts++;
                numberOfGuesses--;
                System.out.println("Incorrect! The number is less than " + guess + ".");
            } else{
                numberOfAttempts++;
                numberOfGuesses--;
                System.out.println("Incorrect! The number is greater than " + guess + ".");
            }
        }

        scanner.close();
    }
}