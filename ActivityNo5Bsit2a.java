import java.util.Scanner;

public class ActivityNo5Bsit2a {

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        // Input 5 scores from the user
        System.out.println("Enter 5 scores:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        // Calculate average
        double average = calculateAverage(scores);

        // Categorize and display the result
        System.out.printf("Average score: %.2f\n", average);
        if (average >= 90) {
            System.out.println("Excellent");
        } else if (average >= 70) {
            System.out.println("Good");
        } else if (average >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
