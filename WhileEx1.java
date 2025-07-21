import java.util.Scanner;

public class WhileEx1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number = 0;
        
        while (number >= 0) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
            }
        }
        
        System.out.println("The sum of the positive numbers entered is: " + sum);
        
    
    }
}