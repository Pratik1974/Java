import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int numberToGuess;
    private int numberOfTries;
    private static final int MAX_TRIES = 5;

    public NumberGuessingGame() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        numberOfTries = 0;
    }

    public void startGame() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + MAX_TRIES + " tries to guess it!");

        while (numberOfTries < MAX_TRIES) {
            int guess = getUserGuess();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries!");
                return;
            }
        }

        System.out.println("Sorry, you've run out of tries. The number was " + numberToGuess + ".");
    }

    private int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 100) {
                    return guess;
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.startGame();
    }
}
