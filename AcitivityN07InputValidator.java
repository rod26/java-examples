import java.util.Scanner;

public class AcitivityN07InputValidator {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Number of input attempts allowed
        int attempts = 5;

        // For loop to iterate through each input attempt
        for (int i = 0; i < attempts; i++) {
            // Prompt user for input
            System.out.print("Enter an integer between 1 and 100: ");
            int input = scanner.nextInt();

            // Validate the input using if-else if statements
            if (input < 1 || input > 100) {
                System.out.println("Invalid input, please enter a number between 1 and 100.");
                // Use continue to skip the rest of the loop iteration
                continue;
            } else if (input == 50) {
                System.out.println("Special number entered, ending the program.");
                // Use break to exit the loop early
                break;
            } else {
                System.out.println("Number accepted.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
