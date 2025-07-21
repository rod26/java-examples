import java.util.Scanner;

public class Ex21Scanner1{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner bsit = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = bsit.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = bsit.nextInt();

        // Clear the newline character from the input buffer
        bsit.nextLine(); 

        // Prompt the user for their favorite color
        System.out.print("Enter your favorite color: ");
        String color = bsit.nextLine();

        // Display the user input
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Color: " + color);

        // Close the scanner
        bsit.close();
    }
}