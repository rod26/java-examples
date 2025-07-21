import java.util.Scanner;

public class ActivityNo3_2Bsit2b {
    public static void main(String[] args) {
        // Initialize Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of individuals
        System.out.print("Enter the number of individuals: ");
        int personCount = scanner.nextInt();

        // Loop through each individual to calculate their BMI
        for (int i = 1; i <= personCount; i++) {
            // Prompt the user to input weight and height
            System.out.print("Enter weight in kilograms for person " + i + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height in meters for person " + i + ": ");
            double height = scanner.nextDouble();

            // Calculate BMI
            double bmi = weight / (height * height);

            // Categorize BMI using if-else if statements
            if (bmi < 18.5) {
                System.out.println("Underweight.");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Normal weight.");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("Overweight.");
            } else {
                System.out.println("Obese.");
            }
        }

        // Close the scanner after all individuals are processed
        scanner.close();

    }
}
