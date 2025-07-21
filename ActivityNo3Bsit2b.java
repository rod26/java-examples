import java.util.Scanner;

public class ActivityNo3Bsit2b {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of individuals
        System.out.print("Enter the number of individuals: ");
        int personCount = scanner.nextInt();

        // Loop through each individual and categorize their age
        for (int i = 1; i <= personCount; i++) {
            // Prompt the user to enter the age of the individual
            System.out.print("Enter the age of person " + i + ": ");
            int age = scanner.nextInt();

            // Categorize the age using if-else if statements
            if (age >= 0 && age <= 12) {
                System.out.println("Child");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager");
            } else if (age >= 18 && age <= 64) {
                System.out.println("Adult");
            } else if (age >= 65) {
                System.out.println("Senior");
            } else {
                System.out.println("Invalid age entered.");
            }
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
