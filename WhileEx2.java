import java.util.Scanner;

public class WhileEx2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = 42;
        int guess = 0;
        
        while (guess != numberToGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low! Guess again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Guess again.");
            } else {
                System.out.println("You guessed it! Congratulations!");
            }
        }
        
        
    }
}