import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        do {
            System.out.print("Enter a positive number (-1 to quit): ");
            inputNumber = scanner.nextInt();

            if (inputNumber > 0) {
                System.out.println("The square of " + inputNumber + " is " + (inputNumber * inputNumber));
            } else if (inputNumber < 0 && inputNumber != -1) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (inputNumber != -1);

        System.out.println("Goodbye!");
    }
}


