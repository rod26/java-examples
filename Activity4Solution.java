import java.util.Scanner;

public class Activity4Solution {
    
    // Method to calculate the total and accept input on the fly
    public static int calculateTotal(int count) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            total += number; // Adding each number to the total
        }
        
        return total;

       
    }
    
    // Method to calculate the average
    public static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for the number of integers
        System.out.print("How many numbers do you want to input? ");
        int count = scanner.nextInt();
        
        // Calculate the total based on user input
        int total = calculateTotal(count);
        
        // Calculate the average
        double average = calculateAverage(total, count);
        
        // Display the total and average
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    
    scanner.close();
    }
  
}
