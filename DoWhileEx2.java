import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = input.nextInt();
                    System.out.println("The sum is " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = input.nextInt();
                    System.out.println("The difference is " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = input.nextInt();
                    System.out.println("The product is " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = input.nextInt();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.println("The quotient is " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println();
        } while (choice != 5);
    }
}