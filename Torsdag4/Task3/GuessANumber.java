import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}

private static void makeAGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        if (scanner.hasNextInt()) {
            int guess = scanner.nextInt();
            if (guess == rnd_number) {
                System.out.println("Congratulations! You guessed the number!");
            } else if (guess < rnd_number) {
                System.out.println("Too low! Try again.");
                makeAGuess(); // Recursively call makeAGuess() for another guess
            } else {
                System.out.println("Too high! Try again.");
                makeAGuess(); // Recursively call makeAGuess() for another guess
            }
        } else {
            System.out.println("Error: Please enter a valid numeric input.");
            scanner.next(); // Clear the invalid input
            makeAGuess(); // Recursively call makeAGuess() after invalid input
        }
        scanner.close(); // Close the scanner to avoid resource leak
    }
}

   