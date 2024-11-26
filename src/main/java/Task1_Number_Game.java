import java.util.Scanner;
import java.util.Random;
public class Task1_Number_Game {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int rounds = 0;
		        int Score = 0;

		        System.out.println("Welcome to the Number Guessing Game!");

		        boolean playAgain = true;
		        while (playAgain) {
		            rounds++;
		            int numberToGuess = random.nextInt(100) + 1;
		            int attemptsAllowed = 3;
		            int attemptsUsed = 0;
		            boolean guessedCorrectly = false;

		            System.out.println("Round " + rounds + ":");
		            System.out.println("You have " + attemptsAllowed + " attempts to guess the number bettwen 1 and 100");

		            while (attemptsUsed < attemptsAllowed && !guessedCorrectly) {
		                System.out.print("Enter your guess: ");
		                int userGuess = scanner.nextInt();
		                attemptsUsed++;

		                if (userGuess == numberToGuess) {
		                    System.out.println("Congratulations! You guessed the number correctly in " + attemptsUsed + " attempts.");
		                  Score += (attemptsAllowed - attemptsUsed + 1); // Higher score for fewer attempts
		                    guessedCorrectly = true;
		                } else if (userGuess < numberToGuess) {
		                    System.out.println("Too low! Try again.");
		                } else {
		                    System.out.println("Too high! Try again.");
		                }
		            }

		            if (!guessedCorrectly) {
		                System.out.println("You've used all your attempts. The number was: " + numberToGuess);
		            }

		            System.out.println("Your current score: " + Score);

		            System.out.print("Do you want to play another round? (yes/no): ");
		            playAgain = scanner.next().equalsIgnoreCase("yes");
		        }

		        System.out.println("\nGame Over! You played " + rounds + " rounds and scored " + Score + " points.");
		        scanner.close();
		    }
		}

	
