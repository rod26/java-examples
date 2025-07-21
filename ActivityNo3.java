import java.util.Scanner;

public class ActivityNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize constants for ticket prices
        final double REGULAR_PRICE = 200.00;
        final double VIP_PRICE = 350.00;
        final double STUDENT_PRICE = 150.00;

        // Initialize variables for total cost
        double totalCost = 0;

        // Input: Ask the user for the number of different ticket types
        System.out.print("Enter the number of different ticket types in your order: ");
        int numTicketTypes = scanner.nextInt();

        // Loop to input details for each ticket type
        for (int i = 0; i < numTicketTypes; i++) {
            // Input: Ask the user for the ticket type
            System.out.println("Select ticket type for ticket " + (i + 1) + ": ");
            System.out.println("1. Regular (PHP 200 each)");
            System.out.println("2. VIP (PHP 350 each)");
            System.out.println("3. Student (PHP 150 each)");
            int ticketType = scanner.nextInt();

            // Input: Ask the user for the quantity of this ticket type
            System.out.print("Enter the quantity of this ticket type: ");
            int quantity = scanner.nextInt();

            // Ensure quantity is non-negative
            if (quantity < 0) {
                System.out.println("Quantity cannot be negative. Please try again.");
                i--; // Retry the current ticket type
                continue;
            }

            double pricePerTicket = 0;

            // Determine the price per ticket based on the type selected
            if (ticketType == 1) {
                pricePerTicket = REGULAR_PRICE;
                System.out.println("You selected Regular. Price: PHP 200 each.");
            } else if (ticketType == 2) {
                pricePerTicket = VIP_PRICE;
                System.out.println("You selected VIP. Price: PHP 350 each.");
            } else if (ticketType == 3) {
                pricePerTicket = STUDENT_PRICE;
                System.out.println("You selected Student. Price: PHP 150 each.");
            } else {
                System.out.println("Invalid ticket type selected.");
                i--; // Retry the current ticket type
                continue;
            }

            // Calculate the cost for this ticket type
            double ticketCost = pricePerTicket * quantity;
            totalCost += ticketCost;
        }

        // Calculate the service fee (5% of the total cost)
        double serviceFee = totalCost * 0.05;

        // Add service fee to total cost
        totalCost += serviceFee;

        // Apply a discount based on the total cost
        if (totalCost > 1500) {
            totalCost = totalCost * 0.90; // Apply a 10% discount
            System.out.println("A 10% discount has been applied.");
        }

        // Display the final total cost with service fee
        System.out.println("Your total cost including service fee is: PHP " + totalCost);

        // Close the scanner
        scanner.close();
    }
}
