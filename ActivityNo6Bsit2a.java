
import java.util.Scanner;

public class ActivityNo6Bsit2a {

    // Method to count even and odd numbers in an array
    public static void countEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];


        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call the method to count even and odd numbers
        countEvenOdd(numbers);

        scanner.close();
    }
}
